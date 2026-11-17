# Meta Muse (com.facebook.aura) 逆向分析

> 2026-11-17 · 凛的手机（PMD110，ColorOS 16 / Android 16）`adb pull` 的 base.apk（v16.0.0.11.159，46.9MB，targetSdk 36），jadx 1.5.2 全量反编译。
> 产物：`aura/base.apk`（原包）、`decompiled/`（sources + resources）。
> 动机：看 Muse 如何"操控手机"，与自建 phone-mcp（sumi-rin-app 的无障碍 agent + 29 个 phone_* MCP 工具）互相参考。

## 一句话结论

**Muse 刻意不做屏幕级操控。** 它没有 AccessibilityService、没有 dispatchGesture、没有 MediaProjection、没有 shell 注入（全源码 grep 为零）。它的模式是"**瘦执行器 + 胖数据源**"：智能全在 Meta 云端（Noise 加密 WS 连 Jarvis 后端 + ConfidentialVM 工作区），手机端只做三件事：

1. 受控执行 71 个 spec 化设备命令（短信/电话/日历/闹钟/照片/通知…，OS 权限 × HITL 审批双闸，拒绝即降级为卡片）
2. 持续向云端差分推送 10 类结构化数据源（通知/短信/日历/联系人/通话/闹钟/提醒/健康/位置/地理围栏）
3. 提供三个输入面：默认数字助手（语音）、内置相机（拍照给 agent 看）、通知监听

它**看不到屏幕**（screenshot/ 目录只是 bug 上报的裁图 UI；视觉输入 = 相机 + 相册 MediaStore）。

## 架构细节

（下列路径省略前缀 `decompiled/sources/com/facebook/aura/`）

### 1. 命令通道（对应我们的 WS 中继 + phone_* MCP）

- **链路**：`gateway/HatchGatewayConnection`（Noise 加密 WebSocket，keepalive + 重连状态机）→ 收 `client.invoke` 事件（`gateway/HatchGatewayEventsHandler.java`）→ `nodes/HatchNodeClient.executeCommand` 分发 → 域 handler 执行 → `client.invokeResult` 回执。
- **RPC 方法集 43 个**（`network/api/RpcMethod.java`）：ChatStream / ClientInvoke / ClientInvokeResult / **ClientRegisterCapabilities**（端侧上报能力快照）/ **ClientDataSourcePublish**（端侧推数据源）/ ConnectionPing。
- **能力上报**：`HatchNodeClient.buildCapabilitiesSnapshot()` 按**当前权限/设备状态过滤**后只注册实际可用的命令（`nodes/registry/HatchNodeCommandRegistry.getEnabledCommandSpecs()`），云端 LLM 永远只看到当前环境真能做的工具。
- **可靠性封套**：requestId 全链路幂等 + `gateway/service/PendingCommandStore`（进程死亡恢复）+ `NodeCommandFallbackWorker` + 失败也回执 + spec 级 `timeoutMs`。

### 2. 命令 schema

`nodes/core/NodeCommandSpec.java` = description / required / optional / permission_required / resultDescription / timeoutMs —— **description 和 resultDescription 直接写给云端 LLM**（含 "ALWAYS invoke this tool when…"、"never claim a text was sent without invoking it" 这类提示词）。本质是 MCP tool schema 的私有版。全集 71 个域命令 + 28 个 `ui.navigate.*`（app 内导航，`uicontrol/UiCommandSpecsKt.java`）。

### 3. 双层权限闸

- **OS 层**：`nodes/NodePermissionGate` + 命令→权限映射表（`nodes/snapshot/NodeCommandDevicePermissionsKt.java`：MESSAGE_SEND→SEND_SMS、PHONE_CALL→CALL_PHONE…；伪权限 `@notification_listener`/`@photos`/`@health_connect`）。缺权限现场弹 `commands/core/NodePermissionActivity`。
- **HITL 层**：命令→(领域组, READ/WRITE) 矩阵（`nodes/core/NodeHitlCatalog.java`，21 组）；`gateway/HatchNodeHitlGate` 查本地 ALLOW/ASK 存储（按 vmId，与服务器同步）；敏感组禁止"始终允许"（`NO_ALLOW_ALWAYS_GROUPS`）；审批 UI 是会话内 Approval 卡片 + 审批历史 + 后台审批通知。
- **拒绝即降级**：`phone.dial` 后台/无权限 → tap-to-call 通知或 `HatchCallCard` 可点卡片；`message.send` 被拒 → 降级 message.draft，用户自己在短信 app 里按发送。**LLM 收到的不是裸 error，而是降级语义**。

### 4. 各域命令的执行 API（对照 phone-mcp 可借鉴的部分）

| 命令 | 执行方式 | HITL |
|---|---|---|
| alarm.set | 优先 `ACTION_SET_ALARM` + SKIP_UI 移交系统时钟（`commands/alarm/AlarmHandlersKt.tryHandOffToClockApp`），无时钟 app 才回退自管 AlarmManager | 写入首次 ASK |
| message.send | `SmsManager` 直发，**仅默认数字助手可用**；群发/附件只出卡片 | 强 HITL，可 always-allow |
| message.search / attachment.get | `content://sms/mms` ContentProvider 读 + 附件上传给云端看 | READ_SMS |
| phone.dial | 前台直拨 / 后台 tap-to-call 通知 / 无权限卡片 | PHONE_CALL 组 |
| app.open / app.list | PackageManager launch intent；**每次都要确认**（NO_ALLOW_ALWAYS） | APPS 组 |
| photos.search/upload | MediaStore（`MediaStore.setRequireOriginal`）+ Room 队列 + WorkManager 上传 | `@photos` |
| calendar.* | CalendarContract ContentProvider | 读默认允许，写 ASK |
| notifications.get/action | `NodeNotificationListenerService`（NotificationListenerService）+ RemoteInput | `@notification_listener` |
| geofence.set | Geofencing API → 触发进 proactive 管道 | LOCATION |

### 5. 数据源推送（对"AI 轮询"的替代）

`nodes/datasource/`：DataSource 接口（sourceId/permissionRequired/proactiveTrigger/snapshot/backfill）注册 10 源；五类触发（ContentObserver/BroadcastReceiver/NotificationListener/Periodic/CallerDriven）；**基线 + 差分 + 分页回填**（`NodeSyncBaselineStore`/`NodeSyncDiff`/`PagedBackfillStrategy`）；WS 断线时 WorkManager 周期兜底。语义 = 设备事件 → 差分推云 → 云端决定是否主动开口。

### 6. 前台网关服务（对应我们的 PhoneAgentService）

`gateway/service/HatchForegroundService`：只在"Run-in-background"开启时前台保活 WS。**租约模型**：operation/host lease + agent turn hold（干完自动放），不常驻满载；两个通知通道区分"运行中"与"NEEDS_USER（等审批）"。

### 7. 浏览器：云端 VM + VNC 串流

`vmbrowser/runtime/BrowserSessionController`：Noise 双工流串流**云端 VM 里的浏览器**（日志原话 "VNC connected"），用户可 `AgentBrowserLiveViewer` 观看、`BrowserTakeoverBottomBar` 接管输入；agent 侧网页操作发生在云端（Jarvis HTTP lease 机制）。另有 `localbrowser/`（本地 WebView 自动化）做轻量任务。

## 与 phone-mcp 对照 & 可借鉴点

我们现状（`Sumi服务器/phone-mcp/`）：sumi-rin-app 内 PhoneAgentService（前台服务 + 无障碍 agent）经 WS 中继连服务器，暴露 29 个 phone_* MCP 工具（tap/swipe/screenshot/读屏节点树/通知/剪贴板/音量…）给澄用 —— 是**屏幕级操控**路线，和 Muse 互补而非重复。

值得抄的机制（按性价比排序）：

1. **命令 spec 声明化 + 按环境过滤上报**：把 29 个工具做成带 LLM 提示词/超时/resultDescription 的单一 spec 源，agent 连上时上报"当前权限下真实可用子集"（无障碍没开就别让澄看到 tap 工具，或标注 degraded）。
2. **拒绝即降级**：tap/输入被 ColorOS 掐或权限丢失时，降级为"给凛推一条带深链的通知"，而不是裸 error。
3. **通知数据源化**：从"澄轮询 phone_get_notifications"升级为"端侧事件触发 → 差分推 WS → 服务器缓存 30 条"，低延迟省 token（服务器侧已有 push_recent 流水雏形）。
4. **HITL 审批粒度**：per-domain + READ/WRITE + 本次允许/始终允许/拒绝 三态（我们目前是无障碍一开全开）。凛是唯一用户，粒度可以粗，但"敏感动作先问凛"对 AI 伴侣场景反而加分。
5. **结果必达封套**：requestId 幂等 + pending 持久化 + 失败也回执 + 超时声明（我们 WS 中继已有 command/result 配对，补 pending 持久化和幂等即可）。
6. **云端浏览器域**：家里服务器本就有 playwright-mcp——把"订票/查网页"类任务从手机无障碍剥离到服务器浏览器执行，phone agent 只处理必须碰手机的 UI 操作。

## 无障碍「无法运行」问题诊断（同日排查结论）

- **现象复现**：`am force-stop com.sumirin.app` 后重开 app，服务不恢复。
- **根因**：ColorOS 扩展 `AccessibilityManagerServiceExtImpl` 在服务进程死亡时直接 `removeEnableService` 把 SumiAccessibilityService 从 `enabled_accessibility_services` 踢掉（logcat 铁证：`removeEnableService diffService=[com.sumirin.app/...]` + `uploadCollectData type=AccessibilityPkgNameRunningTime`）。开关仍显示开/灰，服务已不在 enabled 集 →「无法运行，点按可查看相关信息」。
- **边界**：温和后台杀（`am kill`、LMK）**不会**踢（a11y 绑定进程优先级 perceptible）；只有 force-stop 级（最近任务上划清除、一键深度清理）会踢。
- **已做防护**（2026-11-17）：
  - `accessibility_turn_off_switch` → 0（关"闲置自动关闭"）
  - `accessibility_turn_off_skip_package` 追加 `com.sumirin.app`（豁免名单，李跳跳/GKD 同款待遇）
  - doze 白名单 `+com.sumirin.app`；包验证关闭（外源安装放宽）
  - 但 force-stop 场景的踢服务**不受上述开关控制**，根治需 app 侧自愈（下条）。
- **建议 app 改动**（待凛点头再出包）：manifest 声明 `android.permission.WRITE_SECURE_SETTINGS`（development 级，adb `pm grant` 授权），PhoneAgentService/MainActivity 启动时检查 `Settings.Secure.getString(enabled_accessibility_services)` 缺自己就写回 —— 凛点开 app 的瞬间无障碍自动恢复，不用进设置。

## 目录

- `aura/base.apk` —— 手机拉的原包（未拆 splits，单包）
- `decompiled/resources/AndroidManifest.xml` —— 合并后的 manifest
- `decompiled/sources/` —— jadx 反编译 Java（含 `com/facebook/aura/` 主包与 `X/` 混淆包）

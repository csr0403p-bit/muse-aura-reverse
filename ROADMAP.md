# phone-mcp 改进路线图

> 2026-11-17 · 基于 Muse 逆向（见 ANALYSIS.md）+ 三路调研（Android 官方 agent API / 开源手机 agent 项目盘点 / 免 root 权限天花板）整理。
> 原则：**仍以 MCP 为主**（澄经 phone_* 工具操控手机），无障碍路线继续深耕 —— 调研确认官方新能力（AppFunctions/Computer Control）全走特权门禁（OEM 预装/Play 关联），sideload 自建系统的天花板就是"无障碍 + 通知监听 + adb 授予的 development 权限"，我们已在正确的路上。

## 已实施（2026-11-17）

| 改动 | 侧 | 说明 |
|---|---|---|
| `phone_click_node` / `phone_set_node_text` / `phone_scroll_node` | 双端 | 节点级操作，省"读屏→算坐标→tap"两步；ACTION_CLICK 系统直接路由，不怕遮挡/坐标漂移；scrollable 标记透传 |
| `phone_notification_reply` / `phone_notification_dismiss` | 双端 | RemoteInput 通知直接回复（微信/QQ/短信，不打开 app）；通知带 replyable 标记 |
| 能力快照上报 | 双端 | hello 后推 capabilities（a11y/notif 就绪、屏幕尺寸、WRITE_SECURE_SETTINGS 状态）→ phone_agent_status 转述 |
| 无障碍自愈场景③ | 手机端 | 被 ColorOS 踢出 enabled 列表时用 WRITE_SECURE_SETTINGS 写回（manifest 已声明；`adb shell pm grant com.sumirin.app android.permission.WRITE_SECURE_SETTINGS` 一次永久生效）+ 通知告知凛 |
| manifest 补 DUMP / READ_LOGS | 手机端 | 同为 signature\|development 可授；dumpsys/logcat 感知 |
| 系统侧防护 | 手机 | accessibility_turn_off_switch=0、skip_package 豁免、doze 白名单、包验证关闭（详见 ANALYSIS.md「无障碍问题」节） |

## P1（下一步，性价比最高）

1. **`find_node(selector)` 结构化选择器**（抄 GKD 的 DSL 子集：`id/text ^= $= *= ~=`、父子/兄弟关系、逻辑组合）—— 模型一次查询直接拿到目标节点 id，替代"截图+读屏"高频组合；GKD 快照调试工作流（i.gkd.li 式在线试选择器）可抄成凛/澄共用的调试页。
2. **`batch_actions`**（抄 mobile-mcp / Tasker AutoInput Actions v2）—— 多步 tap/type/swipe 打包一次 WS 往返；WS 中继架构下收益尤其大。
3. **Take_over / 敏感页守卫**（抄 AutoGLM）—— 检测支付/验证码/银行页（FLAG_SECURE 黑屏也是信号）自动暂停并推通知给凛。OPPO《移动 Agent 安全技术白皮书》的权限分级/审计模型值得对齐。
4. **通知事件订阅化**——已有 event:notification 推送 + 服务器 30 条环形缓冲，差"服务器侧按规则唤醒澄"的消费端（MacroDroid trigger 模型）。
5. **`cheat_sheet` 工具**（抄 Maestro）—— 把工具用法/已知 app 操作路径做成可检索工具，澄先读再操作。

## P2（演进）

6. **自建 IME**（输入法服务）—— 中文/游戏输入比 ACTION_SET_TEXT 可靠（调研确认这是 sideload 合法强项）。
7. **截图分级**（抄 CursorTouch 256 色量化 / Appium LRU+压缩）：a11y takeScreenshot 有强制节流（CTS 验证），高频观察另想；画质参数化已有 maxWidth。
8. **AppFunctions（androidx.appfunctions 1.0.0-rc01）自包闭环**—— Android 16 起 app 可声明函数并被同 app 调用（无需权限）；跨 app 调用特权拿不到，但**自家 sumi-rin-app 可以把常用功能（查电量/定闹钟/播音乐）声明成 AppFunction 给系统 test agent / adb 调试**，将来 Gemini 集成开放时占位。
9. **scrcpy 并行流**（可选）—— 需要"看视频画面"的场景在服务器跑 scrcpy-server 抽帧（33ms 级），与 a11y 主链路并行；剪贴板绕 Android 10+ 限制的技巧也可抄。
10. **隐私脱敏**（抄 android-remote-control-mcp）—— 端上对身份证/卡号/密码先脱敏再出网；AI 伴侣场景下保护凛。

## 明确不做（调研否决）

- **MediaProjection 常驻截屏**：Android 14+ 每会话需用户重新同意，无人值守不可依赖（维持 a11y takeScreenshot）。
- **Shizuku / LADB 回环 adb**：无线调试重启即关 + CVE-2026-0073（同网段免配对 RCE）+ Google 拟禁 loopback（IssueTracker #526109803）——脆弱且是攻击面；WRITE_SECURE_SETTINGS 方案已覆盖核心需求。
- **INJECT_EVENTS / 系统应用化**：signature 权限 + priv-app 需要 root，封死。
- **adb tcpip 5555**：无 TLS 同网段任意设备可连，安全风险大。
- **Play 上架**：Play 政策明文禁止"无障碍自主规划执行的 agent"（deterministic 规则脚本除外）——我们本来就是 sideload，不受管。

## 网络链路备忘（2026-11-17 实测）

手机在移动蜂窝（cmnet）下 `phone.sumi-rin.cc` TCP 443 超时（SNI/运营商干扰），WiFi 环境正常 —— agent 断连优先查这个。手册的"新手机接入"章节已有私人 DNS（dns.google）的解法；v2ray 走代理亦可。

## 参考项目速查

- mobile-mcp（mobile-next）· Appium MCP · Maestro MCP · android-remote-control-mcp（架构最像我们，65 工具/紧凑 UI 状态/隐私脱敏/OAuth2.1）· CursorTouch/Android-MCP · GKD（选择器 DSL）· Tasker AutoInput · AutoGLM（Take_over，模型执行分离 API）· AndroidWorld/M3A（无障碍转发 app + gRPC，路线同类验证）· OS-Atlas / UI-TARS（grounding 兜底模型）· scrcpy（控制协议）
- 全部链接见各调研报告（本仓库 ANALYSIS.md + 三份调研报告附件）。

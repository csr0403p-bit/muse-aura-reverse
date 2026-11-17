# 免 root 权限天花板调研（ColorOS 16 / Android 16）

> 2026-11-17 调研。结论：**「adb 一次性授权后长期有效」的通道存在且是免 root 核心**，分三层——(A) pm grant/appops 持久权限（重启保留）；(B) 无障碍（被 ColorOS 管控，需自愈）；(C) shell uid 通道（Shizuku/adb，最强但重启后需重连）。

## WRITE_SECURE_SETTINGS（已采用）

- 保护级别 `signature|development`：**必须 manifest 声明**（未声明 pm grant 直接失败），声明后 `adb shell pm grant <pkg> android.permission.WRITE_SECURE_SETTINGS` 即可，appops 无绕法。
- **持久性：永久**。重启保留，卸载才丢；同签名覆盖安装通常保留。
- 自愈无障碍的标准手法：写 `settings put secure enabled_accessibility_services <pkg>/<cls>` + `accessibility_enabled 1`。
- 出处：AOSP Permissions.md、Tasker 官方指引、GalaxyMaxHz wiki、r/tasker。

## Shizuku 模型（评估后暂不采用）

- adb 启动 shell uid(2000) 常驻 Binder 服务；app bind 后获 shell 级能力（pm grant/am/input/svc/appops/settings/dumpsys/IInputManager.injectInputEvent/uiautomator）。
- **每次重启需重新启动**（无线调试自连 13.6+ 支持受信任 WLAN 自动启动，但无线调试本身重启即关）。
- ColorOS 前置：开发者选项关闭「权限监控」（金标版被隐藏，切英文找回）。
- 已知不稳：无线调试 ~30min 掉线、锁屏被杀、OPPO 卡 "Waiting for service"（Shizuku issues #1899/#2241/#2596）。

## 无线调试 / adb over WiFi（风险提示）

- 配对模式端口每次会话随机、重启/断 Wi-Fi 自动关闭（设计行为）。
- **CVE-2026-0073**（2026-05）：无线 ADB 互相认证绕过，同网段免配对 RCE；Google IssueTracker #526109803 拟让 adbd 只绑 wlan0、禁 loopback —— 若落地将杀死 LADB/Shizuku 无线自连生态。
- `adb tcpip 5555` 无 TLS 同网段任意设备可连，不用。
- 手机自连 localhost（LADB 模式）可行但脆弱；**USB 常连是最稳的 adb 宿主形态**。

## INJECT_EVENTS / 系统应用化

- INJECT_EVENTS signature 级 @hide，第三方不可能；shell uid 被白名单（所以 adb input 能注入）。普通 app 得 shell 能力只有 Shizuku 族系一条路。
- priv-app 需要 root；平台签名拿不到。封死。

## ColorOS 特有

- 无障碍自动关闭是**官方安全管控**：OPPO 官方回应"软件商店下载的读屏软件不受影响"——侧载被针对性管控；无官方豁免文档，我们发现的 `accessibility_turn_off_*` keys 就是社区最全来源。
- 自启动/关联启动/深度休眠（速冻）：**无 adb 通道**，只能手动（手机管家→权限隐私→自启动管理；电池→允许后台运行；多任务下拉锁定；移出深度休眠名单）。
- 通用可做：Doze 白名单 `dumpsys deviceidle whitelist +<pkg>`、`am set-standby-bucket <pkg> active`（重启保留）。

## MediaProjection（不可依赖）

- Android 14+ 每次捕获会话都要用户重新 consent + 先启动 mediaProjection 型前台服务；Android 15 定为单次使用；Android 16 加投影检测。**无人值守场景下 a11y 节点树 + takeScreenshot 是主力**。
- takeScreenshot（API 30+）静默无指示器但有**强制节流间隔**（CTS 验证），只能低频抓帧。

## 推荐权限组合（本项目已按此执行）

| 权限 | 授予方式 | 持久性 | 状态 |
|---|---|---|---|
| WRITE_SECURE_SETTINGS | manifest + pm grant | 永久 | manifest 已声明，待出包后 grant |
| DUMP / READ_LOGS | 同上 | 永久 | 同上 |
| PACKAGE_USAGE_STATS | 设置授权（appop） | 持久 | 已有 |
| SYSTEM_ALERT_WINDOW | appop allow | 持久 | 已有 |
| 无障碍服务 | 手动开启 + WRITE_SECURE_SETTINGS 自愈 | 持久 | 已有+自愈 |
| Doze 白名单 | dumpsys deviceidle whitelist | 重启保留 | 已加 |
| 前台服务 specialUse | manifest | 随 app | 已有 |

ColorOS 手动必做（凛）：允许自启动+关联启动；电池允许完全后台；多任务下拉锁定；移出深度休眠。

## 出处

AOSP Permissions.md / PackageManagerShellCommand.java / Shizuku GitHub + 官方指南 + issues #1254 #2527 #1899 #2241 / Tasker 指引 / LADB XDA / CVE-2026-0073（cve.org、NVD、runZero）/ kitsumed loopback 限制分析 / OPPO 官方回应（bbs.tatans.cn）/ gkd-kit discussion #1346 / dontkillmyapp OPPO / Android 14 FGS 文档 / droidVNC-NG #195 / takeScreenshot CTS

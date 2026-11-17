# Android 官方 Agent API 调研（截至 2026-11-17）

> 核心结论：**官方新 agent 能力全部走特权门禁（OEM 预装 / Play 关联 / 特权 caller + 会话级用户同意），第三方 sideload 的操控上限仍是「无障碍 + 通知监听 + UsageStats + MediaProjection + IME + adb 授予」这套旧组合** —— sumi-rin 的选型正确。

## App Functions / AppFunctionService（Android 16）

- 包 `android.app.appfunctions`，Jetpack `androidx.appfunctions` 1.0.0-rc01；`@AppFunction` 注解 + KSP 生成 schema，系统用 AppSearch 建索引，agent 经 AppFunctionManager 搜索执行。官方定位「on-device MCP server」「Android 的统一 tool calling 层」（Dev Summit 2025-11 宣布 Android MCP，2026-10 beta）。
- **权限**：`EXECUTE_APP_FUNCTIONS` Android 16 为 `internal|privileged`（仅特权系统 app）；Android 17 改 `internal|role`（仅 ASSISTANT 角色预装 app）。**自己包内调用无需权限**（自包闭环）。
- Gemini 集成走 Connected Apps Platform：必须关联 **Play 应用**、aab 测试轨道 —— sideload 吃不到。
- Android 17 加 `AppInteractionManager/Session`（会话级用户同意）、`EXECUTE_APP_FUNCTIONS_TRUSTED`（SYSTEM_VENDOR_INTELLIGENCE 角色）。
- **对本项目**：跨 app 调用拿不到；自包闭环可玩（sumi-rin-app 把自家功能声明成 AppFunction 占位，P2 项）。

## 助手角色 / Computer Control

- 没有 `AGENT_ROLE`；`EXECUTE_APP_ACTION`（API 34）仅授予用户选定的 Assistant。VoiceInteractionService 仍是默认助手正式路径（Muse 就走这条）。
- **Computer Control 框架**（2026 Preview）：OEM 预装助手专用 —— 安全虚拟 display 跑目标 app、截图→推断→注入循环、每会话 ≤6 app、全系统 1 会话、首次弹系统框。Galaxy S26 / Pixel 10 上以 Gemini beta 形态运行。第三方不可用。
- 端上无 "AgentCore" SDK（Google 那是云产品 Gemini AgentCore）；端侧给第三方的是 ML Kit Agentic API（alpha，Gemini Nano）。

## 无障碍之外的感知/注入 API

- `INJECT_EVENTS`：signature + @hide，"Not for use by third-party applications" —— 跨窗口注入唯一普通 app 通道仍是无障碍 dispatchGesture。
- `PACKAGE_USAGE_STATS`（appop 授权可用）、NotificationListener、MediaProjection（逐次同意）均维持原状。
- 无新的对普通 app 开放的截屏+注入组合。

## Play 政策（我们不受管，但记录）

- 现行政策明文：**"Any use of the Accessibility API that enables an app to autonomously initiate, plan, and execute actions is strictly prohibited"** —— Play 上的 AI agent 用无障碍被禁；确定性规则脚本除外。sideload 不受 Play 管辖。
- Android 13+ 纯 sideload app 有「受限设置」，开无障碍需 adb 预解锁（我们的 app 已开过，覆盖安装不受影响）。

## 出处

developer.android.com/ai/appfunctions · /ai/computer-control · /ai/intelligence-system · AppFunctionManager/RoleManager/Manifest.permission 参考 · AOSP frameworks/base AndroidManifest.xml（android16-release 与 main）· PermissionController roles.xml · Android Developers Blog（The Intelligent OS 2026-02 / AppFunctions 实战 2026-07 / Android 17 2026-06 / Dev Summit 2025 session）· Play 政策页 · Anthropic MCP 公告 · support.google.com 受限设置与 automation controls 页

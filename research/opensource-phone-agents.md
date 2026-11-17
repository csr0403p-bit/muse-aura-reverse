# 开源/业界手机 Agent 方案盘点（2026-11-17）

> 与自建 phone-mcp（无障碍 app + WS 中继 + MCP 工具）对照的可借鉴点，按来源分组。

## MCP 类

| 项目 | 路线 | 值得抄 |
|---|---|---|
| **mobile-mcp**（mobile-next，~10.6k⭐） | PC 侧 Node + adb；a11y 树优先、截图兜底；~35 工具 | `mobile_batch_commands` 一次往返打包多命令；crash report 工具 |
| **Appium MCP**（官方） | 内嵌 uiautomator2/WDA driver；~25 工具组 | 视觉定位 opt-in 防 LLM 偷懒走贵路径；NO_UI 模式 + LRU 缓存 + 截图压缩（省 50-80% 响应/60-90% token） |
| **Maestro MCP**（mobile-dev-inc） | `maestro mcp` 内置于 CLI；10 工具 | **`cheat_sheet` 工具**（用法手册做成工具让 agent 先读再操作）；inline flow 批处理 |
| **android-remote-control-mcp**（danielealbano，844⭐，GPLv3） | **架构最像我们**：手机端 Kotlin app（Ktor 前台服务）+ MCP over Streamable HTTP；全走无障碍；65 工具 | 紧凑 UI 状态（比 uiautomator dump 小 10-50 倍）；**端上隐私脱敏**（规则 + 本地 NER）；按工具禁用定义省 token；OAuth 2.1 + 手机 2 位数字码授权 |
| **CursorTouch/Android-MCP**（930⭐） | PC + 纯 adb（uiautomator dump） | 截图 256 色量化；busy 界面 dump 挂 → 自动降级截图-only（反证无障碍路线选型正确） |
| **phone-mcp**（htekdev，Termux 系） | 手机端 Termux:API，零依赖 | 传感器/短信/拨号等系统 API 面（与 a11y 互补） |
| BrowserStack MCP | 云真机 | 失败自动分析/自愈层（MCP 之上） |

注：ideslab/mcp-android 已 404（改名或删除）。

## 学术/开源框架

- **Mobile-Agent v1→v3.5**（阿里 X-PLUG）：v3 起纯视觉 VLM（GUI-Owl），adb 执行；多 agent 分工（规划/决策/反思/进度/记忆）。
- **AppAgent**（腾讯 GY Lab）：探索期自动生成「App 使用文档」+ 部署期 RAG —— **常用 app 路径知识库**思路值得上。
- **AutoGLM / Open-AutoGLM**（智谱）：纯截图 + 纯 adb；10 种动作含 **Take_over（转人工）**、银行支付页黑屏自动转人工；AutoGLM-Phone-9B 已开源（模型-执行分离 API 形态最完整的公开参考）。
- **OS-Atlas**（上海AI Lab，ICLR'25）：截图→坐标 grounding 模型 —— 可作 a11y 树找不到节点时的视觉兜底定位器。
- **AndroidWorld + M3A**（Google Research）：模拟器内「无障碍转发 app + gRPC(:8554)」—— **与我们的 WS+无障碍架构同类且被官方验证**；116 个程序化验证任务可当回归集。
- **DigiRL**（Berkeley）：真机在线 RL；自动 evaluator 思路可做工具回归测试。
- **UI-TARS**（字节 Seed）：纯截图端到端原生 GUI agent，开源权重。

## 无障碍自动化标杆（执行层成熟）

- **GKD**（gkd-kit）：CSS-like 选择器 DSL（14 操作符 `= != ^= $= *= ~=` + 取反；属性 id/text/name/vid/index/depth/parent；**关系选择器** `+ - > < << ->` 支持元组；从右往左匹配）；规则 JSON 订阅分发；快照在线审查（i.gkd.li）。**选择器 DSL 是 find_node 工具的直接蓝本。**
- **李跳跳**：已停更下架（合规压力）——教训：针对特定 app 的规则别公开分发，自用无碍。
- **Tasker AutoInput**：Actions v2 单 action 批量多步交互 + UI Query 条件查询。
- **MacroDroid**：trigger-action-constraint 事件驱动模型 = 「通知/应用切换/定时 → 动作」是读通知工具的高级形态。

## scrcpy 路线（对照）

| 维度 | scrcpy 控制协议 | 无障碍（自建） |
|---|---|---|
| 截图延迟 | 33ms（视频流抽帧） | ~100ms 级 |
| 注入延迟 | 5-10ms | ~50ms 级，够用 |
| 语义感知 | 无节点树（纯坐标） | 原生节点树+文本 |
| 依赖 | PC/adb 宿主 | 手机自含直连服务器 |

- 相关：juancf/scrcpy-mcp（44 工具，实测数据来源）；UHID/AOA 键盘对游戏兼容好；剪贴板走协议可绕 Android 10+ adb 限制。
- 落点：需要"看视频画面识别"的场景可并行 scrcpy 流，不动 a11y 主链路（P2）。

## 商业产品教训

- **Rabbit R1/LAM**：实为云端 Playwright 站点脚本 —— Web 域任务用「站点适配脚本」最稳（家里已有 playwright-mcp，方向一致）。
- **Humane Pin**：死于延迟与不可靠 —— agent 的可靠性 > 功能数量；"第二大脑"定位 > 替代手机。
- **荣耀 YOYO/OPPO Agent Matrix/vivo 意图框架**：厂商走「意图框架（App Intents 语义 API）+ 无障碍兜底」；OPPO《移动 Agent 安全技术白皮书》讲清了 agent 权限分级/MCP+OAuth 授权联邦/可审计调用链 —— **建议凛读一遍**。
- 信通院《手机智能体技术研究报告》：行业全景。

## 链接

github.com/mobile-next/mobile-mcp · appium/appium-mcp · docs.maestro.dev/maestro-mcp · danielealbano/android-remote-control-mcp · CursorTouch/Android-MCP · htekdev/phone-mcp-server · X-PLUG/MobileAgent · mnotgod96/AppAgent · zai-org/Open-AutoGLM · osatlas.github.io · digirl-agent/digirl · google-research/android_world · bytedance/UI-TARS · gkd-kit/gkd（gkd.li / i.gkd.li）· joaoapps.com/autoinput · Genymobile/scrcpy（doc/control.md）· juancf/scrcpy-mcp · rabbit.tech/LAM 架构页 · privacy.oppo.com 移动Agent安全技术白皮书 · taf.org.cn 手机智能体报告

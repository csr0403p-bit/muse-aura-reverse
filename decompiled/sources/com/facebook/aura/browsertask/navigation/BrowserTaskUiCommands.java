package com.facebook.aura.browsertask.navigation;

import X.AnonymousClass006;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.model.BrowserTaskIdKt;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionParserKt;
import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandSpecsKt;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class BrowserTaskUiCommands implements UiCommandContributor {
    public static final BrowserTaskUiCommands INSTANCE = new BrowserTaskUiCommands();
    public static final Map<String, NodeCommandSpec> specs = AnonymousClass006.A10(BrowserTaskUiCommandsKt.UI_NAVIGATE_BROWSER_TASK, C3cH.A0U("Open the live view of one of the agent's browser tasks on the user's screen, the same as tapping its Open browser card. Use this when the user asks to open, show, or see the browser. Get task_id from browser.windows list. Does not stop, restart, or close the task; if the task is waiting for the user (for example sign-in or captcha), the user is handed control exactly as the card does. A task running on another of the user's devices opens a view-only preview instead: the user can watch or stop it here, but must take over on that device.", "Confirmation that the browser task's live view was opened on the user's screen.", AnonymousClass006.A10(BrowserTaskUiCommandsKt.TASK_ID_PARAM, new NodeArgSpec(NodeArgType.STRING, "Browser task id from browser.windows list (for example \"browser-task:<uuid>\"); the bare id is also accepted.")), AnonymousClass006.A10(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, UiCommandSpecsKt.MODE_PARAM)));

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public String invalidParams(String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(BrowserTaskUiCommandsKt.UI_NAVIGATE_BROWSER_TASK) && INSTANCE.taskIdParam(jsonObject) == null) {
            return "ui.navigate.browser_task requires non-empty task_id";
        }
        return null;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        String strTaskIdParam;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(BrowserTaskUiCommandsKt.UI_NAVIGATE_BROWSER_TASK) || (strTaskIdParam = taskIdParam(jsonObject)) == null) {
            return null;
        }
        return new OpenBrowserTaskUiAction(strTaskIdParam);
    }

    private final String taskIdParam(JsonObject jsonObject) {
        String strTrimmedStringParam = UiActionParserKt.trimmedStringParam(jsonObject, BrowserTaskUiCommandsKt.TASK_ID_PARAM);
        if (strTrimmedStringParam == null || BrowserTaskIdKt.canonicalBrowserTaskId(strTrimmedStringParam).length() == 0) {
            return null;
        }
        return strTrimmedStringParam;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        return specs;
    }
}

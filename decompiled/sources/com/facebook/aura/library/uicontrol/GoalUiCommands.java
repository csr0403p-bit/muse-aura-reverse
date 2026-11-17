package com.facebook.aura.library.uicontrol;

import X.AnonymousClass006;
import X.C3cH;
import X.C7384Etj;
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
public final class GoalUiCommands implements UiCommandContributor {
    public static final GoalUiCommands INSTANCE = new GoalUiCommands();
    public static final Map<String, NodeCommandSpec> specs = AnonymousClass006.A10(GoalUiCommandsKt.UI_NAVIGATE_GOALS_ITEM, C3cH.A0U("Open one specific goal's detail view by goal id. Use this when the user asks to open, show, or go to a particular goal; use ui.navigate.goals to open the Goals tab as a whole.", "Confirmation that the requested goal was opened.", AnonymousClass006.A10(GoalUiCommandsKt.GOAL_ID_PARAM, new NodeArgSpec(NodeArgType.STRING, "Goal id as returned by the goal tools.")), AnonymousClass006.A10(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, UiCommandSpecsKt.MODE_PARAM)));

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public String invalidParams(String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(GoalUiCommandsKt.UI_NAVIGATE_GOALS_ITEM) && UiActionParserKt.trimmedStringParam(jsonObject, GoalUiCommandsKt.GOAL_ID_PARAM) == null) {
            return "ui.navigate.goals.item requires non-empty goal_id";
        }
        return null;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        String strTrimmedStringParam;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(GoalUiCommandsKt.UI_NAVIGATE_GOALS_ITEM) || (strTrimmedStringParam = UiActionParserKt.trimmedStringParam(jsonObject, GoalUiCommandsKt.GOAL_ID_PARAM)) == null) {
            return null;
        }
        return new OpenGoalUiAction(strTrimmedStringParam);
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        return specs;
    }
}

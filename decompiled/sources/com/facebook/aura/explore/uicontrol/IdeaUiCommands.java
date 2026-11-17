package com.facebook.aura.explore.uicontrol;

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
public final class IdeaUiCommands implements UiCommandContributor {
    public static final IdeaUiCommands INSTANCE = new IdeaUiCommands();
    public static final Map<String, NodeCommandSpec> specs = AnonymousClass006.A10(IdeaUiCommandsKt.UI_NAVIGATE_EXPLORE_ITEM, C3cH.A0U("Open one specific idea's detail view on the Ideas tab by idea id. Use this when the user asks to open, show, or go to a particular idea; use the Ideas tab command to open the tab as a whole.", "Confirmation that the requested idea was opened.", AnonymousClass006.A10(IdeaUiCommandsKt.IDEA_ID_PARAM, new NodeArgSpec(NodeArgType.STRING, "Idea id (e.g. \"idea_5023868855f94e22964b272783bb1c76\").")), AnonymousClass006.A10(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, UiCommandSpecsKt.MODE_PARAM)));

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public String invalidParams(String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(IdeaUiCommandsKt.UI_NAVIGATE_EXPLORE_ITEM) && UiActionParserKt.trimmedStringParam(jsonObject, IdeaUiCommandsKt.IDEA_ID_PARAM) == null) {
            return "ui.navigate.explore.item requires non-empty idea_id";
        }
        return null;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        String strTrimmedStringParam;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(IdeaUiCommandsKt.UI_NAVIGATE_EXPLORE_ITEM) || (strTrimmedStringParam = UiActionParserKt.trimmedStringParam(jsonObject, IdeaUiCommandsKt.IDEA_ID_PARAM)) == null) {
            return null;
        }
        return new OpenIdeaUiAction(strTrimmedStringParam);
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        return specs;
    }
}

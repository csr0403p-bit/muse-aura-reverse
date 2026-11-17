package com.facebook.aura.spacesharing.impl;

import X.AnonymousClass006;
import X.C0881AGi;
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

/* loaded from: classes6.dex */
public final class SpaceShareUiCommands implements UiCommandContributor {
    public static final SpaceShareUiCommands INSTANCE = new SpaceShareUiCommands();
    public static final Map<String, NodeCommandSpec> specs = AnonymousClass006.A10(SpaceShareUiCommandsKt.UI_NAVIGATE_SPACE_SHARE, new NodeCommandSpec("Open the Share settings for one artifact by public slug.", AnonymousClass006.A10(SpaceShareUiCommandsKt.SPACE_SLUG_PARAM, new NodeArgSpec(NodeArgType.STRING, "Public slug from artifact.list.slug (e.g. \"weather-tracker\").")), AnonymousClass006.A10(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, UiCommandSpecsKt.MODE_PARAM), C0881AGi.A00, null, "Confirmation that the artifact's Share settings are on screen. The user makes every sharing choice there; nothing has been shared.", 0));

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public String invalidParams(String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(SpaceShareUiCommandsKt.UI_NAVIGATE_SPACE_SHARE) && UiActionParserKt.trimmedStringParam(jsonObject, SpaceShareUiCommandsKt.SPACE_SLUG_PARAM) == null) {
            return "ui.navigate.space.share requires non-empty space_slug";
        }
        return null;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        String strTrimmedStringParam;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(SpaceShareUiCommandsKt.UI_NAVIGATE_SPACE_SHARE) || (strTrimmedStringParam = UiActionParserKt.trimmedStringParam(jsonObject, SpaceShareUiCommandsKt.SPACE_SLUG_PARAM)) == null) {
            return null;
        }
        return new OpenSpaceShareUiAction(strTrimmedStringParam);
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        return specs;
    }
}

package com.facebook.aura.appappearance;

import X.AGH;
import X.AnonymousClass006;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiCommandContributor;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public final class AppAppearanceUiCommands implements UiCommandContributor {
    public static final AppAppearanceUiCommands INSTANCE = new AppAppearanceUiCommands();
    public static final Map<String, NodeCommandSpec> specs = AnonymousClass006.A10(AppAppearanceUiCommandsKt.UI_SET_APPEARANCE_MODE, C3cH.A0U("Switch the whole app between light and dark mode, or Automatic to follow the device (Settings > Appearance > Mode). Use this for \"dark mode\" or \"light mode\" requests; chat_theme only changes chat bubble colors.", "Confirmation that the app's light or dark mode changed.", AnonymousClass006.A10(AppAppearanceUiCommandsKt.APPEARANCE_MODE_PARAM, new NodeArgSpec(NodeArgType.STRING, "\"light\", \"dark\", or \"automatic\" to follow the device setting.")), AGH.A0E()));

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public String invalidParams(String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(AppAppearanceUiCommandsKt.UI_SET_APPEARANCE_MODE) && INSTANCE.appearanceModeValue(jsonObject) == null) {
            return "Pass appearance_mode \"light\", \"dark\", or \"automatic\".";
        }
        return null;
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        Integer numAppearanceModeValue;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(AppAppearanceUiCommandsKt.UI_SET_APPEARANCE_MODE) || (numAppearanceModeValue = appearanceModeValue(jsonObject)) == null) {
            return null;
        }
        return new SetAppearanceModeUiAction(numAppearanceModeValue.intValue());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Integer appearanceModeValue(kotlinx.serialization.json.JsonObject r2) {
        /*
            r1 = this;
            java.lang.String r0 = "appearance_mode"
            java.lang.String r0 = com.facebook.aura.uicontrol.UiActionParserKt.trimmedStringParam(r2, r0)
            r2 = 0
            if (r0 == 0) goto L14
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -887328209: goto L15;
                case 3075958: goto L18;
                case 102970646: goto L22;
                case 1673671211: goto L2c;
                default: goto L14;
            }
        L14:
            return r2
        L15:
            java.lang.String r0 = "system"
            goto L2e
        L18:
            java.lang.String r0 = "dark"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r0 = 2
            goto L35
        L22:
            java.lang.String r0 = "light"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r0 = 1
            goto L35
        L2c:
            java.lang.String r0 = "automatic"
        L2e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L14
            r0 = -1
        L35:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.appappearance.AppAppearanceUiCommands.appearanceModeValue(kotlinx.serialization.json.JsonObject):java.lang.Integer");
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        return specs;
    }
}

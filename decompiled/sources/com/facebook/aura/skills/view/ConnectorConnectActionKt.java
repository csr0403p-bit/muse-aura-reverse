package com.facebook.aura.skills.view;

import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SkillConnectDisconnectRouterScreenKey;
import com.facebook.aura.perf.HatchConnectorQplLogger;

/* loaded from: classes.dex */
public abstract class ConnectorConnectActionKt {
    public static final void handleEnableSkill(String str, AuraNavigator auraNavigator, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass005.A11(auraNavigator, str2, hatchSkillOAuthOrigin, 1);
        HatchInteractionLogger.INSTANCE.logClick(hatchSkillOAuthOrigin, HatchComponent.SKILL_AUTH_STARTED, AnonymousClass007.A0d(HatchMetadataKey.PROVIDER.getValue(), str, new HxE(HatchMetadataKey.AUTH_FLOW_TYPE.getValue(), "consent")));
        HatchConnectorQplLogger.INSTANCE.startAuth("consent", str2, str, false);
        auraNavigator.navigate((AuraNavKey) new SkillConnectDisconnectRouterScreenKey(str, true, null, hatchSkillOAuthOrigin, null, false), false);
    }

    public static /* synthetic */ void handleEnableSkill$default(String str, AuraNavigator auraNavigator, String str2, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "settings";
        }
        if ((i & 8) != 0) {
            hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.SETTINGS;
        }
        handleEnableSkill(str, auraNavigator, str2, hatchSkillOAuthOrigin);
    }
}

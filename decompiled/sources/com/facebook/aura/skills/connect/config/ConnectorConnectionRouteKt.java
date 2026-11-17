package com.facebook.aura.skills.connect.config;

import X.C7384Etj;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.skills.connect.config.ConnectorConnectionRoute;

/* loaded from: classes3.dex */
public abstract class ConnectorConnectionRouteKt {
    public static final ConnectorConnectionRoute accountsCenterConnectionRoute(FirstPartyConnectorConfig firstPartyConnectorConfig) {
        HatchAccountLinkingTarget hatchAccountLinkingTargetAccountLinkingTarget;
        C7384Etj.A0Y(firstPartyConnectorConfig, 0);
        if (!firstPartyConnectorConfig.isAccountsCenterManaged || (hatchAccountLinkingTargetAccountLinkingTarget = SkillConnectConfigKt.accountLinkingTarget(firstPartyConnectorConfig)) == null) {
            return null;
        }
        return new ConnectorConnectionRoute.AccountLinking(hatchAccountLinkingTargetAccountLinkingTarget);
    }
}

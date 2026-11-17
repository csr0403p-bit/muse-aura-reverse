package com.facebook.aura.deeplink;

import X.AbstractC3358CGz;
import X.C60P;
import X.C7384Etj;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;

/* loaded from: classes3.dex */
public final class AuraDeeplinkActivation {
    public static final int $stable = 0;
    public static final AuraDeeplinkActivation INSTANCE = new AuraDeeplinkActivation();

    public final boolean isFullyActivated(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AuraUserData auraUserData = (AuraUserData) C60P.A1J(AuraViewerDataProvider.Companion, abstractC3358CGz);
        return (auraUserData != null ? auraUserData.getCurrentActivationState(false, false, false) : null) == ActivationState.FULLY_ACTIVATED;
    }

    public final boolean isMidOnboarding(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AuraUserData auraUserData = (AuraUserData) C60P.A1J(AuraViewerDataProvider.Companion, abstractC3358CGz);
        return (auraUserData == null || auraUserData.getCurrentActivationState(false, false, false) == ActivationState.FULLY_ACTIVATED) ? false : true;
    }
}

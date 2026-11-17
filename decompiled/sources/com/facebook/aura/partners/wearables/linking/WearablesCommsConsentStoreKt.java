package com.facebook.aura.partners.wearables.linking;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C31u;
import X.C7384Etj;
import X.C7462Ewq;
import X.InterfaceC7359EnW;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.partners.wearables.linking.MC;

/* loaded from: classes2.dex */
public abstract class WearablesCommsConsentStoreKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(WearablesCommsConsentStoreKt.class, "commsConsentScreenEnabled", "getCommsConsentScreenEnabled()Z", 1)};
    public static final C31u commsConsentScreenEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_onboarding_abra.enable_comms_consent_screen);

    public static final boolean isCommsConsentPending(AbstractC3358CGz abstractC3358CGz, boolean z) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        return z && new WearablesCommsConsentStore(abstractC3358CGz).get() != WearablesCommsConsent.GRANTED && getCommsConsentScreenEnabled();
    }

    public static final boolean getCommsConsentScreenEnabled() {
        return AnonymousClass001.A1X(C31u.A00(commsConsentScreenEnabled$delegate, $$delegatedProperties));
    }
}

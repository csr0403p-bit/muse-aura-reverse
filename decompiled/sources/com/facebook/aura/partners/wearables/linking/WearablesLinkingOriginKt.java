package com.facebook.aura.partners.wearables.linking;

import X.AIW;
import X.AnonymousClass001;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class WearablesLinkingOriginKt {
    public static final String UTM_MEDIUM_KEY = "utm_medium";

    public static final void logWearablesConsentDismiss(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2) {
        C7384Etj.A0Y(wearablesLinkingOrigin, 0);
        HatchInteractionLogger.INSTANCE.logDismiss(wearablesLinkingOrigin.getSurface(), wearablesLinkingOrigin.getSubsurface(), HatchScreen.WEARABLES_LINKING, HatchComponent.WEARABLES_CONSENT, null, wearablesLinkingMetadata(str, str2));
    }

    public static /* synthetic */ void logWearablesConsentDismiss$default(WearablesLinkingOrigin wearablesLinkingOrigin, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        logWearablesConsentDismiss(wearablesLinkingOrigin, str, str2);
    }

    public static final Map<String, String> wearablesLinkingMetadata(String str, String str2) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (str != null && !C7BY.A0j(str)) {
            c0924AIaA0u.put("utm_medium", str);
        }
        if (str2 != null && !C7BY.A0j(str2)) {
            AnonymousClass001.A1C(HatchMetadataKey.SETUP_SESSION_ID, str2, c0924AIaA0u);
        }
        C0924AIa c0924AIaA0K = AIW.A0K(c0924AIaA0u);
        if (c0924AIaA0K.isEmpty()) {
            return null;
        }
        return c0924AIaA0K;
    }
}

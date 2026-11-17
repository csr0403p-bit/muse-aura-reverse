package com.facebook.aura.partners.wearables.onboarding;

import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchAppOpenLogger;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.WearablesLinkingBottomSheetKey;
import com.facebook.aura.navigation.key.WearablesLinkingFullScreenKey;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class WearablesOnboardingDeeplinkRouter {
    public static final String ALLOW_SKIP_PARAM = "allow_skip";
    public static final String ENABLE_WEARABLES_HOST = "enable-wearables";
    public static final WearablesOnboardingDeeplinkRouter INSTANCE = new WearablesOnboardingDeeplinkRouter();
    public static final String MODAL_FULLSCREEN = "fullscreen";
    public static final String MODAL_PARAM = "modal";
    public static final String PHONE_PROVIDER_LINKED_PARAM = "phone_provider_linked";
    public static final String SETUP_SESSION_ID_PARAM = "setup_session_id";
    public static final String SKIP_CONSENT_PARAM = "skip_consent";
    public static final String WAKE_WORD_PARAM = "wake_word";

    private final String canonicalSetupSessionId(String str) {
        Object objA0s;
        if (str == null) {
            return null;
        }
        try {
            objA0s = UUID.fromString(str).toString();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (String) (objA0s instanceof C10571Hud ? null : objA0s);
    }

    public final WearablesOnboardingDeeplinkTarget routeForUri(Uri uri, boolean z) {
        AuraNavKey activationScreenKey;
        C7384Etj.A0Y(uri, 0);
        boolean booleanQueryParameter = uri.getBooleanQueryParameter(ALLOW_SKIP_PARAM, false);
        boolean booleanQueryParameter2 = uri.getBooleanQueryParameter(SKIP_CONSENT_PARAM, false);
        String queryParameter = uri.getQueryParameter(WAKE_WORD_PARAM);
        boolean booleanQueryParameter3 = uri.getBooleanQueryParameter(PHONE_PROVIDER_LINKED_PARAM, false);
        String strCanonicalSetupSessionId = canonicalSetupSessionId(uri.getQueryParameter(SETUP_SESSION_ID_PARAM));
        String str = HatchAppOpenLogger.INSTANCE.extractUtmParams(uri).first;
        if (str == null || str.equals(HatchCcvLoggingKt.NO_POSTAL_FIELD)) {
            str = null;
        }
        if (booleanQueryParameter2) {
            activationScreenKey = ConversationTabScreenKey.INSTANCE;
        } else {
            if (!z) {
                return new WearablesOnboardingDeeplinkTarget(MODAL_FULLSCREEN.equals(uri.getQueryParameter(MODAL_PARAM)) ? new WearablesLinkingFullScreenKey(queryParameter, str, true, booleanQueryParameter3, strCanonicalSetupSessionId) : new WearablesLinkingBottomSheetKey(queryParameter, str, true, booleanQueryParameter3, strCanonicalSetupSessionId), LaunchFlag.NAVIGATE);
            }
            activationScreenKey = new ActivationScreenKey(true, booleanQueryParameter, queryParameter, booleanQueryParameter3, strCanonicalSetupSessionId);
        }
        return new WearablesOnboardingDeeplinkTarget(activationScreenKey, LaunchFlag.REPLACE_BACKSTACK);
    }
}

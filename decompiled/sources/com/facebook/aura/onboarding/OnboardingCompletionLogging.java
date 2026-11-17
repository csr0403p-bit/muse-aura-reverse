package com.facebook.aura.onboarding;

import X.AIW;
import X.C0924AIa;
import X.C3cG;
import X.C3cH;
import X.HsJ;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContextKt;
import com.facebook.aura.settings.HatchCredentialsViewModelKt;

/* loaded from: classes3.dex */
public final class OnboardingCompletionLogging {
    public static final String COMPONENT = "onboarding_complete";
    public static final String EVENT_NAME = "onboarding_complete";
    public static final OnboardingCompletionLogging INSTANCE = new OnboardingCompletionLogging();
    public static final String KEY_ERROR_CODE = "error_code";
    public static final String KEY_HTTP_STATUS = "http_status";

    public final void log(Object obj, long j) {
        Throwable thA00 = HsJ.A00(obj);
        NetworkException networkException = thA00 instanceof NetworkException ? (NetworkException) thA00 : null;
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.ONBOARDING.getValue();
        String value2 = HatchSubsurface.ONBOARDING_POST_AUTH.getValue();
        String value3 = HatchEventType.STATUS_CHECK.getValue();
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(HatchMetadataKey.RESULT.getValue(), thA00 == null ? "success" : "error");
        C3cH.A1A(HatchMetadataKey.DURATION_MS.getValue(), c0924AIaA0u, j);
        if (thA00 != null) {
            c0924AIaA0u.put(HatchMetadataKey.FAILURE_REASON.getValue(), networkException == null ? HatchCallJoinContextKt.COSMOS_JOIN_NO_RESPONSE : HatchCredentialsViewModelKt.SECURE_STORAGE_FAILURE_REQUEST_FAILED);
            if (networkException != null) {
                c0924AIaA0u.put("http_status", String.valueOf(networkException.httpResponseCode));
                String str = networkException.errorCode;
                if (str != null) {
                    c0924AIaA0u.put("error_code", str);
                }
            }
        }
        hatchAppEventLogger.logEvent("onboarding_complete", value, value2, value3, "onboarding_complete", AIW.A0K(c0924AIaA0u), null);
    }
}

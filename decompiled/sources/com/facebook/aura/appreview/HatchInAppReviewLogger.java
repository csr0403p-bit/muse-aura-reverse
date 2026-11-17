package com.facebook.aura.appreview;

import X.AIW;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.appreview.HatchInAppReviewOutcome;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import com.google.android.gms.common.api.ApiException;
import com.google.android.play.core.review.ReviewException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HatchInAppReviewLogger {
    public static final int $stable = 0;
    public static final String EVENT_NAME = "in_app_review_request";
    public static final HatchInAppReviewLogger INSTANCE = new HatchInAppReviewLogger();
    public static final String KEY_ERROR_CODE = "error_code";
    public static final String KEY_MS_SINCE_REPLY_FAILURE = "ms_since_reply_failure";
    public static final String KEY_TRIGGER = "trigger";

    public final void logLaunchAttempt(HatchInAppReviewTrigger.TriggerSource triggerSource) {
        C7384Etj.A0Y(triggerSource, 0);
        log(triggerSource, AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "launch_attempted"));
    }

    private final void log(HatchInAppReviewTrigger.TriggerSource triggerSource, Map<String, String> map) {
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String surface = triggerSource.getSurface();
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.putAll(map);
        c0924AIa.put("trigger", triggerSource.getAnalyticsValue());
        Long l = HatchInAppReviewTrigger.lastReplyFailureElapsedMs;
        if (l != null) {
            c0924AIa.put(KEY_MS_SINCE_REPLY_FAILURE, String.valueOf(C3cG.A04(l.longValue())));
        }
        hatchAppEventLogger.logEvent(EVENT_NAME, surface, null, null, null, AIW.A0K(c0924AIa), null);
    }

    public final void logRequestResult(HatchInAppReviewOutcome hatchInAppReviewOutcome, HatchInAppReviewTrigger.TriggerSource triggerSource) {
        Map<String, String> mapA0K;
        ApiException apiException;
        AnonymousClass003.A0u(hatchInAppReviewOutcome, triggerSource);
        if (hatchInAppReviewOutcome.equals(HatchInAppReviewOutcome.Success.INSTANCE)) {
            mapA0K = AnonymousClass006.A10(HatchMetadataKey.RESULT.getValue(), "success");
        } else {
            if (!(hatchInAppReviewOutcome instanceof HatchInAppReviewOutcome.Failure)) {
                throw C3cG.A0q();
            }
            C0924AIa c0924AIa = new C0924AIa();
            c0924AIa.put(HatchMetadataKey.RESULT.getValue(), "failure");
            HatchInAppReviewOutcome.Failure failure = (HatchInAppReviewOutcome.Failure) hatchInAppReviewOutcome;
            c0924AIa.put(HatchMetadataKey.FAILURE_REASON.getValue(), failure.reason.getAnalyticsValue());
            Throwable th = failure.cause;
            if ((th instanceof ReviewException) && (apiException = (ApiException) th) != null) {
                c0924AIa.put("error_code", String.valueOf(apiException.mStatus.A00));
            }
            mapA0K = AIW.A0K(c0924AIa);
        }
        log(triggerSource, mapA0K);
    }
}

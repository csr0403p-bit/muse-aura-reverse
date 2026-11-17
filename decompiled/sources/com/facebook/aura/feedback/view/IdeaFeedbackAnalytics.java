package com.facebook.aura.feedback.view;

import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.feedback.FeedbackReason;

/* loaded from: classes.dex */
public final class IdeaFeedbackAnalytics {
    public static final int $stable = 0;
    public static final IdeaFeedbackAnalytics INSTANCE = new IdeaFeedbackAnalytics();
    public static final String RESULT_WRITE_SOMETHING = "write_something";
    public static final String RESULT_WRITTEN = "written";

    public final void logWriteSomethingClick(String str) {
        C7384Etj.A0Y(str, 0);
        logFeedbackFormClick(str, RESULT_WRITE_SOMETHING);
    }

    public final void logWrittenSubmitClick$fbandroid_express_aura_java_com_facebook_aura_feedback_view_view(String str) {
        C7384Etj.A0Y(str, 0);
        logFeedbackFormClick(str, RESULT_WRITTEN);
    }

    private final void logFeedbackFormClick(String str, String str2) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.IDEAS, null, HatchScreen.FEEDBACK_FORM, HatchComponent.FEEDBACK_FORM, null, AnonymousClass007.A0d(HatchMetadataKey.RESULT.getValue(), str2, AnonymousClass006.A12(HatchMetadataKey.IDEA_CARD_ID, str)), null);
    }

    public final void logReasonClick(String str, FeedbackReason feedbackReason) {
        AnonymousClass003.A0u(str, feedbackReason);
        logFeedbackFormClick(str, feedbackReason.getAnalyticsValue());
    }

    public final void logWriteSheetDismiss$fbandroid_express_aura_java_com_facebook_aura_feedback_view_view(String str) {
        AnonymousClass006.A0b(str).logDismiss(HatchSurface.IDEAS, null, HatchScreen.FEEDBACK_FORM, HatchComponent.CLOSE_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.IDEA_CARD_ID, str));
    }
}

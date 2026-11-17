package com.facebook.aura.feedback;

import X.Ey9;
import X.F3w;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedbackReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedbackReason[] $VALUES;
    public static final FeedbackReason DISLIKE;
    public static final FeedbackReason HIDE;
    public static final FeedbackReason NOT_RELEVANT;
    public static final FeedbackReason OTHER;
    public static final FeedbackReason TOO_REPETITIVE;
    public static final FeedbackReason TOO_SPECIFIC;
    public final String analyticsValue;

    static {
        FeedbackReason feedbackReason = new FeedbackReason("NOT_RELEVANT", 0, "not_relevant");
        NOT_RELEVANT = feedbackReason;
        FeedbackReason feedbackReason2 = new FeedbackReason("TOO_REPETITIVE", 1, "too_repetitive");
        TOO_REPETITIVE = feedbackReason2;
        FeedbackReason feedbackReason3 = new FeedbackReason("TOO_SPECIFIC", 2, "too_specific");
        TOO_SPECIFIC = feedbackReason3;
        FeedbackReason feedbackReason4 = new FeedbackReason("DISLIKE", 3, "dislike");
        DISLIKE = feedbackReason4;
        FeedbackReason feedbackReason5 = new FeedbackReason("HIDE", 4, "hide");
        HIDE = feedbackReason5;
        FeedbackReason feedbackReason6 = new FeedbackReason("OTHER", 5, DeviceSmsReaderKt.ATTACHMENT_OTHER);
        OTHER = feedbackReason6;
        FeedbackReason[] feedbackReasonArr = {feedbackReason, feedbackReason2, feedbackReason3, feedbackReason4, feedbackReason5, feedbackReason6};
        $VALUES = feedbackReasonArr;
        $ENTRIES = new F3w(feedbackReasonArr);
    }

    public static Ey9<FeedbackReason> getEntries() {
        return $ENTRIES;
    }

    public static FeedbackReason valueOf(String str) {
        return (FeedbackReason) Enum.valueOf(FeedbackReason.class, str);
    }

    public static FeedbackReason[] values() {
        return (FeedbackReason[]) $VALUES.clone();
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public FeedbackReason(String str, int i, String str2) {
        this.analyticsValue = str2;
    }
}

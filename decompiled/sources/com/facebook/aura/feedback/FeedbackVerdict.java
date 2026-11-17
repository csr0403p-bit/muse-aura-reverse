package com.facebook.aura.feedback;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedbackVerdict {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedbackVerdict[] $VALUES;
    public static final FeedbackVerdict DOWN;
    public static final FeedbackVerdict UP;
    public final String wireValue;

    static {
        FeedbackVerdict feedbackVerdict = new FeedbackVerdict("UP", 0, "feedback_up");
        UP = feedbackVerdict;
        FeedbackVerdict feedbackVerdict2 = new FeedbackVerdict("DOWN", 1, "feedback_down");
        DOWN = feedbackVerdict2;
        FeedbackVerdict[] feedbackVerdictArr = {feedbackVerdict, feedbackVerdict2};
        $VALUES = feedbackVerdictArr;
        $ENTRIES = new F3w(feedbackVerdictArr);
    }

    public static Ey9<FeedbackVerdict> getEntries() {
        return $ENTRIES;
    }

    public static FeedbackVerdict valueOf(String str) {
        return (FeedbackVerdict) Enum.valueOf(FeedbackVerdict.class, str);
    }

    public static FeedbackVerdict[] values() {
        return (FeedbackVerdict[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public FeedbackVerdict(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

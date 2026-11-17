package com.facebook.aura.conversation.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedbackMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedbackMode[] $VALUES;
    public static final FeedbackMode BAD;
    public static final FeedbackMode GOOD;

    static {
        FeedbackMode feedbackMode = new FeedbackMode("GOOD", 0);
        GOOD = feedbackMode;
        FeedbackMode feedbackMode2 = new FeedbackMode("BAD", 1);
        BAD = feedbackMode2;
        FeedbackMode[] feedbackModeArr = {feedbackMode, feedbackMode2};
        $VALUES = feedbackModeArr;
        $ENTRIES = new F3w(feedbackModeArr);
    }

    public static Ey9<FeedbackMode> getEntries() {
        return $ENTRIES;
    }

    public static FeedbackMode valueOf(String str) {
        return (FeedbackMode) Enum.valueOf(FeedbackMode.class, str);
    }

    public static FeedbackMode[] values() {
        return (FeedbackMode[]) $VALUES.clone();
    }

    public FeedbackMode(String str, int i) {
    }
}

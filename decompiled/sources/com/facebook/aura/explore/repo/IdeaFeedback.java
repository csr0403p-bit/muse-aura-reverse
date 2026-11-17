package com.facebook.aura.explore.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaFeedback {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaFeedback[] $VALUES;
    public static final IdeaFeedback DOWN;
    public static final IdeaFeedback UP;
    public final String wireValue;

    static {
        IdeaFeedback ideaFeedback = new IdeaFeedback("UP", 0, "feedback_up");
        UP = ideaFeedback;
        IdeaFeedback ideaFeedback2 = new IdeaFeedback("DOWN", 1, "feedback_down");
        DOWN = ideaFeedback2;
        IdeaFeedback[] ideaFeedbackArr = {ideaFeedback, ideaFeedback2};
        $VALUES = ideaFeedbackArr;
        $ENTRIES = new F3w(ideaFeedbackArr);
    }

    public static Ey9<IdeaFeedback> getEntries() {
        return $ENTRIES;
    }

    public static IdeaFeedback valueOf(String str) {
        return (IdeaFeedback) Enum.valueOf(IdeaFeedback.class, str);
    }

    public static IdeaFeedback[] values() {
        return (IdeaFeedback[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public IdeaFeedback(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

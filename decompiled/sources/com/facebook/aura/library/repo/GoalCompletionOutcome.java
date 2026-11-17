package com.facebook.aura.library.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GoalCompletionOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalCompletionOutcome[] $VALUES;
    public static final GoalCompletionOutcome FAILURE;
    public static final GoalCompletionOutcome LIFECYCLE_CONFLICT;
    public static final GoalCompletionOutcome SUCCESS;

    static {
        GoalCompletionOutcome goalCompletionOutcome = new GoalCompletionOutcome("SUCCESS", 0);
        SUCCESS = goalCompletionOutcome;
        GoalCompletionOutcome goalCompletionOutcome2 = new GoalCompletionOutcome("LIFECYCLE_CONFLICT", 1);
        LIFECYCLE_CONFLICT = goalCompletionOutcome2;
        GoalCompletionOutcome goalCompletionOutcome3 = new GoalCompletionOutcome("FAILURE", 2);
        FAILURE = goalCompletionOutcome3;
        GoalCompletionOutcome[] goalCompletionOutcomeArr = {goalCompletionOutcome, goalCompletionOutcome2, goalCompletionOutcome3};
        $VALUES = goalCompletionOutcomeArr;
        $ENTRIES = C3cG.A0w(goalCompletionOutcomeArr);
    }

    public static Ey9<GoalCompletionOutcome> getEntries() {
        return $ENTRIES;
    }

    public static GoalCompletionOutcome valueOf(String str) {
        return (GoalCompletionOutcome) Enum.valueOf(GoalCompletionOutcome.class, str);
    }

    public static GoalCompletionOutcome[] values() {
        return (GoalCompletionOutcome[]) $VALUES.clone();
    }

    public GoalCompletionOutcome(String str, int i) {
    }
}

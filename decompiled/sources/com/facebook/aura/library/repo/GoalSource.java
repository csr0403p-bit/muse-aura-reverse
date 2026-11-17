package com.facebook.aura.library.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GoalSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalSource[] $VALUES;
    public static final GoalSource ASSISTANT_TRACKING;
    public static final GoalSource USER_GOAL;
    public final String wireValue;

    static {
        GoalSource goalSource = new GoalSource("USER_GOAL", 0, "user_goal");
        USER_GOAL = goalSource;
        GoalSource goalSource2 = new GoalSource("ASSISTANT_TRACKING", 1, "assistant_tracking");
        ASSISTANT_TRACKING = goalSource2;
        GoalSource[] goalSourceArr = {goalSource, goalSource2};
        $VALUES = goalSourceArr;
        $ENTRIES = C3cG.A0w(goalSourceArr);
    }

    public static Ey9<GoalSource> getEntries() {
        return $ENTRIES;
    }

    public static GoalSource valueOf(String str) {
        return (GoalSource) Enum.valueOf(GoalSource.class, str);
    }

    public static GoalSource[] values() {
        return (GoalSource[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public GoalSource(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

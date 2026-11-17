package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SharedGoalProblem {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SharedGoalProblem[] $VALUES;
    public static final SharedGoalProblem CONFLICT;
    public static final SharedGoalProblem HOST_UNAVAILABLE;
    public static final SharedGoalProblem LOAD_FAILED;
    public static final SharedGoalProblem MISSING;
    public static final SharedGoalProblem NO_ACCESS;
    public static final SharedGoalProblem RATE_LIMITED;
    public static final SharedGoalProblem SAVE_FAILED;

    static {
        SharedGoalProblem sharedGoalProblem = new SharedGoalProblem("LOAD_FAILED", 0);
        LOAD_FAILED = sharedGoalProblem;
        SharedGoalProblem sharedGoalProblem2 = new SharedGoalProblem("NO_ACCESS", 1);
        NO_ACCESS = sharedGoalProblem2;
        SharedGoalProblem sharedGoalProblem3 = new SharedGoalProblem("MISSING", 2);
        MISSING = sharedGoalProblem3;
        SharedGoalProblem sharedGoalProblem4 = new SharedGoalProblem("RATE_LIMITED", 3);
        RATE_LIMITED = sharedGoalProblem4;
        SharedGoalProblem sharedGoalProblem5 = new SharedGoalProblem("HOST_UNAVAILABLE", 4);
        HOST_UNAVAILABLE = sharedGoalProblem5;
        SharedGoalProblem sharedGoalProblem6 = new SharedGoalProblem("CONFLICT", 5);
        CONFLICT = sharedGoalProblem6;
        SharedGoalProblem sharedGoalProblem7 = new SharedGoalProblem("SAVE_FAILED", 6);
        SAVE_FAILED = sharedGoalProblem7;
        SharedGoalProblem[] sharedGoalProblemArr = {sharedGoalProblem, sharedGoalProblem2, sharedGoalProblem3, sharedGoalProblem4, sharedGoalProblem5, sharedGoalProblem6, sharedGoalProblem7};
        $VALUES = sharedGoalProblemArr;
        $ENTRIES = C3cG.A0w(sharedGoalProblemArr);
    }

    public static Ey9<SharedGoalProblem> getEntries() {
        return $ENTRIES;
    }

    public static SharedGoalProblem valueOf(String str) {
        return (SharedGoalProblem) Enum.valueOf(SharedGoalProblem.class, str);
    }

    public static SharedGoalProblem[] values() {
        return (SharedGoalProblem[]) $VALUES.clone();
    }

    public SharedGoalProblem(String str, int i) {
    }
}

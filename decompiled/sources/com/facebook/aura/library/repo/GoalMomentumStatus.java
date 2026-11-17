package com.facebook.aura.library.repo;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GoalMomentumStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalMomentumStatus[] $VALUES;
    public static final GoalMomentumStatus AT_RISK;
    public static final GoalMomentumStatus BEHIND;
    public static final GoalMomentumStatus ON_TRACK;

    static {
        GoalMomentumStatus goalMomentumStatus = new GoalMomentumStatus("ON_TRACK", 0);
        ON_TRACK = goalMomentumStatus;
        GoalMomentumStatus goalMomentumStatus2 = new GoalMomentumStatus("AT_RISK", 1);
        AT_RISK = goalMomentumStatus2;
        GoalMomentumStatus goalMomentumStatus3 = new GoalMomentumStatus("BEHIND", 2);
        BEHIND = goalMomentumStatus3;
        GoalMomentumStatus[] goalMomentumStatusArr = {goalMomentumStatus, goalMomentumStatus2, goalMomentumStatus3};
        $VALUES = goalMomentumStatusArr;
        $ENTRIES = C3cG.A0w(goalMomentumStatusArr);
    }

    public static Ey9<GoalMomentumStatus> getEntries() {
        return $ENTRIES;
    }

    public static GoalMomentumStatus valueOf(String str) {
        return (GoalMomentumStatus) Enum.valueOf(GoalMomentumStatus.class, str);
    }

    public static GoalMomentumStatus[] values() {
        return (GoalMomentumStatus[]) $VALUES.clone();
    }

    public GoalMomentumStatus(String str, int i) {
    }
}

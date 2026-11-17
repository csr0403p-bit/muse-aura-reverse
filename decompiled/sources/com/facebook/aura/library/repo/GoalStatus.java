package com.facebook.aura.library.repo;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class GoalStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GoalStatus[] $VALUES;
    public static final GoalStatus ACTIVE;
    public static final GoalStatus COMPLETED;
    public static final Companion Companion;
    public static final GoalStatus PAUSED;
    public static final GoalStatus RETIRED;
    public final String wireValue;

    public final class Companion {
        public final GoalStatus completedOrActive(boolean z) {
            return z ? GoalStatus.COMPLETED : GoalStatus.ACTIVE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        GoalStatus goalStatus = new GoalStatus("ACTIVE", 0, HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE);
        ACTIVE = goalStatus;
        GoalStatus goalStatus2 = new GoalStatus("PAUSED", 1, "paused");
        PAUSED = goalStatus2;
        GoalStatus goalStatus3 = new GoalStatus("RETIRED", 2, "retired");
        RETIRED = goalStatus3;
        GoalStatus goalStatus4 = new GoalStatus("COMPLETED", 3, "completed");
        COMPLETED = goalStatus4;
        GoalStatus[] goalStatusArr = {goalStatus, goalStatus2, goalStatus3, goalStatus4};
        $VALUES = goalStatusArr;
        $ENTRIES = C3cG.A0w(goalStatusArr);
        Companion = new Companion();
    }

    public static Ey9<GoalStatus> getEntries() {
        return $ENTRIES;
    }

    public static GoalStatus valueOf(String str) {
        return (GoalStatus) Enum.valueOf(GoalStatus.class, str);
    }

    public static GoalStatus[] values() {
        return (GoalStatus[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public GoalStatus(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

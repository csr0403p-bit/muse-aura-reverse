package com.facebook.aura.subscription.model;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ComplimentarySubscriptionRedemptionState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ComplimentarySubscriptionRedemptionState[] $VALUES;
    public static final ComplimentarySubscriptionRedemptionState COMPLETED;
    public static final ComplimentarySubscriptionRedemptionState ENABLED;
    public static final ComplimentarySubscriptionRedemptionState FAILED;
    public static final ComplimentarySubscriptionRedemptionState LOADING;

    static {
        ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState = new ComplimentarySubscriptionRedemptionState("ENABLED", 0);
        ENABLED = complimentarySubscriptionRedemptionState;
        ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState2 = new ComplimentarySubscriptionRedemptionState("LOADING", 1);
        LOADING = complimentarySubscriptionRedemptionState2;
        ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState3 = new ComplimentarySubscriptionRedemptionState("COMPLETED", 2);
        COMPLETED = complimentarySubscriptionRedemptionState3;
        ComplimentarySubscriptionRedemptionState complimentarySubscriptionRedemptionState4 = new ComplimentarySubscriptionRedemptionState(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = complimentarySubscriptionRedemptionState4;
        ComplimentarySubscriptionRedemptionState[] complimentarySubscriptionRedemptionStateArr = {complimentarySubscriptionRedemptionState, complimentarySubscriptionRedemptionState2, complimentarySubscriptionRedemptionState3, complimentarySubscriptionRedemptionState4};
        $VALUES = complimentarySubscriptionRedemptionStateArr;
        $ENTRIES = new F3w(complimentarySubscriptionRedemptionStateArr);
    }

    public static Ey9<ComplimentarySubscriptionRedemptionState> getEntries() {
        return $ENTRIES;
    }

    public static ComplimentarySubscriptionRedemptionState valueOf(String str) {
        return (ComplimentarySubscriptionRedemptionState) Enum.valueOf(ComplimentarySubscriptionRedemptionState.class, str);
    }

    public static ComplimentarySubscriptionRedemptionState[] values() {
        return (ComplimentarySubscriptionRedemptionState[]) $VALUES.clone();
    }

    public ComplimentarySubscriptionRedemptionState(String str, int i) {
    }
}

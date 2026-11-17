package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchShareEligibilityState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchShareEligibilityState[] $VALUES;
    public static final HatchShareEligibilityState ELIGIBLE;
    public static final HatchShareEligibilityState INELIGIBLE;
    public static final HatchShareEligibilityState NOT_REQUIRED;
    public static final HatchShareEligibilityState PENDING;
    public static final HatchShareEligibilityState UNAVAILABLE;

    static {
        HatchShareEligibilityState hatchShareEligibilityState = new HatchShareEligibilityState("NOT_REQUIRED", 0);
        NOT_REQUIRED = hatchShareEligibilityState;
        HatchShareEligibilityState hatchShareEligibilityState2 = new HatchShareEligibilityState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 1);
        PENDING = hatchShareEligibilityState2;
        HatchShareEligibilityState hatchShareEligibilityState3 = new HatchShareEligibilityState(ConfidentialVmEligibility.STATE_ELIGIBLE, 2);
        ELIGIBLE = hatchShareEligibilityState3;
        HatchShareEligibilityState hatchShareEligibilityState4 = new HatchShareEligibilityState("INELIGIBLE", 3);
        INELIGIBLE = hatchShareEligibilityState4;
        HatchShareEligibilityState hatchShareEligibilityState5 = new HatchShareEligibilityState("UNAVAILABLE", 4);
        UNAVAILABLE = hatchShareEligibilityState5;
        HatchShareEligibilityState[] hatchShareEligibilityStateArr = {hatchShareEligibilityState, hatchShareEligibilityState2, hatchShareEligibilityState3, hatchShareEligibilityState4, hatchShareEligibilityState5};
        $VALUES = hatchShareEligibilityStateArr;
        $ENTRIES = new F3w(hatchShareEligibilityStateArr);
    }

    public static Ey9<HatchShareEligibilityState> getEntries() {
        return $ENTRIES;
    }

    public static HatchShareEligibilityState valueOf(String str) {
        return (HatchShareEligibilityState) Enum.valueOf(HatchShareEligibilityState.class, str);
    }

    public static HatchShareEligibilityState[] values() {
        return (HatchShareEligibilityState[]) $VALUES.clone();
    }

    public HatchShareEligibilityState(String str, int i) {
    }
}

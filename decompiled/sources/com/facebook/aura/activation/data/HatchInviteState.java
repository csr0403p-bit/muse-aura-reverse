package com.facebook.aura.activation.data;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchInviteState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchInviteState[] $VALUES;
    public static final HatchInviteState ELIGIBLE;
    public static final HatchInviteState EXHAUSTED;
    public static final HatchInviteState NOT_ELIGIBLE;

    static {
        HatchInviteState hatchInviteState = new HatchInviteState(ConfidentialVmEligibility.STATE_ELIGIBLE, 0);
        ELIGIBLE = hatchInviteState;
        HatchInviteState hatchInviteState2 = new HatchInviteState("EXHAUSTED", 1);
        EXHAUSTED = hatchInviteState2;
        HatchInviteState hatchInviteState3 = new HatchInviteState("NOT_ELIGIBLE", 2);
        NOT_ELIGIBLE = hatchInviteState3;
        HatchInviteState[] hatchInviteStateArr = {hatchInviteState, hatchInviteState2, hatchInviteState3};
        $VALUES = hatchInviteStateArr;
        $ENTRIES = C3cG.A0w(hatchInviteStateArr);
    }

    public static Ey9<HatchInviteState> getEntries() {
        return $ENTRIES;
    }

    public static HatchInviteState valueOf(String str) {
        return (HatchInviteState) Enum.valueOf(HatchInviteState.class, str);
    }

    public static HatchInviteState[] values() {
        return (HatchInviteState[]) $VALUES.clone();
    }

    public HatchInviteState(String str, int i) {
    }
}

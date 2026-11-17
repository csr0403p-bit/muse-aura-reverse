package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class PairsRelationshipState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ PairsRelationshipState[] $VALUES;
    public static final PairsRelationshipState AWAITING_SAS;
    public static final PairsRelationshipState CONFIRMED_LOCAL;
    public static final PairsRelationshipState IDENTITY_CHANGED;
    public static final PairsRelationshipState PENDING;
    public static final PairsRelationshipState VERIFIED;

    static {
        PairsRelationshipState pairsRelationshipState = new PairsRelationshipState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 0);
        PENDING = pairsRelationshipState;
        PairsRelationshipState pairsRelationshipState2 = new PairsRelationshipState("AWAITING_SAS", 1);
        AWAITING_SAS = pairsRelationshipState2;
        PairsRelationshipState pairsRelationshipState3 = new PairsRelationshipState("CONFIRMED_LOCAL", 2);
        CONFIRMED_LOCAL = pairsRelationshipState3;
        PairsRelationshipState pairsRelationshipState4 = new PairsRelationshipState("VERIFIED", 3);
        VERIFIED = pairsRelationshipState4;
        PairsRelationshipState pairsRelationshipState5 = new PairsRelationshipState("IDENTITY_CHANGED", 4);
        IDENTITY_CHANGED = pairsRelationshipState5;
        PairsRelationshipState[] pairsRelationshipStateArr = {pairsRelationshipState, pairsRelationshipState2, pairsRelationshipState3, pairsRelationshipState4, pairsRelationshipState5};
        $VALUES = pairsRelationshipStateArr;
        $ENTRIES = C3cG.A0w(pairsRelationshipStateArr);
    }

    public static Ey9<PairsRelationshipState> getEntries() {
        return $ENTRIES;
    }

    public static PairsRelationshipState valueOf(String str) {
        return (PairsRelationshipState) Enum.valueOf(PairsRelationshipState.class, str);
    }

    public static PairsRelationshipState[] values() {
        return (PairsRelationshipState[]) $VALUES.clone();
    }

    public PairsRelationshipState(String str, int i) {
    }
}

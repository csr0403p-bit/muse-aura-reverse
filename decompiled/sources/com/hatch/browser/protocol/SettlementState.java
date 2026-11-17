package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SettlementState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SettlementState[] $VALUES;
    public static final Companion Companion;
    public static final SettlementState PENDING;
    public static final SettlementState SETTLED;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        SettlementState settlementState = new SettlementState("SETTLED", 0);
        SETTLED = settlementState;
        SettlementState settlementState2 = new SettlementState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 1);
        PENDING = settlementState2;
        SettlementState[] settlementStateArr = {settlementState, settlementState2};
        $VALUES = settlementStateArr;
        $ENTRIES = C3cG.A0w(settlementStateArr);
        Companion = new Companion();
    }

    public static Ey9<SettlementState> getEntries() {
        return $ENTRIES;
    }

    public static SettlementState valueOf(String str) {
        return (SettlementState) Enum.valueOf(SettlementState.class, str);
    }

    public static SettlementState[] values() {
        return (SettlementState[]) $VALUES.clone();
    }

    public SettlementState(String str, int i) {
    }
}

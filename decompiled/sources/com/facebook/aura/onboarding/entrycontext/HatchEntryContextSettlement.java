package com.facebook.aura.onboarding.entrycontext;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchEntryContextSettlement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchEntryContextSettlement[] $VALUES;
    public static final HatchEntryContextSettlement CONTRACT_VIOLATION;
    public static final HatchEntryContextSettlement RETRY;
    public static final HatchEntryContextSettlement SETTLED;

    static {
        HatchEntryContextSettlement hatchEntryContextSettlement = new HatchEntryContextSettlement("SETTLED", 0);
        SETTLED = hatchEntryContextSettlement;
        HatchEntryContextSettlement hatchEntryContextSettlement2 = new HatchEntryContextSettlement("RETRY", 1);
        RETRY = hatchEntryContextSettlement2;
        HatchEntryContextSettlement hatchEntryContextSettlement3 = new HatchEntryContextSettlement("CONTRACT_VIOLATION", 2);
        CONTRACT_VIOLATION = hatchEntryContextSettlement3;
        HatchEntryContextSettlement[] hatchEntryContextSettlementArr = {hatchEntryContextSettlement, hatchEntryContextSettlement2, hatchEntryContextSettlement3};
        $VALUES = hatchEntryContextSettlementArr;
        $ENTRIES = C3cG.A0w(hatchEntryContextSettlementArr);
    }

    public static Ey9<HatchEntryContextSettlement> getEntries() {
        return $ENTRIES;
    }

    public static HatchEntryContextSettlement valueOf(String str) {
        return (HatchEntryContextSettlement) Enum.valueOf(HatchEntryContextSettlement.class, str);
    }

    public static HatchEntryContextSettlement[] values() {
        return (HatchEntryContextSettlement[]) $VALUES.clone();
    }

    public HatchEntryContextSettlement(String str, int i) {
    }
}

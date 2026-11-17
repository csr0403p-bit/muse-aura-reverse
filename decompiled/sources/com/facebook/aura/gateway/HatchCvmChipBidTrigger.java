package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchCvmChipBidTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCvmChipBidTrigger[] $VALUES;
    public static final HatchCvmChipBidTrigger AUTOMATIC;
    public static final HatchCvmChipBidTrigger TRY_AGAIN;

    static {
        HatchCvmChipBidTrigger hatchCvmChipBidTrigger = new HatchCvmChipBidTrigger("AUTOMATIC", 0);
        AUTOMATIC = hatchCvmChipBidTrigger;
        HatchCvmChipBidTrigger hatchCvmChipBidTrigger2 = new HatchCvmChipBidTrigger("TRY_AGAIN", 1);
        TRY_AGAIN = hatchCvmChipBidTrigger2;
        HatchCvmChipBidTrigger[] hatchCvmChipBidTriggerArr = {hatchCvmChipBidTrigger, hatchCvmChipBidTrigger2};
        $VALUES = hatchCvmChipBidTriggerArr;
        $ENTRIES = C3cG.A0w(hatchCvmChipBidTriggerArr);
    }

    public static Ey9<HatchCvmChipBidTrigger> getEntries() {
        return $ENTRIES;
    }

    public static HatchCvmChipBidTrigger valueOf(String str) {
        return (HatchCvmChipBidTrigger) Enum.valueOf(HatchCvmChipBidTrigger.class, str);
    }

    public static HatchCvmChipBidTrigger[] values() {
        return (HatchCvmChipBidTrigger[]) $VALUES.clone();
    }

    public HatchCvmChipBidTrigger(String str, int i) {
    }
}

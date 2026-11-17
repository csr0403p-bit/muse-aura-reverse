package com.facebook.aura.checkout.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchSelectableRowType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSelectableRowType[] $VALUES;
    public static final HatchSelectableRowType CHEVRON;
    public static final HatchSelectableRowType RADIO;

    static {
        HatchSelectableRowType hatchSelectableRowType = new HatchSelectableRowType("RADIO", 0);
        RADIO = hatchSelectableRowType;
        HatchSelectableRowType hatchSelectableRowType2 = new HatchSelectableRowType("CHEVRON", 1);
        CHEVRON = hatchSelectableRowType2;
        HatchSelectableRowType[] hatchSelectableRowTypeArr = {hatchSelectableRowType, hatchSelectableRowType2};
        $VALUES = hatchSelectableRowTypeArr;
        $ENTRIES = C3cG.A0w(hatchSelectableRowTypeArr);
    }

    public static Ey9<HatchSelectableRowType> getEntries() {
        return $ENTRIES;
    }

    public static HatchSelectableRowType valueOf(String str) {
        return (HatchSelectableRowType) Enum.valueOf(HatchSelectableRowType.class, str);
    }

    public static HatchSelectableRowType[] values() {
        return (HatchSelectableRowType[]) $VALUES.clone();
    }

    public HatchSelectableRowType(String str, int i) {
    }
}

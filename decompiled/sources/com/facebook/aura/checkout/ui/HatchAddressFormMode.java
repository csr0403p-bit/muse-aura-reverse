package com.facebook.aura.checkout.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchAddressFormMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAddressFormMode[] $VALUES;
    public static final HatchAddressFormMode ADD;
    public static final HatchAddressFormMode EDIT;

    static {
        HatchAddressFormMode hatchAddressFormMode = new HatchAddressFormMode("ADD", 0);
        ADD = hatchAddressFormMode;
        HatchAddressFormMode hatchAddressFormMode2 = new HatchAddressFormMode("EDIT", 1);
        EDIT = hatchAddressFormMode2;
        HatchAddressFormMode[] hatchAddressFormModeArr = {hatchAddressFormMode, hatchAddressFormMode2};
        $VALUES = hatchAddressFormModeArr;
        $ENTRIES = C3cG.A0w(hatchAddressFormModeArr);
    }

    public static Ey9<HatchAddressFormMode> getEntries() {
        return $ENTRIES;
    }

    public static HatchAddressFormMode valueOf(String str) {
        return (HatchAddressFormMode) Enum.valueOf(HatchAddressFormMode.class, str);
    }

    public static HatchAddressFormMode[] values() {
        return (HatchAddressFormMode[]) $VALUES.clone();
    }

    public HatchAddressFormMode(String str, int i) {
    }
}

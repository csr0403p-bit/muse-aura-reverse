package com.facebook.aura.checkout.ui;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchSelectableLeadingIconStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSelectableLeadingIconStyle[] $VALUES;
    public static final HatchSelectableLeadingIconStyle DEFAULT;
    public static final HatchSelectableLeadingIconStyle ROUNDED_SQUARE;

    static {
        HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle = new HatchSelectableLeadingIconStyle("DEFAULT", 0);
        DEFAULT = hatchSelectableLeadingIconStyle;
        HatchSelectableLeadingIconStyle hatchSelectableLeadingIconStyle2 = new HatchSelectableLeadingIconStyle("ROUNDED_SQUARE", 1);
        ROUNDED_SQUARE = hatchSelectableLeadingIconStyle2;
        HatchSelectableLeadingIconStyle[] hatchSelectableLeadingIconStyleArr = {hatchSelectableLeadingIconStyle, hatchSelectableLeadingIconStyle2};
        $VALUES = hatchSelectableLeadingIconStyleArr;
        $ENTRIES = C3cG.A0w(hatchSelectableLeadingIconStyleArr);
    }

    public static Ey9<HatchSelectableLeadingIconStyle> getEntries() {
        return $ENTRIES;
    }

    public static HatchSelectableLeadingIconStyle valueOf(String str) {
        return (HatchSelectableLeadingIconStyle) Enum.valueOf(HatchSelectableLeadingIconStyle.class, str);
    }

    public static HatchSelectableLeadingIconStyle[] values() {
        return (HatchSelectableLeadingIconStyle[]) $VALUES.clone();
    }

    public HatchSelectableLeadingIconStyle(String str, int i) {
    }
}

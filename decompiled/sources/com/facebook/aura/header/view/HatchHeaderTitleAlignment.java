package com.facebook.aura.header.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchHeaderTitleAlignment {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchHeaderTitleAlignment[] $VALUES;
    public static final HatchHeaderTitleAlignment CENTER;
    public static final HatchHeaderTitleAlignment HIDDEN;
    public static final HatchHeaderTitleAlignment START;

    static {
        HatchHeaderTitleAlignment hatchHeaderTitleAlignment = new HatchHeaderTitleAlignment("CENTER", 0);
        CENTER = hatchHeaderTitleAlignment;
        HatchHeaderTitleAlignment hatchHeaderTitleAlignment2 = new HatchHeaderTitleAlignment("START", 1);
        START = hatchHeaderTitleAlignment2;
        HatchHeaderTitleAlignment hatchHeaderTitleAlignment3 = new HatchHeaderTitleAlignment("HIDDEN", 2);
        HIDDEN = hatchHeaderTitleAlignment3;
        HatchHeaderTitleAlignment[] hatchHeaderTitleAlignmentArr = {hatchHeaderTitleAlignment, hatchHeaderTitleAlignment2, hatchHeaderTitleAlignment3};
        $VALUES = hatchHeaderTitleAlignmentArr;
        $ENTRIES = new F3w(hatchHeaderTitleAlignmentArr);
    }

    public static Ey9<HatchHeaderTitleAlignment> getEntries() {
        return $ENTRIES;
    }

    public static HatchHeaderTitleAlignment valueOf(String str) {
        return (HatchHeaderTitleAlignment) Enum.valueOf(HatchHeaderTitleAlignment.class, str);
    }

    public static HatchHeaderTitleAlignment[] values() {
        return (HatchHeaderTitleAlignment[]) $VALUES.clone();
    }

    public HatchHeaderTitleAlignment(String str, int i) {
    }
}

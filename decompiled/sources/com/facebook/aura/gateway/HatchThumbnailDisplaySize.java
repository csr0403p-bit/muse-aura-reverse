package com.facebook.aura.gateway;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HatchThumbnailDisplaySize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchThumbnailDisplaySize[] $VALUES;
    public static final HatchThumbnailDisplaySize LARGE;
    public static final HatchThumbnailDisplaySize MEDIUM;
    public static final HatchThumbnailDisplaySize SMALL;

    static {
        HatchThumbnailDisplaySize hatchThumbnailDisplaySize = new HatchThumbnailDisplaySize("SMALL", 0);
        SMALL = hatchThumbnailDisplaySize;
        HatchThumbnailDisplaySize hatchThumbnailDisplaySize2 = new HatchThumbnailDisplaySize("MEDIUM", 1);
        MEDIUM = hatchThumbnailDisplaySize2;
        HatchThumbnailDisplaySize hatchThumbnailDisplaySize3 = new HatchThumbnailDisplaySize("LARGE", 2);
        LARGE = hatchThumbnailDisplaySize3;
        HatchThumbnailDisplaySize[] hatchThumbnailDisplaySizeArr = {hatchThumbnailDisplaySize, hatchThumbnailDisplaySize2, hatchThumbnailDisplaySize3};
        $VALUES = hatchThumbnailDisplaySizeArr;
        $ENTRIES = new F3w(hatchThumbnailDisplaySizeArr);
    }

    public static Ey9<HatchThumbnailDisplaySize> getEntries() {
        return $ENTRIES;
    }

    public static HatchThumbnailDisplaySize valueOf(String str) {
        return (HatchThumbnailDisplaySize) Enum.valueOf(HatchThumbnailDisplaySize.class, str);
    }

    public static HatchThumbnailDisplaySize[] values() {
        return (HatchThumbnailDisplaySize[]) $VALUES.clone();
    }

    public HatchThumbnailDisplaySize(String str, int i) {
    }
}

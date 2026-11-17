package com.facebook.aura.vds.compose.button;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraButtonSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraButtonSize[] $VALUES;
    public static final AuraButtonSize LARGE;
    public static final AuraButtonSize MEDIUM;
    public static final AuraButtonSize SMALL;

    static {
        AuraButtonSize auraButtonSize = new AuraButtonSize("SMALL", 0);
        SMALL = auraButtonSize;
        AuraButtonSize auraButtonSize2 = new AuraButtonSize("MEDIUM", 1);
        MEDIUM = auraButtonSize2;
        AuraButtonSize auraButtonSize3 = new AuraButtonSize("LARGE", 2);
        LARGE = auraButtonSize3;
        AuraButtonSize[] auraButtonSizeArr = {auraButtonSize, auraButtonSize2, auraButtonSize3};
        $VALUES = auraButtonSizeArr;
        $ENTRIES = new F3w(auraButtonSizeArr);
    }

    public static Ey9<AuraButtonSize> getEntries() {
        return $ENTRIES;
    }

    public static AuraButtonSize valueOf(String str) {
        return (AuraButtonSize) Enum.valueOf(AuraButtonSize.class, str);
    }

    public static AuraButtonSize[] values() {
        return (AuraButtonSize[]) $VALUES.clone();
    }

    public AuraButtonSize(String str, int i) {
    }
}

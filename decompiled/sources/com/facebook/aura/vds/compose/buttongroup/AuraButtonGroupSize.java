package com.facebook.aura.vds.compose.buttongroup;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraButtonGroupSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraButtonGroupSize[] $VALUES;
    public static final AuraButtonGroupSize LARGE;
    public static final AuraButtonGroupSize MEDIUM;

    static {
        AuraButtonGroupSize auraButtonGroupSize = new AuraButtonGroupSize("MEDIUM", 0);
        MEDIUM = auraButtonGroupSize;
        AuraButtonGroupSize auraButtonGroupSize2 = new AuraButtonGroupSize("LARGE", 1);
        LARGE = auraButtonGroupSize2;
        AuraButtonGroupSize[] auraButtonGroupSizeArr = {auraButtonGroupSize, auraButtonGroupSize2};
        $VALUES = auraButtonGroupSizeArr;
        $ENTRIES = new F3w(auraButtonGroupSizeArr);
    }

    public static Ey9<AuraButtonGroupSize> getEntries() {
        return $ENTRIES;
    }

    public static AuraButtonGroupSize valueOf(String str) {
        return (AuraButtonGroupSize) Enum.valueOf(AuraButtonGroupSize.class, str);
    }

    public static AuraButtonGroupSize[] values() {
        return (AuraButtonGroupSize[]) $VALUES.clone();
    }

    public AuraButtonGroupSize(String str, int i) {
    }
}

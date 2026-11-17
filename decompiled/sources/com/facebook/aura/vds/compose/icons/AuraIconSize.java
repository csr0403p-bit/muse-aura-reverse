package com.facebook.aura.vds.compose.icons;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconSize {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconSize[] $VALUES;
    public static final AuraIconSize EPIC;
    public static final AuraIconSize HUGE;
    public static final AuraIconSize ILLUSTRATION;
    public static final AuraIconSize ILLUSTRATION_SMALL;
    public static final AuraIconSize LARGE;
    public static final AuraIconSize MEDIUM;
    public static final AuraIconSize SMALL;
    public static final AuraIconSize SMALL_MEDIUM;
    public static final AuraIconSize TINY;
    public static final AuraIconSize XX_TINY;
    public static final AuraIconSize X_LARGE;
    public static final AuraIconSize X_SMALL;
    public static final AuraIconSize X_TINY;

    static {
        AuraIconSize auraIconSize = new AuraIconSize("XX_TINY", 0);
        XX_TINY = auraIconSize;
        AuraIconSize auraIconSize2 = new AuraIconSize("X_TINY", 1);
        X_TINY = auraIconSize2;
        AuraIconSize auraIconSize3 = new AuraIconSize("TINY", 2);
        TINY = auraIconSize3;
        AuraIconSize auraIconSize4 = new AuraIconSize("X_SMALL", 3);
        X_SMALL = auraIconSize4;
        AuraIconSize auraIconSize5 = new AuraIconSize("SMALL", 4);
        SMALL = auraIconSize5;
        AuraIconSize auraIconSize6 = new AuraIconSize("SMALL_MEDIUM", 5);
        SMALL_MEDIUM = auraIconSize6;
        AuraIconSize auraIconSize7 = new AuraIconSize("MEDIUM", 6);
        MEDIUM = auraIconSize7;
        AuraIconSize auraIconSize8 = new AuraIconSize("LARGE", 7);
        LARGE = auraIconSize8;
        AuraIconSize auraIconSize9 = new AuraIconSize("X_LARGE", 8);
        X_LARGE = auraIconSize9;
        AuraIconSize auraIconSize10 = new AuraIconSize("ILLUSTRATION_SMALL", 9);
        ILLUSTRATION_SMALL = auraIconSize10;
        AuraIconSize auraIconSize11 = new AuraIconSize("ILLUSTRATION", 10);
        ILLUSTRATION = auraIconSize11;
        AuraIconSize auraIconSize12 = new AuraIconSize("EPIC", 11);
        EPIC = auraIconSize12;
        AuraIconSize auraIconSize13 = new AuraIconSize("HUGE", 12);
        HUGE = auraIconSize13;
        AuraIconSize[] auraIconSizeArr = {auraIconSize, auraIconSize2, auraIconSize3, auraIconSize4, auraIconSize5, auraIconSize6, auraIconSize7, auraIconSize8, auraIconSize9, auraIconSize10, auraIconSize11, auraIconSize12, auraIconSize13};
        $VALUES = auraIconSizeArr;
        $ENTRIES = new F3w(auraIconSizeArr);
    }

    public static Ey9<AuraIconSize> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconSize valueOf(String str) {
        return (AuraIconSize) Enum.valueOf(AuraIconSize.class, str);
    }

    public static AuraIconSize[] values() {
        return (AuraIconSize[]) $VALUES.clone();
    }

    public AuraIconSize(String str, int i) {
    }
}

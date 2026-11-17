package com.facebook.aura.identity.provider;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ThemeType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ThemeType[] $VALUES;
    public static final ThemeType CUSTOM;
    public static final ThemeType DEFAULT;

    static {
        ThemeType themeType = new ThemeType("DEFAULT", 0);
        DEFAULT = themeType;
        ThemeType themeType2 = new ThemeType("CUSTOM", 1);
        CUSTOM = themeType2;
        ThemeType[] themeTypeArr = {themeType, themeType2};
        $VALUES = themeTypeArr;
        $ENTRIES = new F3w(themeTypeArr);
    }

    public static Ey9<ThemeType> getEntries() {
        return $ENTRIES;
    }

    public static ThemeType valueOf(String str) {
        return (ThemeType) Enum.valueOf(ThemeType.class, str);
    }

    public static ThemeType[] values() {
        return (ThemeType[]) $VALUES.clone();
    }

    public ThemeType(String str, int i) {
    }
}

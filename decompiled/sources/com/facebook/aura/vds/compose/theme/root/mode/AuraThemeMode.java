package com.facebook.aura.vds.compose.theme.root.mode;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraThemeMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraThemeMode[] $VALUES;
    public static final AuraThemeMode DARK;
    public static final AuraThemeMode DEFAULT;
    public static final AuraThemeMode LIGHT;

    static {
        AuraThemeMode auraThemeMode = new AuraThemeMode("DEFAULT", 0);
        DEFAULT = auraThemeMode;
        AuraThemeMode auraThemeMode2 = new AuraThemeMode("LIGHT", 1);
        LIGHT = auraThemeMode2;
        AuraThemeMode auraThemeMode3 = new AuraThemeMode("DARK", 2);
        DARK = auraThemeMode3;
        AuraThemeMode[] auraThemeModeArr = {auraThemeMode, auraThemeMode2, auraThemeMode3};
        $VALUES = auraThemeModeArr;
        $ENTRIES = new F3w(auraThemeModeArr);
    }

    public static Ey9<AuraThemeMode> getEntries() {
        return $ENTRIES;
    }

    public static AuraThemeMode valueOf(String str) {
        return (AuraThemeMode) Enum.valueOf(AuraThemeMode.class, str);
    }

    public static AuraThemeMode[] values() {
        return (AuraThemeMode[]) $VALUES.clone();
    }

    public AuraThemeMode(String str, int i) {
    }
}

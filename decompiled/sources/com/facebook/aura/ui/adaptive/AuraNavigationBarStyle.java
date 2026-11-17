package com.facebook.aura.ui.adaptive;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraNavigationBarStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraNavigationBarStyle[] $VALUES;
    public static final AuraNavigationBarStyle Docked;
    public static final AuraNavigationBarStyle Floating;

    static {
        AuraNavigationBarStyle auraNavigationBarStyle = new AuraNavigationBarStyle("Docked", 0);
        Docked = auraNavigationBarStyle;
        AuraNavigationBarStyle auraNavigationBarStyle2 = new AuraNavigationBarStyle("Floating", 1);
        Floating = auraNavigationBarStyle2;
        AuraNavigationBarStyle[] auraNavigationBarStyleArr = {auraNavigationBarStyle, auraNavigationBarStyle2};
        $VALUES = auraNavigationBarStyleArr;
        $ENTRIES = new F3w(auraNavigationBarStyleArr);
    }

    public static Ey9<AuraNavigationBarStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraNavigationBarStyle valueOf(String str) {
        return (AuraNavigationBarStyle) Enum.valueOf(AuraNavigationBarStyle.class, str);
    }

    public static AuraNavigationBarStyle[] values() {
        return (AuraNavigationBarStyle[]) $VALUES.clone();
    }

    public AuraNavigationBarStyle(String str, int i) {
    }
}

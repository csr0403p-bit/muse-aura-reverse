package com.facebook.aura.vds.compose.button;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraButtonStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraButtonStyle[] $VALUES;
    public static final AuraButtonStyle DESTRUCTIVE;
    public static final AuraButtonStyle ELEVATED;
    public static final AuraButtonStyle PRIMARY;
    public static final AuraButtonStyle PRIMARY_ALT;
    public static final AuraButtonStyle SECONDARY;

    static {
        AuraButtonStyle auraButtonStyle = new AuraButtonStyle("PRIMARY", 0);
        PRIMARY = auraButtonStyle;
        AuraButtonStyle auraButtonStyle2 = new AuraButtonStyle("PRIMARY_ALT", 1);
        PRIMARY_ALT = auraButtonStyle2;
        AuraButtonStyle auraButtonStyle3 = new AuraButtonStyle("SECONDARY", 2);
        SECONDARY = auraButtonStyle3;
        AuraButtonStyle auraButtonStyle4 = new AuraButtonStyle("DESTRUCTIVE", 3);
        DESTRUCTIVE = auraButtonStyle4;
        AuraButtonStyle auraButtonStyle5 = new AuraButtonStyle("ELEVATED", 4);
        ELEVATED = auraButtonStyle5;
        AuraButtonStyle[] auraButtonStyleArr = {auraButtonStyle, auraButtonStyle2, auraButtonStyle3, auraButtonStyle4, auraButtonStyle5};
        $VALUES = auraButtonStyleArr;
        $ENTRIES = new F3w(auraButtonStyleArr);
    }

    public static Ey9<AuraButtonStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraButtonStyle valueOf(String str) {
        return (AuraButtonStyle) Enum.valueOf(AuraButtonStyle.class, str);
    }

    public static AuraButtonStyle[] values() {
        return (AuraButtonStyle[]) $VALUES.clone();
    }

    public AuraButtonStyle(String str, int i) {
    }
}

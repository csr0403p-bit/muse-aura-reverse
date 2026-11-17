package com.facebook.aura.vds.compose.typegroup;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraIconAndBodyStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraIconAndBodyStyle[] $VALUES;
    public static final AuraIconAndBodyStyle B1;
    public static final AuraIconAndBodyStyle B2;
    public static final AuraIconAndBodyStyle B2_EMPHASIZED;
    public static final AuraIconAndBodyStyle BODY_REGULAR;
    public static final AuraIconAndBodyStyle SUBTITLE;

    static {
        AuraIconAndBodyStyle auraIconAndBodyStyle = new AuraIconAndBodyStyle("B1", 0);
        B1 = auraIconAndBodyStyle;
        AuraIconAndBodyStyle auraIconAndBodyStyle2 = new AuraIconAndBodyStyle("B2", 1);
        B2 = auraIconAndBodyStyle2;
        AuraIconAndBodyStyle auraIconAndBodyStyle3 = new AuraIconAndBodyStyle("B2_EMPHASIZED", 2);
        B2_EMPHASIZED = auraIconAndBodyStyle3;
        AuraIconAndBodyStyle auraIconAndBodyStyle4 = new AuraIconAndBodyStyle("SUBTITLE", 3);
        SUBTITLE = auraIconAndBodyStyle4;
        AuraIconAndBodyStyle auraIconAndBodyStyle5 = new AuraIconAndBodyStyle("BODY_REGULAR", 4);
        BODY_REGULAR = auraIconAndBodyStyle5;
        AuraIconAndBodyStyle[] auraIconAndBodyStyleArr = {auraIconAndBodyStyle, auraIconAndBodyStyle2, auraIconAndBodyStyle3, auraIconAndBodyStyle4, auraIconAndBodyStyle5};
        $VALUES = auraIconAndBodyStyleArr;
        $ENTRIES = new F3w(auraIconAndBodyStyleArr);
    }

    public static Ey9<AuraIconAndBodyStyle> getEntries() {
        return $ENTRIES;
    }

    public static AuraIconAndBodyStyle valueOf(String str) {
        return (AuraIconAndBodyStyle) Enum.valueOf(AuraIconAndBodyStyle.class, str);
    }

    public static AuraIconAndBodyStyle[] values() {
        return (AuraIconAndBodyStyle[]) $VALUES.clone();
    }

    public AuraIconAndBodyStyle(String str, int i) {
    }
}

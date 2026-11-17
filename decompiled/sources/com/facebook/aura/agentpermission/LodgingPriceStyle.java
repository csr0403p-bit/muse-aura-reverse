package com.facebook.aura.agentpermission;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class LodgingPriceStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LodgingPriceStyle[] $VALUES;
    public static final LodgingPriceStyle ITEM;
    public static final LodgingPriceStyle PAYMENT;
    public static final LodgingPriceStyle TOTAL;

    static {
        LodgingPriceStyle lodgingPriceStyle = new LodgingPriceStyle("ITEM", 0);
        ITEM = lodgingPriceStyle;
        LodgingPriceStyle lodgingPriceStyle2 = new LodgingPriceStyle("TOTAL", 1);
        TOTAL = lodgingPriceStyle2;
        LodgingPriceStyle lodgingPriceStyle3 = new LodgingPriceStyle("PAYMENT", 2);
        PAYMENT = lodgingPriceStyle3;
        LodgingPriceStyle[] lodgingPriceStyleArr = {lodgingPriceStyle, lodgingPriceStyle2, lodgingPriceStyle3};
        $VALUES = lodgingPriceStyleArr;
        $ENTRIES = C3cG.A0w(lodgingPriceStyleArr);
    }

    public static Ey9<LodgingPriceStyle> getEntries() {
        return $ENTRIES;
    }

    public static LodgingPriceStyle valueOf(String str) {
        return (LodgingPriceStyle) Enum.valueOf(LodgingPriceStyle.class, str);
    }

    public static LodgingPriceStyle[] values() {
        return (LodgingPriceStyle[]) $VALUES.clone();
    }

    public LodgingPriceStyle(String str, int i) {
    }
}

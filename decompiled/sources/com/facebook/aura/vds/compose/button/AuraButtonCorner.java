package com.facebook.aura.vds.compose.button;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraButtonCorner {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraButtonCorner[] $VALUES;
    public static final AuraButtonCorner PILL;
    public static final AuraButtonCorner ROUNDED;

    static {
        AuraButtonCorner auraButtonCorner = new AuraButtonCorner("PILL", 0);
        PILL = auraButtonCorner;
        AuraButtonCorner auraButtonCorner2 = new AuraButtonCorner("ROUNDED", 1);
        ROUNDED = auraButtonCorner2;
        AuraButtonCorner[] auraButtonCornerArr = {auraButtonCorner, auraButtonCorner2};
        $VALUES = auraButtonCornerArr;
        $ENTRIES = new F3w(auraButtonCornerArr);
    }

    public static Ey9<AuraButtonCorner> getEntries() {
        return $ENTRIES;
    }

    public static AuraButtonCorner valueOf(String str) {
        return (AuraButtonCorner) Enum.valueOf(AuraButtonCorner.class, str);
    }

    public static AuraButtonCorner[] values() {
        return (AuraButtonCorner[]) $VALUES.clone();
    }

    public AuraButtonCorner(String str, int i) {
    }
}

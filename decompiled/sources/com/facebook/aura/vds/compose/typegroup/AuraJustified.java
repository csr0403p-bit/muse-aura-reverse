package com.facebook.aura.vds.compose.typegroup;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AuraJustified {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraJustified[] $VALUES;
    public static final AuraJustified CENTER;
    public static final AuraJustified LEFT;

    static {
        AuraJustified auraJustified = new AuraJustified("CENTER", 0);
        CENTER = auraJustified;
        AuraJustified auraJustified2 = new AuraJustified("LEFT", 1);
        LEFT = auraJustified2;
        AuraJustified[] auraJustifiedArr = {auraJustified, auraJustified2};
        $VALUES = auraJustifiedArr;
        $ENTRIES = new F3w(auraJustifiedArr);
    }

    public static Ey9<AuraJustified> getEntries() {
        return $ENTRIES;
    }

    public static AuraJustified valueOf(String str) {
        return (AuraJustified) Enum.valueOf(AuraJustified.class, str);
    }

    public static AuraJustified[] values() {
        return (AuraJustified[]) $VALUES.clone();
    }

    public AuraJustified(String str, int i) {
    }
}

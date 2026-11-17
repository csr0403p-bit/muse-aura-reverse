package com.facebook.aura.activation.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuraConfettiDensity {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraConfettiDensity[] $VALUES;
    public static final AuraConfettiDensity DENSE;
    public static final AuraConfettiDensity STANDARD;

    static {
        AuraConfettiDensity auraConfettiDensity = new AuraConfettiDensity("STANDARD", 0);
        STANDARD = auraConfettiDensity;
        AuraConfettiDensity auraConfettiDensity2 = new AuraConfettiDensity("DENSE", 1);
        DENSE = auraConfettiDensity2;
        AuraConfettiDensity[] auraConfettiDensityArr = {auraConfettiDensity, auraConfettiDensity2};
        $VALUES = auraConfettiDensityArr;
        $ENTRIES = C3cG.A0w(auraConfettiDensityArr);
    }

    public static Ey9<AuraConfettiDensity> getEntries() {
        return $ENTRIES;
    }

    public static AuraConfettiDensity valueOf(String str) {
        return (AuraConfettiDensity) Enum.valueOf(AuraConfettiDensity.class, str);
    }

    public static AuraConfettiDensity[] values() {
        return (AuraConfettiDensity[]) $VALUES.clone();
    }

    public AuraConfettiDensity(String str, int i) {
    }
}

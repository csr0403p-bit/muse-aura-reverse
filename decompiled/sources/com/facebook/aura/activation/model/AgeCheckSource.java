package com.facebook.aura.activation.model;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgeCheckSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckSource[] $VALUES;
    public static final AgeCheckSource LINKING;
    public static final AgeCheckSource SELFIE;

    static {
        AgeCheckSource ageCheckSource = new AgeCheckSource("LINKING", 0);
        LINKING = ageCheckSource;
        AgeCheckSource ageCheckSource2 = new AgeCheckSource("SELFIE", 1);
        SELFIE = ageCheckSource2;
        AgeCheckSource[] ageCheckSourceArr = {ageCheckSource, ageCheckSource2};
        $VALUES = ageCheckSourceArr;
        $ENTRIES = C3cG.A0w(ageCheckSourceArr);
    }

    public static Ey9<AgeCheckSource> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckSource valueOf(String str) {
        return (AgeCheckSource) Enum.valueOf(AgeCheckSource.class, str);
    }

    public static AgeCheckSource[] values() {
        return (AgeCheckSource[]) $VALUES.clone();
    }

    public AgeCheckSource(String str, int i) {
    }
}

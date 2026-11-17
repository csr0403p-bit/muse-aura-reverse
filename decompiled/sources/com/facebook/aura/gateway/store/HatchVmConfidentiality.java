package com.facebook.aura.gateway.store;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchVmConfidentiality {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchVmConfidentiality[] $VALUES;
    public static final HatchVmConfidentiality CONFIDENTIAL;
    public static final HatchVmConfidentiality STANDARD;
    public static final HatchVmConfidentiality UNKNOWN;

    static {
        HatchVmConfidentiality hatchVmConfidentiality = new HatchVmConfidentiality("UNKNOWN", 0);
        UNKNOWN = hatchVmConfidentiality;
        HatchVmConfidentiality hatchVmConfidentiality2 = new HatchVmConfidentiality("STANDARD", 1);
        STANDARD = hatchVmConfidentiality2;
        HatchVmConfidentiality hatchVmConfidentiality3 = new HatchVmConfidentiality("CONFIDENTIAL", 2);
        CONFIDENTIAL = hatchVmConfidentiality3;
        HatchVmConfidentiality[] hatchVmConfidentialityArr = {hatchVmConfidentiality, hatchVmConfidentiality2, hatchVmConfidentiality3};
        $VALUES = hatchVmConfidentialityArr;
        $ENTRIES = C3cG.A0w(hatchVmConfidentialityArr);
    }

    public static Ey9<HatchVmConfidentiality> getEntries() {
        return $ENTRIES;
    }

    public static HatchVmConfidentiality valueOf(String str) {
        return (HatchVmConfidentiality) Enum.valueOf(HatchVmConfidentiality.class, str);
    }

    public static HatchVmConfidentiality[] values() {
        return (HatchVmConfidentiality[]) $VALUES.clone();
    }

    public HatchVmConfidentiality(String str, int i) {
    }
}

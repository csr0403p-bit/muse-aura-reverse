package com.facebook.aura.confidentialvm;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchVmPeerType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchVmPeerType[] $VALUES;
    public static final HatchVmPeerType CONFIDENTIAL;
    public static final HatchVmPeerType STANDARD;

    static {
        HatchVmPeerType hatchVmPeerType = new HatchVmPeerType("STANDARD", 0);
        STANDARD = hatchVmPeerType;
        HatchVmPeerType hatchVmPeerType2 = new HatchVmPeerType("CONFIDENTIAL", 1);
        CONFIDENTIAL = hatchVmPeerType2;
        HatchVmPeerType[] hatchVmPeerTypeArr = {hatchVmPeerType, hatchVmPeerType2};
        $VALUES = hatchVmPeerTypeArr;
        $ENTRIES = C3cG.A0w(hatchVmPeerTypeArr);
    }

    public static Ey9<HatchVmPeerType> getEntries() {
        return $ENTRIES;
    }

    public static HatchVmPeerType valueOf(String str) {
        return (HatchVmPeerType) Enum.valueOf(HatchVmPeerType.class, str);
    }

    public static HatchVmPeerType[] values() {
        return (HatchVmPeerType[]) $VALUES.clone();
    }

    public HatchVmPeerType(String str, int i) {
    }
}

package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class HatchVmStatusFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchVmStatusFailure[] $VALUES;
    public static final HatchVmStatusFailure CREDENTIALS_REQUIRED;
    public static final HatchVmStatusFailure STATUS_UNAVAILABLE;

    static {
        HatchVmStatusFailure hatchVmStatusFailure = new HatchVmStatusFailure("CREDENTIALS_REQUIRED", 0);
        CREDENTIALS_REQUIRED = hatchVmStatusFailure;
        HatchVmStatusFailure hatchVmStatusFailure2 = new HatchVmStatusFailure("STATUS_UNAVAILABLE", 1);
        STATUS_UNAVAILABLE = hatchVmStatusFailure2;
        HatchVmStatusFailure[] hatchVmStatusFailureArr = {hatchVmStatusFailure, hatchVmStatusFailure2};
        $VALUES = hatchVmStatusFailureArr;
        $ENTRIES = C3cG.A0w(hatchVmStatusFailureArr);
    }

    public static Ey9<HatchVmStatusFailure> getEntries() {
        return $ENTRIES;
    }

    public static HatchVmStatusFailure valueOf(String str) {
        return (HatchVmStatusFailure) Enum.valueOf(HatchVmStatusFailure.class, str);
    }

    public static HatchVmStatusFailure[] values() {
        return (HatchVmStatusFailure[]) $VALUES.clone();
    }

    public HatchVmStatusFailure(String str, int i) {
    }
}

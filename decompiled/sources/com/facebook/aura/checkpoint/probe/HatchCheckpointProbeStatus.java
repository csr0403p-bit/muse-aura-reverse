package com.facebook.aura.checkpoint.probe;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchCheckpointProbeStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchCheckpointProbeStatus[] $VALUES;
    public static final HatchCheckpointProbeStatus CLEAR;
    public static final HatchCheckpointProbeStatus REQUIRED;
    public static final HatchCheckpointProbeStatus UNAVAILABLE;

    static {
        HatchCheckpointProbeStatus hatchCheckpointProbeStatus = new HatchCheckpointProbeStatus("REQUIRED", 0);
        REQUIRED = hatchCheckpointProbeStatus;
        HatchCheckpointProbeStatus hatchCheckpointProbeStatus2 = new HatchCheckpointProbeStatus("CLEAR", 1);
        CLEAR = hatchCheckpointProbeStatus2;
        HatchCheckpointProbeStatus hatchCheckpointProbeStatus3 = new HatchCheckpointProbeStatus("UNAVAILABLE", 2);
        UNAVAILABLE = hatchCheckpointProbeStatus3;
        HatchCheckpointProbeStatus[] hatchCheckpointProbeStatusArr = {hatchCheckpointProbeStatus, hatchCheckpointProbeStatus2, hatchCheckpointProbeStatus3};
        $VALUES = hatchCheckpointProbeStatusArr;
        $ENTRIES = C3cG.A0w(hatchCheckpointProbeStatusArr);
    }

    public static Ey9<HatchCheckpointProbeStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchCheckpointProbeStatus valueOf(String str) {
        return (HatchCheckpointProbeStatus) Enum.valueOf(HatchCheckpointProbeStatus.class, str);
    }

    public static HatchCheckpointProbeStatus[] values() {
        return (HatchCheckpointProbeStatus[]) $VALUES.clone();
    }

    public HatchCheckpointProbeStatus(String str, int i) {
    }
}

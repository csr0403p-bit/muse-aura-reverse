package com.facebook.aura.model;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchSubAgentStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSubAgentStatus[] $VALUES;
    public static final HatchSubAgentStatus COMPLETED;
    public static final HatchSubAgentStatus FAILED;
    public static final HatchSubAgentStatus RUNNING;

    static {
        HatchSubAgentStatus hatchSubAgentStatus = new HatchSubAgentStatus("RUNNING", 0);
        RUNNING = hatchSubAgentStatus;
        HatchSubAgentStatus hatchSubAgentStatus2 = new HatchSubAgentStatus("COMPLETED", 1);
        COMPLETED = hatchSubAgentStatus2;
        HatchSubAgentStatus hatchSubAgentStatus3 = new HatchSubAgentStatus(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = hatchSubAgentStatus3;
        HatchSubAgentStatus[] hatchSubAgentStatusArr = {hatchSubAgentStatus, hatchSubAgentStatus2, hatchSubAgentStatus3};
        $VALUES = hatchSubAgentStatusArr;
        $ENTRIES = C3cG.A0w(hatchSubAgentStatusArr);
    }

    public static Ey9<HatchSubAgentStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchSubAgentStatus valueOf(String str) {
        return (HatchSubAgentStatus) Enum.valueOf(HatchSubAgentStatus.class, str);
    }

    public static HatchSubAgentStatus[] values() {
        return (HatchSubAgentStatus[]) $VALUES.clone();
    }

    public HatchSubAgentStatus(String str, int i) {
    }
}

package com.facebook.aura.permissions.defaults;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConfidentialVmWriteOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmWriteOutcome[] $VALUES;
    public static final ConfidentialVmWriteOutcome APPLIED;
    public static final ConfidentialVmWriteOutcome FAILED;
    public static final ConfidentialVmWriteOutcome SKIPPED;

    static {
        ConfidentialVmWriteOutcome confidentialVmWriteOutcome = new ConfidentialVmWriteOutcome("APPLIED", 0);
        APPLIED = confidentialVmWriteOutcome;
        ConfidentialVmWriteOutcome confidentialVmWriteOutcome2 = new ConfidentialVmWriteOutcome("SKIPPED", 1);
        SKIPPED = confidentialVmWriteOutcome2;
        ConfidentialVmWriteOutcome confidentialVmWriteOutcome3 = new ConfidentialVmWriteOutcome(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = confidentialVmWriteOutcome3;
        ConfidentialVmWriteOutcome[] confidentialVmWriteOutcomeArr = {confidentialVmWriteOutcome, confidentialVmWriteOutcome2, confidentialVmWriteOutcome3};
        $VALUES = confidentialVmWriteOutcomeArr;
        $ENTRIES = C3cG.A0w(confidentialVmWriteOutcomeArr);
    }

    public static Ey9<ConfidentialVmWriteOutcome> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmWriteOutcome valueOf(String str) {
        return (ConfidentialVmWriteOutcome) Enum.valueOf(ConfidentialVmWriteOutcome.class, str);
    }

    public static ConfidentialVmWriteOutcome[] values() {
        return (ConfidentialVmWriteOutcome[]) $VALUES.clone();
    }

    public ConfidentialVmWriteOutcome(String str, int i) {
    }
}

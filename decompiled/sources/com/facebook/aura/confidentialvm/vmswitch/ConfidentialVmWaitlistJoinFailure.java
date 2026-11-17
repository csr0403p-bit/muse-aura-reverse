package com.facebook.aura.confidentialvm.vmswitch;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmWaitlistJoinFailure {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmWaitlistJoinFailure[] $VALUES;
    public static final ConfidentialVmWaitlistJoinFailure FAILED;
    public static final ConfidentialVmWaitlistJoinFailure NOT_ELIGIBLE;

    static {
        ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure = new ConfidentialVmWaitlistJoinFailure("NOT_ELIGIBLE", 0);
        NOT_ELIGIBLE = confidentialVmWaitlistJoinFailure;
        ConfidentialVmWaitlistJoinFailure confidentialVmWaitlistJoinFailure2 = new ConfidentialVmWaitlistJoinFailure(CvmMigrationStatusJson.STAGE_FAILED, 1);
        FAILED = confidentialVmWaitlistJoinFailure2;
        ConfidentialVmWaitlistJoinFailure[] confidentialVmWaitlistJoinFailureArr = {confidentialVmWaitlistJoinFailure, confidentialVmWaitlistJoinFailure2};
        $VALUES = confidentialVmWaitlistJoinFailureArr;
        $ENTRIES = new F3w(confidentialVmWaitlistJoinFailureArr);
    }

    public static Ey9<ConfidentialVmWaitlistJoinFailure> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmWaitlistJoinFailure valueOf(String str) {
        return (ConfidentialVmWaitlistJoinFailure) Enum.valueOf(ConfidentialVmWaitlistJoinFailure.class, str);
    }

    public static ConfidentialVmWaitlistJoinFailure[] values() {
        return (ConfidentialVmWaitlistJoinFailure[]) $VALUES.clone();
    }

    public ConfidentialVmWaitlistJoinFailure(String str, int i) {
    }
}

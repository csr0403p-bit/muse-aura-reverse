package com.facebook.aura.confidentialvm.vmswitch;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmWaitlistStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmWaitlistStatus[] $VALUES;
    public static final ConfidentialVmWaitlistStatus ADMITTED;
    public static final ConfidentialVmWaitlistStatus WAITLISTED;

    static {
        ConfidentialVmWaitlistStatus confidentialVmWaitlistStatus = new ConfidentialVmWaitlistStatus("WAITLISTED", 0);
        WAITLISTED = confidentialVmWaitlistStatus;
        ConfidentialVmWaitlistStatus confidentialVmWaitlistStatus2 = new ConfidentialVmWaitlistStatus("ADMITTED", 1);
        ADMITTED = confidentialVmWaitlistStatus2;
        ConfidentialVmWaitlistStatus[] confidentialVmWaitlistStatusArr = {confidentialVmWaitlistStatus, confidentialVmWaitlistStatus2};
        $VALUES = confidentialVmWaitlistStatusArr;
        $ENTRIES = new F3w(confidentialVmWaitlistStatusArr);
    }

    public static Ey9<ConfidentialVmWaitlistStatus> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmWaitlistStatus valueOf(String str) {
        return (ConfidentialVmWaitlistStatus) Enum.valueOf(ConfidentialVmWaitlistStatus.class, str);
    }

    public static ConfidentialVmWaitlistStatus[] values() {
        return (ConfidentialVmWaitlistStatus[]) $VALUES.clone();
    }

    public ConfidentialVmWaitlistStatus(String str, int i) {
    }
}

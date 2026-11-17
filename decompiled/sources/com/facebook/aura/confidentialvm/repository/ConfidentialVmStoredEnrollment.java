package com.facebook.aura.confidentialvm.repository;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmStoredEnrollment {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmStoredEnrollment[] $VALUES;
    public static final ConfidentialVmStoredEnrollment NOT_STORED;
    public static final ConfidentialVmStoredEnrollment STORED;
    public static final ConfidentialVmStoredEnrollment UNAVAILABLE;

    static {
        ConfidentialVmStoredEnrollment confidentialVmStoredEnrollment = new ConfidentialVmStoredEnrollment("NOT_STORED", 0);
        NOT_STORED = confidentialVmStoredEnrollment;
        ConfidentialVmStoredEnrollment confidentialVmStoredEnrollment2 = new ConfidentialVmStoredEnrollment("STORED", 1);
        STORED = confidentialVmStoredEnrollment2;
        ConfidentialVmStoredEnrollment confidentialVmStoredEnrollment3 = new ConfidentialVmStoredEnrollment("UNAVAILABLE", 2);
        UNAVAILABLE = confidentialVmStoredEnrollment3;
        ConfidentialVmStoredEnrollment[] confidentialVmStoredEnrollmentArr = {confidentialVmStoredEnrollment, confidentialVmStoredEnrollment2, confidentialVmStoredEnrollment3};
        $VALUES = confidentialVmStoredEnrollmentArr;
        $ENTRIES = new F3w(confidentialVmStoredEnrollmentArr);
    }

    public static Ey9<ConfidentialVmStoredEnrollment> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmStoredEnrollment valueOf(String str) {
        return (ConfidentialVmStoredEnrollment) Enum.valueOf(ConfidentialVmStoredEnrollment.class, str);
    }

    public static ConfidentialVmStoredEnrollment[] values() {
        return (ConfidentialVmStoredEnrollment[]) $VALUES.clone();
    }

    public ConfidentialVmStoredEnrollment(String str, int i) {
    }
}

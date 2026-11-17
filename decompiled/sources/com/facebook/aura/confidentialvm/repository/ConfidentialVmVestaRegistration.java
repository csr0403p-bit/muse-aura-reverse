package com.facebook.aura.confidentialvm.repository;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmVestaRegistration {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmVestaRegistration[] $VALUES;
    public static final ConfidentialVmVestaRegistration NOT_REGISTERED;
    public static final ConfidentialVmVestaRegistration REGISTERED;
    public static final ConfidentialVmVestaRegistration UNAVAILABLE;

    static {
        ConfidentialVmVestaRegistration confidentialVmVestaRegistration = new ConfidentialVmVestaRegistration("REGISTERED", 0);
        REGISTERED = confidentialVmVestaRegistration;
        ConfidentialVmVestaRegistration confidentialVmVestaRegistration2 = new ConfidentialVmVestaRegistration("NOT_REGISTERED", 1);
        NOT_REGISTERED = confidentialVmVestaRegistration2;
        ConfidentialVmVestaRegistration confidentialVmVestaRegistration3 = new ConfidentialVmVestaRegistration("UNAVAILABLE", 2);
        UNAVAILABLE = confidentialVmVestaRegistration3;
        ConfidentialVmVestaRegistration[] confidentialVmVestaRegistrationArr = {confidentialVmVestaRegistration, confidentialVmVestaRegistration2, confidentialVmVestaRegistration3};
        $VALUES = confidentialVmVestaRegistrationArr;
        $ENTRIES = new F3w(confidentialVmVestaRegistrationArr);
    }

    public static Ey9<ConfidentialVmVestaRegistration> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmVestaRegistration valueOf(String str) {
        return (ConfidentialVmVestaRegistration) Enum.valueOf(ConfidentialVmVestaRegistration.class, str);
    }

    public static ConfidentialVmVestaRegistration[] values() {
        return (ConfidentialVmVestaRegistration[]) $VALUES.clone();
    }

    public ConfidentialVmVestaRegistration(String str, int i) {
    }
}

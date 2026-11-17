package com.facebook.aura.confidentialvm.repository;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConfidentialVmEnrollmentStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmEnrollmentStep[] $VALUES;
    public static final ConfidentialVmEnrollmentStep CREATE_PIN;
    public static final ConfidentialVmEnrollmentStep ENTER_EXISTING_PIN;
    public static final ConfidentialVmEnrollmentStep UNAVAILABLE;
    public static final ConfidentialVmEnrollmentStep USE_STORED_SECRET;

    static {
        ConfidentialVmEnrollmentStep confidentialVmEnrollmentStep = new ConfidentialVmEnrollmentStep("USE_STORED_SECRET", 0);
        USE_STORED_SECRET = confidentialVmEnrollmentStep;
        ConfidentialVmEnrollmentStep confidentialVmEnrollmentStep2 = new ConfidentialVmEnrollmentStep("ENTER_EXISTING_PIN", 1);
        ENTER_EXISTING_PIN = confidentialVmEnrollmentStep2;
        ConfidentialVmEnrollmentStep confidentialVmEnrollmentStep3 = new ConfidentialVmEnrollmentStep("CREATE_PIN", 2);
        CREATE_PIN = confidentialVmEnrollmentStep3;
        ConfidentialVmEnrollmentStep confidentialVmEnrollmentStep4 = new ConfidentialVmEnrollmentStep("UNAVAILABLE", 3);
        UNAVAILABLE = confidentialVmEnrollmentStep4;
        ConfidentialVmEnrollmentStep[] confidentialVmEnrollmentStepArr = {confidentialVmEnrollmentStep, confidentialVmEnrollmentStep2, confidentialVmEnrollmentStep3, confidentialVmEnrollmentStep4};
        $VALUES = confidentialVmEnrollmentStepArr;
        $ENTRIES = C3cG.A0w(confidentialVmEnrollmentStepArr);
    }

    public static Ey9<ConfidentialVmEnrollmentStep> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmEnrollmentStep valueOf(String str) {
        return (ConfidentialVmEnrollmentStep) Enum.valueOf(ConfidentialVmEnrollmentStep.class, str);
    }

    public static ConfidentialVmEnrollmentStep[] values() {
        return (ConfidentialVmEnrollmentStep[]) $VALUES.clone();
    }

    public ConfidentialVmEnrollmentStep(String str, int i) {
    }
}

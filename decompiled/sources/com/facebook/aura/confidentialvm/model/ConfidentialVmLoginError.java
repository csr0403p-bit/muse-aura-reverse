package com.facebook.aura.confidentialvm.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ConfidentialVmLoginError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmLoginError[] $VALUES;
    public static final ConfidentialVmLoginError GENERIC;
    public static final ConfidentialVmLoginError INCORRECT_PIN;
    public static final ConfidentialVmLoginError RATE_LIMITED;

    static {
        ConfidentialVmLoginError confidentialVmLoginError = new ConfidentialVmLoginError("INCORRECT_PIN", 0);
        INCORRECT_PIN = confidentialVmLoginError;
        ConfidentialVmLoginError confidentialVmLoginError2 = new ConfidentialVmLoginError("RATE_LIMITED", 1);
        RATE_LIMITED = confidentialVmLoginError2;
        ConfidentialVmLoginError confidentialVmLoginError3 = new ConfidentialVmLoginError("GENERIC", 2);
        GENERIC = confidentialVmLoginError3;
        ConfidentialVmLoginError[] confidentialVmLoginErrorArr = {confidentialVmLoginError, confidentialVmLoginError2, confidentialVmLoginError3};
        $VALUES = confidentialVmLoginErrorArr;
        $ENTRIES = new F3w(confidentialVmLoginErrorArr);
    }

    public static Ey9<ConfidentialVmLoginError> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmLoginError valueOf(String str) {
        return (ConfidentialVmLoginError) Enum.valueOf(ConfidentialVmLoginError.class, str);
    }

    public static ConfidentialVmLoginError[] values() {
        return (ConfidentialVmLoginError[]) $VALUES.clone();
    }

    public ConfidentialVmLoginError(String str, int i) {
    }
}

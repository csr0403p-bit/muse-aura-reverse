package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class CredentialCaptureError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CredentialCaptureError[] $VALUES;
    public static final CredentialCaptureError CONFLICT;
    public static final CredentialCaptureError CREDIT_CARD_REJECTED;
    public static final CredentialCaptureError FAILED;
    public static final CredentialCaptureError INVALID;

    static {
        CredentialCaptureError credentialCaptureError = new CredentialCaptureError("INVALID", 0);
        INVALID = credentialCaptureError;
        CredentialCaptureError credentialCaptureError2 = new CredentialCaptureError("CREDIT_CARD_REJECTED", 1);
        CREDIT_CARD_REJECTED = credentialCaptureError2;
        CredentialCaptureError credentialCaptureError3 = new CredentialCaptureError("CONFLICT", 2);
        CONFLICT = credentialCaptureError3;
        CredentialCaptureError credentialCaptureError4 = new CredentialCaptureError(CvmMigrationStatusJson.STAGE_FAILED, 3);
        FAILED = credentialCaptureError4;
        CredentialCaptureError[] credentialCaptureErrorArr = {credentialCaptureError, credentialCaptureError2, credentialCaptureError3, credentialCaptureError4};
        $VALUES = credentialCaptureErrorArr;
        $ENTRIES = new F3w(credentialCaptureErrorArr);
    }

    public static Ey9<CredentialCaptureError> getEntries() {
        return $ENTRIES;
    }

    public static CredentialCaptureError valueOf(String str) {
        return (CredentialCaptureError) Enum.valueOf(CredentialCaptureError.class, str);
    }

    public static CredentialCaptureError[] values() {
        return (CredentialCaptureError[]) $VALUES.clone();
    }

    public CredentialCaptureError(String str, int i) {
    }
}

package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SecureStorageVerificationCodeCaptureError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SecureStorageVerificationCodeCaptureError[] $VALUES;
    public static final SecureStorageVerificationCodeCaptureError INVALID_CHARACTERS;
    public static final SecureStorageVerificationCodeCaptureError SUBMIT_FAILED;
    public static final SecureStorageVerificationCodeCaptureError TOO_LONG;

    static {
        SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError = new SecureStorageVerificationCodeCaptureError("INVALID_CHARACTERS", 0);
        INVALID_CHARACTERS = secureStorageVerificationCodeCaptureError;
        SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError2 = new SecureStorageVerificationCodeCaptureError("TOO_LONG", 1);
        TOO_LONG = secureStorageVerificationCodeCaptureError2;
        SecureStorageVerificationCodeCaptureError secureStorageVerificationCodeCaptureError3 = new SecureStorageVerificationCodeCaptureError("SUBMIT_FAILED", 2);
        SUBMIT_FAILED = secureStorageVerificationCodeCaptureError3;
        SecureStorageVerificationCodeCaptureError[] secureStorageVerificationCodeCaptureErrorArr = {secureStorageVerificationCodeCaptureError, secureStorageVerificationCodeCaptureError2, secureStorageVerificationCodeCaptureError3};
        $VALUES = secureStorageVerificationCodeCaptureErrorArr;
        $ENTRIES = new F3w(secureStorageVerificationCodeCaptureErrorArr);
    }

    public static Ey9<SecureStorageVerificationCodeCaptureError> getEntries() {
        return $ENTRIES;
    }

    public static SecureStorageVerificationCodeCaptureError valueOf(String str) {
        return (SecureStorageVerificationCodeCaptureError) Enum.valueOf(SecureStorageVerificationCodeCaptureError.class, str);
    }

    public static SecureStorageVerificationCodeCaptureError[] values() {
        return (SecureStorageVerificationCodeCaptureError[]) $VALUES.clone();
    }

    public SecureStorageVerificationCodeCaptureError(String str, int i) {
    }
}

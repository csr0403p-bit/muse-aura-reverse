package com.facebook.aura.settings;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SecureStorageCaptureError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SecureStorageCaptureError[] $VALUES;
    public static final SecureStorageCaptureError INVALID_WEBSITE;
    public static final SecureStorageCaptureError PASSWORD_TOO_LONG;
    public static final SecureStorageCaptureError USERNAME_TOO_LONG;

    static {
        SecureStorageCaptureError secureStorageCaptureError = new SecureStorageCaptureError("INVALID_WEBSITE", 0);
        INVALID_WEBSITE = secureStorageCaptureError;
        SecureStorageCaptureError secureStorageCaptureError2 = new SecureStorageCaptureError("USERNAME_TOO_LONG", 1);
        USERNAME_TOO_LONG = secureStorageCaptureError2;
        SecureStorageCaptureError secureStorageCaptureError3 = new SecureStorageCaptureError("PASSWORD_TOO_LONG", 2);
        PASSWORD_TOO_LONG = secureStorageCaptureError3;
        SecureStorageCaptureError[] secureStorageCaptureErrorArr = {secureStorageCaptureError, secureStorageCaptureError2, secureStorageCaptureError3};
        $VALUES = secureStorageCaptureErrorArr;
        $ENTRIES = new F3w(secureStorageCaptureErrorArr);
    }

    public static Ey9<SecureStorageCaptureError> getEntries() {
        return $ENTRIES;
    }

    public static SecureStorageCaptureError valueOf(String str) {
        return (SecureStorageCaptureError) Enum.valueOf(SecureStorageCaptureError.class, str);
    }

    public static SecureStorageCaptureError[] values() {
        return (SecureStorageCaptureError[]) $VALUES.clone();
    }

    public SecureStorageCaptureError(String str, int i) {
    }
}

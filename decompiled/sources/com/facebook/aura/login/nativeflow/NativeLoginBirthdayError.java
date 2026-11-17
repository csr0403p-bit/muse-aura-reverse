package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginBirthdayError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginBirthdayError[] $VALUES;
    public static final NativeLoginBirthdayError INVALID_DATE;
    public static final NativeLoginBirthdayError UNDERAGE;

    static {
        NativeLoginBirthdayError nativeLoginBirthdayError = new NativeLoginBirthdayError("INVALID_DATE", 0);
        INVALID_DATE = nativeLoginBirthdayError;
        NativeLoginBirthdayError nativeLoginBirthdayError2 = new NativeLoginBirthdayError("UNDERAGE", 1);
        UNDERAGE = nativeLoginBirthdayError2;
        NativeLoginBirthdayError[] nativeLoginBirthdayErrorArr = {nativeLoginBirthdayError, nativeLoginBirthdayError2};
        $VALUES = nativeLoginBirthdayErrorArr;
        $ENTRIES = C3cG.A0w(nativeLoginBirthdayErrorArr);
    }

    public static Ey9<NativeLoginBirthdayError> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginBirthdayError valueOf(String str) {
        return (NativeLoginBirthdayError) Enum.valueOf(NativeLoginBirthdayError.class, str);
    }

    public static NativeLoginBirthdayError[] values() {
        return (NativeLoginBirthdayError[]) $VALUES.clone();
    }

    public NativeLoginBirthdayError(String str, int i) {
    }
}

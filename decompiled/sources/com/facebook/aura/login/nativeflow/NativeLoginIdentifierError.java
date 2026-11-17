package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginIdentifierError {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginIdentifierError[] $VALUES;
    public static final NativeLoginIdentifierError INVALID_CONTACT_POINT;
    public static final NativeLoginIdentifierError INVALID_EMAIL;
    public static final NativeLoginIdentifierError INVALID_PHONE;

    static {
        NativeLoginIdentifierError nativeLoginIdentifierError = new NativeLoginIdentifierError("INVALID_PHONE", 0);
        INVALID_PHONE = nativeLoginIdentifierError;
        NativeLoginIdentifierError nativeLoginIdentifierError2 = new NativeLoginIdentifierError("INVALID_EMAIL", 1);
        INVALID_EMAIL = nativeLoginIdentifierError2;
        NativeLoginIdentifierError nativeLoginIdentifierError3 = new NativeLoginIdentifierError("INVALID_CONTACT_POINT", 2);
        INVALID_CONTACT_POINT = nativeLoginIdentifierError3;
        NativeLoginIdentifierError[] nativeLoginIdentifierErrorArr = {nativeLoginIdentifierError, nativeLoginIdentifierError2, nativeLoginIdentifierError3};
        $VALUES = nativeLoginIdentifierErrorArr;
        $ENTRIES = C3cG.A0w(nativeLoginIdentifierErrorArr);
    }

    public static Ey9<NativeLoginIdentifierError> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginIdentifierError valueOf(String str) {
        return (NativeLoginIdentifierError) Enum.valueOf(NativeLoginIdentifierError.class, str);
    }

    public static NativeLoginIdentifierError[] values() {
        return (NativeLoginIdentifierError[]) $VALUES.clone();
    }

    public NativeLoginIdentifierError(String str, int i) {
    }
}

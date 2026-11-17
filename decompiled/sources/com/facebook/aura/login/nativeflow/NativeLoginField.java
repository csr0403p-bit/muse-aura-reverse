package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginField {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginField[] $VALUES;
    public static final NativeLoginField CONTACT_POINT;
    public static final NativeLoginField OTP;
    public static final NativeLoginField PASSWORD;
    public static final NativeLoginField SIGNUP_PASSWORD;
    public static final NativeLoginField TWO_FACTOR_CODE;

    static {
        NativeLoginField nativeLoginField = new NativeLoginField("CONTACT_POINT", 0);
        CONTACT_POINT = nativeLoginField;
        NativeLoginField nativeLoginField2 = new NativeLoginField("OTP", 1);
        OTP = nativeLoginField2;
        NativeLoginField nativeLoginField3 = new NativeLoginField("PASSWORD", 2);
        PASSWORD = nativeLoginField3;
        NativeLoginField nativeLoginField4 = new NativeLoginField("TWO_FACTOR_CODE", 3);
        TWO_FACTOR_CODE = nativeLoginField4;
        NativeLoginField nativeLoginField5 = new NativeLoginField("SIGNUP_PASSWORD", 4);
        SIGNUP_PASSWORD = nativeLoginField5;
        NativeLoginField[] nativeLoginFieldArr = {nativeLoginField, nativeLoginField2, nativeLoginField3, nativeLoginField4, nativeLoginField5};
        $VALUES = nativeLoginFieldArr;
        $ENTRIES = C3cG.A0w(nativeLoginFieldArr);
    }

    public static Ey9<NativeLoginField> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginField valueOf(String str) {
        return (NativeLoginField) Enum.valueOf(NativeLoginField.class, str);
    }

    public static NativeLoginField[] values() {
        return (NativeLoginField[]) $VALUES.clone();
    }

    public NativeLoginField(String str, int i) {
    }
}

package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginErrorDismissal {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginErrorDismissal[] $VALUES;
    public static final NativeLoginErrorDismissal BACK_TO_LOGIN;
    public static final NativeLoginErrorDismissal CLOSE;
    public static final NativeLoginErrorDismissal CONTINUE_TO_BIRTHDAY;
    public static final NativeLoginErrorDismissal CONTINUE_TO_OTP;
    public static final NativeLoginErrorDismissal RETURN_TO_LANDING;

    static {
        NativeLoginErrorDismissal nativeLoginErrorDismissal = new NativeLoginErrorDismissal("CLOSE", 0);
        CLOSE = nativeLoginErrorDismissal;
        NativeLoginErrorDismissal nativeLoginErrorDismissal2 = new NativeLoginErrorDismissal("RETURN_TO_LANDING", 1);
        RETURN_TO_LANDING = nativeLoginErrorDismissal2;
        NativeLoginErrorDismissal nativeLoginErrorDismissal3 = new NativeLoginErrorDismissal("BACK_TO_LOGIN", 2);
        BACK_TO_LOGIN = nativeLoginErrorDismissal3;
        NativeLoginErrorDismissal nativeLoginErrorDismissal4 = new NativeLoginErrorDismissal("CONTINUE_TO_BIRTHDAY", 3);
        CONTINUE_TO_BIRTHDAY = nativeLoginErrorDismissal4;
        NativeLoginErrorDismissal nativeLoginErrorDismissal5 = new NativeLoginErrorDismissal("CONTINUE_TO_OTP", 4);
        CONTINUE_TO_OTP = nativeLoginErrorDismissal5;
        NativeLoginErrorDismissal[] nativeLoginErrorDismissalArr = {nativeLoginErrorDismissal, nativeLoginErrorDismissal2, nativeLoginErrorDismissal3, nativeLoginErrorDismissal4, nativeLoginErrorDismissal5};
        $VALUES = nativeLoginErrorDismissalArr;
        $ENTRIES = C3cG.A0w(nativeLoginErrorDismissalArr);
    }

    public static Ey9<NativeLoginErrorDismissal> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginErrorDismissal valueOf(String str) {
        return (NativeLoginErrorDismissal) Enum.valueOf(NativeLoginErrorDismissal.class, str);
    }

    public static NativeLoginErrorDismissal[] values() {
        return (NativeLoginErrorDismissal[]) $VALUES.clone();
    }

    public NativeLoginErrorDismissal(String str, int i) {
    }
}

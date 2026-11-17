package com.facebook.aura.login.nativeflow;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NativeLoginStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NativeLoginStep[] $VALUES;
    public static final NativeLoginStep CANCEL_DELETION;
    public static final NativeLoginStep CONFIRM_OTP;
    public static final NativeLoginStep CONFIRM_PASSKEY;
    public static final NativeLoginStep CONFIRM_PASSWORD;
    public static final NativeLoginStep GOOGLE_EXCHANGE;
    public static final NativeLoginStep REGISTER_COMPLETION;
    public static final NativeLoginStep REGISTER_COMPLETION_LINKED;
    public static final NativeLoginStep SELECT_ACCOUNT;
    public static final NativeLoginStep SEND_OTP;
    public static final NativeLoginStep SEND_OTP_RESEND;
    public static final NativeLoginStep SSO;
    public static final NativeLoginStep START;
    public static final NativeLoginStep TWO_FACTOR_CONFIRM;
    public static final NativeLoginStep TWO_FACTOR_SEND;

    static {
        NativeLoginStep nativeLoginStep = new NativeLoginStep("START", 0);
        START = nativeLoginStep;
        NativeLoginStep nativeLoginStep2 = new NativeLoginStep("SEND_OTP", 1);
        SEND_OTP = nativeLoginStep2;
        NativeLoginStep nativeLoginStep3 = new NativeLoginStep("SEND_OTP_RESEND", 2);
        SEND_OTP_RESEND = nativeLoginStep3;
        NativeLoginStep nativeLoginStep4 = new NativeLoginStep("CONFIRM_OTP", 3);
        CONFIRM_OTP = nativeLoginStep4;
        NativeLoginStep nativeLoginStep5 = new NativeLoginStep("CONFIRM_PASSKEY", 4);
        CONFIRM_PASSKEY = nativeLoginStep5;
        NativeLoginStep nativeLoginStep6 = new NativeLoginStep("CONFIRM_PASSWORD", 5);
        CONFIRM_PASSWORD = nativeLoginStep6;
        NativeLoginStep nativeLoginStep7 = new NativeLoginStep("CANCEL_DELETION", 6);
        CANCEL_DELETION = nativeLoginStep7;
        NativeLoginStep nativeLoginStep8 = new NativeLoginStep("SELECT_ACCOUNT", 7);
        SELECT_ACCOUNT = nativeLoginStep8;
        NativeLoginStep nativeLoginStep9 = new NativeLoginStep("REGISTER_COMPLETION", 8);
        REGISTER_COMPLETION = nativeLoginStep9;
        NativeLoginStep nativeLoginStep10 = new NativeLoginStep("REGISTER_COMPLETION_LINKED", 9);
        REGISTER_COMPLETION_LINKED = nativeLoginStep10;
        NativeLoginStep nativeLoginStep11 = new NativeLoginStep("SSO", 10);
        SSO = nativeLoginStep11;
        NativeLoginStep nativeLoginStep12 = new NativeLoginStep("GOOGLE_EXCHANGE", 11);
        GOOGLE_EXCHANGE = nativeLoginStep12;
        NativeLoginStep nativeLoginStep13 = new NativeLoginStep("TWO_FACTOR_SEND", 12);
        TWO_FACTOR_SEND = nativeLoginStep13;
        NativeLoginStep nativeLoginStep14 = new NativeLoginStep("TWO_FACTOR_CONFIRM", 13);
        TWO_FACTOR_CONFIRM = nativeLoginStep14;
        NativeLoginStep[] nativeLoginStepArr = {nativeLoginStep, nativeLoginStep2, nativeLoginStep3, nativeLoginStep4, nativeLoginStep5, nativeLoginStep6, nativeLoginStep7, nativeLoginStep8, nativeLoginStep9, nativeLoginStep10, nativeLoginStep11, nativeLoginStep12, nativeLoginStep13, nativeLoginStep14};
        $VALUES = nativeLoginStepArr;
        $ENTRIES = C3cG.A0w(nativeLoginStepArr);
    }

    public static Ey9<NativeLoginStep> getEntries() {
        return $ENTRIES;
    }

    public static NativeLoginStep valueOf(String str) {
        return (NativeLoginStep) Enum.valueOf(NativeLoginStep.class, str);
    }

    public static NativeLoginStep[] values() {
        return (NativeLoginStep[]) $VALUES.clone();
    }

    public NativeLoginStep(String str, int i) {
    }
}

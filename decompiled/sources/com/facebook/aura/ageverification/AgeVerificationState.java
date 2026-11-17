package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AgeVerificationState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeVerificationState[] $VALUES;
    public static final AgeVerificationState CONFIRMED;
    public static final AgeVerificationState FAILED_FINAL;
    public static final AgeVerificationState FAILED_RETRYABLE;
    public static final AgeVerificationState NOT_REQUIRED;
    public static final AgeVerificationState NOT_SUPPORTED;
    public static final AgeVerificationState PENDING;
    public static final AgeVerificationState REQUIRED;

    static {
        AgeVerificationState ageVerificationState = new AgeVerificationState("NOT_REQUIRED", 0);
        NOT_REQUIRED = ageVerificationState;
        AgeVerificationState ageVerificationState2 = new AgeVerificationState("REQUIRED", 1);
        REQUIRED = ageVerificationState2;
        AgeVerificationState ageVerificationState3 = new AgeVerificationState(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 2);
        PENDING = ageVerificationState3;
        AgeVerificationState ageVerificationState4 = new AgeVerificationState("CONFIRMED", 3);
        CONFIRMED = ageVerificationState4;
        AgeVerificationState ageVerificationState5 = new AgeVerificationState("FAILED_RETRYABLE", 4);
        FAILED_RETRYABLE = ageVerificationState5;
        AgeVerificationState ageVerificationState6 = new AgeVerificationState("FAILED_FINAL", 5);
        FAILED_FINAL = ageVerificationState6;
        AgeVerificationState ageVerificationState7 = new AgeVerificationState("NOT_SUPPORTED", 6);
        NOT_SUPPORTED = ageVerificationState7;
        AgeVerificationState[] ageVerificationStateArr = {ageVerificationState, ageVerificationState2, ageVerificationState3, ageVerificationState4, ageVerificationState5, ageVerificationState6, ageVerificationState7};
        $VALUES = ageVerificationStateArr;
        $ENTRIES = C3cG.A0w(ageVerificationStateArr);
    }

    public static Ey9<AgeVerificationState> getEntries() {
        return $ENTRIES;
    }

    public static AgeVerificationState valueOf(String str) {
        return (AgeVerificationState) Enum.valueOf(AgeVerificationState.class, str);
    }

    public static AgeVerificationState[] values() {
        return (AgeVerificationState[]) $VALUES.clone();
    }

    public AgeVerificationState(String str, int i) {
    }
}

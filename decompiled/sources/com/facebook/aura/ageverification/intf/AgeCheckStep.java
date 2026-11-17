package com.facebook.aura.ageverification.intf;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AgeCheckStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgeCheckStep[] $VALUES;
    public static final AgeCheckStep BLOCKED;
    public static final AgeCheckStep CCV_FORM;
    public static final AgeCheckStep LINKING_FACEBOOK;
    public static final AgeCheckStep LINKING_INSTAGRAM;
    public static final AgeCheckStep METHOD_LIST;
    public static final AgeCheckStep SELFIE_CAPTURE;
    public static final AgeCheckStep SELFIE_ERROR;
    public static final AgeCheckStep SELFIE_INTRO;
    public static final AgeCheckStep SELFIE_INTRO_PICKED;
    public static final AgeCheckStep SELFIE_REVIEWING;

    static {
        AgeCheckStep ageCheckStep = new AgeCheckStep("SELFIE_INTRO", 0);
        SELFIE_INTRO = ageCheckStep;
        AgeCheckStep ageCheckStep2 = new AgeCheckStep("SELFIE_INTRO_PICKED", 1);
        SELFIE_INTRO_PICKED = ageCheckStep2;
        AgeCheckStep ageCheckStep3 = new AgeCheckStep("SELFIE_CAPTURE", 2);
        SELFIE_CAPTURE = ageCheckStep3;
        AgeCheckStep ageCheckStep4 = new AgeCheckStep("SELFIE_REVIEWING", 3);
        SELFIE_REVIEWING = ageCheckStep4;
        AgeCheckStep ageCheckStep5 = new AgeCheckStep("SELFIE_ERROR", 4);
        SELFIE_ERROR = ageCheckStep5;
        AgeCheckStep ageCheckStep6 = new AgeCheckStep("METHOD_LIST", 5);
        METHOD_LIST = ageCheckStep6;
        AgeCheckStep ageCheckStep7 = new AgeCheckStep("CCV_FORM", 6);
        CCV_FORM = ageCheckStep7;
        AgeCheckStep ageCheckStep8 = new AgeCheckStep("LINKING_FACEBOOK", 7);
        LINKING_FACEBOOK = ageCheckStep8;
        AgeCheckStep ageCheckStep9 = new AgeCheckStep("LINKING_INSTAGRAM", 8);
        LINKING_INSTAGRAM = ageCheckStep9;
        AgeCheckStep ageCheckStep10 = new AgeCheckStep("BLOCKED", 9);
        BLOCKED = ageCheckStep10;
        AgeCheckStep[] ageCheckStepArr = {ageCheckStep, ageCheckStep2, ageCheckStep3, ageCheckStep4, ageCheckStep5, ageCheckStep6, ageCheckStep7, ageCheckStep8, ageCheckStep9, ageCheckStep10};
        $VALUES = ageCheckStepArr;
        $ENTRIES = C3cG.A0w(ageCheckStepArr);
    }

    public static Ey9<AgeCheckStep> getEntries() {
        return $ENTRIES;
    }

    public static AgeCheckStep valueOf(String str) {
        return (AgeCheckStep) Enum.valueOf(AgeCheckStep.class, str);
    }

    public static AgeCheckStep[] values() {
        return (AgeCheckStep[]) $VALUES.clone();
    }

    public AgeCheckStep(String str, int i) {
    }
}

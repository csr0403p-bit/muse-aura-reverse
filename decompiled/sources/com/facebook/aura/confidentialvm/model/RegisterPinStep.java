package com.facebook.aura.confidentialvm.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RegisterPinStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RegisterPinStep[] $VALUES;
    public static final RegisterPinStep CHOOSE;
    public static final RegisterPinStep CONFIRM;

    static {
        RegisterPinStep registerPinStep = new RegisterPinStep("CHOOSE", 0);
        CHOOSE = registerPinStep;
        RegisterPinStep registerPinStep2 = new RegisterPinStep("CONFIRM", 1);
        CONFIRM = registerPinStep2;
        RegisterPinStep[] registerPinStepArr = {registerPinStep, registerPinStep2};
        $VALUES = registerPinStepArr;
        $ENTRIES = new F3w(registerPinStepArr);
    }

    public static Ey9<RegisterPinStep> getEntries() {
        return $ENTRIES;
    }

    public static RegisterPinStep valueOf(String str) {
        return (RegisterPinStep) Enum.valueOf(RegisterPinStep.class, str);
    }

    public static RegisterPinStep[] values() {
        return (RegisterPinStep[]) $VALUES.clone();
    }

    public RegisterPinStep(String str, int i) {
    }
}

package com.facebook.aura.confidentialvm.model;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RegisterPinFlow {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RegisterPinFlow[] $VALUES;
    public static final RegisterPinFlow ACCESS_CONTROLLED_ENROLLMENT;
    public static final RegisterPinFlow ONBOARDING_ENROLLMENT;
    public static final RegisterPinFlow PIN_CHANGE;

    static {
        RegisterPinFlow registerPinFlow = new RegisterPinFlow("PIN_CHANGE", 0);
        PIN_CHANGE = registerPinFlow;
        RegisterPinFlow registerPinFlow2 = new RegisterPinFlow("ONBOARDING_ENROLLMENT", 1);
        ONBOARDING_ENROLLMENT = registerPinFlow2;
        RegisterPinFlow registerPinFlow3 = new RegisterPinFlow("ACCESS_CONTROLLED_ENROLLMENT", 2);
        ACCESS_CONTROLLED_ENROLLMENT = registerPinFlow3;
        RegisterPinFlow[] registerPinFlowArr = {registerPinFlow, registerPinFlow2, registerPinFlow3};
        $VALUES = registerPinFlowArr;
        $ENTRIES = new F3w(registerPinFlowArr);
    }

    public static Ey9<RegisterPinFlow> getEntries() {
        return $ENTRIES;
    }

    public static RegisterPinFlow valueOf(String str) {
        return (RegisterPinFlow) Enum.valueOf(RegisterPinFlow.class, str);
    }

    public static RegisterPinFlow[] values() {
        return (RegisterPinFlow[]) $VALUES.clone();
    }

    public RegisterPinFlow(String str, int i) {
    }
}

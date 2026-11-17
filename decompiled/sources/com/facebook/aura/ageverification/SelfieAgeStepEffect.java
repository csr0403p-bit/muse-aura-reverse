package com.facebook.aura.ageverification;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.activation.model.AuraActivationViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SelfieAgeStepEffect {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SelfieAgeStepEffect[] $VALUES;
    public static final SelfieAgeStepEffect BACK;
    public static final SelfieAgeStepEffect OTHER_METHODS;
    public static final SelfieAgeStepEffect RESOLVED;
    public static final SelfieAgeStepEffect SELFIE_UNAVAILABLE;

    static {
        SelfieAgeStepEffect selfieAgeStepEffect = new SelfieAgeStepEffect(AuraActivationViewModelKt.OTHER_AGE_METHODS, 0);
        OTHER_METHODS = selfieAgeStepEffect;
        SelfieAgeStepEffect selfieAgeStepEffect2 = new SelfieAgeStepEffect(AuraActivationViewModelKt.SELFIE_UNAVAILABLE, 1);
        SELFIE_UNAVAILABLE = selfieAgeStepEffect2;
        SelfieAgeStepEffect selfieAgeStepEffect3 = new SelfieAgeStepEffect("RESOLVED", 2);
        RESOLVED = selfieAgeStepEffect3;
        SelfieAgeStepEffect selfieAgeStepEffect4 = new SelfieAgeStepEffect("BACK", 3);
        BACK = selfieAgeStepEffect4;
        SelfieAgeStepEffect[] selfieAgeStepEffectArr = {selfieAgeStepEffect, selfieAgeStepEffect2, selfieAgeStepEffect3, selfieAgeStepEffect4};
        $VALUES = selfieAgeStepEffectArr;
        $ENTRIES = C3cG.A0w(selfieAgeStepEffectArr);
    }

    public static Ey9<SelfieAgeStepEffect> getEntries() {
        return $ENTRIES;
    }

    public static SelfieAgeStepEffect valueOf(String str) {
        return (SelfieAgeStepEffect) Enum.valueOf(SelfieAgeStepEffect.class, str);
    }

    public static SelfieAgeStepEffect[] values() {
        return (SelfieAgeStepEffect[]) $VALUES.clone();
    }

    public SelfieAgeStepEffect(String str, int i) {
    }
}

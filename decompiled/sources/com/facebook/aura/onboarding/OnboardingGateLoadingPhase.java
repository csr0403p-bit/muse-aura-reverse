package com.facebook.aura.onboarding;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnboardingGateLoadingPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OnboardingGateLoadingPhase[] $VALUES;
    public static final OnboardingGateLoadingPhase VM_CONNECTION_FAILED_FETCHING_ONBOARDING;
    public static final OnboardingGateLoadingPhase VM_CONNECTION_SUCCESS_FETCHING_ONBOARDING;
    public static final OnboardingGateLoadingPhase WAITING_VM_CONNECTION;

    static {
        OnboardingGateLoadingPhase onboardingGateLoadingPhase = new OnboardingGateLoadingPhase("WAITING_VM_CONNECTION", 0);
        WAITING_VM_CONNECTION = onboardingGateLoadingPhase;
        OnboardingGateLoadingPhase onboardingGateLoadingPhase2 = new OnboardingGateLoadingPhase("VM_CONNECTION_FAILED_FETCHING_ONBOARDING", 1);
        VM_CONNECTION_FAILED_FETCHING_ONBOARDING = onboardingGateLoadingPhase2;
        OnboardingGateLoadingPhase onboardingGateLoadingPhase3 = new OnboardingGateLoadingPhase("VM_CONNECTION_SUCCESS_FETCHING_ONBOARDING", 2);
        VM_CONNECTION_SUCCESS_FETCHING_ONBOARDING = onboardingGateLoadingPhase3;
        OnboardingGateLoadingPhase[] onboardingGateLoadingPhaseArr = {onboardingGateLoadingPhase, onboardingGateLoadingPhase2, onboardingGateLoadingPhase3};
        $VALUES = onboardingGateLoadingPhaseArr;
        $ENTRIES = C3cG.A0w(onboardingGateLoadingPhaseArr);
    }

    public static Ey9<OnboardingGateLoadingPhase> getEntries() {
        return $ENTRIES;
    }

    public static OnboardingGateLoadingPhase valueOf(String str) {
        return (OnboardingGateLoadingPhase) Enum.valueOf(OnboardingGateLoadingPhase.class, str);
    }

    public static OnboardingGateLoadingPhase[] values() {
        return (OnboardingGateLoadingPhase[]) $VALUES.clone();
    }

    public OnboardingGateLoadingPhase(String str, int i) {
    }
}

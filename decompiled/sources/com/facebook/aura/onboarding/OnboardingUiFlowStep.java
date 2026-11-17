package com.facebook.aura.onboarding;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.library.model.HatchLibraryViewModelKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnboardingUiFlowStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OnboardingUiFlowStep[] $VALUES;
    public static final OnboardingUiFlowStep IDEAS;
    public static final OnboardingUiFlowStep NAME;

    static {
        OnboardingUiFlowStep onboardingUiFlowStep = new OnboardingUiFlowStep(HatchLibraryViewModelKt.LEGACY_SORT_NAME, 0);
        NAME = onboardingUiFlowStep;
        OnboardingUiFlowStep onboardingUiFlowStep2 = new OnboardingUiFlowStep("IDEAS", 1);
        IDEAS = onboardingUiFlowStep2;
        OnboardingUiFlowStep[] onboardingUiFlowStepArr = {onboardingUiFlowStep, onboardingUiFlowStep2};
        $VALUES = onboardingUiFlowStepArr;
        $ENTRIES = C3cG.A0w(onboardingUiFlowStepArr);
    }

    public static Ey9<OnboardingUiFlowStep> getEntries() {
        return $ENTRIES;
    }

    public static OnboardingUiFlowStep valueOf(String str) {
        return (OnboardingUiFlowStep) Enum.valueOf(OnboardingUiFlowStep.class, str);
    }

    public static OnboardingUiFlowStep[] values() {
        return (OnboardingUiFlowStep[]) $VALUES.clone();
    }

    public OnboardingUiFlowStep(String str, int i) {
    }
}

package com.facebook.aura.onboarding;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnboardingGateDecision {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OnboardingGateDecision[] $VALUES;
    public static final OnboardingGateDecision SHOWN_COMPLETED_OTHER_VM;
    public static final OnboardingGateDecision SHOWN_NOT_COMPLETED;
    public static final OnboardingGateDecision SHOWN_NO_VM_ID;
    public static final OnboardingGateDecision SKIPPED;
    public final String wireValue;

    static {
        OnboardingGateDecision onboardingGateDecision = new OnboardingGateDecision("SKIPPED", 0, "skipped");
        SKIPPED = onboardingGateDecision;
        OnboardingGateDecision onboardingGateDecision2 = new OnboardingGateDecision("SHOWN_NO_VM_ID", 1, "shown_no_vm_id");
        SHOWN_NO_VM_ID = onboardingGateDecision2;
        OnboardingGateDecision onboardingGateDecision3 = new OnboardingGateDecision("SHOWN_COMPLETED_OTHER_VM", 2, "shown_completed_other_vm");
        SHOWN_COMPLETED_OTHER_VM = onboardingGateDecision3;
        OnboardingGateDecision onboardingGateDecision4 = new OnboardingGateDecision("SHOWN_NOT_COMPLETED", 3, "shown_not_completed");
        SHOWN_NOT_COMPLETED = onboardingGateDecision4;
        OnboardingGateDecision[] onboardingGateDecisionArr = {onboardingGateDecision, onboardingGateDecision2, onboardingGateDecision3, onboardingGateDecision4};
        $VALUES = onboardingGateDecisionArr;
        $ENTRIES = C3cG.A0w(onboardingGateDecisionArr);
    }

    public static Ey9<OnboardingGateDecision> getEntries() {
        return $ENTRIES;
    }

    public static OnboardingGateDecision valueOf(String str) {
        return (OnboardingGateDecision) Enum.valueOf(OnboardingGateDecision.class, str);
    }

    public static OnboardingGateDecision[] values() {
        return (OnboardingGateDecision[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public OnboardingGateDecision(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

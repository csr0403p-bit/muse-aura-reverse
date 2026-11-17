package com.facebook.aura.onboarding;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnboardingGateResolveTrigger {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OnboardingGateResolveTrigger[] $VALUES;
    public static final OnboardingGateResolveTrigger AUTO_RECONNECT;
    public static final OnboardingGateResolveTrigger INITIAL;
    public static final OnboardingGateResolveTrigger RETRY;
    public final String wireValue;

    static {
        OnboardingGateResolveTrigger onboardingGateResolveTrigger = new OnboardingGateResolveTrigger("INITIAL", 0, "initial");
        INITIAL = onboardingGateResolveTrigger;
        OnboardingGateResolveTrigger onboardingGateResolveTrigger2 = new OnboardingGateResolveTrigger("RETRY", 1, "retry");
        RETRY = onboardingGateResolveTrigger2;
        OnboardingGateResolveTrigger onboardingGateResolveTrigger3 = new OnboardingGateResolveTrigger("AUTO_RECONNECT", 2, "auto_reconnect");
        AUTO_RECONNECT = onboardingGateResolveTrigger3;
        OnboardingGateResolveTrigger[] onboardingGateResolveTriggerArr = {onboardingGateResolveTrigger, onboardingGateResolveTrigger2, onboardingGateResolveTrigger3};
        $VALUES = onboardingGateResolveTriggerArr;
        $ENTRIES = C3cG.A0w(onboardingGateResolveTriggerArr);
    }

    public static Ey9<OnboardingGateResolveTrigger> getEntries() {
        return $ENTRIES;
    }

    public static OnboardingGateResolveTrigger valueOf(String str) {
        return (OnboardingGateResolveTrigger) Enum.valueOf(OnboardingGateResolveTrigger.class, str);
    }

    public static OnboardingGateResolveTrigger[] values() {
        return (OnboardingGateResolveTrigger[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public OnboardingGateResolveTrigger(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

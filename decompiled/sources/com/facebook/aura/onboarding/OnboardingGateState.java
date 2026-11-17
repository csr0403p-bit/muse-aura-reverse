package com.facebook.aura.onboarding;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OnboardingGateState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ OnboardingGateState[] $VALUES;
    public static final Companion Companion;
    public static final OnboardingGateState ERROR;
    public static final OnboardingGateState RESOLVED;
    public static final OnboardingGateState WAITING;
    public final String wireValue;

    static {
        OnboardingGateState onboardingGateState = new OnboardingGateState("WAITING", 0, "waiting");
        WAITING = onboardingGateState;
        OnboardingGateState onboardingGateState2 = new OnboardingGateState("ERROR", 1, "error");
        ERROR = onboardingGateState2;
        OnboardingGateState onboardingGateState3 = new OnboardingGateState("RESOLVED", 2, "resolved");
        RESOLVED = onboardingGateState3;
        OnboardingGateState[] onboardingGateStateArr = {onboardingGateState, onboardingGateState2, onboardingGateState3};
        $VALUES = onboardingGateStateArr;
        $ENTRIES = C3cG.A0w(onboardingGateStateArr);
        Companion = new Companion();
    }

    public static Ey9<OnboardingGateState> getEntries() {
        return $ENTRIES;
    }

    public static OnboardingGateState valueOf(String str) {
        return (OnboardingGateState) Enum.valueOf(OnboardingGateState.class, str);
    }

    public static OnboardingGateState[] values() {
        return (OnboardingGateState[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final OnboardingGateState of(OnboardingGateUiState onboardingGateUiState) {
            C7384Etj.A0Y(onboardingGateUiState, 0);
            return onboardingGateUiState.destination != null ? OnboardingGateState.RESOLVED : onboardingGateUiState.isError ? OnboardingGateState.ERROR : OnboardingGateState.WAITING;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public OnboardingGateState(String str, int i, String str2) {
        this.wireValue = str2;
    }
}

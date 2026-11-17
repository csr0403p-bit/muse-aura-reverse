package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class OnboardingGateUiState extends C06G {
    public final int attemptNumber;
    public final OnboardingGateDestination destination;
    public final boolean isError;
    public final OnboardingGateLoadingPhase loadingPhase;

    public final OnboardingGateUiState copy(boolean z, int i, OnboardingGateLoadingPhase onboardingGateLoadingPhase, OnboardingGateDestination onboardingGateDestination) {
        C7384Etj.A0Y(onboardingGateLoadingPhase, 2);
        return new OnboardingGateUiState(z, i, onboardingGateLoadingPhase, onboardingGateDestination);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingGateUiState) {
                OnboardingGateUiState onboardingGateUiState = (OnboardingGateUiState) obj;
                if (this.isError != onboardingGateUiState.isError || this.attemptNumber != onboardingGateUiState.attemptNumber || this.loadingPhase != onboardingGateUiState.loadingPhase || !C7384Etj.areEqual(this.destination, onboardingGateUiState.destination)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingGateUiState copy$default(OnboardingGateUiState onboardingGateUiState, boolean z, int i, OnboardingGateLoadingPhase onboardingGateLoadingPhase, OnboardingGateDestination onboardingGateDestination, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = onboardingGateUiState.isError;
        }
        if ((i2 & 2) != 0) {
            i = onboardingGateUiState.attemptNumber;
        }
        if ((i2 & 4) != 0) {
            onboardingGateLoadingPhase = onboardingGateUiState.loadingPhase;
        }
        if ((i2 & 8) != 0) {
            onboardingGateDestination = onboardingGateUiState.destination;
        }
        C7384Etj.A0Y(onboardingGateLoadingPhase, 2);
        return new OnboardingGateUiState(z, i, onboardingGateLoadingPhase, onboardingGateDestination);
    }

    public final boolean component1() {
        return this.isError;
    }

    public final int component2() {
        return this.attemptNumber;
    }

    public final OnboardingGateLoadingPhase component3() {
        return this.loadingPhase;
    }

    public final OnboardingGateDestination component4() {
        return this.destination;
    }

    public final int getAttemptNumber() {
        return this.attemptNumber;
    }

    public final OnboardingGateDestination getDestination() {
        return this.destination;
    }

    public final OnboardingGateLoadingPhase getLoadingPhase() {
        return this.loadingPhase;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.loadingPhase, (C0KA.A02(this.isError) + this.attemptNumber) * 31) + AnonymousClass006.A0D(this.destination);
    }

    public final boolean isError() {
        return this.isError;
    }

    public /* synthetic */ OnboardingGateUiState(boolean z, int i, OnboardingGateLoadingPhase onboardingGateLoadingPhase, OnboardingGateDestination onboardingGateDestination, int i2, C06H c06h) {
        this(AnonymousClass001.A1P(i2, z), C3cG.A01(i2, i), (i2 & 4) != 0 ? OnboardingGateLoadingPhase.WAITING_VM_CONNECTION : onboardingGateLoadingPhase, (i2 & 8) != 0 ? null : onboardingGateDestination);
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingGateUiState(boolean z, int i, OnboardingGateLoadingPhase onboardingGateLoadingPhase, OnboardingGateDestination onboardingGateDestination) {
        C7384Etj.A0Y(onboardingGateLoadingPhase, 2);
        this.isError = z;
        this.attemptNumber = i;
        this.loadingPhase = onboardingGateLoadingPhase;
        this.destination = onboardingGateDestination;
    }

    public OnboardingGateUiState() {
        this(false, 0, OnboardingGateLoadingPhase.WAITING_VM_CONNECTION, null);
    }
}

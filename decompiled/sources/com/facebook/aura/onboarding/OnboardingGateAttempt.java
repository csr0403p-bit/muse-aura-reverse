package com.facebook.aura.onboarding;

import X.AbstractC7535F0i;
import X.C7384Etj;
import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class OnboardingGateAttempt {
    public final int number;
    public final String requestId;
    public final long startedAtMs;
    public final OnboardingGateResolveTrigger trigger;

    public OnboardingGateAttempt(int i, OnboardingGateResolveTrigger onboardingGateResolveTrigger) {
        C7384Etj.A0Y(onboardingGateResolveTrigger, 1);
        this.number = i;
        this.trigger = onboardingGateResolveTrigger;
        this.startedAtMs = SystemClock.elapsedRealtime();
        this.requestId = AbstractC7535F0i.A00().toString();
    }

    public final int getNumber() {
        return this.number;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final OnboardingGateResolveTrigger getTrigger() {
        return this.trigger;
    }
}

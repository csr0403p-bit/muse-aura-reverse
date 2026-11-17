package com.facebook.aura.library.repo;

import X.AHH;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalToggleState extends C06G {
    public final GoalCompletionStep inFlight;
    public final AHH<GoalToggleIntent> queued;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalToggleState) {
                GoalToggleState goalToggleState = (GoalToggleState) obj;
                if (!C7384Etj.areEqual(this.inFlight, goalToggleState.inFlight) || !C7384Etj.areEqual(this.queued, goalToggleState.queued)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalToggleState copy$default(GoalToggleState goalToggleState, GoalCompletionStep goalCompletionStep, AHH ahh, int i, Object obj) {
        if ((i & 1) != 0) {
            goalCompletionStep = goalToggleState.inFlight;
        }
        if ((i & 2) != 0) {
            ahh = goalToggleState.queued;
        }
        AnonymousClass003.A0u(goalCompletionStep, ahh);
        return new GoalToggleState(goalCompletionStep, ahh);
    }

    public final GoalCompletionStep component1() {
        return this.inFlight;
    }

    public final AHH<GoalToggleIntent> component2() {
        return this.queued;
    }

    public final GoalCompletionStep getInFlight() {
        return this.inFlight;
    }

    public final AHH<GoalToggleIntent> getQueued() {
        return this.queued;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.queued, AnonymousClass005.A0E(this.inFlight));
    }

    public GoalToggleState(GoalCompletionStep goalCompletionStep, AHH<GoalToggleIntent> ahh) {
        AnonymousClass003.A0u(goalCompletionStep, ahh);
        this.inFlight = goalCompletionStep;
        this.queued = ahh;
    }

    public final GoalToggleState copy(GoalCompletionStep goalCompletionStep, AHH<GoalToggleIntent> ahh) {
        AnonymousClass003.A0u(goalCompletionStep, ahh);
        return new GoalToggleState(goalCompletionStep, ahh);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalToggleState(GoalCompletionStep goalCompletionStep, AHH ahh, int i, C06H c06h) {
        this(goalCompletionStep, (i & 2) != 0 ? AHI.A01 : ahh);
    }
}

package com.facebook.aura.library.view;

import X.AHD;
import X.AnonymousClass003;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class GoalRowsSnapshot {
    public final AHD<Goal> goals;
    public final AHD<Goal> trackingGoals;

    public final AHD<Goal> getGoals() {
        return this.goals;
    }

    public final AHD<Goal> getTrackingGoals() {
        return this.trackingGoals;
    }

    public GoalRowsSnapshot(AHD<Goal> ahd, AHD<Goal> ahd2) {
        AnonymousClass003.A0u(ahd, ahd2);
        this.goals = ahd;
        this.trackingGoals = ahd2;
    }
}

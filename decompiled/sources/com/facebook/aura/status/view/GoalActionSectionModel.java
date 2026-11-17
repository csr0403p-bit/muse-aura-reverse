package com.facebook.aura.status.view;

import X.AHD;
import X.AnonymousClass003;
import com.facebook.aura.status.repo.ActivityGoalAction;

/* loaded from: classes3.dex */
public final class GoalActionSectionModel {
    public final AHD<ActivityGoalAction> actions;
    public final String label;

    public final AHD<ActivityGoalAction> getActions() {
        return this.actions;
    }

    public final String getLabel() {
        return this.label;
    }

    public GoalActionSectionModel(String str, AHD<ActivityGoalAction> ahd) {
        AnonymousClass003.A0u(str, ahd);
        this.label = str;
        this.actions = ahd;
    }
}

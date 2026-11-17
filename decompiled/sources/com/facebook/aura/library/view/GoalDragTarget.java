package com.facebook.aura.library.view;

import X.C7384Etj;
import com.facebook.aura.library.repo.GoalListSection;

/* loaded from: classes2.dex */
public final class GoalDragTarget {
    public final String goalId;
    public final GoalListSection section;

    public GoalDragTarget(GoalListSection goalListSection, String str) {
        C7384Etj.A0Y(goalListSection, 0);
        this.section = goalListSection;
        this.goalId = str;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final GoalListSection getSection() {
        return this.section;
    }
}

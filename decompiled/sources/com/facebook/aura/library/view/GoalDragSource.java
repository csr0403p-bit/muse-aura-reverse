package com.facebook.aura.library.view;

import X.AnonymousClass003;
import com.facebook.aura.library.repo.GoalListSection;

/* loaded from: classes2.dex */
public final class GoalDragSource {
    public final String goalId;
    public final String parentGoalId;
    public final GoalListSection section;

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getParentGoalId() {
        return this.parentGoalId;
    }

    public final GoalListSection getSection() {
        return this.section;
    }

    public GoalDragSource(GoalListSection goalListSection, String str, String str2) {
        AnonymousClass003.A0u(goalListSection, str);
        this.section = goalListSection;
        this.goalId = str;
        this.parentGoalId = str2;
    }
}

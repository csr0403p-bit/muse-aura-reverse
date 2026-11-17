package com.facebook.aura.library.view;

import com.facebook.aura.library.repo.GoalListSection;

/* loaded from: classes2.dex */
public final class SubGoalDragSource {
    public String parentGoalId;
    public GoalListSection section;
    public String subGoalId;

    public final void clear() {
        this.subGoalId = null;
        this.parentGoalId = null;
        this.section = null;
    }

    public final String getParentGoalId() {
        return this.parentGoalId;
    }

    public final GoalListSection getSection() {
        return this.section;
    }

    public final String getSubGoalId() {
        return this.subGoalId;
    }

    public final void setParentGoalId(String str) {
        this.parentGoalId = str;
    }

    public final void setSection(GoalListSection goalListSection) {
        this.section = goalListSection;
    }

    public final void setSubGoalId(String str) {
        this.subGoalId = str;
    }
}

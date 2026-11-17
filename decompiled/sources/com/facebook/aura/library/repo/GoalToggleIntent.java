package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalToggleIntent extends C06G {
    public final boolean completed;
    public final String goalId;

    public GoalToggleIntent(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.goalId = str;
        this.completed = z;
    }

    public final GoalToggleIntent copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new GoalToggleIntent(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalToggleIntent) {
                GoalToggleIntent goalToggleIntent = (GoalToggleIntent) obj;
                if (!C7384Etj.areEqual(this.goalId, goalToggleIntent.goalId) || this.completed != goalToggleIntent.completed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalToggleIntent copy$default(GoalToggleIntent goalToggleIntent, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goalToggleIntent.goalId;
        }
        if ((i & 2) != 0) {
            z = goalToggleIntent.completed;
        }
        C7384Etj.A0Y(str, 0);
        return new GoalToggleIntent(str, z);
    }

    public final String component1() {
        return this.goalId;
    }

    public final boolean component2() {
        return this.completed;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.goalId), this.completed);
    }

    public String toString() {
        return super.toString();
    }
}

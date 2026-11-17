package com.facebook.aura.library.view;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.library.repo.GoalListSection;

/* loaded from: classes2.dex */
public final class GoalRootPlacement extends C06G {
    public final String beforeGoalId;
    public final GoalListSection section;

    public GoalRootPlacement(GoalListSection goalListSection, String str) {
        C7384Etj.A0Y(goalListSection, 0);
        this.section = goalListSection;
        this.beforeGoalId = str;
    }

    public final GoalRootPlacement copy(GoalListSection goalListSection, String str) {
        C7384Etj.A0Y(goalListSection, 0);
        return new GoalRootPlacement(goalListSection, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalRootPlacement) {
                GoalRootPlacement goalRootPlacement = (GoalRootPlacement) obj;
                if (this.section != goalRootPlacement.section || !C7384Etj.areEqual(this.beforeGoalId, goalRootPlacement.beforeGoalId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalRootPlacement copy$default(GoalRootPlacement goalRootPlacement, GoalListSection goalListSection, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            goalListSection = goalRootPlacement.section;
        }
        if ((i & 2) != 0) {
            str = goalRootPlacement.beforeGoalId;
        }
        C7384Etj.A0Y(goalListSection, 0);
        return new GoalRootPlacement(goalListSection, str);
    }

    public final GoalListSection component1() {
        return this.section;
    }

    public final String component2() {
        return this.beforeGoalId;
    }

    public final String getBeforeGoalId() {
        return this.beforeGoalId;
    }

    public final GoalListSection getSection() {
        return this.section;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.section) + AnonymousClass006.A0G(this.beforeGoalId);
    }

    public String toString() {
        return super.toString();
    }
}

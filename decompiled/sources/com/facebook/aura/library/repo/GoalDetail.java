package com.facebook.aura.library.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalDetail extends C06G {
    public final AHD<GoalAssociation> associations;
    public final Goal goal;
    public final AHD<GoalUpdate> updates;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalDetail) {
                GoalDetail goalDetail = (GoalDetail) obj;
                if (!C7384Etj.areEqual(this.goal, goalDetail.goal) || !C7384Etj.areEqual(this.updates, goalDetail.updates) || !C7384Etj.areEqual(this.associations, goalDetail.associations)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalDetail copy$default(GoalDetail goalDetail, Goal goal, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            goal = goalDetail.goal;
        }
        if ((i & 2) != 0) {
            ahd = goalDetail.updates;
        }
        if ((i & 4) != 0) {
            ahd2 = goalDetail.associations;
        }
        return goalDetail.copy(goal, ahd, ahd2);
    }

    public final Goal component1() {
        return this.goal;
    }

    public final AHD<GoalUpdate> component2() {
        return this.updates;
    }

    public final AHD<GoalAssociation> component3() {
        return this.associations;
    }

    public final AHD<GoalAssociation> getAssociations() {
        return this.associations;
    }

    public final Goal getGoal() {
        return this.goal;
    }

    public final AHD<GoalUpdate> getUpdates() {
        return this.updates;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.associations, AnonymousClass005.A0F(this.updates, AnonymousClass005.A0E(this.goal)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoalDetail(Goal goal, AHD<GoalUpdate> ahd, AHD<? extends GoalAssociation> ahd2) {
        AnonymousClass005.A0x(goal, ahd, ahd2);
        this.goal = goal;
        this.updates = ahd;
        this.associations = ahd2;
    }

    public final GoalDetail copy(Goal goal, AHD<GoalUpdate> ahd, AHD<? extends GoalAssociation> ahd2) {
        AnonymousClass005.A0x(goal, ahd, ahd2);
        return new GoalDetail(goal, ahd, ahd2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalDetail(Goal goal, AHD ahd, AHD ahd2, int i, C06H c06h) {
        this(goal, (i & 2) != 0 ? AHI.A01 : ahd, (i & 4) != 0 ? AHI.A01 : ahd2);
    }
}

package com.facebook.aura.library.repo;

import X.AHH;
import X.AHI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class GoalNode extends C06G {
    public final AHH<String> childIds;
    public final Goal goal;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalNode) {
                GoalNode goalNode = (GoalNode) obj;
                if (!C7384Etj.areEqual(this.goal, goalNode.goal) || !C7384Etj.areEqual(this.childIds, goalNode.childIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalNode copy$default(GoalNode goalNode, Goal goal, AHH ahh, int i, Object obj) {
        if ((i & 1) != 0) {
            goal = goalNode.goal;
        }
        if ((i & 2) != 0) {
            ahh = goalNode.childIds;
        }
        AnonymousClass003.A0u(goal, ahh);
        return new GoalNode(goal, ahh);
    }

    public final Goal component1() {
        return this.goal;
    }

    public final AHH<String> component2() {
        return this.childIds;
    }

    public final AHH<String> getChildIds() {
        return this.childIds;
    }

    public final Goal getGoal() {
        return this.goal;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.childIds, AnonymousClass005.A0E(this.goal));
    }

    public GoalNode(Goal goal, AHH<String> ahh) {
        AnonymousClass003.A0u(goal, ahh);
        this.goal = goal;
        this.childIds = ahh;
    }

    public final GoalNode copy(Goal goal, AHH<String> ahh) {
        AnonymousClass003.A0u(goal, ahh);
        return new GoalNode(goal, ahh);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GoalNode(Goal goal, AHH ahh, int i, C06H c06h) {
        this(goal, (i & 2) != 0 ? AHI.A01 : ahh);
    }
}

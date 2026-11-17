package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes2.dex */
public final class GoalCompletionStep extends C06G {
    public final boolean completed;
    public final String goalId;
    public final Set<String> statusChangeIds;
    public final boolean wasInListOrder;
    public final boolean wasInTrackingOrder;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalCompletionStep) {
                GoalCompletionStep goalCompletionStep = (GoalCompletionStep) obj;
                if (!C7384Etj.areEqual(this.goalId, goalCompletionStep.goalId) || this.completed != goalCompletionStep.completed || !C7384Etj.areEqual(this.statusChangeIds, goalCompletionStep.statusChangeIds) || this.wasInListOrder != goalCompletionStep.wasInListOrder || this.wasInTrackingOrder != goalCompletionStep.wasInTrackingOrder) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalCompletionStep copy$default(GoalCompletionStep goalCompletionStep, String str, boolean z, Set set, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goalCompletionStep.goalId;
        }
        if ((i & 2) != 0) {
            z = goalCompletionStep.completed;
        }
        if ((i & 4) != 0) {
            set = goalCompletionStep.statusChangeIds;
        }
        if ((i & 8) != 0) {
            z2 = goalCompletionStep.wasInListOrder;
        }
        if ((i & 16) != 0) {
            z3 = goalCompletionStep.wasInTrackingOrder;
        }
        return goalCompletionStep.copy(str, z, set, z2, z3);
    }

    public final String component1() {
        return this.goalId;
    }

    public final boolean component2() {
        return this.completed;
    }

    public final Set<String> component3() {
        return this.statusChangeIds;
    }

    public final boolean component4() {
        return this.wasInListOrder;
    }

    public final boolean component5() {
        return this.wasInTrackingOrder;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final Set<String> getStatusChangeIds() {
        return this.statusChangeIds;
    }

    public final boolean getWasInListOrder() {
        return this.wasInListOrder;
    }

    public final boolean getWasInTrackingOrder() {
        return this.wasInTrackingOrder;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.statusChangeIds, C0KA.A01(AnonymousClass001.A0G(this.goalId), this.completed)), this.wasInListOrder), this.wasInTrackingOrder);
    }

    public GoalCompletionStep(String str, boolean z, Set<String> set, boolean z2, boolean z3) {
        AnonymousClass003.A0v(str, set);
        this.goalId = str;
        this.completed = z;
        this.statusChangeIds = set;
        this.wasInListOrder = z2;
        this.wasInTrackingOrder = z3;
    }

    public final GoalCompletionStep copy(String str, boolean z, Set<String> set, boolean z2, boolean z3) {
        AnonymousClass003.A0v(str, set);
        return new GoalCompletionStep(str, z, set, z2, z3);
    }

    public String toString() {
        return super.toString();
    }
}

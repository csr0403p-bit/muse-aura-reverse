package com.facebook.aura.status.repo;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ActivityGoalUpdate extends C06G {
    public final Set<String> changedActionIds;
    public final String goalId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalUpdate) {
                ActivityGoalUpdate activityGoalUpdate = (ActivityGoalUpdate) obj;
                if (!C7384Etj.areEqual(this.goalId, activityGoalUpdate.goalId) || !C7384Etj.areEqual(this.changedActionIds, activityGoalUpdate.changedActionIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivityGoalUpdate copy$default(ActivityGoalUpdate activityGoalUpdate, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityGoalUpdate.goalId;
        }
        if ((i & 2) != 0) {
            set = activityGoalUpdate.changedActionIds;
        }
        return new ActivityGoalUpdate(str, set);
    }

    public final String component1() {
        return this.goalId;
    }

    public final Set<String> component2() {
        return this.changedActionIds;
    }

    public final ActivityGoalUpdate copy(String str, Set<String> set) {
        return new ActivityGoalUpdate(str, set);
    }

    public final Set<String> getChangedActionIds() {
        return this.changedActionIds;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.goalId) * 31) + C3cH.A02(this.changedActionIds);
    }

    public ActivityGoalUpdate(String str, Set<String> set) {
        this.goalId = str;
        this.changedActionIds = set;
    }

    public String toString() {
        return super.toString();
    }
}

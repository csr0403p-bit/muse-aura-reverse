package com.facebook.aura.status.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C3cI;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class ActivityGoalActionsPage extends C06G {
    public final List<ActivityGoalAction> actions;
    public final String nextCursor;
    public final long totalCount;

    public ActivityGoalActionsPage(long j, List<ActivityGoalAction> list, String str) {
        C7384Etj.A0Y(list, 1);
        this.totalCount = j;
        this.actions = list;
        this.nextCursor = str;
    }

    public final ActivityGoalActionsPage copy(long j, List<ActivityGoalAction> list, String str) {
        C7384Etj.A0Y(list, 1);
        return new ActivityGoalActionsPage(j, list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityGoalActionsPage) {
                ActivityGoalActionsPage activityGoalActionsPage = (ActivityGoalActionsPage) obj;
                if (this.totalCount != activityGoalActionsPage.totalCount || !C7384Etj.areEqual(this.actions, activityGoalActionsPage.actions) || !C7384Etj.areEqual(this.nextCursor, activityGoalActionsPage.nextCursor)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivityGoalActionsPage copy$default(ActivityGoalActionsPage activityGoalActionsPage, long j, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = activityGoalActionsPage.totalCount;
        }
        if ((i & 2) != 0) {
            list = activityGoalActionsPage.actions;
        }
        if ((i & 4) != 0) {
            str = activityGoalActionsPage.nextCursor;
        }
        return activityGoalActionsPage.copy(j, list, str);
    }

    public final long component1() {
        return this.totalCount;
    }

    public final List<ActivityGoalAction> component2() {
        return this.actions;
    }

    public final String component3() {
        return this.nextCursor;
    }

    public final List<ActivityGoalAction> getActions() {
        return this.actions;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final long getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.actions, C3cI.A01(this.totalCount)) + AnonymousClass006.A0G(this.nextCursor);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.library.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class GoalsPage extends C06G {
    public final List<Goal> goals;
    public final boolean hasNextPage;
    public final String nextCursor;

    public GoalsPage(List<Goal> list, String str, boolean z) {
        C7384Etj.A0Y(list, 0);
        this.goals = list;
        this.nextCursor = str;
        this.hasNextPage = z;
    }

    public final GoalsPage copy(List<Goal> list, String str, boolean z) {
        C7384Etj.A0Y(list, 0);
        return new GoalsPage(list, str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalsPage) {
                GoalsPage goalsPage = (GoalsPage) obj;
                if (!C7384Etj.areEqual(this.goals, goalsPage.goals) || !C7384Etj.areEqual(this.nextCursor, goalsPage.nextCursor) || this.hasNextPage != goalsPage.hasNextPage) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoalsPage copy$default(GoalsPage goalsPage, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = goalsPage.goals;
        }
        if ((i & 2) != 0) {
            str = goalsPage.nextCursor;
        }
        if ((i & 4) != 0) {
            z = goalsPage.hasNextPage;
        }
        return goalsPage.copy(list, str, z);
    }

    public final List<Goal> component1() {
        return this.goals;
    }

    public final String component2() {
        return this.nextCursor;
    }

    public final boolean component3() {
        return this.hasNextPage;
    }

    public final List<Goal> getGoals() {
        return this.goals;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0E(this.goals) + AnonymousClass006.A0G(this.nextCursor)) * 31, this.hasNextPage);
    }

    public String toString() {
        return super.toString();
    }
}

package com.facebook.aura.status.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes3.dex */
public final class GoalActionsDelta extends C06G {
    public final Long baseSeq;
    public final Set<String> removedIds;

    public GoalActionsDelta(Long l, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        this.baseSeq = l;
        this.removedIds = set;
    }

    public final GoalActionsDelta copy(Long l, Set<String> set) {
        C7384Etj.A0Y(set, 1);
        return new GoalActionsDelta(l, set);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GoalActionsDelta) {
                GoalActionsDelta goalActionsDelta = (GoalActionsDelta) obj;
                if (!C7384Etj.areEqual(this.baseSeq, goalActionsDelta.baseSeq) || !C7384Etj.areEqual(this.removedIds, goalActionsDelta.removedIds)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GoalActionsDelta copy$default(GoalActionsDelta goalActionsDelta, Long l, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            l = goalActionsDelta.baseSeq;
        }
        if ((i & 2) != 0) {
            set = goalActionsDelta.removedIds;
        }
        C7384Etj.A0Y(set, 1);
        return new GoalActionsDelta(l, set);
    }

    public final Long component1() {
        return this.baseSeq;
    }

    public final Set<String> component2() {
        return this.removedIds;
    }

    public final Long getBaseSeq() {
        return this.baseSeq;
    }

    public final Set<String> getRemovedIds() {
        return this.removedIds;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.removedIds, AnonymousClass006.A0D(this.baseSeq) * 31);
    }

    public String toString() {
        return super.toString();
    }
}

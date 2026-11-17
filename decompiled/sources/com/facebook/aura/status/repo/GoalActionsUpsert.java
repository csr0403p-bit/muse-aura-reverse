package com.facebook.aura.status.repo;

import X.C06G;
import X.C7384Etj;
import java.util.Set;

/* loaded from: classes3.dex */
public interface GoalActionsUpsert {

    public final class KeepPrevious implements GoalActionsUpsert {
        public static final KeepPrevious INSTANCE = new KeepPrevious();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof KeepPrevious);
        }

        public String toString() {
            return "KeepPrevious";
        }

        public int hashCode() {
            return -1632703103;
        }
    }

    public final class Merge extends C06G implements GoalActionsUpsert {
        public final Set<String> removedIds;

        public Merge(Set<String> set) {
            C7384Etj.A0Y(set, 0);
            this.removedIds = set;
        }

        public final Merge copy(Set<String> set) {
            C7384Etj.A0Y(set, 0);
            return new Merge(set);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Merge) && C7384Etj.areEqual(this.removedIds, ((Merge) obj).removedIds));
        }

        public static /* synthetic */ Merge copy$default(Merge merge, Set set, int i, Object obj) {
            if ((i & 1) != 0) {
                set = merge.removedIds;
            }
            C7384Etj.A0Y(set, 0);
            return new Merge(set);
        }

        public final Set<String> component1() {
            return this.removedIds;
        }

        public final Set<String> getRemovedIds() {
            return this.removedIds;
        }

        public int hashCode() {
            return this.removedIds.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Replace implements GoalActionsUpsert {
        public static final Replace INSTANCE = new Replace();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Replace);
        }

        public String toString() {
            return "Replace";
        }

        public int hashCode() {
            return -1622892625;
        }
    }
}

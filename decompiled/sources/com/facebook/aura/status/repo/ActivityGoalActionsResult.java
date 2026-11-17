package com.facebook.aura.status.repo;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface ActivityGoalActionsResult {

    public final class CursorExpired implements ActivityGoalActionsResult {
        public static final CursorExpired INSTANCE = new CursorExpired();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CursorExpired);
        }

        public String toString() {
            return "CursorExpired";
        }

        public int hashCode() {
            return -354521847;
        }
    }

    public final class Failed implements ActivityGoalActionsResult {
        public static final Failed INSTANCE = new Failed();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public String toString() {
            return "Failed";
        }

        public int hashCode() {
            return -1614852253;
        }
    }

    public final class Loaded extends C06G implements ActivityGoalActionsResult {
        public final ActivityGoalActionsPage page;

        public Loaded(ActivityGoalActionsPage activityGoalActionsPage) {
            C7384Etj.A0Y(activityGoalActionsPage, 0);
            this.page = activityGoalActionsPage;
        }

        public final Loaded copy(ActivityGoalActionsPage activityGoalActionsPage) {
            C7384Etj.A0Y(activityGoalActionsPage, 0);
            return new Loaded(activityGoalActionsPage);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Loaded) && C7384Etj.areEqual(this.page, ((Loaded) obj).page));
        }

        public static /* synthetic */ Loaded copy$default(Loaded loaded, ActivityGoalActionsPage activityGoalActionsPage, int i, Object obj) {
            if ((i & 1) != 0) {
                activityGoalActionsPage = loaded.page;
            }
            C7384Etj.A0Y(activityGoalActionsPage, 0);
            return new Loaded(activityGoalActionsPage);
        }

        public final ActivityGoalActionsPage component1() {
            return this.page;
        }

        public final ActivityGoalActionsPage getPage() {
            return this.page;
        }

        public int hashCode() {
            return this.page.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}

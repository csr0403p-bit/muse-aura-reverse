package com.facebook.aura.status.view;

import X.C7384Etj;
import com.facebook.aura.status.repo.ActivityGoalAction;

/* loaded from: classes3.dex */
public interface GoalBottomSheetDestination {

    public final class Overview implements GoalBottomSheetDestination {
        public static final int $stable = 0;
        public static final Overview INSTANCE = new Overview();
    }

    public final class Report implements GoalBottomSheetDestination {
        public static final int $stable = 8;
        public final ActivityGoalAction goalAction;

        public Report(ActivityGoalAction activityGoalAction) {
            C7384Etj.A0Y(activityGoalAction, 0);
            this.goalAction = activityGoalAction;
        }

        public final ActivityGoalAction getGoalAction() {
            return this.goalAction;
        }
    }
}

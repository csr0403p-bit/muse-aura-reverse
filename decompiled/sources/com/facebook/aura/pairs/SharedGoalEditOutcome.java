package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public interface SharedGoalEditOutcome {

    public final class Applied implements SharedGoalEditOutcome {
        public static final int $stable = 8;
        public final SharedGoal goal;

        public Applied(SharedGoal sharedGoal) {
            C7384Etj.A0Y(sharedGoal, 0);
            this.goal = sharedGoal;
        }

        public final SharedGoal getGoal() {
            return this.goal;
        }
    }

    public final class Conflict implements SharedGoalEditOutcome {
        public static final int $stable = 8;
        public final SharedGoal goal;

        public final SharedGoal getGoal() {
            return this.goal;
        }

        public Conflict(SharedGoal sharedGoal) {
            this.goal = sharedGoal;
        }
    }
}

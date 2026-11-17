package com.facebook.aura.library.view;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.library.repo.GoalListSection;

/* loaded from: classes2.dex */
public interface GoalDropOutcome {

    public final class Nested extends C06G implements GoalDropOutcome {
        public static final int $stable = 0;
        public final String goalId;
        public final String parentGoalId;
        public final GoalListSection parentSection;
        public final String sourceParentGoalId;
        public final GoalListSection sourceSection;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Nested) {
                    Nested nested = (Nested) obj;
                    if (!C7384Etj.areEqual(this.goalId, nested.goalId) || this.sourceSection != nested.sourceSection || !C7384Etj.areEqual(this.sourceParentGoalId, nested.sourceParentGoalId) || !C7384Etj.areEqual(this.parentGoalId, nested.parentGoalId) || this.parentSection != nested.parentSection) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Nested copy$default(Nested nested, String str, GoalListSection goalListSection, String str2, String str3, GoalListSection goalListSection2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nested.goalId;
            }
            if ((i & 2) != 0) {
                goalListSection = nested.sourceSection;
            }
            if ((i & 4) != 0) {
                str2 = nested.sourceParentGoalId;
            }
            if ((i & 8) != 0) {
                str3 = nested.parentGoalId;
            }
            if ((i & 16) != 0) {
                goalListSection2 = nested.parentSection;
            }
            return nested.copy(str, goalListSection, str2, str3, goalListSection2);
        }

        public final String component1() {
            return this.goalId;
        }

        public final GoalListSection component2() {
            return this.sourceSection;
        }

        public final String component3() {
            return this.sourceParentGoalId;
        }

        public final String component4() {
            return this.parentGoalId;
        }

        public final GoalListSection component5() {
            return this.parentSection;
        }

        @Override // com.facebook.aura.library.view.GoalDropOutcome
        public String getGoalId() {
            return this.goalId;
        }

        public final String getParentGoalId() {
            return this.parentGoalId;
        }

        public final GoalListSection getParentSection() {
            return this.parentSection;
        }

        @Override // com.facebook.aura.library.view.GoalDropOutcome
        public String getSourceParentGoalId() {
            return this.sourceParentGoalId;
        }

        @Override // com.facebook.aura.library.view.GoalDropOutcome
        public GoalListSection getSourceSection() {
            return this.sourceSection;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.parentSection, AnonymousClass005.A0I(this.parentGoalId, (AnonymousClass005.A0F(this.sourceSection, AnonymousClass001.A0G(this.goalId)) + AnonymousClass006.A0G(this.sourceParentGoalId)) * 31));
        }

        public Nested(String str, GoalListSection goalListSection, String str2, String str3, GoalListSection goalListSection2) {
            AnonymousClass005.A0y(str, goalListSection, str3);
            C7384Etj.A0Y(goalListSection2, 4);
            this.goalId = str;
            this.sourceSection = goalListSection;
            this.sourceParentGoalId = str2;
            this.parentGoalId = str3;
            this.parentSection = goalListSection2;
        }

        public final Nested copy(String str, GoalListSection goalListSection, String str2, String str3, GoalListSection goalListSection2) {
            AnonymousClass005.A0y(str, goalListSection, str3);
            C7384Etj.A0Y(goalListSection2, 4);
            return new Nested(str, goalListSection, str2, str3, goalListSection2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Root extends C06G implements GoalDropOutcome {
        public static final int $stable = 0;
        public final String beforeGoalId;
        public final GoalListSection destinationSection;
        public final String goalId;
        public final String sourceParentGoalId;
        public final GoalListSection sourceSection;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Root) {
                    Root root = (Root) obj;
                    if (!C7384Etj.areEqual(this.goalId, root.goalId) || this.sourceSection != root.sourceSection || !C7384Etj.areEqual(this.sourceParentGoalId, root.sourceParentGoalId) || this.destinationSection != root.destinationSection || !C7384Etj.areEqual(this.beforeGoalId, root.beforeGoalId)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Root copy$default(Root root, String str, GoalListSection goalListSection, String str2, GoalListSection goalListSection2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = root.goalId;
            }
            if ((i & 2) != 0) {
                goalListSection = root.sourceSection;
            }
            if ((i & 4) != 0) {
                str2 = root.sourceParentGoalId;
            }
            if ((i & 8) != 0) {
                goalListSection2 = root.destinationSection;
            }
            if ((i & 16) != 0) {
                str3 = root.beforeGoalId;
            }
            return root.copy(str, goalListSection, str2, goalListSection2, str3);
        }

        public final String component1() {
            return this.goalId;
        }

        public final GoalListSection component2() {
            return this.sourceSection;
        }

        public final String component3() {
            return this.sourceParentGoalId;
        }

        public final GoalListSection component4() {
            return this.destinationSection;
        }

        public final String component5() {
            return this.beforeGoalId;
        }

        public final String getBeforeGoalId() {
            return this.beforeGoalId;
        }

        public final GoalListSection getDestinationSection() {
            return this.destinationSection;
        }

        @Override // com.facebook.aura.library.view.GoalDropOutcome
        public String getGoalId() {
            return this.goalId;
        }

        @Override // com.facebook.aura.library.view.GoalDropOutcome
        public String getSourceParentGoalId() {
            return this.sourceParentGoalId;
        }

        @Override // com.facebook.aura.library.view.GoalDropOutcome
        public GoalListSection getSourceSection() {
            return this.sourceSection;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.destinationSection, (AnonymousClass005.A0F(this.sourceSection, AnonymousClass001.A0G(this.goalId)) + AnonymousClass006.A0G(this.sourceParentGoalId)) * 31) + AnonymousClass005.A0H(this.beforeGoalId);
        }

        public Root(String str, GoalListSection goalListSection, String str2, GoalListSection goalListSection2, String str3) {
            AnonymousClass005.A0y(str, goalListSection, goalListSection2);
            this.goalId = str;
            this.sourceSection = goalListSection;
            this.sourceParentGoalId = str2;
            this.destinationSection = goalListSection2;
            this.beforeGoalId = str3;
        }

        public final Root copy(String str, GoalListSection goalListSection, String str2, GoalListSection goalListSection2, String str3) {
            AnonymousClass005.A0y(str, goalListSection, goalListSection2);
            return new Root(str, goalListSection, str2, goalListSection2, str3);
        }

        public String toString() {
            return super.toString();
        }
    }

    String getGoalId();

    String getSourceParentGoalId();

    GoalListSection getSourceSection();
}

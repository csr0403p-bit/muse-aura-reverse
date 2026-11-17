package com.facebook.aura.pairs;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class SharedGoalUiState extends C06G {
    public static final int $stable = SharedGoal.$stable;
    public final SharedGoalChange draft;
    public final SharedGoal goal;
    public final boolean isLoading;
    public final boolean isSaving;
    public final SharedGoalProblem problem;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SharedGoalUiState) {
                SharedGoalUiState sharedGoalUiState = (SharedGoalUiState) obj;
                if (!C7384Etj.areEqual(this.goal, sharedGoalUiState.goal) || this.isLoading != sharedGoalUiState.isLoading || this.problem != sharedGoalUiState.problem || !C7384Etj.areEqual(this.draft, sharedGoalUiState.draft) || this.isSaving != sharedGoalUiState.isSaving) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SharedGoalUiState copy$default(SharedGoalUiState sharedGoalUiState, SharedGoal sharedGoal, boolean z, SharedGoalProblem sharedGoalProblem, SharedGoalChange sharedGoalChange, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            sharedGoal = sharedGoalUiState.goal;
        }
        if ((i & 2) != 0) {
            z = sharedGoalUiState.isLoading;
        }
        if ((i & 4) != 0) {
            sharedGoalProblem = sharedGoalUiState.problem;
        }
        if ((i & 8) != 0) {
            sharedGoalChange = sharedGoalUiState.draft;
        }
        if ((i & 16) != 0) {
            z2 = sharedGoalUiState.isSaving;
        }
        return sharedGoalUiState.copy(sharedGoal, z, sharedGoalProblem, sharedGoalChange, z2);
    }

    public final SharedGoal component1() {
        return this.goal;
    }

    public final boolean component2() {
        return this.isLoading;
    }

    public final SharedGoalProblem component3() {
        return this.problem;
    }

    public final SharedGoalChange component4() {
        return this.draft;
    }

    public final boolean component5() {
        return this.isSaving;
    }

    public final SharedGoalUiState copy(SharedGoal sharedGoal, boolean z, SharedGoalProblem sharedGoalProblem, SharedGoalChange sharedGoalChange, boolean z2) {
        return new SharedGoalUiState(sharedGoal, z, sharedGoalProblem, sharedGoalChange, z2);
    }

    public final SharedGoalChange getDraft() {
        return this.draft;
    }

    public final SharedGoal getGoal() {
        return this.goal;
    }

    public final SharedGoalProblem getProblem() {
        return this.problem;
    }

    public int hashCode() {
        return C0KA.A00((((C0KA.A01(AnonymousClass006.A0D(this.goal) * 31, this.isLoading) + AnonymousClass006.A0D(this.problem)) * 31) + C3cH.A02(this.draft)) * 31, this.isSaving);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public SharedGoalUiState(SharedGoal sharedGoal, boolean z, SharedGoalProblem sharedGoalProblem, SharedGoalChange sharedGoalChange, boolean z2) {
        this.goal = sharedGoal;
        this.isLoading = z;
        this.problem = sharedGoalProblem;
        this.draft = sharedGoalChange;
        this.isSaving = z2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SharedGoalUiState(SharedGoal sharedGoal, boolean z, SharedGoalProblem sharedGoalProblem, SharedGoalChange sharedGoalChange, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : sharedGoal, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : sharedGoalProblem, (i & 8) != 0 ? null : sharedGoalChange, C3cI.A1S(i, z2));
    }

    public SharedGoalUiState() {
        this(null, true, null, null, false);
    }
}

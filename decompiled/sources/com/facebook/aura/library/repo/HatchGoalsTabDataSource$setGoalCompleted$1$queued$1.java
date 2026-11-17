package com.facebook.aura.library.repo;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;

/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$setGoalCompleted$1$queued$1 extends AbstractC7559F3s implements G0U<GoalToggleIntent, Boolean> {
    public final /* synthetic */ String $goalId;

    @Override // X.G0U
    public final Boolean invoke(GoalToggleIntent goalToggleIntent) {
        C7384Etj.A0Y(goalToggleIntent, 0);
        return Boolean.valueOf(C7384Etj.areEqual(goalToggleIntent.goalId, this.$goalId));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabDataSource$setGoalCompleted$1$queued$1(String str) {
        super(1);
        this.$goalId = str;
    }
}

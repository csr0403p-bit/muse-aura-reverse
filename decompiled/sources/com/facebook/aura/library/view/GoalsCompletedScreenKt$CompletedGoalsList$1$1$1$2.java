package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$2 extends AbstractC7559F3s implements G0V<Integer, Goal, Object> {
    public static final GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$2 INSTANCE = new GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$2();

    public GoalsCompletedScreenKt$CompletedGoalsList$1$1$1$2() {
        super(2);
    }

    public final Object invoke(int i, Goal goal) {
        C7384Etj.A0Y(goal, 1);
        return goal.id;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(Integer num, Goal goal) {
        num.intValue();
        Goal goal2 = goal;
        C7384Etj.A0Y(goal2, 1);
        return goal2.id;
    }
}

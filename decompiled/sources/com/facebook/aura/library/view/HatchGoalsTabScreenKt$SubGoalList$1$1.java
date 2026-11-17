package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$1$1 extends AbstractC7559F3s implements G0U<Goal, Object> {
    public static final HatchGoalsTabScreenKt$SubGoalList$1$1 INSTANCE = new HatchGoalsTabScreenKt$SubGoalList$1$1();

    public HatchGoalsTabScreenKt$SubGoalList$1$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Object invoke(Goal goal) {
        Goal goal2 = goal;
        C7384Etj.A0Y(goal2, 0);
        return goal2.id;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Goal goal) {
        C7384Etj.A0Y(goal, 0);
        return goal.id;
    }
}

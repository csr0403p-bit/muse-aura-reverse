package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalSubgoalsSection$2$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ G0U<Goal, Unit> $onOpenSubgoal;
    public final /* synthetic */ Goal $subgoal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalDetailScreenKt$GoalSubgoalsSection$2$1$2$1(Goal goal, int i, G0U<? super Goal, Unit> g0u) {
        super(0);
        this.$subgoal = goal;
        this.$absolutePosition = i;
        this.$onOpenSubgoal = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_ROW, HatchScreen.GOAL_DETAIL, this.$subgoal.id, HatchSubsurface.GOALS, Integer.valueOf(this.$absolutePosition));
        this.$onOpenSubgoal.invoke(this.$subgoal);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

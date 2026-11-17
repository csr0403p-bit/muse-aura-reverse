package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalRow$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ Function0<Unit> $onToggleExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalRow$1$1$1(boolean z, Goal goal, int i, Function0<Unit> function0) {
        super(0);
        this.$isExpanded = z;
        this.$goal = goal;
        this.$absolutePosition = i;
        this.$onToggleExpanded = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(this.$isExpanded ? HatchComponent.GOAL_COLLAPSE_TOGGLE : HatchComponent.GOAL_EXPAND_TOGGLE, HatchScreen.GOALS_HOME, this.$goal.id, HatchSubsurface.GOALS, Integer.valueOf(this.$absolutePosition));
        this.$onToggleExpanded.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

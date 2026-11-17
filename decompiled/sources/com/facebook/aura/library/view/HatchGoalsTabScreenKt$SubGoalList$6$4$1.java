package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$6$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ GoalListSection $section;
    public final /* synthetic */ Goal $subGoal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$SubGoalList$6$4$1(GoalReorderActions goalReorderActions, Goal goal, GoalListSection goalListSection) {
        super(0);
        this.$reorderActions = goalReorderActions;
        this.$subGoal = goal;
        this.$section = goalListSection;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reorderActions.promoteSubGoal.invoke(this.$subGoal.id, this.$section);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

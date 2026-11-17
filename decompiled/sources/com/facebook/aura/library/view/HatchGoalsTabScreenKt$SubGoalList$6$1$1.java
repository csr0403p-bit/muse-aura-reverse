package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.ui.ReorderableColumnKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalList$6$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Goal $parentGoal;
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ Goal $subGoal;
    public final /* synthetic */ AHD<String> $subGoalIds;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$reorderActions.reorderSubGoals.invoke(this.$parentGoal.id, ReorderableColumnKt.movedIntoSlotOf(this.$subGoalIds, this.$subGoal.id, str), this.$subGoal.id);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$SubGoalList$6$1$1(GoalReorderActions goalReorderActions, Goal goal, AHD<String> ahd, Goal goal2) {
        super(1);
        this.$reorderActions = goalReorderActions;
        this.$parentGoal = goal;
        this.$subGoalIds = ahd;
        this.$subGoal = goal2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

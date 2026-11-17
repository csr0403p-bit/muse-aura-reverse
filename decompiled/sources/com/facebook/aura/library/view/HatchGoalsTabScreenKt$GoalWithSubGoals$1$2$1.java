package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalListSection;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalWithSubGoals$1$2$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ GoalReorderActions $reorderActions;
    public final /* synthetic */ GoalListSection $section;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$reorderActions.moveGoal.invoke(this.$section, this.$goal.id, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalWithSubGoals$1$2$1(GoalReorderActions goalReorderActions, GoalListSection goalListSection, Goal goal) {
        super(1);
        this.$reorderActions = goalReorderActions;
        this.$section = goalListSection;
        this.$goal = goal;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

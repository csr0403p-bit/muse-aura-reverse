package com.facebook.aura.library.view;

import X.AnonymousClass003;
import X.C7438Evz;
import X.G0V;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.GoalListSection;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$3 extends C7438Evz implements G0V<String, GoalListSection, Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$3(Object obj) {
        super(2, obj, HatchGoalsTabViewModel.class, "promoteSubGoalToGoal", "promoteSubGoalToGoal(Ljava/lang/String;Lcom/facebook/aura/library/repo/GoalListSection;)V", 0);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, GoalListSection goalListSection) {
        invoke2(str, goalListSection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, GoalListSection goalListSection) {
        AnonymousClass003.A0u(str, goalListSection);
        ((HatchGoalsTabViewModel) this.receiver).promoteSubGoalToGoal(str, goalListSection);
    }
}

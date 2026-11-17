package com.facebook.aura.library.view;

import X.AnonymousClass005;
import X.C7438Evz;
import X.G0W;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.GoalListSection;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$1 extends C7438Evz implements G0W<GoalListSection, String, String, Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$1(Object obj) {
        super(3, obj, HatchGoalsTabViewModel.class, "moveGoal", "moveGoal(Lcom/facebook/aura/library/repo/GoalListSection;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(GoalListSection goalListSection, String str, String str2) {
        invoke2(goalListSection, str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoalListSection goalListSection, String str, String str2) {
        AnonymousClass005.A0x(goalListSection, str, str2);
        ((HatchGoalsTabViewModel) this.receiver).moveGoal(goalListSection, str, str2);
    }
}

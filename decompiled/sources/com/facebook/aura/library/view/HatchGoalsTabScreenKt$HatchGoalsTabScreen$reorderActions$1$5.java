package com.facebook.aura.library.view;

import X.AnonymousClass005;
import X.C7438Evz;
import X.G2j;
import com.facebook.aura.library.model.HatchGoalsTabViewModel;
import com.facebook.aura.library.repo.GoalListSection;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$5 extends C7438Evz implements G2j<String, GoalListSection, GoalListSection, String, Unit> {
    public HatchGoalsTabScreenKt$HatchGoalsTabScreen$reorderActions$1$5(Object obj) {
        super(4, obj, HatchGoalsTabViewModel.class, "placeGoalAtRoot", "placeGoalAtRoot(Ljava/lang/String;Lcom/facebook/aura/library/repo/GoalListSection;Lcom/facebook/aura/library/repo/GoalListSection;Ljava/lang/String;)V", 0);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(String str, GoalListSection goalListSection, GoalListSection goalListSection2, String str2) {
        invoke2(str, goalListSection, goalListSection2, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, GoalListSection goalListSection, GoalListSection goalListSection2, String str2) {
        AnonymousClass005.A0x(str, goalListSection, goalListSection2);
        ((HatchGoalsTabViewModel) this.receiver).placeGoalAtRoot(str, goalListSection, goalListSection2, str2);
    }
}

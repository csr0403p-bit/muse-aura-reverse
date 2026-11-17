package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalDetail;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$1$5$1 extends AbstractC7559F3s implements G0U<Goal, Unit> {
    public final /* synthetic */ GoalDetail $detail;
    public final /* synthetic */ AuraNavigator $navigator;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Goal goal) {
        C7384Etj.A0Y(goal, 0);
        this.$navigator.navigate((AuraNavKey) new GoalDetailScreenKey(goal.id, goal.title, this.$detail.goal.title), false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$1$5$1(AuraNavigator auraNavigator, GoalDetail goalDetail) {
        super(1);
        this.$navigator = auraNavigator;
        this.$detail = goalDetail;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Goal goal) {
        invoke2(goal);
        return Unit.INSTANCE;
    }
}

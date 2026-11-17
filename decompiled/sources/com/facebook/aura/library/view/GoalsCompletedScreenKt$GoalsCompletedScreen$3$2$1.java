package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$GoalsCompletedScreen$3$2$1 extends AbstractC7559F3s implements G0V<Goal, Integer, Unit> {
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalsCompletedScreenKt$GoalsCompletedScreen$3$2$1(AuraNavigator auraNavigator) {
        super(2);
        this.$navigator = auraNavigator;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(Goal goal, Integer num) {
        invoke(goal, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(Goal goal, int i) {
        C7384Etj.A0Y(goal, 0);
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_CARD, HatchScreen.GOALS_COMPLETED, goal.id, HatchSubsurface.GOALS, Integer.valueOf(i));
        this.$navigator.navigate((AuraNavKey) new GoalDetailScreenKey(goal.id, goal.title, null), false);
    }
}

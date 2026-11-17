package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.GoalDetailScreenKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$rememberGoalDetailClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onBeforeNavigate;
    public final /* synthetic */ String $parentGoalTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$rememberGoalDetailClick$1$1(Function0<Unit> function0, Goal goal, int i, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$onBeforeNavigate = function0;
        this.$goal = goal;
        this.$absolutePosition = i;
        this.$navigator = auraNavigator;
        this.$parentGoalTitle = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onBeforeNavigate.invoke();
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_CARD, HatchScreen.GOALS_HOME, this.$goal.id, HatchSubsurface.GOALS, Integer.valueOf(this.$absolutePosition));
        AuraNavigator auraNavigator = this.$navigator;
        Goal goal = this.$goal;
        auraNavigator.navigate((AuraNavKey) new GoalDetailScreenKey(goal.id, goal.title, this.$parentGoalTitle), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

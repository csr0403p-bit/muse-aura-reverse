package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$SubGoalRow$1$1$1 extends AbstractC7559F3s implements G0U<Boolean, Boolean> {
    public final /* synthetic */ int $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ G0U<Boolean, Boolean> $onToggleComplete;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGoalsTabScreenKt$SubGoalRow$1$1$1(G0U<? super Boolean, Boolean> g0u, Goal goal, int i) {
        super(1);
        this.$onToggleComplete = g0u;
        this.$goal = goal;
        this.$absolutePosition = i;
    }

    public final Boolean invoke(boolean z) {
        Boolean boolInvoke = this.$onToggleComplete.invoke(Boolean.valueOf(z));
        Goal goal = this.$goal;
        int i = this.$absolutePosition;
        Boolean bool = boolInvoke;
        if (bool.booleanValue()) {
            GoalRowOverflowMenuKt.logGoalCompleteToggle(z, HatchScreen.GOALS_HOME, goal.id, Integer.valueOf(i), HatchSubsurface.GOALS);
        }
        return bool;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(AnonymousClass001.A1X(bool));
    }
}

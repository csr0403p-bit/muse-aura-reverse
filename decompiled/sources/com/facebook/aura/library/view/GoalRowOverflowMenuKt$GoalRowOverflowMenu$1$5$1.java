package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C3cG;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Integer $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ boolean $menuGoalCompleted;
    public final /* synthetic */ G0U<Boolean, Boolean> $onComplete;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$5$1(Function0<Unit> function0, G0U<? super Boolean, Boolean> g0u, boolean z, HatchScreen hatchScreen, Goal goal, Integer num) {
        super(0);
        this.$onDismiss = function0;
        this.$onComplete = g0u;
        this.$menuGoalCompleted = z;
        this.$screen = hatchScreen;
        this.$goal = goal;
        this.$absolutePosition = num;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismiss.invoke();
        if (AnonymousClass003.A1X(C3cG.A0P(this.$menuGoalCompleted), this.$onComplete)) {
            GoalRowOverflowMenuKt.logGoalCompleteToggle(!this.$menuGoalCompleted, this.$screen, this.$goal.id, this.$absolutePosition, HatchSubsurface.DOT_MENU);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

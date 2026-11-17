package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Integer $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ Function0<Unit> $onOpen;
    public final /* synthetic */ HatchScreen $screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$1$1(HatchScreen hatchScreen, Goal goal, Integer num, Function0<Unit> function0) {
        super(0);
        this.$screen = hatchScreen;
        this.$goal = goal;
        this.$absolutePosition = num;
        this.$onOpen = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.THREE_DOTS_MENU, this.$screen, this.$goal.id, HatchSubsurface.GOALS, this.$absolutePosition);
        this.$onOpen.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

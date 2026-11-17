package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$8$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Integer $absolutePosition;
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchScreen $screen;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$1$8$1(Function0<Unit> function0, HatchScreen hatchScreen, Goal goal, Integer num, MutableState<Boolean> mutableState) {
        super(0);
        this.$onDismiss = function0;
        this.$screen = hatchScreen;
        this.$goal = goal;
        this.$absolutePosition = num;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onDismiss.invoke();
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.DELETE_BUTTON, this.$screen, this.$goal.id, HatchSubsurface.DOT_MENU, this.$absolutePosition);
        MutableState.A09(true, this.$showDeleteConfirmation$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalsCompletedScreenKt$CompletedGoalRow$openMenu$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ MutableState<Boolean> $menuExpanded$delegate;
    public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalsCompletedScreenKt$CompletedGoalRow$openMenu$1$1(Goal goal, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$goal = goal;
        this.$menuGoalCompleted$delegate = mutableState;
        this.$menuExpanded$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(this.$goal.isCompleted(), this.$menuGoalCompleted$delegate);
        MutableState.A09(true, this.$menuExpanded$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

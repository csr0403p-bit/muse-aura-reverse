package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalRowOverflowMenuKt$GoalRowOverflowMenu$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Goal $goal;
    public final /* synthetic */ G0U<String, Unit> $onDeleteGoal;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GoalRowOverflowMenuKt$GoalRowOverflowMenu$5$1(G0U<? super String, Unit> g0u, Goal goal, MutableState<Boolean> mutableState) {
        super(0);
        this.$onDeleteGoal = g0u;
        this.$goal = goal;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$showDeleteConfirmation$delegate);
        this.$onDeleteGoal.invoke(this.$goal.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

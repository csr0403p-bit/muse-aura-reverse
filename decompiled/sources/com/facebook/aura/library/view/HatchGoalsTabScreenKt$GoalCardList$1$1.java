package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.view.GoalDropOutcome;
import com.facebook.aura.ui.ReorderableLazyListState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ GoalDropOutcome $appliedOutcome;
    public final /* synthetic */ MutableState<GoalRowsSnapshot> $dragRowsSnapshot$delegate;
    public final /* synthetic */ MutableState<GoalDropOutcome> $pendingDropOutcome$delegate;
    public final /* synthetic */ ReorderableLazyListState $reorderState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$1$1(ReorderableLazyListState reorderableLazyListState, GoalDropOutcome goalDropOutcome, MutableState<GoalRowsSnapshot> mutableState, MutableState<GoalDropOutcome> mutableState2) {
        super(0);
        this.$reorderState = reorderableLazyListState;
        this.$appliedOutcome = goalDropOutcome;
        this.$dragRowsSnapshot$delegate = mutableState;
        this.$pendingDropOutcome$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$reorderState.acknowledgePlacement(this.$appliedOutcome instanceof GoalDropOutcome.Root);
        MutableState<GoalRowsSnapshot> mutableState = this.$dragRowsSnapshot$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        mutableState.Af8(null);
        this.$pendingDropOutcome$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

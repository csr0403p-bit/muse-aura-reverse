package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$dragState$3$1 extends AbstractC7559F3s implements G0U<GoalDropOutcome, Unit> {
    public final /* synthetic */ MutableState<GoalDropOutcome> $pendingDropOutcome$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$dragState$3$1(MutableState<GoalDropOutcome> mutableState) {
        super(1);
        this.$pendingDropOutcome$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(GoalDropOutcome goalDropOutcome) {
        invoke2(goalDropOutcome);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GoalDropOutcome goalDropOutcome) {
        MutableState<GoalDropOutcome> mutableState = this.$pendingDropOutcome$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        mutableState.Af8(goalDropOutcome);
    }
}

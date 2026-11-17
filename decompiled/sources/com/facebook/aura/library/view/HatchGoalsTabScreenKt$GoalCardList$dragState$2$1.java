package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.Goal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchGoalsTabScreenKt$GoalCardList$dragState$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<GoalRowsSnapshot> $dragRowsSnapshot$delegate;
    public final /* synthetic */ AHD<Goal> $goals;
    public final /* synthetic */ MutableState<GoalDropOutcome> $pendingDropOutcome$delegate;
    public final /* synthetic */ AHD<Goal> $trackingGoals;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGoalsTabScreenKt$GoalCardList$dragState$2$1(AHD<Goal> ahd, AHD<Goal> ahd2, MutableState<GoalRowsSnapshot> mutableState, MutableState<GoalDropOutcome> mutableState2) {
        super(0);
        this.$goals = ahd;
        this.$trackingGoals = ahd2;
        this.$dragRowsSnapshot$delegate = mutableState;
        this.$pendingDropOutcome$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState<GoalRowsSnapshot> mutableState = this.$dragRowsSnapshot$delegate;
        float f = HatchGoalsTabScreenKt.LoadMoreFooterHeight;
        if (mutableState.getValue() == null) {
            this.$dragRowsSnapshot$delegate.Af8(new GoalRowsSnapshot(this.$goals, this.$trackingGoals));
        }
        this.$pendingDropOutcome$delegate.Af8(null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

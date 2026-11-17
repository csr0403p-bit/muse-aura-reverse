package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C1BO;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$3$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<GoalDetail> $goalDetail$delegate;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ MutableState<Boolean> $menuGoalCompleted$delegate;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$3$2$1(String str, C1BO<GoalDetail> c1bo, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$goalId = str;
        this.$goalDetail$delegate = c1bo;
        this.$menuGoalCompleted$delegate = mutableState;
        this.$showMenu$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Goal goal;
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.THREE_DOTS_MENU, HatchScreen.GOAL_DETAIL, this.$goalId, HatchSubsurface.GOALS, null);
        MutableState<Boolean> mutableState = this.$menuGoalCompleted$delegate;
        GoalDetail value = this.$goalDetail$delegate.getValue();
        boolean z = false;
        if (value != null && (goal = value.goal) != null && goal.isCompleted()) {
            z = true;
        }
        MutableState.A09(z, mutableState);
        MutableState.A09(true, this.$showMenu$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

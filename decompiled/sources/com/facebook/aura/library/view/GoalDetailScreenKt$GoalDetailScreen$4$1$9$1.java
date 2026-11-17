package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.library.model.GoalDetailViewModel;
import com.facebook.aura.library.repo.Goal;
import com.facebook.aura.library.repo.GoalDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ GoalDetail $detail;
    public final /* synthetic */ String $goalId;
    public final /* synthetic */ MutableState<String> $renameText$delegate;
    public final /* synthetic */ MutableState<Boolean> $showRenameDialog$delegate;
    public final /* synthetic */ GoalDetailViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$9$1(String str, GoalDetailViewModel goalDetailViewModel, GoalDetail goalDetail, MutableState<String> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$goalId = str;
        this.$viewModel = goalDetailViewModel;
        this.$detail = goalDetail;
        this.$renameText$delegate = mutableState;
        this.$showRenameDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Goal goal;
        GoalRowOverflowMenuKt.logGoalRowClick(HatchComponent.GOAL_SAVE_BUTTON, HatchScreen.GOAL_DETAIL, this.$goalId, HatchSubsurface.GOAL_RENAME_DIALOG, null);
        String strA0l = AnonymousClass002.A0l(MutableState.A05(this.$renameText$delegate));
        MutableState.A09(false, this.$showRenameDialog$delegate);
        if (strA0l.length() > 0) {
            GoalDetailViewModel goalDetailViewModel = this.$viewModel;
            GoalDetail goalDetail = this.$detail;
            goalDetailViewModel.renameCurrentGoal(strA0l, (goalDetail == null || (goal = goalDetail.goal) == null) ? null : goal.description);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

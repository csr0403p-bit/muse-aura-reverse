package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.status.viewmodel.GoalStepsViewModel;

/* loaded from: classes2.dex */
public final class ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $actionId;
    public final /* synthetic */ GoalStepsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$1$1(GoalStepsViewModel goalStepsViewModel, String str) {
        super(1);
        this.$viewModel = goalStepsViewModel;
        this.$actionId = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$viewModel.openReport(this.$actionId);
        final GoalStepsViewModel goalStepsViewModel = this.$viewModel;
        return new C78g() { // from class: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                goalStepsViewModel.closeReport();
            }
        };
    }
}

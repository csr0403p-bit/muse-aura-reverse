package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import com.facebook.aura.library.model.GoalDetailViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$6$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ GoalDetailViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$6$1(GoalDetailViewModel goalDetailViewModel) {
        super(0);
        this.$viewModel = goalDetailViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$viewModel.toggleCurrentGoalCompleted());
    }
}

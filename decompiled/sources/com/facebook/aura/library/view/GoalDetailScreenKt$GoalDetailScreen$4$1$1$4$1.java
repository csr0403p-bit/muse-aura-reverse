package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.library.model.GoalDetailViewModel;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$1$4$1 extends AbstractC7559F3s implements G0V<String, Boolean, Boolean> {
    public final /* synthetic */ GoalDetailViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$1$4$1(GoalDetailViewModel goalDetailViewModel) {
        super(2);
        this.$viewModel = goalDetailViewModel;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Boolean invoke(String str, Boolean bool) {
        return invoke(str, AnonymousClass001.A1X(bool));
    }

    public final Boolean invoke(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return Boolean.valueOf(this.$viewModel.setGoalCompleted(str, z));
    }
}

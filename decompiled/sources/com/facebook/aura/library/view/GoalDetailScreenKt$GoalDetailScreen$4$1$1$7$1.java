package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.library.model.GoalDetailViewModel;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class GoalDetailScreenKt$GoalDetailScreen$4$1$1$7$1 extends AbstractC7559F3s implements G0W<String, String, String, Unit> {
    public final /* synthetic */ GoalDetailViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoalDetailScreenKt$GoalDetailScreen$4$1$1$7$1(GoalDetailViewModel goalDetailViewModel) {
        super(3);
        this.$viewModel = goalDetailViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, String str3) {
        invoke2(str, str2, str3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.renameSubgoal(str, str2, str3);
    }
}

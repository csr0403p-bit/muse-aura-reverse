package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ActivityScreenKt$ActivityScreen$4$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ActivityViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScreenKt$ActivityScreen$4$2$1(ActivityViewModel activityViewModel) {
        super(0);
        this.$viewModel = activityViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.loadActions();
    }
}

package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ActivityScreenKt$ActivityScreen$4$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ActivityViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityScreenKt$ActivityScreen$4$4$1(ActivityViewModel activityViewModel) {
        super(0);
        this.$viewModel = activityViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logPullToRefresh(HatchSurface.STATUS, HatchSubsurface.TASK_LIST, null, null);
        this.$viewModel.refresh();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

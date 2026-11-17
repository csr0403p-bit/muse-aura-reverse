package com.facebook.aura.status.view;

import X.C7438Evz;
import com.facebook.aura.status.viewmodel.GoalStepsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$2$2$1 extends C7438Evz implements Function0<Unit> {
    public ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$2$2$1(Object obj) {
        super(0, obj, GoalStepsViewModel.class, "retryReport", "retryReport()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoalStepsViewModel) this.receiver).retryReport();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

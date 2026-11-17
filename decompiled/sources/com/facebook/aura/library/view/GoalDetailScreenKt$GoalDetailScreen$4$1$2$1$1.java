package com.facebook.aura.library.view;

import X.C7438Evz;
import com.facebook.aura.library.model.GoalDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class GoalDetailScreenKt$GoalDetailScreen$4$1$2$1$1 extends C7438Evz implements Function0<Unit> {
    public GoalDetailScreenKt$GoalDetailScreen$4$1$2$1$1(Object obj) {
        super(0, obj, GoalDetailViewModel.class, "retry", "retry()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GoalDetailViewModel) this.receiver).retry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

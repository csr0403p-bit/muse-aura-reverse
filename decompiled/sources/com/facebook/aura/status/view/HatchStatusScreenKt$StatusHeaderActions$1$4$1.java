package com.facebook.aura.status.view;

import X.C7438Evz;
import com.facebook.aura.status.viewmodel.HatchStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchStatusScreenKt$StatusHeaderActions$1$4$1 extends C7438Evz implements Function0<Unit> {
    public HatchStatusScreenKt$StatusHeaderActions$1$4$1(Object obj) {
        super(0, obj, HatchStatusViewModel.class, "onRefreshClick", "onRefreshClick()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchStatusViewModel) this.receiver).onRefreshClick();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.ageverification;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class SelfieAgeStepScreenKt$SelfieAgeStepContent$8$1 extends C7438Evz implements Function0<Unit> {
    public SelfieAgeStepScreenKt$SelfieAgeStepContent$8$1(Object obj) {
        super(0, obj, SelfieAgeStepViewModel.class, "onRetry", "onRetry()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((SelfieAgeStepViewModel) this.receiver).onRetry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

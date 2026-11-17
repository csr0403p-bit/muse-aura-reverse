package com.facebook.aura.activation.view;

import X.C7438Evz;
import com.facebook.aura.ccv.nativeflow.ui.HatchAgeLinkingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ActivationAgeStepKt$MethodListAgeStep$5$1$1 extends C7438Evz implements Function0<Unit> {
    public ActivationAgeStepKt$MethodListAgeStep$5$1$1(Object obj) {
        super(0, obj, HatchAgeLinkingViewModel.class, "onErrorDismissed", "onErrorDismissed()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchAgeLinkingViewModel) this.receiver).onErrorDismissed();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

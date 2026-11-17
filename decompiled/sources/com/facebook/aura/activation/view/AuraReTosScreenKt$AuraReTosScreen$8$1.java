package com.facebook.aura.activation.view;

import X.C7438Evz;
import com.facebook.aura.activation.model.HatchReTosViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class AuraReTosScreenKt$AuraReTosScreen$8$1 extends C7438Evz implements Function0<Unit> {
    public AuraReTosScreenKt$AuraReTosScreen$8$1(Object obj) {
        super(0, obj, HatchReTosViewModel.class, "onRetry", "onRetry()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchReTosViewModel) this.receiver).onRetry();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

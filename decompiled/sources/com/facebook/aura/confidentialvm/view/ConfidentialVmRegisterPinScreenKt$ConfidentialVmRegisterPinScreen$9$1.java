package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$9$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$9$1(Object obj) {
        super(0, obj, ConfidentialVmRegisterPinViewModel.class, "onRetryReconnect", "onRetryReconnect()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmRegisterPinViewModel) this.receiver).onRetryReconnect();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

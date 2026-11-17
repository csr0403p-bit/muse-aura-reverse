package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$3$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmSwitchProgressScreenKt$ConfidentialVmSwitchProgressScreen$3$1(Object obj) {
        super(0, obj, ConfidentialVmSwitchProgressViewModel.class, "onTryAgain", "onTryAgain()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmSwitchProgressViewModel) this.receiver).onTryAgain();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

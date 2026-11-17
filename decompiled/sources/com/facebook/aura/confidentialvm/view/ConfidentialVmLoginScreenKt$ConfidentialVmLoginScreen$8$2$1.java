package com.facebook.aura.confidentialvm.view;

import X.C7438Evz;
import com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$8$2$1 extends C7438Evz implements Function0<Unit> {
    public ConfidentialVmLoginScreenKt$ConfidentialVmLoginScreen$8$2$1(Object obj) {
        super(0, obj, ConfidentialVmLoginViewModel.class, "onSubmit", "onSubmit()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ConfidentialVmLoginViewModel) this.receiver).onSubmit();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

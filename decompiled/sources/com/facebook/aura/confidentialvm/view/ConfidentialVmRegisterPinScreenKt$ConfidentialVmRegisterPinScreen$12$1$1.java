package com.facebook.aura.confidentialvm.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.confidentialvm.model.ConfidentialVmRegisterPinViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12$1$1 extends C7438Evz implements G0U<String, Unit> {
    public ConfidentialVmRegisterPinScreenKt$ConfidentialVmRegisterPinScreen$12$1$1(Object obj) {
        super(1, obj, ConfidentialVmRegisterPinViewModel.class, "onPinChange", "onPinChange(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((ConfidentialVmRegisterPinViewModel) AnonymousClass006.A0o(str, this)).onPinChange(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}

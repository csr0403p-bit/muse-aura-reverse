package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginViewModel$picker$1 extends C7438Evz implements G0V<NativeLoginPickerRows<NativeLoginAccountUiModel>, NativeLoginSiblingDisclosure, Unit> {
    public NativeLoginViewModel$picker$1(Object obj) {
        super(2, obj, NativeLoginViewModel.class, "publishPicker", "publishPicker(Lcom/facebook/aura/login/nativeflow/NativeLoginPickerRows;Lcom/facebook/aura/login/nativeflow/NativeLoginSiblingDisclosure;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NativeLoginPickerRows<NativeLoginAccountUiModel> nativeLoginPickerRows, NativeLoginSiblingDisclosure nativeLoginSiblingDisclosure) {
        ((NativeLoginViewModel) AnonymousClass006.A0o(nativeLoginPickerRows, this)).publishPicker(nativeLoginPickerRows, nativeLoginSiblingDisclosure);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginPickerRows<NativeLoginAccountUiModel> nativeLoginPickerRows, NativeLoginSiblingDisclosure nativeLoginSiblingDisclosure) {
        invoke2(nativeLoginPickerRows, nativeLoginSiblingDisclosure);
        return Unit.INSTANCE;
    }
}

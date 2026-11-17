package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginLandingRoute$2$1 extends C7438Evz implements G0U<NativeLoginAccountUiModel, Unit> {
    public NativeLoginRoutesKt$NativeLoginLandingRoute$2$1(Object obj) {
        super(1, obj, NativeLoginViewModel.class, "onAccountSelected", "onAccountSelected(Lcom/facebook/aura/login/nativeflow/NativeLoginAccountUiModel;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        ((NativeLoginViewModel) AnonymousClass006.A0o(nativeLoginAccountUiModel, this)).onAccountSelected(nativeLoginAccountUiModel);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(NativeLoginAccountUiModel nativeLoginAccountUiModel) {
        invoke2(nativeLoginAccountUiModel);
        return Unit.INSTANCE;
    }
}

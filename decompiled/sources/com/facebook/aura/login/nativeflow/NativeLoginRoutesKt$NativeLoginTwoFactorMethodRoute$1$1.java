package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginTwoFactorMethodRoute$1$1 extends C7438Evz implements G0U<HatchTwoFactorMethod, Unit> {
    public NativeLoginRoutesKt$NativeLoginTwoFactorMethodRoute$1$1(Object obj) {
        super(1, obj, NativeLoginViewModel.class, "onTwoFactorMethodSelected", "onTwoFactorMethodSelected(Lcom/facebook/aura/login/nativeflow/HatchTwoFactorMethod;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchTwoFactorMethod hatchTwoFactorMethod) {
        ((NativeLoginViewModel) AnonymousClass006.A0o(hatchTwoFactorMethod, this)).onTwoFactorMethodSelected(hatchTwoFactorMethod);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchTwoFactorMethod hatchTwoFactorMethod) {
        invoke2(hatchTwoFactorMethod);
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.login.nativeflow;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$2$1 extends C7438Evz implements Function0<Unit> {
    public NativeLoginRoutesKt$NativeLoginNtpUpsellRoute$2$1(Object obj) {
        super(0, obj, NativeLoginViewModel.class, "onNtpUpsellDeclineClicked", "onNtpUpsellDeclineClicked()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NativeLoginViewModel) this.receiver).onNtpUpsellDeclineClicked();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

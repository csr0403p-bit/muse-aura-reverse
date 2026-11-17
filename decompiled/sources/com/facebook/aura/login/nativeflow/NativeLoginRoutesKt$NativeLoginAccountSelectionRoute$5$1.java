package com.facebook.aura.login.nativeflow;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$5$1 extends C7438Evz implements Function0<Unit> {
    public NativeLoginRoutesKt$NativeLoginAccountSelectionRoute$5$1(Object obj) {
        super(0, obj, NativeLoginViewModel.class, "onAccountSelectionBackClicked", "onAccountSelectionBackClicked()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NativeLoginViewModel) this.receiver).onAccountSelectionBackClicked();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

package com.facebook.aura.login.nativeflow;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class PreloadsTosRouteKt$PreloadsTosRoute$2$1 extends C7438Evz implements Function0<Unit> {
    public PreloadsTosRouteKt$PreloadsTosRoute$2$1(Object obj) {
        super(0, obj, PreloadsTosViewModel.class, "onContinueClicked", "onContinueClicked()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PreloadsTosViewModel) this.receiver).onContinueClicked();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

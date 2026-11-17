package com.facebook.aura.login.nativeflow;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginNameRoute$9$1 extends C7438Evz implements Function0<Unit> {
    public NativeLoginRoutesKt$NativeLoginNameRoute$9$1(Object obj) {
        super(0, obj, NativeLoginViewModel.class, "onBirthdayScreenLeft", "onBirthdayScreenLeft()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NativeLoginViewModel) this.receiver).onBirthdayScreenLeft();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

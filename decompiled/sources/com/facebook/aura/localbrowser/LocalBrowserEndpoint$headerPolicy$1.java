package com.facebook.aura.localbrowser;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserEndpoint$headerPolicy$1 extends C7438Evz implements Function0<Unit> {
    public LocalBrowserEndpoint$headerPolicy$1(Object obj) {
        super(0, obj, LocalBrowserRuntime.class, "invalidatePolicy", "invalidatePolicy()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LocalBrowserRuntime) this.receiver).invalidatePolicy();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

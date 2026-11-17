package com.facebook.aura.localbrowser;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocalBrowserTarget$rendering$1 extends C7438Evz implements Function0<Unit> {
    public LocalBrowserTarget$rendering$1(Object obj) {
        super(0, obj, LocalBrowserTarget.class, "refreshRenderingAvailability", "refreshRenderingAvailability()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LocalBrowserTarget) this.receiver).refreshRenderingAvailability();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

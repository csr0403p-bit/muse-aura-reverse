package com.facebook.aura.localbrowser;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserComputerSurface$Viewport$2$1$3$1 extends C7438Evz implements Function0<Unit> {
    public LocalBrowserComputerSurface$Viewport$2$1$3$1(Object obj) {
        super(0, obj, LocalBrowserTarget.class, "goForwardFromUser", "goForwardFromUser()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LocalBrowserTarget) this.receiver).goForwardFromUser();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

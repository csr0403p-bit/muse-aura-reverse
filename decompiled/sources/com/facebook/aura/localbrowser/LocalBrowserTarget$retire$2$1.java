package com.facebook.aura.localbrowser;

import X.C7438Evz;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocalBrowserTarget$retire$2$1 extends C7438Evz implements Function0<Unit> {
    public LocalBrowserTarget$retire$2$1(Object obj) {
        super(0, obj, LocalBrowserTarget.HostSlot.class, "close", "close()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((LocalBrowserTarget.HostSlot) this.receiver).close();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

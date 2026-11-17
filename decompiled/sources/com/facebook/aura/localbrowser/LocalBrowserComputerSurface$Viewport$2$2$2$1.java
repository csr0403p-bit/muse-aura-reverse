package com.facebook.aura.localbrowser;

import X.C7438Evz;
import X.G0U;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserComputerSurface$Viewport$2$2$2$1 extends C7438Evz implements G0U<LocalBrowserTarget.HostLease, Unit> {
    public LocalBrowserComputerSurface$Viewport$2$2$2$1(Object obj) {
        super(1, obj, LocalBrowserComputerSurface.class, "hostChanged", "hostChanged(Lcom/facebook/aura/localbrowser/LocalBrowserTarget$HostLease;)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LocalBrowserTarget.HostLease hostLease) {
        invoke2(hostLease);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalBrowserTarget.HostLease hostLease) {
        ((LocalBrowserComputerSurface) this.receiver).hostChanged(hostLease);
    }
}

package com.facebook.aura.localbrowser;

import X.C7438Evz;
import X.G0U;
import com.facebook.aura.localbrowser.LocalBrowserTarget;

/* loaded from: classes2.dex */
public final /* synthetic */ class LocalBrowserComputerSurface$Viewport$2$2$1$1 extends C7438Evz implements G0U<LocalBrowserTarget.HostLease, Boolean> {
    public LocalBrowserComputerSurface$Viewport$2$2$1$1(Object obj) {
        super(1, obj, LocalBrowserSession.class, "acceptsUserInput", "acceptsUserInput(Lcom/facebook/aura/localbrowser/LocalBrowserTarget$HostLease;)Z", 0);
    }

    @Override // X.G0U
    public final Boolean invoke(LocalBrowserTarget.HostLease hostLease) {
        return Boolean.valueOf(((LocalBrowserSession) this.receiver).acceptsUserInput(hostLease));
    }
}

package com.facebook.aura.analytics;

import X.C7384Etj;
import X.C7526EzK;
import X.C8ee;
import X.InterfaceC7549F2g;

/* loaded from: classes5.dex */
public final class AuraLoggerHolder implements InterfaceC7549F2g {
    public final C8ee<C7526EzK> logger;

    public AuraLoggerHolder(C8ee<C7526EzK> c8ee) {
        C7384Etj.A0Y(c8ee, 0);
        this.logger = c8ee;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final C8ee<C7526EzK> getLogger() {
        return this.logger;
    }
}

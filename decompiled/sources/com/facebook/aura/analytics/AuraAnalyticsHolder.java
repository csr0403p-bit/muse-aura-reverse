package com.facebook.aura.analytics;

import X.C7384Etj;
import X.DFX;
import X.InterfaceC7549F2g;

/* loaded from: classes5.dex */
public final class AuraAnalyticsHolder implements InterfaceC7549F2g {
    public final DFX instance;

    public AuraAnalyticsHolder(DFX dfx) {
        C7384Etj.A0Y(dfx, 0);
        this.instance = dfx;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final DFX getInstance() {
        return this.instance;
    }
}

package com.facebook.aura.analytics.impl;

import X.CI7;
import X.CI9;
import X.InterfaceC4946DGk;

/* loaded from: classes5.dex */
public final class UserConsentStateProvider implements CI7, InterfaceC4946DGk {
    @Override // X.CI7
    public CI9 getUserConsentState() {
        CI9 ci9 = new CI9();
        long j = ci9.A00 | 16;
        ci9.A00 = j;
        ci9.A00 = j | 32;
        return ci9;
    }

    @Override // X.InterfaceC4946DGk
    public long getConsentState() {
        return getUserConsentState().A00;
    }
}

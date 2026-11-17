package com.facebook.aura.analytics.impl;

import X.BV5;
import X.C4079ClR;
import X.InterfaceC4083Clb;

/* loaded from: classes5.dex */
public final class RegularPriUploadSchedulerParamsProvider implements InterfaceC4083Clb {
    @Override // X.InterfaceC4083Clb
    public C4079ClR getBackgroundParams() {
        return new C4079ClR(BV5.A0F().regularBackMinDelayMsSingle, BV5.A0F().regularBackMaxDelayMsSingle, BV5.A0F().regularBackMinDelayMsBatch, BV5.A0F().regularBackMaxDelayMsBatch);
    }

    @Override // X.InterfaceC4083Clb
    public C4079ClR getForegroundParams() {
        return new C4079ClR(BV5.A0F().regularForeMinDelayMsSingle, BV5.A0F().regularForeMaxDelayMsSingle, BV5.A0F().regularForeMinDelayMsBatch, BV5.A0F().regularForeMaxDelayMsBatch);
    }
}

package com.facebook.aura.analytics.impl;

import X.BV5;
import X.C4079ClR;
import X.InterfaceC4083Clb;

/* loaded from: classes5.dex */
public final class HighPriUploadSchedulerParamsProvider implements InterfaceC4083Clb {
    @Override // X.InterfaceC4083Clb
    public C4079ClR getBackgroundParams() {
        return new C4079ClR(BV5.A0F().highBackMinDelayMsSingle, BV5.A0F().highBackMaxDelayMsSingle, BV5.A0F().highBackMinDelayMsBatch, BV5.A0F().highBackMaxDelayMsBatch);
    }

    @Override // X.InterfaceC4083Clb
    public C4079ClR getForegroundParams() {
        return new C4079ClR(BV5.A0F().highForeMinDelayMsSingle, BV5.A0F().highForeMaxDelayMsSingle, BV5.A0F().highForeMinDelayMsBatch, BV5.A0F().highForeMaxDelayMsBatch);
    }
}

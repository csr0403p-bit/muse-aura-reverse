package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.GVL;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$connectFunnelProxy$2 extends AbstractC7559F3s implements Function0<GVL> {
    public final /* synthetic */ HatchRealTimeSessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$connectFunnelProxy$2(HatchRealTimeSessionController hatchRealTimeSessionController) {
        super(0);
        this.this$0 = hatchRealTimeSessionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final GVL invoke() {
        return new GVL(this.this$0.getXAnalyticsProvider());
    }
}

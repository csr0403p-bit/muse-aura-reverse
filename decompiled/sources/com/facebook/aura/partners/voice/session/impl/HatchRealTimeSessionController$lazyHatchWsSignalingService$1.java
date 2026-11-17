package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchRealTimeSessionController$lazyHatchWsSignalingService$1 extends AbstractC7559F3s implements Function0<HatchWsSignalingService> {
    public final /* synthetic */ HatchRealTimeSessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRealTimeSessionController$lazyHatchWsSignalingService$1(HatchRealTimeSessionController hatchRealTimeSessionController) {
        super(0);
        this.this$0 = hatchRealTimeSessionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchWsSignalingService invoke() {
        HatchRealTimeSessionController hatchRealTimeSessionController = this.this$0;
        return new HatchWsSignalingService(hatchRealTimeSessionController.userId, hatchRealTimeSessionController.gateway, hatchRealTimeSessionController.joinContext);
    }
}

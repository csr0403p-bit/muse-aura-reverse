package com.facebook.aura.gateway.service;

import X.AbstractC7559F3s;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchGatewayServiceManager$reset$invalidated$2 extends AbstractC7559F3s implements Function0<Unit> {
    public static final HatchGatewayServiceManager$reset$invalidated$2 INSTANCE = new HatchGatewayServiceManager$reset$invalidated$2();

    public HatchGatewayServiceManager$reset$invalidated$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        AuraNoiseVmTransport.INSTANCE.unregisterConnectionDemandHandler();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNoiseVmTransport.INSTANCE.unregisterConnectionDemandHandler();
    }
}

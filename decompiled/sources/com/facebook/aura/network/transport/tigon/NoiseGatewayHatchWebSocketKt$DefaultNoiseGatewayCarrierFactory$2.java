package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.F0C;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$2 extends AbstractC7559F3s implements Function0<NoiseChannelManagerHolder> {
    public static final NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$2 INSTANCE = new NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$2();

    public NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ NoiseChannelManagerHolder invoke() {
        return AuraNoiseVmTransport.managerHolderLazy.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NoiseChannelManagerHolder invoke() {
        return F0C.A03();
    }
}

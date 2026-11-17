package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import com.facebook.aura.network.transport.HatchWebSocket;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class TigonTransportFactory$vmJwtNoiseGatewayWebSocket$2 extends AbstractC7559F3s implements Function0<HatchWebSocket> {
    public static final TigonTransportFactory$vmJwtNoiseGatewayWebSocket$2 INSTANCE = new TigonTransportFactory$vmJwtNoiseGatewayWebSocket$2();

    public TigonTransportFactory$vmJwtNoiseGatewayWebSocket$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchWebSocket invoke() {
        return NoiseGatewayHatchWebSocketFactory.INSTANCE.create();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ HatchWebSocket invoke() {
        return NoiseGatewayHatchWebSocketFactory.INSTANCE.create();
    }
}

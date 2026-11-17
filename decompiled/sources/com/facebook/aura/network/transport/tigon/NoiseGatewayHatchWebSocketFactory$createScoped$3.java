package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketFactory$createScoped$3 extends AbstractC7559F3s implements Function0<Integer> {
    public static final NoiseGatewayHatchWebSocketFactory$createScoped$3 INSTANCE = new NoiseGatewayHatchWebSocketFactory$createScoped$3();

    public NoiseGatewayHatchWebSocketFactory$createScoped$3() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketConnectTimeoutMs());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Integer invoke() {
        return Integer.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketConnectTimeoutMs());
    }
}

package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketFactory$createScoped$4 extends AbstractC7559F3s implements Function0<Long> {
    public static final NoiseGatewayHatchWebSocketFactory$createScoped$4 INSTANCE = new NoiseGatewayHatchWebSocketFactory$createScoped$4();

    public NoiseGatewayHatchWebSocketFactory$createScoped$4() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketUpgradeTimeoutMs());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Long invoke() {
        return Long.valueOf(NoiseGatewayHatchWebSocketKt.getGatewayWebSocketUpgradeTimeoutMs());
    }
}

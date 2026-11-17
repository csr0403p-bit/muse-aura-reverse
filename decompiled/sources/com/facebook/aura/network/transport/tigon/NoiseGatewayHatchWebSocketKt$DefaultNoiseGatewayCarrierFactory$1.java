package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.DCW;
import X.F0C;
import com.facebook.aura.network.tigon.AuraTigonServiceProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$1 extends AbstractC7559F3s implements Function0<DCW> {
    public static final NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$1 INSTANCE = new NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$1();

    public NoiseGatewayHatchWebSocketKt$DefaultNoiseGatewayCarrierFactory$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.DCW, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ DCW invoke() {
        return AuraTigonServiceProvider.tigonHttpClient$delegate.getValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DCW invoke() {
        return F0C.A02();
    }
}

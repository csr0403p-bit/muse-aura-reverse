package com.facebook.aura.gateway.noise.carrier;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class NoiseGatewayWebSocketTransportPolicy {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NoiseGatewayWebSocketTransportPolicy[] $VALUES;
    public static final NoiseGatewayWebSocketTransportPolicy HTTP1_UPGRADE;
    public static final NoiseGatewayWebSocketTransportPolicy HTTP2_EXTENDED_CONNECT;
    public final int nativeCode;

    static {
        NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy = new NoiseGatewayWebSocketTransportPolicy("HTTP1_UPGRADE", 0, 0);
        HTTP1_UPGRADE = noiseGatewayWebSocketTransportPolicy;
        NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy2 = new NoiseGatewayWebSocketTransportPolicy("HTTP2_EXTENDED_CONNECT", 1, 1);
        HTTP2_EXTENDED_CONNECT = noiseGatewayWebSocketTransportPolicy2;
        NoiseGatewayWebSocketTransportPolicy[] noiseGatewayWebSocketTransportPolicyArr = {noiseGatewayWebSocketTransportPolicy, noiseGatewayWebSocketTransportPolicy2};
        $VALUES = noiseGatewayWebSocketTransportPolicyArr;
        $ENTRIES = C3cG.A0w(noiseGatewayWebSocketTransportPolicyArr);
    }

    public static Ey9<NoiseGatewayWebSocketTransportPolicy> getEntries() {
        return $ENTRIES;
    }

    public static NoiseGatewayWebSocketTransportPolicy valueOf(String str) {
        return (NoiseGatewayWebSocketTransportPolicy) Enum.valueOf(NoiseGatewayWebSocketTransportPolicy.class, str);
    }

    public static NoiseGatewayWebSocketTransportPolicy[] values() {
        return (NoiseGatewayWebSocketTransportPolicy[]) $VALUES.clone();
    }

    public final int getNativeCode$fbandroid_express_aura_java_com_facebook_aura_gateway_noise_carrier_carrier() {
        return this.nativeCode;
    }

    public NoiseGatewayWebSocketTransportPolicy(String str, int i, int i2) {
        this.nativeCode = i2;
    }
}

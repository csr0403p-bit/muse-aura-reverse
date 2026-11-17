package com.facebook.aura.network.transport.tigon;

/* loaded from: classes5.dex */
public final class FailedNoiseGatewayCarrierHandle implements NoiseGatewayCarrierHandle {
    public static final FailedNoiseGatewayCarrierHandle INSTANCE = new FailedNoiseGatewayCarrierHandle();

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public void stop() {
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public /* bridge */ boolean refusesOwnerOf(byte[] bArr) {
        return false;
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public boolean sendWebsocketFrame(byte[] bArr) {
        return false;
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public boolean start(NoiseGatewayStartConfig noiseGatewayStartConfig) {
        return false;
    }
}

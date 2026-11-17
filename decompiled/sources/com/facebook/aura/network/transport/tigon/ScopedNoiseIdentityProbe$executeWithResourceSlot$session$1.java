package com.facebook.aura.network.transport.tigon;

import X.AbstractC7559F3s;
import X.BV8;
import X.G0U;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;
import com.facebook.aura.network.transport.HatchWebSocketSession;

/* loaded from: classes5.dex */
public final class ScopedNoiseIdentityProbe$executeWithResourceSlot$session$1 extends AbstractC7559F3s implements G0U<HatchNoisePrivateAuth, HatchWebSocketSession> {
    public final /* synthetic */ String $authToken;
    public final /* synthetic */ NoiseGatewayHatchWebSocket $noiseWebSocket;
    public final /* synthetic */ String $vmUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedNoiseIdentityProbe$executeWithResourceSlot$session$1(NoiseGatewayHatchWebSocket noiseGatewayHatchWebSocket, String str, String str2) {
        super(1);
        this.$noiseWebSocket = noiseGatewayHatchWebSocket;
        this.$vmUrl = str;
        this.$authToken = str2;
    }

    @Override // X.G0U
    public final HatchWebSocketSession invoke(HatchNoisePrivateAuth hatchNoisePrivateAuth) {
        return this.$noiseWebSocket.connect(BV8.A0d(hatchNoisePrivateAuth, ScopedNoiseIdentityProbeKt.vmUrlWithAuthToken(this.$vmUrl, this.$authToken), ScopedNoiseIdentityProbeKt.noiseHandshakeHeaders(this.$authToken)));
    }
}

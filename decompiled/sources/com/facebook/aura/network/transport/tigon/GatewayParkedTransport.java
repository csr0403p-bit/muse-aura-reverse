package com.facebook.aura.network.transport.tigon;

import X.C7384Etj;
import X.DCW;
import X.F0C;
import com.facebook.aura.gateway.GatewayParkedTransportHook;
import com.facebook.aura.gateway.HatchGatewayPreconnect;

/* loaded from: classes5.dex */
public final class GatewayParkedTransport implements GatewayParkedTransportHook {
    public static final GatewayParkedTransport INSTANCE = new GatewayParkedTransport();

    @Override // com.facebook.aura.gateway.GatewayParkedTransportHook
    public boolean park(String str) {
        C7384Etj.A0Y(str, 0);
        DCW dcwA02 = F0C.A02();
        return dcwA02.A00.preconnectWebSocket(str, NoiseGatewayHatchWebSocketKt.getGatewayWebSocketHttp2Enabled());
    }

    @Override // com.facebook.aura.gateway.GatewayParkedTransportHook
    public String hostForGateway(String str) {
        return NoiseGatewayHatchWebSocket.Companion.preconnectHost$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_tigon(str);
    }

    public final void register() {
        HatchGatewayPreconnect.parkedTransportHook = this;
    }

    @Override // com.facebook.aura.gateway.GatewayParkedTransportHook
    public void cancel() {
        F0C.A02().A00.cancelWebSocketPreconnect();
    }
}

package com.facebook.aura.gateway;

import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.state.Transport;

/* loaded from: classes2.dex */
public abstract class GatewayConnectionSourcesKt {
    public static final String validatedTransportOf(AuraNetworkState auraNetworkState) {
        AuraNetworkState.Online online;
        Transport transport;
        if (!(auraNetworkState instanceof AuraNetworkState.Online) || (online = (AuraNetworkState.Online) auraNetworkState) == null || !online.isValidated || (transport = online.transport) == null) {
            return null;
        }
        return transport.name();
    }
}

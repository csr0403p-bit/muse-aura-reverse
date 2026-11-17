package com.facebook.aura.gateway;

import X.AnonymousClass441;
import X.C1BN;
import X.C3Ej;
import X.C3Ek;
import X.C3UX;
import X.C7384Etj;
import com.facebook.aura.gateway.connection.NetworkSource;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;

/* loaded from: classes2.dex */
public final class GatewayNetworkSource implements NetworkSource {
    public static final int $stable = 0;
    public final C1BN<Boolean> isOnline;
    public final C1BN<String> validatedTransport;

    public GatewayNetworkSource(C3UX c3ux) {
        C7384Etj.A0Y(c3ux, 0);
        AuraNetworkMonitor auraNetworkMonitor = AuraNetworkMonitor.INSTANCE;
        C1BN<AuraNetworkState> c1bn = AuraNetworkMonitor.state;
        GatewayNetworkSource$special$$inlined$map$1 gatewayNetworkSource$special$$inlined$map$1 = new GatewayNetworkSource$special$$inlined$map$1(c1bn);
        C3Ej c3Ej = C3Ek.A00;
        this.isOnline = AnonymousClass441.A00(Boolean.valueOf(auraNetworkMonitor.isOnline()), c3ux, gatewayNetworkSource$special$$inlined$map$1, c3Ej);
        this.validatedTransport = AnonymousClass441.A00(GatewayConnectionSourcesKt.validatedTransportOf(c1bn.getValue()), c3ux, new GatewayNetworkSource$special$$inlined$map$2(c1bn), c3Ej);
    }

    @Override // com.facebook.aura.gateway.connection.NetworkSource
    public C1BN<String> getValidatedTransport() {
        return this.validatedTransport;
    }

    @Override // com.facebook.aura.gateway.connection.NetworkSource
    public C1BN<Boolean> isOnline() {
        return this.isOnline;
    }
}

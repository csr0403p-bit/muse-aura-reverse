package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass005;
import X.BXZ;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.gateway.noise.carrier.NoiseGatewayWebSocketTransportPolicy;
import com.facebook.aura.gateway.noise.carrier.Stream0Listener;
import java.util.List;

/* loaded from: classes5.dex */
public final class NoiseGatewayStartConfig {
    public final byte[] authToken;
    public final int connectAttemptNumber;
    public final int connectTimeoutMs;
    public final boolean dialVmHostsThroughSharedIngress;
    public final List<HxE<String, String>> headers;
    public final boolean inboundTrafficSatisfiesPing;
    public final Stream0Listener listener;
    public final int noiseHandshakeTimeoutMs;
    public final String notaryEndorsement;
    public final int pingIntervalMs;
    public final BXZ privateAuthMode;
    public final byte[] rvKey;
    public final String sharedIngressHost;
    public final NoiseGatewayWebSocketTransportPolicy transportPolicy;
    public final int upgradeTimeoutMs;
    public final String url;
    public final boolean usePreconnect;

    public final byte[] getAuthToken() {
        return this.authToken;
    }

    public final int getConnectAttemptNumber() {
        return this.connectAttemptNumber;
    }

    public final int getConnectTimeoutMs() {
        return this.connectTimeoutMs;
    }

    public final boolean getDialVmHostsThroughSharedIngress() {
        return this.dialVmHostsThroughSharedIngress;
    }

    public final List<HxE<String, String>> getHeaders() {
        return this.headers;
    }

    public final boolean getInboundTrafficSatisfiesPing() {
        return this.inboundTrafficSatisfiesPing;
    }

    public final Stream0Listener getListener() {
        return this.listener;
    }

    public final int getNoiseHandshakeTimeoutMs() {
        return this.noiseHandshakeTimeoutMs;
    }

    public final String getNotaryEndorsement() {
        return this.notaryEndorsement;
    }

    public final int getPingIntervalMs() {
        return this.pingIntervalMs;
    }

    public final BXZ getPrivateAuthMode() {
        return this.privateAuthMode;
    }

    public final byte[] getRvKey() {
        return this.rvKey;
    }

    public final String getSharedIngressHost() {
        return this.sharedIngressHost;
    }

    public final NoiseGatewayWebSocketTransportPolicy getTransportPolicy() {
        return this.transportPolicy;
    }

    public final int getUpgradeTimeoutMs() {
        return this.upgradeTimeoutMs;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean getUsePreconnect() {
        return this.usePreconnect;
    }

    public NoiseGatewayStartConfig(String str, List<HxE<String, String>> list, byte[] bArr, BXZ bxz, String str2, byte[] bArr2, int i, int i2, int i3, int i4, int i5, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str3, boolean z3) {
        AnonymousClass005.A0x(str, list, bArr);
        C7384Etj.A0Y(stream0Listener, 11);
        C7384Etj.A0Y(noiseGatewayWebSocketTransportPolicy, 13);
        C7384Etj.A0Y(str3, 15);
        this.url = str;
        this.headers = list;
        this.authToken = bArr;
        this.privateAuthMode = bxz;
        this.notaryEndorsement = str2;
        this.rvKey = bArr2;
        this.pingIntervalMs = i;
        this.connectTimeoutMs = i2;
        this.upgradeTimeoutMs = i3;
        this.noiseHandshakeTimeoutMs = i4;
        this.connectAttemptNumber = i5;
        this.listener = stream0Listener;
        this.usePreconnect = z;
        this.transportPolicy = noiseGatewayWebSocketTransportPolicy;
        this.dialVmHostsThroughSharedIngress = z2;
        this.sharedIngressHost = str3;
        this.inboundTrafficSatisfiesPing = z3;
    }

    public /* synthetic */ NoiseGatewayStartConfig(String str, List list, byte[] bArr, BXZ bxz, String str2, byte[] bArr2, int i, int i2, int i3, int i4, int i5, Stream0Listener stream0Listener, boolean z, NoiseGatewayWebSocketTransportPolicy noiseGatewayWebSocketTransportPolicy, boolean z2, String str3, boolean z3, int i6, C06H c06h) {
        this(str, list, bArr, (i6 & 8) != 0 ? null : bxz, (i6 & 16) != 0 ? null : str2, (i6 & 32) != 0 ? null : bArr2, i, i2, (i6 & 256) != 0 ? 0 : i3, (i6 & 512) != 0 ? 0 : i4, (i6 & 1024) != 0 ? -1 : i5, stream0Listener, C3cG.A1K(i6 & 4096, z), (i6 & 8192) != 0 ? NoiseGatewayWebSocketTransportPolicy.HTTP1_UPGRADE : noiseGatewayWebSocketTransportPolicy, C3cG.A1K(i6 & 16384, z2), (32768 & i6) != 0 ? "" : str3, C3cH.A1L(i6, 65536, z3));
    }
}

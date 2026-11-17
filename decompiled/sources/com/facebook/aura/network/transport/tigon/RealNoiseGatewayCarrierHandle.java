package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BXZ;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder;
import com.facebook.aura.gateway.noise.carrier.NoiseGatewayCarrier;
import com.facebook.aura.gateway.noise.carrier.Stream0Listener;
import com.facebook.aura.network.transport.HatchNoisePrivateAuthKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class RealNoiseGatewayCarrierHandle implements NoiseGatewayCarrierHandle {
    public final NoiseGatewayCarrier carrier;
    public Stream0Listener listener;
    public final AttestationVerifierHolder verifier;

    public static /* synthetic */ void getListener$annotations() {
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public boolean refusesOwnerOf(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return !HatchNoisePrivateAuthKt.isCvmHostDataFor(bArr, this.verifier.expectedHostData);
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public boolean sendWebsocketFrame(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return this.carrier.sendWebsocketFrame(bArr);
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public boolean start(NoiseGatewayStartConfig noiseGatewayStartConfig) {
        C7384Etj.A0Y(noiseGatewayStartConfig, 0);
        this.listener = noiseGatewayStartConfig.listener;
        List<HxE<String, String>> list = noiseGatewayStartConfig.headers;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<HxE<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().first);
        }
        String[] strArr = (String[]) arrayListA0m.toArray(new String[0]);
        List<HxE<String, String>> list2 = noiseGatewayStartConfig.headers;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<HxE<String, String>> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().second);
        }
        String[] strArr2 = (String[]) arrayListA0m2.toArray(new String[0]);
        BXZ bxz = noiseGatewayStartConfig.privateAuthMode;
        NoiseGatewayCarrier noiseGatewayCarrier = this.carrier;
        String str = noiseGatewayStartConfig.url;
        String[] strArr3 = new String[0];
        int i = noiseGatewayStartConfig.pingIntervalMs;
        int i2 = noiseGatewayStartConfig.connectTimeoutMs;
        int i3 = noiseGatewayStartConfig.upgradeTimeoutMs;
        int i4 = noiseGatewayStartConfig.noiseHandshakeTimeoutMs;
        int i5 = noiseGatewayStartConfig.connectAttemptNumber;
        byte[] bArr = noiseGatewayStartConfig.authToken;
        return bxz == null ? noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, i2, i3, i4, 0L, i5, bArr, this.verifier, noiseGatewayStartConfig.listener, noiseGatewayStartConfig.usePreconnect, noiseGatewayStartConfig.transportPolicy, noiseGatewayStartConfig.dialVmHostsThroughSharedIngress, noiseGatewayStartConfig.sharedIngressHost, noiseGatewayStartConfig.inboundTrafficSatisfiesPing) : noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, i2, i3, i4, 0L, i5, bArr, bxz, noiseGatewayStartConfig.notaryEndorsement, noiseGatewayStartConfig.rvKey, this.verifier, noiseGatewayStartConfig.listener, noiseGatewayStartConfig.usePreconnect, noiseGatewayStartConfig.transportPolicy, noiseGatewayStartConfig.dialVmHostsThroughSharedIngress, noiseGatewayStartConfig.sharedIngressHost, noiseGatewayStartConfig.inboundTrafficSatisfiesPing);
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public void stop() {
        this.carrier.stop();
    }

    public RealNoiseGatewayCarrierHandle(NoiseGatewayCarrier noiseGatewayCarrier, AttestationVerifierHolder attestationVerifierHolder) {
        AnonymousClass003.A0u(noiseGatewayCarrier, attestationVerifierHolder);
        this.carrier = noiseGatewayCarrier;
        this.verifier = attestationVerifierHolder;
    }
}

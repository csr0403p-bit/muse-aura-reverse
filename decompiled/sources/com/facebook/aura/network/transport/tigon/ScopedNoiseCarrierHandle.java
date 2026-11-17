package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BXZ;
import X.C60Q;
import X.C7384Etj;
import X.HxE;
import com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder;
import com.facebook.aura.gateway.noise.carrier.NoiseGatewayCarrier;
import com.facebook.aura.gateway.noise.carrier.NoiseGatewayWebSocketTransportPolicy;
import com.facebook.aura.gateway.noise.carrier.Stream0Listener;
import com.facebook.aura.network.transport.HatchNoisePrivateAuthKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class ScopedNoiseCarrierHandle implements NoiseGatewayCarrierHandle {
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
            arrayListA0m.add(C60Q.A10(it).first);
        }
        String[] strArr = (String[]) arrayListA0m.toArray(new String[0]);
        List<HxE<String, String>> list2 = noiseGatewayStartConfig.headers;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<HxE<String, String>> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(C60Q.A10(it2).second);
        }
        String[] strArr2 = (String[]) arrayListA0m2.toArray(new String[0]);
        BXZ bxz = noiseGatewayStartConfig.privateAuthMode;
        NoiseGatewayCarrier noiseGatewayCarrier = this.carrier;
        String str = noiseGatewayStartConfig.url;
        String[] strArr3 = new String[0];
        int i = noiseGatewayStartConfig.pingIntervalMs;
        int i2 = noiseGatewayStartConfig.connectAttemptNumber;
        byte[] bArr = noiseGatewayStartConfig.authToken;
        if (bxz == null) {
            AttestationVerifierHolder attestationVerifierHolder = this.verifier;
            Stream0Listener stream0Listener = noiseGatewayStartConfig.listener;
            boolean z = noiseGatewayStartConfig.dialVmHostsThroughSharedIngress;
            String str2 = noiseGatewayStartConfig.sharedIngressHost;
            NoiseGatewayCarrier.Companion companion = NoiseGatewayCarrier.Companion;
            return noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, 0, 0, 0, 0L, i2, bArr, attestationVerifierHolder, stream0Listener, false, NoiseGatewayWebSocketTransportPolicy.HTTP1_UPGRADE, z, str2, false);
        }
        String str3 = noiseGatewayStartConfig.notaryEndorsement;
        byte[] bArr2 = noiseGatewayStartConfig.rvKey;
        AttestationVerifierHolder attestationVerifierHolder2 = this.verifier;
        Stream0Listener stream0Listener2 = noiseGatewayStartConfig.listener;
        boolean z2 = noiseGatewayStartConfig.dialVmHostsThroughSharedIngress;
        String str4 = noiseGatewayStartConfig.sharedIngressHost;
        NoiseGatewayCarrier.Companion companion2 = NoiseGatewayCarrier.Companion;
        return noiseGatewayCarrier.start(str, strArr, strArr2, strArr3, i, 0, 0, 0, 0L, i2, bArr, bxz, str3, bArr2, attestationVerifierHolder2, stream0Listener2, false, NoiseGatewayWebSocketTransportPolicy.HTTP1_UPGRADE, z2, str4, false);
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierHandle
    public void stop() {
        this.carrier.stop();
    }

    public ScopedNoiseCarrierHandle(NoiseGatewayCarrier noiseGatewayCarrier, AttestationVerifierHolder attestationVerifierHolder) {
        AnonymousClass003.A0u(noiseGatewayCarrier, attestationVerifierHolder);
        this.carrier = noiseGatewayCarrier;
        this.verifier = attestationVerifierHolder;
    }
}

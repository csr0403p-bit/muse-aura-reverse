package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass003;
import X.DCW;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder;
import com.facebook.aura.gateway.noise.carrier.NoiseGatewayCarrier;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;

/* loaded from: classes5.dex */
public final class ScopedNoiseCarrierFactory implements NoiseGatewayCarrierFactory {
    public final NoiseChannelManagerHolder managerHolder;
    public final DCW tigonHttpClient;

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierFactory
    public NoiseGatewayCarrierHandle create(HatchNoisePrivateAuth hatchNoisePrivateAuth) {
        AttestationVerifierHolder attestationVerifierHolderCreateNoOp;
        NoiseGatewayCarrier noiseGatewayCarrierCreate = NoiseGatewayCarrier.Companion.create(this.tigonHttpClient, this.managerHolder);
        if (hatchNoisePrivateAuth != null) {
            AttestationVerifierHolder.Companion companion = AttestationVerifierHolder.Companion;
            boolean z = HatchDeveloperPrefs.cachedIsFeedEnabled;
            attestationVerifierHolderCreateNoOp = companion.createSnp(hatchNoisePrivateAuth, false);
        } else {
            attestationVerifierHolderCreateNoOp = AttestationVerifierHolder.Companion.createNoOp();
        }
        return new ScopedNoiseCarrierHandle(noiseGatewayCarrierCreate, attestationVerifierHolderCreateNoOp);
    }

    public ScopedNoiseCarrierFactory(DCW dcw, NoiseChannelManagerHolder noiseChannelManagerHolder) {
        AnonymousClass003.A0u(dcw, noiseChannelManagerHolder);
        this.tigonHttpClient = dcw;
        this.managerHolder = noiseChannelManagerHolder;
    }
}

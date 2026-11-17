package com.facebook.aura.network.transport.tigon;

import X.AnonymousClass003;
import X.C31u;
import X.DCW;
import X.InterfaceC7359EnW;
import com.crossapp.tigonhttp.noise.NoiseChannelManagerHolder;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.gateway.noise.carrier.AttestationVerifierHolder;
import com.facebook.aura.gateway.noise.carrier.NoiseGatewayCarrier;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.transport.HatchNoisePrivateAuth;
import com.facebook.aura.network.transport.tigon.MC;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class VmNoiseCarrierFactory implements NoiseGatewayCarrierFactory {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(VmNoiseCarrierFactory.class, "isSnpAttestationVerifierEnabled", "isSnpAttestationVerifierEnabled()Z");
    public final C31u isSnpAttestationVerifierEnabled$delegate;
    public final Function0<NoiseChannelManagerHolder> managerHolder;
    public final Function0<DCW> tigonHttpClient;

    private final boolean isSnpAttestationVerifierEnabled() {
        return C31u.A01(this, this.isSnpAttestationVerifierEnabled$delegate, $$delegatedProperties, 0);
    }

    @Override // com.facebook.aura.network.transport.tigon.NoiseGatewayCarrierFactory
    public NoiseGatewayCarrierHandle create(HatchNoisePrivateAuth hatchNoisePrivateAuth) {
        AttestationVerifierHolder attestationVerifierHolderCreateNoOp;
        NoiseChannelManagerHolder noiseChannelManagerHolderInvoke = this.managerHolder.invoke();
        if (hatchNoisePrivateAuth != null) {
            AttestationVerifierHolder.Companion companion = AttestationVerifierHolder.Companion;
            boolean z = HatchDeveloperPrefs.cachedIsFeedEnabled;
            attestationVerifierHolderCreateNoOp = companion.createSnp(hatchNoisePrivateAuth, false);
        } else {
            boolean zIsSnpAttestationVerifierEnabled = isSnpAttestationVerifierEnabled();
            AttestationVerifierHolder.Companion companion2 = AttestationVerifierHolder.Companion;
            if (zIsSnpAttestationVerifierEnabled) {
                boolean z2 = HatchDeveloperPrefs.cachedIsFeedEnabled;
                attestationVerifierHolderCreateNoOp = companion2.createSnp(false);
            } else {
                attestationVerifierHolderCreateNoOp = companion2.createNoOp();
            }
        }
        return new RealNoiseGatewayCarrierHandle(NoiseGatewayCarrier.Companion.create(this.tigonHttpClient.invoke(), noiseChannelManagerHolderInvoke), attestationVerifierHolderCreateNoOp);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VmNoiseCarrierFactory(Function0<? extends DCW> function0, Function0<NoiseChannelManagerHolder> function02) {
        AnonymousClass003.A0u(function0, function02);
        this.tigonHttpClient = function0;
        this.managerHolder = function02;
        this.isSnpAttestationVerifierEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.enable_snp_attestation_verifier);
    }
}

package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;

/* loaded from: classes5.dex */
public final class NoiseFailureDisposition extends C06G {
    public static final int $stable = 0;
    public final HatchNoiseHandshakeOutcome forwardedOutcome;
    public final HatchVmConfidentiality learnedConfidentiality;

    public NoiseFailureDisposition() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NoiseFailureDisposition) {
                NoiseFailureDisposition noiseFailureDisposition = (NoiseFailureDisposition) obj;
                if (this.learnedConfidentiality != noiseFailureDisposition.learnedConfidentiality || this.forwardedOutcome != noiseFailureDisposition.forwardedOutcome) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NoiseFailureDisposition copy$default(NoiseFailureDisposition noiseFailureDisposition, HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchVmConfidentiality = noiseFailureDisposition.learnedConfidentiality;
        }
        if ((i & 2) != 0) {
            hatchNoiseHandshakeOutcome = noiseFailureDisposition.forwardedOutcome;
        }
        return new NoiseFailureDisposition(hatchVmConfidentiality, hatchNoiseHandshakeOutcome);
    }

    public final HatchVmConfidentiality component1() {
        return this.learnedConfidentiality;
    }

    public final HatchNoiseHandshakeOutcome component2() {
        return this.forwardedOutcome;
    }

    public final NoiseFailureDisposition copy(HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
        return new NoiseFailureDisposition(hatchVmConfidentiality, hatchNoiseHandshakeOutcome);
    }

    public final HatchNoiseHandshakeOutcome getForwardedOutcome() {
        return this.forwardedOutcome;
    }

    public final HatchVmConfidentiality getLearnedConfidentiality() {
        return this.learnedConfidentiality;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.learnedConfidentiality) * 31) + C3cH.A02(this.forwardedOutcome);
    }

    public String toString() {
        return super.toString();
    }

    public NoiseFailureDisposition(HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
        this.learnedConfidentiality = hatchVmConfidentiality;
        this.forwardedOutcome = hatchNoiseHandshakeOutcome;
    }

    public /* synthetic */ NoiseFailureDisposition(HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchVmConfidentiality, (i & 2) != 0 ? null : hatchNoiseHandshakeOutcome);
    }
}

package com.facebook.aura.network.transport;

import X.C06H;
import java.util.List;

/* loaded from: classes5.dex */
public final class HatchVmProbeResult {
    public final String failureMessage;
    public final HatchNoiseHandshakeOutcome noiseHandshakeOutcome;
    public final List<HatchHttpResponse> responses;

    public /* synthetic */ HatchVmProbeResult(List list, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? null : hatchNoiseHandshakeOutcome, (i & 4) != 0 ? null : str);
    }

    public final String getFailureMessage() {
        return this.failureMessage;
    }

    public final HatchNoiseHandshakeOutcome getNoiseHandshakeOutcome() {
        return this.noiseHandshakeOutcome;
    }

    public final List<HatchHttpResponse> getResponses() {
        return this.responses;
    }

    public HatchVmProbeResult(List<HatchHttpResponse> list, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str) {
        this.responses = list;
        this.noiseHandshakeOutcome = hatchNoiseHandshakeOutcome;
        this.failureMessage = str;
    }
}

package com.facebook.aura.network.transport;

/* loaded from: classes5.dex */
public final class HatchWebSocketPreconnectTiming {
    public final long ageMsAtClaim;
    public final boolean inFlightAtClaim;
    public final Long remainingWaitMs;
    public final Long transportDurationMs;

    public final long getAgeMsAtClaim() {
        return this.ageMsAtClaim;
    }

    public final boolean getInFlightAtClaim() {
        return this.inFlightAtClaim;
    }

    public final Long getRemainingWaitMs() {
        return this.remainingWaitMs;
    }

    public final Long getTransportDurationMs() {
        return this.transportDurationMs;
    }

    public HatchWebSocketPreconnectTiming(boolean z, long j, Long l, Long l2) {
        this.inFlightAtClaim = z;
        this.ageMsAtClaim = j;
        this.transportDurationMs = l;
        this.remainingWaitMs = l2;
    }
}

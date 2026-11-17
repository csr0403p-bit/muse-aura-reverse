package com.facebook.aura.gateway;

/* loaded from: classes5.dex */
public final class GatewayConnectionCycleStart {
    public final int connectionCycle;
    public final long monotonicTimestampNs;
    public final long wallTimeMs;

    public final int getConnectionCycle() {
        return this.connectionCycle;
    }

    public final long getMonotonicTimestampNs() {
        return this.monotonicTimestampNs;
    }

    public final long getWallTimeMs() {
        return this.wallTimeMs;
    }

    public GatewayConnectionCycleStart(int i, long j, long j2) {
        this.connectionCycle = i;
        this.monotonicTimestampNs = j;
        this.wallTimeMs = j2;
    }
}

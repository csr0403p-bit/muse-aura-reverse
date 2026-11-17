package com.facebook.aura.gateway;

/* loaded from: classes5.dex */
public final class AttemptContinuity {
    public final int cycle;
    public final long lastActivityMs;
    public final long openedAtMs;

    public final int getCycle() {
        return this.cycle;
    }

    public final long getLastActivityMs() {
        return this.lastActivityMs;
    }

    public final long getOpenedAtMs() {
        return this.openedAtMs;
    }

    public AttemptContinuity(long j, long j2, int i) {
        this.openedAtMs = j;
        this.lastActivityMs = j2;
        this.cycle = i;
    }
}

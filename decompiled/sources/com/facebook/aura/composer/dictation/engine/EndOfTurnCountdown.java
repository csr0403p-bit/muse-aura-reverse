package com.facebook.aura.composer.dictation.engine;

/* loaded from: classes5.dex */
public final class EndOfTurnCountdown {
    public final long durationMs;
    public final long endAtMs;

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final long getEndAtMs() {
        return this.endAtMs;
    }

    public EndOfTurnCountdown(long j, long j2) {
        this.endAtMs = j;
        this.durationMs = j2;
    }
}

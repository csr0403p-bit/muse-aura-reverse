package X;

import java.io.Serializable;

/* renamed from: X.Dzp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6293Dzp implements Serializable {
    public final long maximumLookaheadSegments;
    public final long minimumLookaheadWindowMs;

    public C6293Dzp() {
        this(1000L, 0L);
    }

    public C6293Dzp(long j, long j2) {
        this.minimumLookaheadWindowMs = 1000L;
        this.maximumLookaheadSegments = 0L;
    }
}

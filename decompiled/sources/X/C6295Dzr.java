package X;

import java.io.Serializable;

/* renamed from: X.Dzr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6295Dzr implements Serializable {
    public final long fallbackBitrateBps;
    public final long fallbackSegmentDurationMs;
    public final boolean isEnabled;

    public C6295Dzr() {
        this(false, 0L, 0L);
    }

    public C6295Dzr(boolean z, long j, long j2) {
        this.isEnabled = false;
        this.fallbackBitrateBps = 0L;
        this.fallbackSegmentDurationMs = 0L;
    }
}

package com.facebook.traffic.nts.tasos.http_layer_bwe;

/* loaded from: classes6.dex */
public final class BweStats {
    public final boolean fromCache;
    public final long mean;
    public final long p25;
    public final long p50;
    public final long p75;
    public final long sampleCount;

    public final boolean getFromCache() {
        return this.fromCache;
    }

    public final long getMean() {
        return this.mean;
    }

    public final long getP25() {
        return this.p25;
    }

    public final long getP50() {
        return this.p50;
    }

    public final long getP75() {
        return this.p75;
    }

    public final long getSampleCount() {
        return this.sampleCount;
    }

    public BweStats(long j, long j2, long j3, long j4, long j5, boolean z) {
        this.mean = j;
        this.p25 = j2;
        this.p50 = j3;
        this.p75 = j4;
        this.sampleCount = j5;
        this.fromCache = z;
    }
}

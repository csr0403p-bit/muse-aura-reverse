package com.facebook.traffic.nts.tasos.http_layer_bwe;

import X.C06H;

/* loaded from: classes6.dex */
public final class BucketStats {
    public final long lowerBytes;
    public final BweStats stats;
    public final Long upperBytes;

    public final long getLowerBytes() {
        return this.lowerBytes;
    }

    public final BweStats getStats() {
        return this.stats;
    }

    public final Long getUpperBytes() {
        return this.upperBytes;
    }

    public BucketStats(long j, Long l, BweStats bweStats) {
        this.lowerBytes = j;
        this.upperBytes = l;
        this.stats = bweStats;
    }

    public /* synthetic */ BucketStats(long j, Long l, BweStats bweStats, int i, C06H c06h) {
        this(j, l, (i & 4) != 0 ? null : bweStats);
    }
}

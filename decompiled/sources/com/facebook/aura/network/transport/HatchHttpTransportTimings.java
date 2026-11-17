package com.facebook.aura.network.transport;

import X.C7384Etj;

/* loaded from: classes5.dex */
public final class HatchHttpTransportTimings {
    public final long enqueueToStartMs;
    public final long headersToBodyEndMs;
    public final String source;
    public final long startToHeadersMs;

    public HatchHttpTransportTimings(long j, long j2, long j3, String str) {
        C7384Etj.A0Y(str, 3);
        this.enqueueToStartMs = j;
        this.startToHeadersMs = j2;
        this.headersToBodyEndMs = j3;
        this.source = str;
    }

    public final long getEnqueueToStartMs() {
        return this.enqueueToStartMs;
    }

    public final long getHeadersToBodyEndMs() {
        return this.headersToBodyEndMs;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getStartToHeadersMs() {
        return this.startToHeadersMs;
    }
}

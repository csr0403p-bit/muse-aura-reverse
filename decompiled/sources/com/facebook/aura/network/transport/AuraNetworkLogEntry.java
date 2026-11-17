package com.facebook.aura.network.transport;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class AuraNetworkLogEntry {
    public final long durationMs;
    public final String method;
    public final long startedAtMs;
    public final int status;
    public final String url;

    public AuraNetworkLogEntry(long j, String str, String str2, int i, long j2) {
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(str2, 2);
        this.startedAtMs = j;
        this.method = str;
        this.url = str2;
        this.status = i;
        this.durationMs = j2;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final String getMethod() {
        return this.method;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUrl() {
        return this.url;
    }
}

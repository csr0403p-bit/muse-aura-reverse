package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PairsRelationship {
    public static final int $stable = 0;
    public final long expiresAtMs;
    public final String generationId;
    public final long revision;
    public final long startedAtMs;

    public PairsRelationship(String str, long j, long j2, long j3) {
        C7384Etj.A0Y(str, 0);
        this.generationId = str;
        this.revision = j;
        this.startedAtMs = j2;
        this.expiresAtMs = j3;
    }

    public final long getExpiresAtMs() {
        return this.expiresAtMs;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public final long getRevision() {
        return this.revision;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }
}

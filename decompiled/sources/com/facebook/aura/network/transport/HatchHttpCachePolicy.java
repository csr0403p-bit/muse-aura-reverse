package com.facebook.aura.network.transport;

import X.AnonymousClass006;
import X.C06H;
import X.C3cI;
import X.C60O;

/* loaded from: classes3.dex */
public final class HatchHttpCachePolicy {
    public static final Companion Companion = new Companion();
    public static final long DEFAULT_MAX_BODY_BYTES = 1048576;
    public final String cacheKeyOverride;
    public final long freshTtlMs;
    public final boolean idempotent;
    public final long maxBodyBytes;
    public final long maxTtlMs;

    public final String getCacheKeyOverride() {
        return this.cacheKeyOverride;
    }

    public final long getFreshTtlMs() {
        return this.freshTtlMs;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final long getMaxBodyBytes() {
        return this.maxBodyBytes;
    }

    public final long getMaxTtlMs() {
        return this.maxTtlMs;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchHttpCachePolicy(long j, long j2, String str, long j3, boolean z) {
        this.freshTtlMs = j;
        this.maxTtlMs = j2;
        this.cacheKeyOverride = str;
        this.maxBodyBytes = j3;
        this.idempotent = z;
        if (j < 0) {
            throw C60O.A0i("freshTtlMs must be non-negative");
        }
        if (j2 < j) {
            throw C60O.A0i("maxTtlMs must be >= freshTtlMs");
        }
        if (j3 < 0) {
            throw C60O.A0i("maxBodyBytes must be non-negative");
        }
    }

    public /* synthetic */ HatchHttpCachePolicy(long j, long j2, String str, long j3, boolean z, int i, C06H c06h) {
        this(j, j2, AnonymousClass006.A0t(i, str), (i & 8) != 0 ? 1048576L : j3, C3cI.A1S(i, z));
    }
}

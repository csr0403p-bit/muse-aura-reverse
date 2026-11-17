package com.facebook.aura.network.transport.cache;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.HtJ;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class BoundedInMemoryHatchHttpCacheStore implements HatchHttpCacheStore {
    public static final Companion Companion = new Companion();
    public static final int INITIAL_CAPACITY = 16;
    public static final long MAX_CACHE_BYTES = 4194304;
    public long currentBytes;
    public final LinkedHashMap<String, HatchHttpCachedResponse> entries;
    public final Object lock;
    public final long maxBytes;

    public /* synthetic */ BoundedInMemoryHatchHttpCacheStore(long j, int i, C06H c06h) {
        this((i & 1) != 0 ? 4194304L : j);
    }

    private final void evictToCapLocked() {
        if (this.currentBytes > this.maxBytes) {
            Iterator itA0i = C3cG.A0i(this.entries);
            while (this.currentBytes > this.maxBytes && itA0i.hasNext()) {
                C7384Etj.A0U(itA0i.next());
                this.currentBytes -= ((HatchHttpCachedResponse) ((Map.Entry) r0).getValue()).body.length;
                itA0i.remove();
            }
        }
    }

    @Override // com.facebook.aura.network.transport.cache.HatchHttpCacheStore
    public Object read(String str, long j, HtJ<? super HatchHttpCachedResponse> htJ) {
        synchronized (this.lock) {
            HatchHttpCachedResponse hatchHttpCachedResponse = this.entries.get(str);
            if (hatchHttpCachedResponse == null) {
                return null;
            }
            HatchHttpCachedResponse hatchHttpCachedResponseWithAccessedAt = hatchHttpCachedResponse.withAccessedAt(j);
            this.entries.put(str, hatchHttpCachedResponseWithAccessedAt);
            return hatchHttpCachedResponseWithAccessedAt;
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // com.facebook.aura.network.transport.cache.HatchHttpCacheStore
    public Object write(String str, HatchHttpCachedResponse hatchHttpCachedResponse, HtJ<? super Unit> htJ) {
        Unit unit;
        HatchHttpCachedResponse hatchHttpCachedResponseWithSanitizedHeaders = hatchHttpCachedResponse.withSanitizedHeaders();
        synchronized (this.lock) {
            if (this.entries.put(str, hatchHttpCachedResponseWithSanitizedHeaders) != null) {
                this.currentBytes -= r0.body.length;
            }
            this.currentBytes += hatchHttpCachedResponseWithSanitizedHeaders.body.length;
            evictToCapLocked();
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    public BoundedInMemoryHatchHttpCacheStore(long j) {
        this.maxBytes = j;
        this.lock = C3cG.A0T();
        this.entries = new LinkedHashMap<>(16, 0.75f, true);
    }

    public BoundedInMemoryHatchHttpCacheStore() {
        this(4194304L);
    }
}

package com.facebook.aura.file.view;

import X.AnonymousClass002;
import X.C7384Etj;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class ThumbnailFailureCache {
    public static final int $stable = 0;
    public static final ThumbnailFailureCache INSTANCE = new ThumbnailFailureCache();
    public static final LruCache<String, Boolean> cache = new LruCache<>(512);

    public final void clear(String str) {
        C7384Etj.A0Y(str, 0);
        LruCache<String, Boolean> lruCache = cache;
        synchronized (lruCache) {
            lruCache.remove(str);
        }
    }

    public final void recordTerminal(String str) {
        C7384Etj.A0Y(str, 0);
        LruCache<String, Boolean> lruCache = cache;
        synchronized (lruCache) {
            lruCache.put(str, true);
        }
    }

    public final boolean shouldSkip(String str) {
        boolean zA1X;
        C7384Etj.A0Y(str, 0);
        LruCache<String, Boolean> lruCache = cache;
        synchronized (lruCache) {
            zA1X = AnonymousClass002.A1X(lruCache.get(str));
        }
        return zA1X;
    }
}

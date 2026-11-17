package com.facebook.aura.file.view;

import X.AnonymousClass002;
import X.C7384Etj;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class ThumbnailTitleCache {
    public static final int $stable = 0;
    public static final ThumbnailTitleCache INSTANCE = new ThumbnailTitleCache();
    public static final LruCache<String, String> titles = new LruCache<>(256);
    public static final LruCache<String, Boolean> attempted = new LruCache<>(512);

    public final boolean hasAttempted(String str) {
        boolean zA1X;
        C7384Etj.A0Y(str, 0);
        LruCache<String, Boolean> lruCache = attempted;
        synchronized (lruCache) {
            zA1X = AnonymousClass002.A1X(lruCache.get(str));
        }
        return zA1X;
    }

    public final void record(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        LruCache<String, Boolean> lruCache = attempted;
        synchronized (lruCache) {
            lruCache.put(str, true);
        }
        if (str2 != null) {
            LruCache<String, String> lruCache2 = titles;
            synchronized (lruCache2) {
                lruCache2.put(str, str2);
            }
        }
    }

    public final String title(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        LruCache<String, String> lruCache = titles;
        synchronized (lruCache) {
            str2 = lruCache.get(str);
        }
        return str2;
    }
}

package com.facebook.aura.file.view;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import android.util.LruCache;

/* loaded from: classes.dex */
public final class ThumbnailTextCache {
    public static final int $stable = 0;
    public static final ThumbnailTextCache INSTANCE = new ThumbnailTextCache();
    public static final LruCache<String, String> snippets = new LruCache<>(128);
    public static final LruCache<String, Boolean> attempted = new LruCache<>(256);

    public final boolean hasAttempted(String str) {
        boolean zA1X;
        C7384Etj.A0Y(str, 0);
        LruCache<String, Boolean> lruCache = attempted;
        synchronized (lruCache) {
            zA1X = AnonymousClass002.A1X(lruCache.get(str));
        }
        return zA1X;
    }

    public final String snippet(String str) {
        String str2;
        C7384Etj.A0Y(str, 0);
        LruCache<String, String> lruCache = snippets;
        synchronized (lruCache) {
            str2 = lruCache.get(str);
        }
        return str2;
    }

    public final void record(String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        LruCache<String, Boolean> lruCache = attempted;
        synchronized (lruCache) {
            lruCache.put(str, Boolean.valueOf(zA1a));
        }
        LruCache<String, String> lruCache2 = snippets;
        synchronized (lruCache2) {
            lruCache2.put(str, str2);
        }
    }

    public final void recordContent(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (FileThumbnailPreviewKt.isTextContentPreviewable(null, str)) {
            record(str, FileThumbnailPreviewKt.extractSnippet(str2));
        }
    }
}

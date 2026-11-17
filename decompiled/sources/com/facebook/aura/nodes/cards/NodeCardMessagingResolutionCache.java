package com.facebook.aura.nodes.cards;

import X.AnonymousClass003;
import X.C7384Etj;
import X.FGI;
import android.util.LruCache;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes5.dex */
public final class NodeCardMessagingResolutionCache {
    public static final int $stable = 0;
    public static final int RESOLUTION_CACHE_SIZE = 80;
    public static final NodeCardMessagingResolutionCache INSTANCE = new NodeCardMessagingResolutionCache();
    public static final LruCache<String, NodeCardMessagingResolvedState> cache = new LruCache<>(80);

    public final NodeCardMessagingResolvedState get(String str) {
        NodeCardMessagingResolvedState nodeCardMessagingResolvedState;
        C7384Etj.A0Y(str, 0);
        LruCache<String, NodeCardMessagingResolvedState> lruCache = cache;
        synchronized (lruCache) {
            nodeCardMessagingResolvedState = lruCache.get(str);
        }
        if (nodeCardMessagingResolvedState != null) {
            return NodeCardMessagingResolutionCacheKt.copyForRender(nodeCardMessagingResolvedState);
        }
        return null;
    }

    public final String key(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        if (str2 == null) {
            str2 = "";
        }
        return FGI.A0U(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, str2);
    }

    public final void put(String str, NodeCardMessagingResolvedState nodeCardMessagingResolvedState) {
        AnonymousClass003.A0u(str, nodeCardMessagingResolvedState);
        LruCache<String, NodeCardMessagingResolvedState> lruCache = cache;
        synchronized (lruCache) {
            lruCache.put(str, nodeCardMessagingResolvedState);
        }
    }
}

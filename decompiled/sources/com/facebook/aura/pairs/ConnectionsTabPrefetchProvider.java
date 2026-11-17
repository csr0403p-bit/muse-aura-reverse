package com.facebook.aura.pairs;

import com.facebook.aura.tabs.api.TabPrefetchProvider;
import com.facebook.aura.tabs.api.TabPrefetcher;

/* loaded from: classes3.dex */
public final class ConnectionsTabPrefetchProvider implements TabPrefetchProvider {
    public static final int $stable = 0;
    public static final ConnectionsTabPrefetchProvider INSTANCE = new ConnectionsTabPrefetchProvider();

    @Override // com.facebook.aura.tabs.api.TabPrefetchProvider
    public TabPrefetcher prefetcher() {
        return ConnectionsTabPrefetcher.INSTANCE;
    }
}

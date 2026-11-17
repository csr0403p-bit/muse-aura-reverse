package com.facebook.aura.tabs.api;

import X.AnonymousClass005;
import com.facebook.aura.pairs.ConnectionsTabPrefetchProvider;

/* loaded from: classes3.dex */
public class TabPrefetchProviderStatic {
    public static TabPrefetcher prefetcher(int i) {
        if (i == 0) {
            return ConnectionsTabPrefetchProvider.INSTANCE.prefetcher();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}

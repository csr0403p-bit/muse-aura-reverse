package com.facebook.aura.tabs.api;

import X.AnonymousClass005;
import com.facebook.aura.pairs.ConnectionsTabAttentionProvider;

/* loaded from: classes.dex */
public class TabAttentionProviderStatic {
    public static TabAttentionSource source(int i) {
        if (i == 0) {
            return ConnectionsTabAttentionProvider.INSTANCE.source();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}

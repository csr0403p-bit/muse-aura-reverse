package com.facebook.aura.share.api;

import X.AnonymousClass005;
import com.facebook.aura.pairs.ConnectionsItemShareActionProvider;

/* loaded from: classes.dex */
public class ItemShareActionProviderStatic {
    public static ItemShareAction action(int i, ShareableItem shareableItem) {
        if (i == 0) {
            return ConnectionsItemShareActionProvider.INSTANCE.action(shareableItem);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}

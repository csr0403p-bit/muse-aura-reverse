package com.facebook.aura.main.api;

import X.AnonymousClass005;
import com.facebook.aura.localbrowser.LocalBrowserWindowContentProvider;

/* loaded from: classes.dex */
public class AuthenticatedWindowContentProviderStatic {
    public static AuthenticatedWindowContent content(int i) {
        if (i == 0) {
            return LocalBrowserWindowContentProvider.INSTANCE.content();
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}

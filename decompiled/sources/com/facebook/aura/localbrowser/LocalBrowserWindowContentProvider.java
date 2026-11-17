package com.facebook.aura.localbrowser;

import com.facebook.aura.main.api.AuthenticatedWindowContent;
import com.facebook.aura.main.api.AuthenticatedWindowContentProvider;

/* loaded from: classes.dex */
public final class LocalBrowserWindowContentProvider implements AuthenticatedWindowContentProvider {
    public static final int $stable = 0;
    public static final LocalBrowserWindowContentProvider INSTANCE = new LocalBrowserWindowContentProvider();

    @Override // com.facebook.aura.main.api.AuthenticatedWindowContentProvider
    public AuthenticatedWindowContent content() {
        return LocalBrowserWindowContent.INSTANCE;
    }
}

package com.facebook.aura.localbrowser;

import X.AnonymousClass003;

/* loaded from: classes2.dex */
public final class LocalBrowserTargetMetadata {
    public static final int $stable = 0;
    public final String title;
    public final String url;

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public LocalBrowserTargetMetadata(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.title = str2;
    }
}

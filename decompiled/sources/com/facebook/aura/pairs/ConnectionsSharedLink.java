package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class ConnectionsSharedLink {
    public static final int $stable = 0;
    public final String host;
    public final String title;
    public final String url;

    public final String getHost() {
        return this.host;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public ConnectionsSharedLink(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.title = str;
        this.url = str2;
        this.host = str3;
    }
}

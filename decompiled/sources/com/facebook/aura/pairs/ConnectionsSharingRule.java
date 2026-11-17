package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class ConnectionsSharingRule {
    public static final int $stable = 0;
    public final String description;
    public final String id;
    public final String summary;
    public final String title;

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public ConnectionsSharingRule(String str, String str2, String str3, String str4) {
        AnonymousClass005.A14(str, str2, str3, str4);
        this.id = str;
        this.title = str2;
        this.summary = str3;
        this.description = str4;
    }
}

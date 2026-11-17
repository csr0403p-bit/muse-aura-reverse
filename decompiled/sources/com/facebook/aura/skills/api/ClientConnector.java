package com.facebook.aura.skills.api;

import X.AnonymousClass003;

/* loaded from: classes.dex */
public final class ClientConnector {
    public static final int $stable = 0;
    public final String connectorId;
    public final int iconRes;
    public final String title;

    public final String getConnectorId() {
        return this.connectorId;
    }

    public final int getIconRes() {
        return this.iconRes;
    }

    public final String getTitle() {
        return this.title;
    }

    public ClientConnector(String str, String str2, int i) {
        AnonymousClass003.A0u(str, str2);
        this.connectorId = str;
        this.title = str2;
        this.iconRes = i;
    }
}

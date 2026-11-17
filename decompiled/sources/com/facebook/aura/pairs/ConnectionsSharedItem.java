package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionsSharedItem {
    public static final int $stable = 0;
    public final ConnectionsSharedItemKind kind;
    public final String title;

    public ConnectionsSharedItem(ConnectionsSharedItemKind connectionsSharedItemKind, String str) {
        C7384Etj.A0Y(connectionsSharedItemKind, 0);
        this.kind = connectionsSharedItemKind;
        this.title = str;
    }

    public final ConnectionsSharedItemKind getKind() {
        return this.kind;
    }

    public final String getTitle() {
        return this.title;
    }
}

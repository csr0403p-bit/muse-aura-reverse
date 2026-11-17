package com.facebook.aura.pairs;

import X.AnonymousClass003;

/* loaded from: classes3.dex */
public final class ConnectionsShareTarget {
    public static final int $stable = PairsImageRef.$stable;
    public final String connectionId;
    public final String name;
    public final PairsImageRef photo;

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final String getName() {
        return this.name;
    }

    public final PairsImageRef getPhoto() {
        return this.photo;
    }

    public ConnectionsShareTarget(String str, String str2, PairsImageRef pairsImageRef) {
        AnonymousClass003.A0u(str, str2);
        this.connectionId = str;
        this.name = str2;
        this.photo = pairsImageRef;
    }
}

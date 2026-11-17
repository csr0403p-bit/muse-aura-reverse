package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class ConnectionsGroup {
    public static final int $stable = 0;
    public final String connectionId;
    public final ConnectionsDisconnectEffect disconnectEffect;
    public final String displayName;
    public final ConnectionsGroupProvider provider;

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final ConnectionsDisconnectEffect getDisconnectEffect() {
        return this.disconnectEffect;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final ConnectionsGroupProvider getProvider() {
        return this.provider;
    }

    public ConnectionsGroup(String str, String str2, ConnectionsGroupProvider connectionsGroupProvider, ConnectionsDisconnectEffect connectionsDisconnectEffect) {
        AnonymousClass005.A0x(str, str2, connectionsGroupProvider);
        this.connectionId = str;
        this.displayName = str2;
        this.provider = connectionsGroupProvider;
        this.disconnectEffect = connectionsDisconnectEffect;
    }
}

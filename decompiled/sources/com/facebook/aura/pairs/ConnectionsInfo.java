package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionsInfo {
    public static final int $stable = 0;
    public final String chatSessionId;
    public final String connectionId;
    public final ConnectionsDisconnectEffect disconnectEffect;

    public ConnectionsInfo(String str, String str2, ConnectionsDisconnectEffect connectionsDisconnectEffect) {
        C7384Etj.A0Y(str, 0);
        this.connectionId = str;
        this.chatSessionId = str2;
        this.disconnectEffect = connectionsDisconnectEffect;
    }

    public final String getChatSessionId() {
        return this.chatSessionId;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final ConnectionsDisconnectEffect getDisconnectEffect() {
        return this.disconnectEffect;
    }
}

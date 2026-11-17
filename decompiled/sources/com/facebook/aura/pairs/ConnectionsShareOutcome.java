package com.facebook.aura.pairs;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionsShareOutcome {
    public static final int $stable = 0;
    public final String messageId;
    public final ConnectionsShareStatus status;

    public ConnectionsShareOutcome(ConnectionsShareStatus connectionsShareStatus, String str) {
        C7384Etj.A0Y(connectionsShareStatus, 0);
        this.status = connectionsShareStatus;
        this.messageId = str;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final ConnectionsShareStatus getStatus() {
        return this.status;
    }
}

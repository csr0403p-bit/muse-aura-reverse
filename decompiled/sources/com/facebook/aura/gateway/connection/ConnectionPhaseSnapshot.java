package com.facebook.aura.gateway.connection;

import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class ConnectionPhaseSnapshot extends C06G {
    public final int connectionCycle;
    public final ConnectionPhase phase;

    public ConnectionPhaseSnapshot(ConnectionPhase connectionPhase, int i) {
        C7384Etj.A0Y(connectionPhase, 0);
        this.phase = connectionPhase;
        this.connectionCycle = i;
    }

    public final ConnectionPhaseSnapshot copy(ConnectionPhase connectionPhase, int i) {
        C7384Etj.A0Y(connectionPhase, 0);
        return new ConnectionPhaseSnapshot(connectionPhase, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionPhaseSnapshot) {
                ConnectionPhaseSnapshot connectionPhaseSnapshot = (ConnectionPhaseSnapshot) obj;
                if (!C7384Etj.areEqual(this.phase, connectionPhaseSnapshot.phase) || this.connectionCycle != connectionPhaseSnapshot.connectionCycle) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionPhaseSnapshot copy$default(ConnectionPhaseSnapshot connectionPhaseSnapshot, ConnectionPhase connectionPhase, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            connectionPhase = connectionPhaseSnapshot.phase;
        }
        if ((i2 & 2) != 0) {
            i = connectionPhaseSnapshot.connectionCycle;
        }
        C7384Etj.A0Y(connectionPhase, 0);
        return new ConnectionPhaseSnapshot(connectionPhase, i);
    }

    public final ConnectionPhase component1() {
        return this.phase;
    }

    public final int component2() {
        return this.connectionCycle;
    }

    public final int getConnectionCycle() {
        return this.connectionCycle;
    }

    public final ConnectionPhase getPhase() {
        return this.phase;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.phase) + this.connectionCycle;
    }

    public String toString() {
        return super.toString();
    }
}

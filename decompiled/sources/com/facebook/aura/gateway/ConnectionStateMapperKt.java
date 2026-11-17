package com.facebook.aura.gateway;

import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.connection.ConnectionPhase;

/* loaded from: classes5.dex */
public abstract class ConnectionStateMapperKt {
    public static final HatchGatewayConnectionState toGatewayConnectionState(ConnectionPhase connectionPhase) {
        C7384Etj.A0Y(connectionPhase, 0);
        if (connectionPhase.equals(ConnectionPhase.Idle.INSTANCE)) {
            return new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.NONE);
        }
        if (connectionPhase.equals(ConnectionPhase.Offline.INSTANCE)) {
            return new HatchGatewayConnectionState.Disconnected(HatchGatewayConnectionState.Reason.OFFLINE);
        }
        if (connectionPhase.equals(ConnectionPhase.Connecting.INSTANCE)) {
            return HatchGatewayConnectionState.Connecting.INSTANCE;
        }
        if (connectionPhase instanceof ConnectionPhase.Reconnecting) {
            return new HatchGatewayConnectionState.Reconnecting(((ConnectionPhase.Reconnecting) connectionPhase).attempt);
        }
        if (connectionPhase.equals(ConnectionPhase.Connected.INSTANCE)) {
            return HatchGatewayConnectionState.Connected.INSTANCE;
        }
        if (connectionPhase.equals(ConnectionPhase.StorageRecoveryConnected.INSTANCE)) {
            return new HatchGatewayConnectionState.Reconnecting(1);
        }
        if (connectionPhase.equals(ConnectionPhase.Paused.INSTANCE)) {
            return HatchGatewayConnectionState.Paused.INSTANCE;
        }
        if (connectionPhase.equals(ConnectionPhase.Resetting.INSTANCE)) {
            return HatchGatewayConnectionState.Resetting.INSTANCE;
        }
        if (!(connectionPhase instanceof ConnectionPhase.Failed)) {
            throw C3cG.A0q();
        }
        ConnectionPhase.Failed failed = (ConnectionPhase.Failed) connectionPhase;
        return new HatchGatewayConnectionState.Error(failed.message, failed.retriesExhausted);
    }
}

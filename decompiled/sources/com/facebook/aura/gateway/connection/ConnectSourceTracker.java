package com.facebook.aura.gateway.connection;

import X.C7384Etj;
import com.facebook.aura.gateway.connection.ConnectionEvent;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class ConnectSourceTracker {
    public String override;
    public volatile String value = "connect_requested";

    public final <T> T during(String str, Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 1);
        String str2 = this.override;
        if (str == null) {
            str = str2;
        }
        this.override = str;
        try {
            return function0.invoke();
        } finally {
            this.override = str2;
        }
    }

    public final void onReduced(ConnectionEvent connectionEvent, ConnectionState connectionState, ConnectionState connectionState2) {
        C7384Etj.A0Y(connectionEvent, 0);
        C7384Etj.A0Y(connectionState, 1);
        C7384Etj.A0Y(connectionState2, 2);
        if (connectionState2.connectionCycle != connectionState.connectionCycle) {
            String strSourceFor = this.override;
            if (strSourceFor == null && (strSourceFor = sourceFor(connectionEvent, connectionState)) == null) {
                return;
            }
            this.value = strSourceFor;
        }
    }

    private final String sourceFor(ConnectionEvent connectionEvent, ConnectionState connectionState) {
        if (connectionEvent instanceof ConnectionEvent.ConnectRequested) {
            return "connect_requested";
        }
        if (connectionEvent instanceof ConnectionEvent.NetworkChanged) {
            return "network_available";
        }
        if (!(connectionEvent instanceof ConnectionEvent.LifecycleChanged)) {
            return null;
        }
        ConnectionLifecycleSnapshot connectionLifecycleSnapshot = ((ConnectionEvent.LifecycleChanged) connectionEvent).snapshot;
        return (!connectionLifecycleSnapshot.isAppForeground || connectionState.isAppForeground) ? (!connectionLifecycleSnapshot.isAssistOverlayActive || connectionState.isAssistOverlayActive) ? (!connectionLifecycleSnapshot.isNodeOperationActive || connectionState.isNodeOperationActive) ? (!connectionLifecycleSnapshot.isAgentExecutionActive || connectionState.isAgentExecutionActive) ? (!connectionLifecycleSnapshot.isLiveSessionActive || connectionState.isLiveSessionActive) ? "lifecycle_other" : "live_session" : "agent_execution" : "node_operation" : "assist_overlay" : "app_foreground";
    }

    public final String getValue() {
        return this.value;
    }
}

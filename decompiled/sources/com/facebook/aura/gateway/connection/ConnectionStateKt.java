package com.facebook.aura.gateway.connection;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;

/* loaded from: classes6.dex */
public abstract class ConnectionStateKt {
    public static final boolean allowsLifecycleConnection(ConnectionState connectionState) {
        C7384Etj.A0Y(connectionState, 0);
        return connectionState.isAppForeground || connectionState.isBackgroundSessionActive || connectionState.isAssistOverlayActive || connectionState.isNodeOperationActive || connectionState.isAgentExecutionActive || connectionState.isLiveSessionActive;
    }

    public static final ConnectionState copy(ConnectionState connectionState, boolean z, int i) {
        C7384Etj.A0Y(connectionState, 0);
        return ConnectionState.copy$default(connectionState, null, 0L, 0, i, z ? ReconnectMode.SERVICE : ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048551, null);
    }

    public static final boolean holdsActiveWork(ConnectionState connectionState) {
        C7384Etj.A0Y(connectionState, 0);
        return connectionState.isNodeOperationActive || connectionState.isAgentExecutionActive || connectionState.isLiveSessionActive;
    }

    public static final boolean isSpecialized(ReconnectMode reconnectMode) {
        C7384Etj.A0Y(reconnectMode, 0);
        return reconnectMode == ReconnectMode.SERVICE || reconnectMode == ReconnectMode.VM_SUSPENDED || reconnectMode == ReconnectMode.VM_STARTING;
    }

    public static final int reconnectBudget(ConnectionState connectionState, ConnectionConfig connectionConfig) {
        boolean zA1a = AnonymousClass002.A1a(connectionState, connectionConfig);
        int iOrdinal = connectionState.reconnectMode.ordinal();
        if (iOrdinal == 0 || iOrdinal == 4) {
            return connectionConfig.maxReconnectAttempts + (holdsActiveWork(connectionState) ? connectionConfig.activeWorkFastRetries : connectionState.fastReconnectAttempts);
        }
        if (iOrdinal == zA1a) {
            return connectionConfig.serviceReconnectMaxAttempts;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return connectionConfig.badGatewayMaxReconnectAttempts;
        }
        throw C3cG.A0q();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReconnectMode.values().length];
            try {
                AnonymousClass002.A13(ReconnectMode.REGULAR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ReconnectMode.REGULAR_FALLBACK, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ReconnectMode.SERVICE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ReconnectMode.VM_SUSPENDED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ReconnectMode.VM_STARTING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ConnectionState copy$default(ConnectionState connectionState, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = connectionState.reconnectAttempt;
        }
        return copy(connectionState, z, i);
    }
}

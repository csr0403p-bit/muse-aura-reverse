package com.facebook.aura.gateway.connection;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.BQG;
import X.C06G;
import X.C0881AGi;
import X.C7384Etj;
import X.Hr7;
import com.facebook.aura.gateway.HatchGatewayConnectionKt;
import com.facebook.aura.gateway.connection.ConnectionEffect;
import com.facebook.aura.gateway.connection.ConnectionEvent;
import com.facebook.aura.gateway.connection.ConnectionPhase;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes6.dex */
public final class ConnectionReducer {
    public static final int HTTP_STATUS_BAD_GATEWAY = 502;
    public static final int HTTP_STATUS_BAD_REQUEST = 400;
    public static final ConnectionReducer INSTANCE = new ConnectionReducer();

    public final class Reduction extends C06G {
        public final List<ConnectionEffect> effects;
        public final ConnectionState state;

        /* JADX WARN: Multi-variable type inference failed */
        public Reduction(ConnectionState connectionState, List<? extends ConnectionEffect> list) {
            C7384Etj.A0Y(connectionState, 0);
            C7384Etj.A0Y(list, 1);
            this.state = connectionState;
            this.effects = list;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Reduction) {
                    Reduction reduction = (Reduction) obj;
                    if (!C7384Etj.areEqual(this.state, reduction.state) || !C7384Etj.areEqual(this.effects, reduction.effects)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Reduction copy$default(Reduction reduction, ConnectionState connectionState, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                connectionState = reduction.state;
            }
            if ((i & 2) != 0) {
                list = reduction.effects;
            }
            AnonymousClass003.A0u(connectionState, list);
            return AbstractC7607F5u.A0v(connectionState, list);
        }

        public final ConnectionState component1() {
            return this.state;
        }

        public final List<ConnectionEffect> component2() {
            return this.effects;
        }

        public final List<ConnectionEffect> getEffects() {
            return this.effects;
        }

        public final ConnectionState getState() {
            return this.state;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.effects, AnonymousClass005.A0E(this.state));
        }

        public final Reduction copy(ConnectionState connectionState, List<? extends ConnectionEffect> list) {
            AnonymousClass003.A0u(connectionState, list);
            return AbstractC7607F5u.A0v(connectionState, list);
        }

        public String toString() {
            return super.toString();
        }
    }

    private final Reduction onSubscribeAckStalled(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        List listAsList;
        if (AbstractC7607F5u.A1V(connectionState) || C7384Etj.areEqual(connectionState.phase, ConnectionPhase.StorageRecoveryConnected.INSTANCE)) {
            listAsList = C0881AGi.A00;
        } else {
            if (!withinSubscribeBudget(connectionState, j, connectionConfig)) {
                return onTransportFailed(connectionState, HatchGatewayConnectionKt.ERROR_TYPE_HANDSHAKE_TIMEOUT, null, null, j, connectionConfig);
            }
            listAsList = Arrays.asList(ConnectionEffect.EnsurePrimarySubscribePending.INSTANCE, new ConnectionEffect.StartSubscribeWatchdog(connectionState.epoch));
        }
        return AbstractC7607F5u.A0v(connectionState, listAsList);
    }

    private final Reduction onUrlUnavailable(ConnectionState connectionState, ConnectionEvent.UrlUnavailable urlUnavailable) {
        return AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, new ConnectionPhase.Failed("Missing gateway URL", false, ConnectionPhase.FailureCause.TRANSPORT), 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048574, null), Collections.singletonList(ConnectionEffect.CancelHandshakeWatchdog.INSTANCE));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchNoiseHandshakeOutcome.values().length];
            try {
                AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.KEY_REQUIRED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ReconnectMode.values().length];
            try {
                AnonymousClass005.A0v(ReconnectMode.REGULAR, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(ReconnectMode.REGULAR_FALLBACK, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(ReconnectMode.SERVICE, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A16(ReconnectMode.VM_SUSPENDED, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A17(ReconnectMode.VM_STARTING, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final boolean admitsVmWakeWait(ReconnectMode reconnectMode) {
        return reconnectMode == ReconnectMode.VM_SUSPENDED || reconnectMode == ReconnectMode.VM_STARTING;
    }

    private final Reduction beginConnect(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        ConnectionState connectionStateCopy$default;
        List listA1G;
        if (connectionState.isOnline) {
            connectionStateCopy$default = ConnectionState.copy$default(connectionState, ConnectionPhase.Connecting.INSTANCE, connectionState.epoch + 1, connectionState.connectionCycle + 1, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1042464, null);
            List<ConnectionEffect> listCancelConnectAttemptEffects = cancelConnectAttemptEffects(connectionState, ConnectAttemptCancellation.SUPERSEDED);
            ConnectionEffect.CancelReconnectTimer cancelReconnectTimer = ConnectionEffect.CancelReconnectTimer.INSTANCE;
            ConnectionEffect.CancelExhaustionCooldown cancelExhaustionCooldown = ConnectionEffect.CancelExhaustionCooldown.INSTANCE;
            ConnectionEffect.CancelKeepaliveTimer cancelKeepaliveTimer = ConnectionEffect.CancelKeepaliveTimer.INSTANCE;
            ConnectionEffect.CancelStabilityTimer cancelStabilityTimer = ConnectionEffect.CancelStabilityTimer.INSTANCE;
            ConnectionEffect.CancelHandshakeWatchdog cancelHandshakeWatchdog = ConnectionEffect.CancelHandshakeWatchdog.INSTANCE;
            ConnectionEffect.CloseTransport closeTransport = ConnectionEffect.CloseTransport.INSTANCE;
            long j2 = connectionStateCopy$default.epoch;
            listA1G = Hr7.A1G(listCancelConnectAttemptEffects, new ConnectionEffect[]{cancelReconnectTimer, cancelExhaustionCooldown, cancelKeepaliveTimer, cancelStabilityTimer, cancelHandshakeWatchdog, closeTransport, new ConnectionEffect.OpenTransport(j2, connectionStateCopy$default.connectionCycle, false), new ConnectionEffect.StartHandshakeWatchdog(j2), new ConnectionEffect.RunPauseStatusCheck(j2)});
        } else {
            connectionStateCopy$default = ConnectionState.copy$default(connectionState, ConnectionPhase.Offline.INSTANCE, 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1044478, null);
            listA1G = Collections.singletonList(ConnectionEffect.CancelReconnectTimer.INSTANCE);
        }
        return AbstractC7607F5u.A0v(connectionStateCopy$default, listA1G);
    }

    private final List<ConnectionEffect> failConnectAttemptEffects(ConnectionState connectionState, String str, String str2, Integer num, String str3) {
        Object failConnectAttempt;
        if (num != null && num.intValue() == 502) {
            failConnectAttempt = new ConnectionEffect.FailBadGatewayAttempt(str, str2, str3);
        } else {
            if (!hasReportableConnectTrace(connectionState)) {
                return C0881AGi.A00;
            }
            failConnectAttempt = new ConnectionEffect.FailConnectAttempt(str, str2);
        }
        return Collections.singletonList(failConnectAttempt);
    }

    public static /* synthetic */ List failConnectAttemptEffects$default(ConnectionReducer connectionReducer, ConnectionState connectionState, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        return connectionReducer.failConnectAttemptEffects(connectionState, str, str2, num, str3);
    }

    private final Reduction giveUp(ConnectionState connectionState, String str, ConnectionConfig connectionConfig) {
        return AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, new ConnectionPhase.Failed(str, true, ConnectionPhase.FailureCause.RECONNECT_EXHAUSTED), 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048574, null), Arrays.asList(ConnectionEffect.CancelReconnectTimer.INSTANCE, ConnectionEffect.CancelKeepaliveTimer.INSTANCE, new ConnectionEffect.ScheduleExhaustionCooldown(connectionConfig.retriesExhaustedCooldownMs)));
    }

    private final boolean hasConnectAttemptInFlight(ConnectionState connectionState) {
        ConnectionPhase connectionPhase = connectionState.phase;
        return C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connecting.INSTANCE) || ((connectionPhase instanceof ConnectionPhase.Reconnecting) && ((ConnectionPhase.Reconnecting) connectionPhase).activity == ConnectionPhase.ReconnectActivity.ACTIVE);
    }

    private final Reduction onAssistOverlayActivated(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        List listSingletonList;
        ConnectionPhase connectionPhase = connectionState.phase;
        if (C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connected.INSTANCE)) {
            listSingletonList = Collections.singletonList(new ConnectionEffect.SendKeepalivePing(presence(connectionState)));
        } else {
            if ((C7384Etj.areEqual(connectionPhase, ConnectionPhase.Idle.INSTANCE) || C7384Etj.areEqual(connectionPhase, ConnectionPhase.Offline.INSTANCE) || (connectionPhase instanceof ConnectionPhase.Failed) || (connectionPhase instanceof ConnectionPhase.Reconnecting)) && connectionState.isOnline && !connectionState.intentionalDisconnect) {
                return beginConnect(connectionState, j, connectionConfig);
            }
            listSingletonList = C0881AGi.A00;
        }
        return AbstractC7607F5u.A0v(connectionState, listSingletonList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r4.force != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r3.vmWakeWaitStartedAtMs == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction onConnectRequested(com.facebook.aura.gateway.connection.ConnectionState r3, com.facebook.aura.gateway.connection.ConnectionEvent.ConnectRequested r4, long r5, com.facebook.aura.gateway.connection.ConnectionConfig r7) {
        /*
            r2 = this;
            com.facebook.aura.gateway.connection.ConnectionPhase r1 = r3.phase
            com.facebook.aura.gateway.connection.ConnectionPhase$Connected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionPhase$Connecting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connecting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionPhase$Paused r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Paused.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionPhase$Resetting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Resetting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L63
            com.facebook.aura.gateway.connection.ConnectionPhase$StorageRecoveryConnected r0 = com.facebook.aura.gateway.connection.ConnectionPhase.StorageRecoveryConnected.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L33
            boolean r0 = r4.force
            if (r0 == 0) goto L63
        L2e:
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = r2.beginConnect(r3, r5, r7)
            return r0
        L33:
            boolean r0 = r1 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Reconnecting
            if (r0 == 0) goto L4a
            boolean r0 = r4.force
            if (r0 == 0) goto L63
            boolean r0 = r4.joinInFlight
            if (r0 == 0) goto L45
            boolean r0 = r2.hasConnectAttemptInFlight(r3)
            if (r0 != 0) goto L63
        L45:
            java.lang.Long r0 = r3.vmWakeWaitStartedAtMs
            if (r0 != 0) goto L63
            goto L2e
        L4a:
            com.facebook.aura.gateway.connection.ConnectionPhase$Idle r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Idle.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L2e
            com.facebook.aura.gateway.connection.ConnectionPhase$Offline r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Offline.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L2e
            boolean r0 = r1 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Failed
            if (r0 != 0) goto L2e
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L63:
            X.AGi r0 = X.C0881AGi.A00
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.onConnectRequested(com.facebook.aura.gateway.connection.ConnectionState, com.facebook.aura.gateway.connection.ConnectionEvent$ConnectRequested, long, com.facebook.aura.gateway.connection.ConnectionConfig):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    private final Reduction onDisconnect(ConnectionState connectionState, ConnectionPhase connectionPhase) {
        return AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, connectionPhase, connectionState.epoch + 1, 0, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, true, false, false, false, false, false, false, false, 1042468, null), Arrays.asList(ConnectionEffect.CancelKeepaliveTimer.INSTANCE, ConnectionEffect.CancelHandshakeWatchdog.INSTANCE, ConnectionEffect.CancelReconnectTimer.INSTANCE, ConnectionEffect.CancelStabilityTimer.INSTANCE, ConnectionEffect.CancelExhaustionCooldown.INSTANCE, ConnectionEffect.CloseTransport.INSTANCE, ConnectionEffect.FailPendingRpcRequests.INSTANCE, ConnectionEffect.ResetDeltaState.INSTANCE, ConnectionEffect.NotifyIntentionalDisconnect.INSTANCE));
    }

    private final Reduction onExhaustionCooldownElapsed(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        List listSingletonList;
        ConnectionPhase connectionPhase = connectionState.phase;
        ConnectionPhase.Failed failed = connectionPhase instanceof ConnectionPhase.Failed ? (ConnectionPhase.Failed) connectionPhase : null;
        if (connectionState.intentionalDisconnect || failed == null || !failed.retriesExhausted || !ConnectionStateKt.allowsLifecycleConnection(connectionState)) {
            listSingletonList = C0881AGi.A00;
        } else {
            if (connectionState.isOnline) {
                return scheduleReconnect(ConnectionState.copy$default(connectionState, new ConnectionPhase.Reconnecting(1, ConnectionPhase.ReconnectActivity.ACTIVE), 0L, connectionState.connectionCycle + 1, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1046562, null), j, connectionConfig);
            }
            listSingletonList = Collections.singletonList(new ConnectionEffect.ScheduleExhaustionCooldown(connectionConfig.retriesExhaustedCooldownMs));
        }
        return AbstractC7607F5u.A0v(connectionState, listSingletonList);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction onLifecycleChanged(com.facebook.aura.gateway.connection.ConnectionState r32, com.facebook.aura.gateway.connection.ConnectionEvent.LifecycleChanged r33, long r34, com.facebook.aura.gateway.connection.ConnectionConfig r36) {
        /*
            r31 = this;
            r0 = r33
            com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot r0 = r0.snapshot
            boolean r5 = r0.isAppForeground
            boolean r4 = r0.isBackgroundSessionActive
            boolean r3 = r0.isAssistOverlayActive
            boolean r2 = r0.isNodeOperationActive
            boolean r1 = r0.isAgentExecutionActive
            boolean r0 = r0.isLiveSessionActive
            r29 = 139263(0x21fff, float:1.95149E-40)
            r7 = 0
            r8 = 0
            r10 = 0
            r6 = r32
            r11 = r10
            r12 = r7
            r13 = r10
            r14 = r7
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r8
            r21 = r10
            r22 = r5
            r23 = r4
            r24 = r3
            r25 = r2
            r26 = r10
            r27 = r1
            r28 = r0
            r30 = r7
            com.facebook.aura.gateway.connection.ConnectionState r5 = com.facebook.aura.gateway.connection.ConnectionState.copy$default(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = r31
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = r4.parkConnectionIfNewlyDisallowed(r6, r5)
            if (r0 != 0) goto L54
            boolean r1 = r6.isAppForeground
            r7 = r34
            r9 = r36
            if (r1 != 0) goto L55
            boolean r0 = r5.isAppForeground
            if (r0 == 0) goto L55
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = r4.onForegrounded(r5, r7, r9)
        L54:
            return r0
        L55:
            boolean r0 = r6.isAssistOverlayActive
            if (r0 != 0) goto L62
            boolean r0 = r5.isAssistOverlayActive
            if (r0 == 0) goto L62
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = r4.onAssistOverlayActivated(r5, r7, r9)
            return r0
        L62:
            boolean r0 = r6.isNodeOperationActive
            if (r0 != 0) goto L6a
            boolean r0 = r5.isNodeOperationActive
            if (r0 != 0) goto L7a
        L6a:
            boolean r0 = r6.isAgentExecutionActive
            if (r0 != 0) goto L72
            boolean r0 = r5.isAgentExecutionActive
            if (r0 != 0) goto L7a
        L72:
            boolean r0 = r6.isLiveSessionActive
            if (r0 != 0) goto L87
            boolean r0 = r5.isLiveSessionActive
            if (r0 == 0) goto L87
        L7a:
            if (r1 == 0) goto L81
            boolean r0 = r5.isAppForeground
            r6 = 1
            if (r0 == 0) goto L82
        L81:
            r6 = 0
        L82:
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = r4.onWorkStarted(r5, r6, r7, r9)
            return r0
        L87:
            if (r1 == 0) goto La5
            boolean r0 = r5.isAppForeground
            if (r0 != 0) goto La5
            boolean r0 = X.AbstractC7607F5u.A1V(r5)
            if (r0 == 0) goto La5
            com.facebook.aura.gateway.connection.Presence r1 = r4.presence(r5)
            com.facebook.aura.gateway.connection.ConnectionEffect$SendKeepalivePing r0 = new com.facebook.aura.gateway.connection.ConnectionEffect$SendKeepalivePing
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
        La0:
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r5, r0)
            return r0
        La5:
            X.AGi r0 = X.C0881AGi.A00
            goto La0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.onLifecycleChanged(com.facebook.aura.gateway.connection.ConnectionState, com.facebook.aura.gateway.connection.ConnectionEvent$LifecycleChanged, long, com.facebook.aura.gateway.connection.ConnectionConfig):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction onNetworkChanged(com.facebook.aura.gateway.connection.ConnectionState r38, com.facebook.aura.gateway.connection.ConnectionEvent.NetworkChanged r39, long r40, com.facebook.aura.gateway.connection.ConnectionConfig r42) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.onNetworkChanged(com.facebook.aura.gateway.connection.ConnectionState, com.facebook.aura.gateway.connection.ConnectionEvent$NetworkChanged, long, com.facebook.aura.gateway.connection.ConnectionConfig):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    private final Reduction onNetworkRecovered(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        if (!connectionState.intentionalDisconnect && connectionState.isOnline && ConnectionStateKt.allowsLifecycleConnection(connectionState)) {
            ConnectionPhase connectionPhase = connectionState.phase;
            if ((connectionPhase instanceof ConnectionPhase.Reconnecting) && ((ConnectionPhase.Reconnecting) connectionPhase).activity == ConnectionPhase.ReconnectActivity.AWAITING_RETRY && !ConnectionStateKt.isSpecialized(connectionState.reconnectMode)) {
                Reduction reductionOnReconnectTimerFired = onReconnectTimerFired(connectionState, connectionConfig);
                return AbstractC7607F5u.A0v(reductionOnReconnectTimerFired.state, AbstractC0878AGe.A0P(reductionOnReconnectTimerFired.effects, Collections.singletonList(ConnectionEffect.CancelReconnectTimer.INSTANCE)));
            }
            if ((connectionPhase instanceof ConnectionPhase.Failed) && ((ConnectionPhase.Failed) connectionPhase).cause == ConnectionPhase.FailureCause.RECONNECT_EXHAUSTED) {
                return beginConnect(connectionState, j, connectionConfig);
            }
        }
        return AbstractC7607F5u.A0v(connectionState, C0881AGi.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction onReconnectTimerFired(com.facebook.aura.gateway.connection.ConnectionState r27, com.facebook.aura.gateway.connection.ConnectionConfig r28) {
        /*
            r26 = this;
            r4 = r27
            boolean r0 = r4.intentionalDisconnect
            if (r0 == 0) goto Ld
            X.AGi r0 = X.C0881AGi.A00
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r4, r0)
            return r0
        Ld:
            r1 = r26
            r0 = r28
            boolean r1 = r1.shouldRefreshVmInventoryOnRetry(r4, r0)
            int r2 = r4.reconnectAttempt
            r0 = 1
            if (r2 >= r0) goto L1b
            r2 = 1
        L1b:
            r10 = 0
            com.facebook.aura.gateway.connection.ConnectionPhase$ReconnectActivity r0 = com.facebook.aura.gateway.connection.ConnectionPhase.ReconnectActivity.ACTIVE
            com.facebook.aura.gateway.connection.ConnectionPhase$Reconnecting r5 = new com.facebook.aura.gateway.connection.ConnectionPhase$Reconnecting
            r5.<init>(r2, r0)
            long r6 = r4.epoch
            r2 = 1
            long r6 = r6 + r2
            int r15 = r4.credentialRefreshAttempt
            if (r1 == 0) goto L2e
            int r15 = r15 + 1
        L2e:
            boolean r0 = r4.vmInventoryRefreshAttempted
            r8 = 0
            if (r0 != 0) goto L37
            r16 = 0
            if (r1 == 0) goto L39
        L37:
            r16 = 1
        L39:
            r27 = 1047036(0xff9fc, float:1.46721E-39)
            r17 = 0
            r9 = r8
            r11 = r8
            r12 = r10
            r13 = r8
            r14 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r8
            r26 = r8
            r28 = r10
            com.facebook.aura.gateway.connection.ConnectionState r7 = com.facebook.aura.gateway.connection.ConnectionState.copy$default(r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            com.facebook.aura.gateway.connection.ConnectionEffect$CancelHandshakeWatchdog r6 = com.facebook.aura.gateway.connection.ConnectionEffect.CancelHandshakeWatchdog.INSTANCE
            com.facebook.aura.gateway.connection.ConnectionEffect$CloseTransport r5 = com.facebook.aura.gateway.connection.ConnectionEffect.CloseTransport.INSTANCE
            long r3 = r7.epoch
            int r0 = r7.connectionCycle
            com.facebook.aura.gateway.connection.ConnectionEffect$OpenTransport r2 = new com.facebook.aura.gateway.connection.ConnectionEffect$OpenTransport
            r2.<init>(r3, r0, r1)
            com.facebook.aura.gateway.connection.ConnectionEffect$StartHandshakeWatchdog r1 = new com.facebook.aura.gateway.connection.ConnectionEffect$StartHandshakeWatchdog
            r1.<init>(r3)
            com.facebook.aura.gateway.connection.ConnectionEffect$RunPauseStatusCheck r0 = new com.facebook.aura.gateway.connection.ConnectionEffect$RunPauseStatusCheck
            r0.<init>(r3)
            com.facebook.aura.gateway.connection.ConnectionEffect[] r0 = new com.facebook.aura.gateway.connection.ConnectionEffect[]{r6, r5, r2, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.onReconnectTimerFired(com.facebook.aura.gateway.connection.ConnectionState, com.facebook.aura.gateway.connection.ConnectionConfig):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    private final Reduction onServiceNotice(ConnectionState connectionState, ConnectionEvent.ServiceNoticeReceived serviceNoticeReceived) {
        return (ConnectionReducerKt.isPlannedRestartNotice(serviceNoticeReceived.code) && AbstractC7607F5u.A1V(connectionState)) ? AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, null, 0L, 0, 0, ReconnectMode.SERVICE, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048551, null), C0881AGi.A00) : AbstractC7607F5u.A0v(connectionState, C0881AGi.A00);
    }

    private final Reduction onStabilityElapsed(ConnectionState connectionState) {
        return AbstractC7607F5u.A1V(connectionState) ? AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, null, 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1047031, null), Collections.singletonList(ConnectionEffect.CancelReconnectTimer.INSTANCE)) : AbstractC7607F5u.A0v(connectionState, C0881AGi.A00);
    }

    private final Reduction onStorageRecoveryConnected(ConnectionState connectionState) {
        return (C7384Etj.areEqual(connectionState.phase, ConnectionPhase.StorageRecoveryConnected.INSTANCE) || !(C7384Etj.areEqual(connectionState.phase, ConnectionPhase.Connecting.INSTANCE) || (connectionState.phase instanceof ConnectionPhase.Reconnecting))) ? AbstractC7607F5u.A0v(connectionState, C0881AGi.A00) : AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, ConnectionPhase.StorageRecoveryConnected.INSTANCE, 0L, 0, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1044518, null), Hr7.A1G(failConnectAttemptEffects(connectionState, ConnectionReducerKt.CONNECT_ERROR_TYPE_STORAGE_RECOVERY, ConnectionReducerKt.CONNECT_ERROR_MESSAGE_STORAGE_FULL, null, null), new ConnectionEffect[]{ConnectionEffect.CancelReconnectTimer.INSTANCE, ConnectionEffect.CancelExhaustionCooldown.INSTANCE, ConnectionEffect.CancelHandshakeWatchdog.INSTANCE, ConnectionEffect.CancelStabilityTimer.INSTANCE}));
    }

    private final Reduction onSuspectedDead(ConnectionState connectionState, long j, ConnectionConfig connectionConfig, ConnectionEffect connectionEffect) {
        if (connectionState.intentionalDisconnect || !(AbstractC7607F5u.A1V(connectionState) || C7384Etj.areEqual(connectionState.phase, ConnectionPhase.StorageRecoveryConnected.INSTANCE))) {
            return AbstractC7607F5u.A0v(connectionState, C0881AGi.A00);
        }
        ConnectionState connectionStateCopy$default = ConnectionState.copy$default(connectionState, null, connectionState.epoch + 1, connectionState.connectionCycle + 1, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1046561, null);
        List listA0F = BFI.A0F(new ConnectionEffect[]{connectionEffect, ConnectionEffect.CancelHandshakeWatchdog.INSTANCE, ConnectionEffect.CancelKeepaliveTimer.INSTANCE, ConnectionEffect.CancelStabilityTimer.INSTANCE, ConnectionEffect.CloseTransport.INSTANCE, ConnectionEffect.ResetDeltaState.INSTANCE});
        Reduction reductionScheduleReconnect = scheduleReconnect(connectionStateCopy$default, j, connectionConfig);
        return AbstractC7607F5u.A0v(reductionScheduleReconnect.state, AbstractC0878AGe.A0P(reductionScheduleReconnect.effects, listA0F));
    }

    public static /* synthetic */ Reduction onSuspectedDead$default(ConnectionReducer connectionReducer, ConnectionState connectionState, long j, ConnectionConfig connectionConfig, ConnectionEffect connectionEffect, int i, Object obj) {
        if ((i & 8) != 0) {
            connectionEffect = null;
        }
        return connectionReducer.onSuspectedDead(connectionState, j, connectionConfig, connectionEffect);
    }

    private final Reduction onTransportClosed(ConnectionState connectionState, ConnectionEvent.TransportClosed transportClosed, long j, ConnectionConfig connectionConfig) {
        Long l;
        int i;
        boolean z;
        boolean z2;
        int iCycleAfterDrop = cycleAfterDrop(connectionState);
        boolean zA1P = AnonymousClass002.A1P(iCycleAfterDrop, connectionState.connectionCycle);
        long j2 = connectionState.epoch + 1;
        if (zA1P) {
            l = null;
            i = 0;
            z = false;
            z2 = false;
        } else {
            l = connectionState.vmWakeWaitStartedAtMs;
            i = connectionState.vmWakeWaitRetryCount;
            z = connectionState.vmWakeWaitSpent;
            z2 = connectionState.vmInventoryRefreshAttempted;
        }
        ConnectionState connectionStateCopy$default = ConnectionState.copy$default(connectionState, null, j2, iCycleAfterDrop, 0, null, 0, l, i, z, 0, z2, 0L, false, false, false, false, false, false, false, false, 1047097, null);
        List listAsList = Arrays.asList(ConnectionEffect.CancelHandshakeWatchdog.INSTANCE, ConnectionEffect.ResetDeltaState.INSTANCE);
        if (connectionState.intentionalDisconnect) {
            return AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionStateCopy$default, ConnectionPhase.Idle.INSTANCE, 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048574, null), listAsList);
        }
        ArrayList arrayListA0Q = AbstractC0878AGe.A0Q(new ConnectionEffect.EmitConnectionClosed(transportClosed.code, BQG.A17(transportClosed.reason, 200)), listAsList);
        if (!ConnectionStateKt.allowsLifecycleConnection(connectionState)) {
            return AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionStateCopy$default, new ConnectionPhase.Reconnecting(1, ConnectionPhase.ReconnectActivity.PARKED), 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048574, null), arrayListA0Q);
        }
        Reduction reductionScheduleReconnect = scheduleReconnect(connectionStateCopy$default, j, connectionConfig);
        return AbstractC7607F5u.A0v(reductionScheduleReconnect.state, AbstractC0878AGe.A0P(reductionScheduleReconnect.effects, arrayListA0Q));
    }

    private final Reduction onTransportConnecting(ConnectionState connectionState) {
        return AbstractC7607F5u.A0v(connectionState, Collections.singletonList(new ConnectionEffect.StartHandshakeWatchdog(connectionState.epoch)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0340 A[PHI: r9
  0x0340: PHI (r9v16 java.lang.Long) = (r9v1 java.lang.Long), (r9v0 java.lang.Long), (r9v0 java.lang.Long) binds: [B:9:0x0031, B:4:0x0025, B:7:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction onTransportFailed(com.facebook.aura.gateway.connection.ConnectionState r56, java.lang.String r57, java.lang.Integer r58, com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome r59, long r60, com.facebook.aura.gateway.connection.ConnectionConfig r62) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.onTransportFailed(com.facebook.aura.gateway.connection.ConnectionState, java.lang.String, java.lang.Integer, com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome, long, com.facebook.aura.gateway.connection.ConnectionConfig):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    private final Reduction onTransportOpened(ConnectionState connectionState) {
        ConnectionPhase.Connected connected = ConnectionPhase.Connected.INSTANCE;
        ReconnectMode reconnectMode = connectionState.reconnectMode;
        ReconnectMode reconnectMode2 = ReconnectMode.REGULAR;
        ConnectionState connectionStateCopy$default = ConnectionState.copy$default(connectionState, connected, 0L, 0, reconnectMode != reconnectMode2 ? 0 : connectionState.reconnectAttempt, reconnectMode2, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048102, null);
        ConnectionEffect.CancelHandshakeWatchdog cancelHandshakeWatchdog = ConnectionEffect.CancelHandshakeWatchdog.INSTANCE;
        ConnectionEffect.CancelExhaustionCooldown cancelExhaustionCooldown = ConnectionEffect.CancelExhaustionCooldown.INSTANCE;
        ConnectionEffect.SendKeepalivePing sendKeepalivePing = new ConnectionEffect.SendKeepalivePing(presence(connectionStateCopy$default));
        long j = connectionStateCopy$default.epoch;
        return AbstractC7607F5u.A0v(connectionStateCopy$default, Arrays.asList(cancelHandshakeWatchdog, cancelExhaustionCooldown, sendKeepalivePing, new ConnectionEffect.ScheduleKeepaliveTimer(j), new ConnectionEffect.ScheduleStabilityTimer(j)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction onVmStateResolved(com.facebook.aura.gateway.connection.ConnectionState r26, com.facebook.aura.gateway.connection.ConnectionEvent.VmStateResolved r27) {
        /*
            r25 = this;
            r3 = r26
            com.facebook.aura.gateway.connection.ConnectionPhase r1 = r3.phase
            com.facebook.aura.gateway.connection.ConnectionPhase$Connecting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connecting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L19
            com.facebook.aura.gateway.connection.ConnectionPhase r0 = r3.phase
            boolean r0 = r0 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Reconnecting
            if (r0 != 0) goto L19
            X.AGi r0 = X.C0881AGi.A00
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r3, r0)
            return r0
        L19:
            r2 = r27
            boolean r0 = r2.isStarting
            com.facebook.aura.gateway.connection.ReconnectMode r1 = r3.reconnectMode
            if (r0 == 0) goto L67
            com.facebook.aura.gateway.connection.ReconnectMode r0 = com.facebook.aura.gateway.connection.ReconnectMode.REGULAR
            if (r1 != r0) goto L4d
            com.facebook.aura.gateway.connection.ReconnectMode r9 = com.facebook.aura.gateway.connection.ReconnectMode.VM_STARTING
        L27:
            r26 = 1048551(0xfffe7, float:1.469333E-39)
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = r7
            r10 = r7
            r11 = r4
            r12 = r7
            r13 = r7
            r14 = r7
            r15 = r7
            r16 = r5
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r27 = r4
            com.facebook.aura.gateway.connection.ConnectionState r3 = com.facebook.aura.gateway.connection.ConnectionState.copy$default(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L4d:
            boolean r0 = r2.isStarting
            if (r0 != 0) goto L58
            com.facebook.aura.gateway.connection.ReconnectMode r2 = r3.reconnectMode
            com.facebook.aura.gateway.connection.ReconnectMode r0 = com.facebook.aura.gateway.connection.ReconnectMode.VM_SUSPENDED
            r1 = 0
            if (r2 != r0) goto L59
        L58:
            r1 = 1
        L59:
            com.facebook.aura.gateway.connection.ConnectionEffect$SetVmStarting r0 = new com.facebook.aura.gateway.connection.ConnectionEffect$SetVmStarting
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r3, r0)
            return r0
        L67:
            com.facebook.aura.gateway.connection.ReconnectMode r0 = com.facebook.aura.gateway.connection.ReconnectMode.VM_STARTING
            if (r1 != r0) goto L4d
            com.facebook.aura.gateway.connection.ReconnectMode r9 = com.facebook.aura.gateway.connection.ReconnectMode.REGULAR
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.onVmStateResolved(com.facebook.aura.gateway.connection.ConnectionState, com.facebook.aura.gateway.connection.ConnectionEvent$VmStateResolved):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction parkConnectionIfNewlyDisallowed(com.facebook.aura.gateway.connection.ConnectionState r26, com.facebook.aura.gateway.connection.ConnectionState r27) {
        /*
            r25 = this;
            r2 = r26
            boolean r1 = com.facebook.aura.gateway.connection.ConnectionStateKt.allowsLifecycleConnection(r2)
            r3 = r27
            boolean r0 = com.facebook.aura.gateway.connection.ConnectionStateKt.allowsLifecycleConnection(r3)
            if (r1 == 0) goto L20
            if (r0 != 0) goto L20
            com.facebook.aura.gateway.connection.ConnectionPhase r1 = r3.phase
            com.facebook.aura.gateway.connection.ConnectionPhase$Connecting r0 = com.facebook.aura.gateway.connection.ConnectionPhase.Connecting.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L22
            com.facebook.aura.gateway.connection.ConnectionPhase r0 = r3.phase
            boolean r0 = r0 instanceof com.facebook.aura.gateway.connection.ConnectionPhase.Reconnecting
            if (r0 != 0) goto L22
        L20:
            r0 = 0
            return r0
        L22:
            int r1 = r3.reconnectAttempt
            r0 = 1
            if (r1 >= r0) goto L28
            r1 = 1
        L28:
            com.facebook.aura.gateway.connection.ConnectionPhase$ReconnectActivity r0 = com.facebook.aura.gateway.connection.ConnectionPhase.ReconnectActivity.PARKED
            com.facebook.aura.gateway.connection.ConnectionPhase$Reconnecting r4 = new com.facebook.aura.gateway.connection.ConnectionPhase$Reconnecting
            r4.<init>(r1, r0)
            long r5 = r3.epoch
            r0 = 1
            long r5 = r5 + r0
            boolean r0 = r3.vmWakeWaitSpent
            r7 = 0
            if (r0 != 0) goto L3e
            java.lang.Long r0 = r2.vmWakeWaitStartedAtMs
            r13 = 0
            if (r0 == 0) goto L3f
        L3e:
            r13 = 1
        L3f:
            r26 = 1048252(0xffebc, float:1.468914E-39)
            r9 = 0
            r16 = 0
            r8 = r7
            r10 = r7
            r11 = r9
            r12 = r7
            r14 = r7
            r15 = r7
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r27 = r9
            com.facebook.aura.gateway.connection.ConnectionState r3 = com.facebook.aura.gateway.connection.ConnectionState.copy$default(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.facebook.aura.gateway.connection.ConnectionEffect$CancelReconnectTimer r2 = com.facebook.aura.gateway.connection.ConnectionEffect.CancelReconnectTimer.INSTANCE
            com.facebook.aura.gateway.connection.ConnectionEffect$CancelHandshakeWatchdog r1 = com.facebook.aura.gateway.connection.ConnectionEffect.CancelHandshakeWatchdog.INSTANCE
            com.facebook.aura.gateway.connection.ConnectionEffect$CloseTransport r0 = com.facebook.aura.gateway.connection.ConnectionEffect.CloseTransport.INSTANCE
            com.facebook.aura.gateway.connection.ConnectionEffect[] r0 = new com.facebook.aura.gateway.connection.ConnectionEffect[]{r2, r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.facebook.aura.gateway.connection.ConnectionReducer$Reduction r0 = X.AbstractC7607F5u.A0v(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.parkConnectionIfNewlyDisallowed(com.facebook.aura.gateway.connection.ConnectionState, com.facebook.aura.gateway.connection.ConnectionState):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    private final Presence presence(ConnectionState connectionState) {
        return (connectionState.isAssistOverlayActive || connectionState.isAppForeground || connectionState.isBackgroundSessionActive) ? Presence.ACTIVE : Presence.AWAY;
    }

    private final ConnectionPhase.FailureCause privateAuthFailureCause(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
        if (hatchNoiseHandshakeOutcome == null) {
            return null;
        }
        int iOrdinal = hatchNoiseHandshakeOutcome.ordinal();
        if (iOrdinal == 3) {
            return ConnectionPhase.FailureCause.CVM_KEY_REQUIRED;
        }
        if (iOrdinal == 2) {
            return ConnectionPhase.FailureCause.CVM_ENROLLMENT_REQUIRED;
        }
        if (iOrdinal == 4) {
            return ConnectionPhase.FailureCause.CVM_VERIFICATION_FAILED;
        }
        return null;
    }

    public static /* synthetic */ Reduction reduce$default(ConnectionReducer connectionReducer, ConnectionState connectionState, ConnectionEvent connectionEvent, long j, ConnectionConfig connectionConfig, int i, Object obj) {
        if ((i & 8) != 0) {
            connectionConfig = ConnectionConfig.DEFAULT;
        }
        return connectionReducer.reduce(connectionState, connectionEvent, j, connectionConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.connection.ConnectionReducer.Reduction scheduleReconnect(com.facebook.aura.gateway.connection.ConnectionState r32, long r33, com.facebook.aura.gateway.connection.ConnectionConfig r35) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.connection.ConnectionReducer.scheduleReconnect(com.facebook.aura.gateway.connection.ConnectionState, long, com.facebook.aura.gateway.connection.ConnectionConfig):com.facebook.aura.gateway.connection.ConnectionReducer$Reduction");
    }

    private final boolean shouldRefreshVmInventoryOnRetry(ConnectionState connectionState, ConnectionConfig connectionConfig) {
        ReconnectMode reconnectMode = connectionState.reconnectMode;
        return (reconnectMode == ReconnectMode.VM_SUSPENDED || reconnectMode == ReconnectMode.VM_STARTING) && connectionState.reconnectAttempt >= connectionConfig.vmInventoryRefreshAfterFailedAttempts && !connectionState.vmInventoryRefreshAttempted && connectionState.credentialRefreshAttempt < connectionConfig.maxCredentialRefreshAttempts;
    }

    private final ConnectionState withReconnectMode(ConnectionState connectionState, ReconnectMode reconnectMode) {
        return connectionState.reconnectMode == reconnectMode ? connectionState : ConnectionState.copy$default(connectionState, null, 0L, 0, 0, reconnectMode, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048551, null);
    }

    private final boolean withinSubscribeBudget(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        long j2 = connectionState.subscribeStartedAtMs;
        return j2 > 0 && j - j2 < connectionConfig.subscribeAckMaxWaitMs;
    }

    public final Reduction reduce(ConnectionState connectionState, ConnectionEvent connectionEvent, long j, ConnectionConfig connectionConfig) {
        ConnectionState connectionStateCopy$default;
        List listSingletonList;
        C7384Etj.A0Y(connectionState, 0);
        C7384Etj.A0Y(connectionEvent, 1);
        C7384Etj.A0Y(connectionConfig, 3);
        if ((connectionEvent instanceof ConnectionEvent.Epoched) && ((ConnectionEvent.Epoched) connectionEvent).getEpoch() != connectionState.epoch) {
            return new Reduction(connectionState, C0881AGi.A00);
        }
        if (connectionEvent instanceof ConnectionEvent.ConnectRequested) {
            return onConnectRequested(connectionState, (ConnectionEvent.ConnectRequested) connectionEvent, j, connectionConfig);
        }
        if (connectionEvent.equals(ConnectionEvent.DisconnectRequested.INSTANCE)) {
            return onDisconnect(connectionState, ConnectionPhase.Idle.INSTANCE);
        }
        if (!connectionEvent.equals(ConnectionEvent.PauseRequested.INSTANCE)) {
            if (connectionEvent.equals(ConnectionEvent.ResetRequested.INSTANCE)) {
                connectionStateCopy$default = ConnectionState.copy$default(connectionState, ConnectionPhase.Resetting.INSTANCE, 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, false, false, false, false, false, false, false, false, 1048574, null);
                listSingletonList = Collections.singletonList(ConnectionEffect.PerformReset.INSTANCE);
            } else if (connectionEvent instanceof ConnectionEvent.ResetFinished) {
                connectionStateCopy$default = ConnectionState.copy$default(connectionState, ConnectionPhase.Idle.INSTANCE, 0L, 0, 0, null, 0, null, 0, false, 0, false, 0L, true, false, false, false, false, false, false, false, 1044478, null);
                listSingletonList = C0881AGi.A00;
            } else {
                if (connectionEvent instanceof ConnectionEvent.SuspectedDeadConnection) {
                    return onSuspectedDead(connectionState, j, connectionConfig, null);
                }
                if (connectionEvent instanceof ConnectionEvent.KeepaliveTimedOut) {
                    ConnectionEvent.KeepaliveTimedOut keepaliveTimedOut = (ConnectionEvent.KeepaliveTimedOut) connectionEvent;
                    return onSuspectedDead(connectionState, j, connectionConfig, new ConnectionEffect.RecordKeepaliveDrop(keepaliveTimedOut.latePong, keepaliveTimedOut.presence, keepaliveTimedOut.waitMs));
                }
                if (connectionEvent.equals(ConnectionEvent.StorageRecoveryConnected.INSTANCE)) {
                    return onStorageRecoveryConnected(connectionState);
                }
                if (connectionEvent instanceof ConnectionEvent.TransportConnecting) {
                    return onTransportConnecting(connectionState);
                }
                if (connectionEvent instanceof ConnectionEvent.TransportSubscribing) {
                    return onTransportSubscribing(connectionState, j);
                }
                if (connectionEvent instanceof ConnectionEvent.TransportOpened) {
                    return onTransportOpened(connectionState);
                }
                if (connectionEvent instanceof ConnectionEvent.TransportClosed) {
                    return onTransportClosed(connectionState, (ConnectionEvent.TransportClosed) connectionEvent, j, connectionConfig);
                }
                if (connectionEvent instanceof ConnectionEvent.TransportFailed) {
                    ConnectionEvent.TransportFailed transportFailed = (ConnectionEvent.TransportFailed) connectionEvent;
                    return onTransportFailed(connectionState, transportFailed.message, transportFailed.httpCode, transportFailed.noiseHandshakeOutcome, j, connectionConfig);
                }
                if (connectionEvent instanceof ConnectionEvent.UrlUnavailable) {
                    return onUrlUnavailable(connectionState, (ConnectionEvent.UrlUnavailable) connectionEvent);
                }
                if (!(connectionEvent instanceof ConnectionEvent.PauseDetected)) {
                    if (connectionEvent instanceof ConnectionEvent.VmStateResolved) {
                        return onVmStateResolved(connectionState, (ConnectionEvent.VmStateResolved) connectionEvent);
                    }
                    if (connectionEvent instanceof ConnectionEvent.ReconnectTimerFired) {
                        return onReconnectTimerFired(connectionState, connectionConfig);
                    }
                    if (connectionEvent instanceof ConnectionEvent.KeepaliveTick) {
                        return onKeepaliveTick(connectionState);
                    }
                    if (connectionEvent instanceof ConnectionEvent.StabilityElapsed) {
                        return onStabilityElapsed(connectionState);
                    }
                    if (connectionEvent instanceof ConnectionEvent.HandshakeStalled) {
                        return onTransportFailed(connectionState, HatchGatewayConnectionKt.ERROR_TYPE_HANDSHAKE_TIMEOUT, null, null, j, connectionConfig);
                    }
                    if (connectionEvent instanceof ConnectionEvent.SubscribeAckStalled) {
                        return onSubscribeAckStalled(connectionState, j, connectionConfig);
                    }
                    if (connectionEvent.equals(ConnectionEvent.ExhaustionCooldownElapsed.INSTANCE)) {
                        return onExhaustionCooldownElapsed(connectionState, j, connectionConfig);
                    }
                    if (connectionEvent instanceof ConnectionEvent.NetworkChanged) {
                        return onNetworkChanged(connectionState, (ConnectionEvent.NetworkChanged) connectionEvent, j, connectionConfig);
                    }
                    if (connectionEvent.equals(ConnectionEvent.NetworkRecovered.INSTANCE)) {
                        return onNetworkRecovered(connectionState, j, connectionConfig);
                    }
                    if (connectionEvent instanceof ConnectionEvent.LifecycleChanged) {
                        return onLifecycleChanged(connectionState, (ConnectionEvent.LifecycleChanged) connectionEvent, j, connectionConfig);
                    }
                    if (connectionEvent instanceof ConnectionEvent.ServiceNoticeReceived) {
                        return onServiceNotice(connectionState, (ConnectionEvent.ServiceNoticeReceived) connectionEvent);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return new Reduction(connectionStateCopy$default, listSingletonList);
        }
        return onDisconnect(connectionState, ConnectionPhase.Paused.INSTANCE);
    }

    private final List<ConnectionEffect> cancelConnectAttemptEffects(ConnectionState connectionState, ConnectAttemptCancellation connectAttemptCancellation) {
        return hasReportableConnectTrace(connectionState) ? Collections.singletonList(new ConnectionEffect.CancelConnectAttempt(connectAttemptCancellation)) : C0881AGi.A00;
    }

    private final int cycleAfterDrop(ConnectionState connectionState) {
        return (AbstractC7607F5u.A1V(connectionState) || C7384Etj.areEqual(connectionState.phase, ConnectionPhase.StorageRecoveryConnected.INSTANCE)) ? connectionState.connectionCycle + 1 : connectionState.connectionCycle;
    }

    private final boolean hasReportableConnectTrace(ConnectionState connectionState) {
        return hasConnectAttemptInFlight(connectionState) || connectionState.vmWakeWaitStartedAtMs != null;
    }

    private final Reduction onForegrounded(ConnectionState connectionState, long j, ConnectionConfig connectionConfig) {
        List listAsList;
        if (AbstractC7607F5u.A1V(connectionState)) {
            listAsList = Arrays.asList(new ConnectionEffect.SendKeepalivePing(presence(connectionState)), ConnectionEffect.CancelKeepaliveTimer.INSTANCE, new ConnectionEffect.ScheduleKeepaliveTimer(connectionState.epoch));
        } else {
            if (!connectionState.intentionalDisconnect) {
                ConnectionPhase connectionPhase = connectionState.phase;
                if ((C7384Etj.areEqual(connectionPhase, ConnectionPhase.Idle.INSTANCE) || C7384Etj.areEqual(connectionPhase, ConnectionPhase.Offline.INSTANCE) || (connectionPhase instanceof ConnectionPhase.Failed) || (connectionPhase instanceof ConnectionPhase.Reconnecting)) && connectionState.isOnline) {
                    return beginConnect(connectionState, j, connectionConfig);
                }
            }
            listAsList = C0881AGi.A00;
        }
        return AbstractC7607F5u.A0v(connectionState, listAsList);
    }

    private final Reduction onKeepaliveTick(ConnectionState connectionState) {
        return AbstractC7607F5u.A0v(connectionState, AbstractC7607F5u.A1V(connectionState) ? Arrays.asList(new ConnectionEffect.SendKeepalivePing(presence(connectionState)), new ConnectionEffect.ScheduleKeepaliveTimer(connectionState.epoch)) : C0881AGi.A00);
    }

    private final Reduction onTransportSubscribing(ConnectionState connectionState, long j) {
        return AbstractC7607F5u.A0v(ConnectionState.copy$default(connectionState, null, 0L, 0, 0, null, 0, null, 0, false, 0, false, j, false, false, false, false, false, false, false, false, 1046527, null), Collections.singletonList(new ConnectionEffect.StartSubscribeWatchdog(connectionState.epoch)));
    }

    private final Reduction onWorkStarted(ConnectionState connectionState, boolean z, long j, ConnectionConfig connectionConfig) {
        List listSingletonList;
        if (hasConnectAttemptInFlight(connectionState)) {
            listSingletonList = C0881AGi.A00;
        } else {
            ConnectionPhase connectionPhase = connectionState.phase;
            if (C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connected.INSTANCE)) {
                if (z) {
                    listSingletonList = Collections.singletonList(new ConnectionEffect.SendKeepalivePing(presence(connectionState)));
                }
            } else if ((C7384Etj.areEqual(connectionPhase, ConnectionPhase.Idle.INSTANCE) || C7384Etj.areEqual(connectionPhase, ConnectionPhase.Offline.INSTANCE) || (connectionPhase instanceof ConnectionPhase.Failed) || (connectionPhase instanceof ConnectionPhase.Reconnecting)) && connectionState.isOnline && !connectionState.intentionalDisconnect) {
                return beginConnect(connectionState, j, connectionConfig);
            }
            listSingletonList = C0881AGi.A00;
        }
        return AbstractC7607F5u.A0v(connectionState, listSingletonList);
    }
}

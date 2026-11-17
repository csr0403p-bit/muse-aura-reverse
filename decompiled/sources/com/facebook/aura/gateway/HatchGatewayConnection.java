package com.facebook.aura.gateway;

import X.A3q;
import X.AGH;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.BQG;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C0881AGi;
import X.C10533Hqc;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C2nw;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pd;
import X.C4oT;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C7Je;
import X.C7qW;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.F0C;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GDB;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzC;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC3137BzH;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.analytics.hatch.HatchVmLoggingContext;
import com.facebook.aura.analytics.impl.MetaAnalyticsInstance;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.components.reactions.AuraVictoryGleamKt;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.conversation.data.ChatHistoryFetchResult;
import com.facebook.aura.conversation.data.HatchSearchResult;
import com.facebook.aura.gateway.HatchAiIdentityHandler;
import com.facebook.aura.gateway.HatchCvmAuthenticationState;
import com.facebook.aura.gateway.HatchGatewayConnectionLogger;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.connection.ConnectAttemptCancellation;
import com.facebook.aura.gateway.connection.ConnectRequestResult;
import com.facebook.aura.gateway.connection.ConnectionConfig;
import com.facebook.aura.gateway.connection.ConnectionEngine;
import com.facebook.aura.gateway.connection.ConnectionEngineHost;
import com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot;
import com.facebook.aura.gateway.connection.ConnectionPhase;
import com.facebook.aura.gateway.connection.ConnectionPhaseSnapshot;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;
import com.facebook.aura.gateway.connection.Presence;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.HatchAttachment;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchSubAgent;
import com.facebook.aura.model.ReplyElementSupport;
import com.facebook.aura.network.api.RpcMethod;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.network.state.AuraNetworkState;
import com.facebook.aura.network.transport.HatchConnectTimeout;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsFailure;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.crudolib.prefs.LightSharedPreferencesImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HatchGatewayConnection implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final int CLOSE_NORMAL = 1000;
    public static final Companion Companion = new Companion();
    public final C3Em<ConnectionClosed> _connectionClosedEvents;
    public final BLG<HatchGatewayConnectionState> _connectionState;
    public final BLG<HatchCvmAuthenticationState> _cvmAuthenticationState;
    public final BLG<HatchGatewayStateSnapshot> _gatewayState;
    public final BLG<Boolean> _serviceRestartPending;
    public final BLG<Boolean> _storageRecoveryConnected;
    public volatile GatewayTransportSession activeSession;
    public volatile boolean assistOverlayActive;
    public volatile boolean cleared;
    public final C22I<ConnectionClosed> connectionClosedEvents;
    public final C1BN<HatchGatewayConnectionState> connectionState;
    public volatile String currentEffectiveWsUrl;
    public String currentWsUrl;
    public final C1BN<HatchCvmAuthenticationState> cvmAuthenticationState;
    public final F0C engine$delegate;
    public final GatewayConnectionEngineHost engineHost;
    public final F0C eventsHandler$delegate;
    public final C4oT gatewayPrefs;
    public final InterfaceC3137BzH gatewayRouteListener;
    public final C1BN<HatchGatewayStateSnapshot> gatewayState;
    public ConnectionPhase lastPhase;
    public final HatchGatewayConnectionLogger logger;
    public final JarvisProtocol protocol;
    public final C3UX scope;
    public final AtomicBoolean serviceNoticeShowing;
    public long serviceRestartNoticeCount;
    public final C1BN<Boolean> serviceRestartPending;
    public final C1BN<Boolean> storageRecoveryConnected;
    public volatile HatchWebSocketSession transport;
    public final AbstractC3358CGz userSession;
    public final HatchVmDisabledStore vmDisabledStore;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$1", f = "HatchGatewayConnection.kt", l = {493}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayConnection.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<Boolean> c20q = AuraAppLifecycleManager.isAppInForegroundImmediateFlow;
                final HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchGatewayConnection.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z) {
                            hatchGatewayConnection.serviceNoticeShowing.set(false);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGatewayConnection.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: classes5.dex */
    public final class GatewayConnectionEngineHost implements ConnectionEngineHost {
        public volatile AttemptContinuity attemptContinuity;
        public String connectVmAttemptVmId;
        public volatile String connectedVmId;
        public volatile GatewayConnectionCycleStart connectionCycleStart;
        public volatile DeferredBadGatewayDiagnostics deferredBadGatewayDiagnostics;
        public boolean isConnectVmOpen;
        public volatile String lastAttemptedVmId;
        public volatile Integer lastCloseCode;
        public volatile HoC openJob;
        public final SingleFlight vmStateRefreshSingleFlight;
        public volatile String connectionAttemptId = BV5.A0j();
        public volatile int connectionAttemptIdCycle = -1;
        public final Object attemptContinuityLock = C3cG.A0T();
        public volatile int lastVmStateRefreshConnectionCycle = -1;
        public final Object connectVmLock = C3cG.A0T();
        public volatile long openEpoch = -1;
        public volatile long noActiveDemandEpoch = -1;
        public volatile GatewayConnectStage connectStage = GatewayConnectStage.UNKNOWN;
        public volatile List<? extends HoC> sessionCollectorJobs = C0881AGi.A00;

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleOpen(GatewayTransportSession gatewayTransportSession, long j, String str, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, PinnedHostData pinnedHostData, String str2, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, Function0<Unit> function0, G0U<? super String, Unit> g0u, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w) {
            String strVmAuthTokenForGatewayUrl;
            int iOrdinal;
            if (hatchNoiseHandshakeOutcome != null && (iOrdinal = hatchNoiseHandshakeOutcome.ordinal()) != -1) {
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 3 && iOrdinal != 2 && iOrdinal != 4) {
                            throw C3cG.A0q();
                        }
                        handleFailure(gatewayTransportSession, j, str, noisePrivateAuthAttempt, hatchVmConfidentiality, new HatchWsFailure(BV4.A0K("noise.handshake.invalid_open_outcome"), null, AGH.A0E(), hatchNoiseHandshakeOutcome, null, null, false), g0w, null);
                        return;
                    }
                    recordVmConfidentiality(str, HatchVmConfidentiality.CONFIDENTIAL, HatcheryVMIdUtilsKt.extractHatcheryVMId(str));
                    settleLegacySecret(pinnedHostData, HatchGatewayConnectionKt.attestedHostDataVerdict(noisePrivateAuthAttempt, hatchNoiseHandshakeOutcome, null));
                } else if (HatchGatewayConnectionKt.isLegacyPeerDowngrade(hatchVmConfidentiality)) {
                    handleFailure(gatewayTransportSession, j, str, noisePrivateAuthAttempt, hatchVmConfidentiality, new HatchWsFailure(BV4.A0K("noise.handshake.private_auth.downgrade_detected"), null, AGH.A0E(), HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, null, null, false), g0w, null);
                    return;
                } else {
                    if (hatchVmConfidentiality == HatchVmConfidentiality.UNKNOWN) {
                        recordVmConfidentiality(str, HatchVmConfidentiality.STANDARD, null);
                    }
                    HatchGatewayConnection.this.updateGatewayState(HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$1.INSTANCE);
                }
            }
            HatchGatewayConnection.this.logger.logPoint(HatchGatewayConnectionLogger.Point.WS_CONNECT_END);
            this.connectStage = GatewayConnectStage.AWAITING_SUBSCRIBE_ACK;
            BV5.A1G(this, HatchGatewayConnection.this);
            function0.invoke();
            CFK.A03(str2 == null ? "none" : str2, HatchGatewayConnectionKt.TAG, "WebSocket transport opened (connId=%s); awaiting chat.subscribe ack");
            HatchGatewayConnection.this.logger.logPoint(HatchGatewayConnectionLogger.Point.CHAT_SUBSCRIBE_START);
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            JarvisProtocol jarvisProtocol = hatchGatewayConnection.protocol;
            HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$2 hatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$2 = new HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$2(hatchGatewayConnection);
            String str3 = hatchGatewayConnection.currentWsUrl;
            if (str3 == null || (strVmAuthTokenForGatewayUrl = VmAuthTokenKt.vmAuthTokenForGatewayUrl(str3)) == null) {
                strVmAuthTokenForGatewayUrl = "";
            }
            jarvisProtocol.onWebSocketOpened(hatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$2, strVmAuthTokenForGatewayUrl, new HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$4(hatchNoiseHandshakeOutcome, str, this, gatewayTransportSession, j, noisePrivateAuthAttempt, hatchVmConfidentiality, g0w, HatchGatewayConnection.this, str2, g0u));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logWebSocketMilestonesIfAvailable(GatewayTransportSession gatewayTransportSession) {
            logTransportReadyIfAvailable(gatewayTransportSession, null);
            logWebSocketUpgradeIfAvailable(gatewayTransportSession, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void startMarker(int i) {
            if (i != this.connectionAttemptIdCycle) {
                startAttemptCycle();
                this.connectionAttemptIdCycle = i;
            } else {
                noteAttemptActivity();
            }
            logConnectVmAttempt();
            AttemptContinuity attemptContinuity = this.attemptContinuity;
            int i2 = attemptContinuity != null ? attemptContinuity.cycle : 1;
            boolean runInBackgroundEnabled = HatchGatewayPrefsStore.Companion.getInstance(HatchGatewayConnection.this.userSession).getRunInBackgroundEnabled();
            ConnectionPhase value = HatchGatewayConnection.this.getEngine().phase.getValue();
            boolean z = value instanceof ConnectionPhase.Reconnecting;
            HatchGatewayConnectionLogger hatchGatewayConnectionLogger = HatchGatewayConnection.this.logger;
            if (z) {
                hatchGatewayConnectionLogger.startReconnectMarker(((ConnectionPhase.Reconnecting) value).attempt, this.lastCloseCode, this.connectionAttemptId, i2, HatchGatewayConnection.this.getEngine().connectSourceTracker.value, ((CH0) HatchGatewayConnection.this.userSession).A01, runInBackgroundEnabled);
            } else {
                hatchGatewayConnectionLogger.startMarker(this.connectionAttemptId, i2, HatchGatewayConnection.this.getEngine().connectSourceTracker.value, ((CH0) HatchGatewayConnection.this.userSession).A01, runInBackgroundEnabled);
            }
            BV5.A1G(this, HatchGatewayConnection.this);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void cancelConnectAttempt(ConnectAttemptCancellation connectAttemptCancellation) {
            HatchGatewayConnectionLogger.CancellationReason cancellationReason;
            C7384Etj.A0Y(connectAttemptCancellation, 0);
            GatewayTransportSession gatewayTransportSession = HatchGatewayConnection.this.activeSession;
            if (gatewayTransportSession != null) {
                logWebSocketMilestonesIfAvailable(gatewayTransportSession);
            }
            int iOrdinal = connectAttemptCancellation.ordinal();
            if (iOrdinal == 0) {
                cancellationReason = HatchGatewayConnectionLogger.CancellationReason.SUPERSEDED;
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                cancellationReason = HatchGatewayConnectionLogger.CancellationReason.NETWORK_UNAVAILABLE;
            }
            CFK.A00(cancellationReason.getValue(), this.connectStage.getConnectPhase(), Integer.valueOf(currentRetryCount()), this.connectionAttemptId, HatchGatewayConnectionKt.TAG, "Gateway connect attempt cancelled (reason=%s phase=%s retryCount=%d sessionId=%s)");
            HatchGatewayConnection.this.logger.logCancel(cancellationReason);
            noteAttemptActivity();
        }

        public final void clearUserData() {
            this.connectionAttemptIdCycle = -1;
            synchronized (this.connectVmLock) {
                this.isConnectVmOpen = false;
                this.connectVmAttemptVmId = null;
            }
            endAttemptContinuity();
            this.connectionCycleStart = null;
            this.lastVmStateRefreshConnectionCycle = -1;
            this.vmStateRefreshSingleFlight.clearAndCancelAll();
            this.lastAttemptedVmId = null;
            this.connectedVmId = null;
            this.noActiveDemandEpoch = -1L;
            this.deferredBadGatewayDiagnostics = null;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void emitConnectionClosed(int i, String str) {
            C7384Etj.A0Y(str, 1);
            HatchGatewayConnection.this.logger.logFailure(HatchGatewayConnectionLogger.FailureReason.SERVER_CLOSE, null, null, null, Integer.valueOf(i), "connected", null);
            HatchGatewayConnection.this._connectionClosedEvents.AhV(new ConnectionClosed(i, BQG.A17(str, 200)));
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void failConnectAttempt(String str, String str2) {
            String timeoutDetail = str2;
            AnonymousClass003.A0u(str, str2);
            GatewayTransportSession gatewayTransportSession = HatchGatewayConnection.this.activeSession;
            if (gatewayTransportSession != null) {
                logWebSocketMilestonesIfAvailable(gatewayTransportSession);
            }
            if (str.equals(HatchGatewayConnectionKt.ERROR_TYPE_HANDSHAKE_TIMEOUT)) {
                timeoutDetail = this.connectStage.getTimeoutDetail();
            }
            String strResolveGatewayConnectFailureErrorType = HatchGatewayConnectionKt.resolveGatewayConnectFailureErrorType(str, this.connectStage);
            logConnectFailure(strResolveGatewayConnectFailureErrorType, timeoutDetail);
            HatchGatewayConnection.this.logger.logFailure(ConnectionReducerKt.CONNECT_ERROR_TYPE_STORAGE_RECOVERY.equals(strResolveGatewayConnectFailureErrorType) ? HatchGatewayConnectionLogger.FailureReason.STORAGE_RECOVERY_REQUIRED : HatchGatewayConnectionLogger.FailureReason.TIMEOUT, strResolveGatewayConnectFailureErrorType, timeoutDetail, null, null, this.connectStage.getConnectPhase(), null);
            noteAttemptActivity();
        }

        public final void logConnectVmOutcome(HatchClientCvmOutcome hatchClientCvmOutcome) {
            C7384Etj.A0Y(hatchClientCvmOutcome, 0);
            HatchClientCvmEventLogger hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
            String strCurrentCvmVmId = hatchClientCvmEventLogger.currentCvmVmId();
            synchronized (this.connectVmLock) {
                if (this.isConnectVmOpen || hatchClientCvmOutcome != HatchClientCvmOutcome.FAILURE) {
                    this.isConnectVmOpen = false;
                    String str = this.connectVmAttemptVmId;
                    this.connectVmAttemptVmId = null;
                    if (strCurrentCvmVmId != null) {
                        if (!strCurrentCvmVmId.equals(str)) {
                            hatchClientCvmEventLogger.logConnectVm(HatchClientCvmOutcome.ATTEMPT);
                        }
                        hatchClientCvmEventLogger.logConnectVm(hatchClientCvmOutcome);
                    }
                }
            }
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void openTransport(long j, int i, boolean z, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, G0V<? super Integer, ? super String, Unit> g0v, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, G0V<? super String, ? super String, Unit> g0v2) {
            AnonymousClass002.A1C(function0, 3, function02);
            AnonymousClass005.A0z(g0u, g0v, g0w);
            C7384Etj.A0Y(g0v2, 8);
            GatewayConnectionCycleStart gatewayConnectionCycleStart = this.connectionCycleStart;
            if (gatewayConnectionCycleStart == null || gatewayConnectionCycleStart.connectionCycle != i) {
                this.connectionCycleStart = new GatewayConnectionCycleStart(i, System.nanoTime(), System.currentTimeMillis());
            }
            HoC hoC = this.openJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.openEpoch = j;
            this.deferredBadGatewayDiagnostics = null;
            this.connectStage = GatewayConnectStage.RESOLVING_GATEWAY_URL;
            String str = z ? HatchGatewayConnection.this.getEngine().phase.getValue() instanceof ConnectionPhase.Reconnecting ? "reconnect_recovery" : "auth_401" : null;
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            this.openJob = AnonymousClass001.A11(new HatchGatewayConnection$GatewayConnectionEngineHost$openTransport$1(hatchGatewayConnection, g0v2, z, this, j, i, str, g0w, function0, function02, g0u, g0v, null), hatchGatewayConnection.scope);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void performReset(G0U<? super Boolean, Unit> g0u) {
            C7384Etj.A0Y(g0u, 0);
            AnonymousClass001.A1K(true, g0u);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void recordKeepaliveDrop(boolean z, Presence presence, long j) {
            C7384Etj.A0Y(presence, 1);
            HatchGatewayConnection.this.logger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(HatchGatewayConnectionLogger.DisconnectReason.KEEPALIVE_TIMEOUT, z ? "late_pong" : null, false, null, new HatchGatewayConnectionLogger.KeepaliveDropDetail(HatchGatewayConnectionKt.getWireValue(presence), j));
        }

        public final void refreshVmStateForSubscribe(String str) {
            C7384Etj.A0Y(str, 0);
            ConnectionPhaseSnapshot value = HatchGatewayConnection.this.getEngine().phaseSnapshot.getValue();
            ConnectionPhase connectionPhase = value.phase;
            if ((connectionPhase instanceof ConnectionPhase.Connecting) || (connectionPhase instanceof ConnectionPhase.Reconnecting)) {
                int i = value.connectionCycle;
                long j = this.openEpoch;
                if (j >= 0) {
                    HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
                    AnonymousClass001.A1J(new HatchGatewayConnection$GatewayConnectionEngineHost$refreshVmStateForSubscribe$1(this, i, str, j, hatchGatewayConnection, null), hatchGatewayConnection.scope);
                }
            }
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void runPauseStatusCheck(long j, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 1);
            if (HatchLockGating.INSTANCE.isEnabled()) {
                HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
                AnonymousClass001.A1J(new HatchGatewayConnection$GatewayConnectionEngineHost$runPauseStatusCheck$1(hatchGatewayConnection, function0, null), hatchGatewayConnection.scope);
            }
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[HatchNoiseHandshakeOutcome.values().length];
                try {
                    AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED, iArr, 1);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED, iArr, 2);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HatchNoiseHandshakeOutcome.KEY_REQUIRED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ConnectAttemptCancellation.values().length];
                try {
                    AnonymousClass005.A0v(ConnectAttemptCancellation.SUPERSEDED, iArr2, 1);
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    AnonymousClass005.A0v(ConnectAttemptCancellation.NETWORK_UNAVAILABLE, iArr2, 2);
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public GatewayConnectionEngineHost() {
            this.vmStateRefreshSingleFlight = SingleFlightKt.SingleFlight(HatchGatewayConnection.this.userSession, OnDuplicateCall.Join.INSTANCE, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void annotateCredentialState(com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult r6, java.lang.String r7, java.lang.String r8) {
            /*
                r5 = this;
                boolean r1 = r6 instanceof com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success
                r0 = 0
                if (r1 == 0) goto L7e
                r4 = r6
                com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Success r4 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success) r4
            L8:
                if (r6 == 0) goto Le
                com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Failure r0 = r6.asFailure()
            Le:
                if (r4 == 0) goto L75
                int r0 = r4.validUrlCount
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                int r0 = r4.validCredentialCount
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            L1c:
                com.facebook.aura.gateway.HatchGatewayConnection r2 = com.facebook.aura.gateway.HatchGatewayConnection.this
                int r1 = r1.intValue()
                com.facebook.aura.gateway.HatchGatewayConnectionLogger r3 = r2.logger
                java.lang.String r2 = "valid_url_count"
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r3.annotate(r2, r1)
            L2e:
                if (r0 == 0) goto L42
                com.facebook.aura.gateway.HatchGatewayConnection r1 = com.facebook.aura.gateway.HatchGatewayConnection.this
                int r0 = r0.intValue()
                com.facebook.aura.gateway.HatchGatewayConnectionLogger r2 = r1.logger
                java.lang.String r1 = "valid_credential_count"
                java.lang.String r0 = java.lang.String.valueOf(r0)
                r2.annotate(r1, r0)
            L42:
                if (r4 == 0) goto L51
                java.lang.String r2 = r4.fallbackBackendErrorCode
                if (r2 == 0) goto L51
                com.facebook.aura.gateway.HatchGatewayConnection r0 = com.facebook.aura.gateway.HatchGatewayConnection.this
                com.facebook.aura.gateway.HatchGatewayConnectionLogger r1 = r0.logger
                java.lang.String r0 = "fallback_backend_error_code"
                r1.annotate(r0, r2)
            L51:
                com.facebook.aura.gateway.HatchGatewayConnection r0 = com.facebook.aura.gateway.HatchGatewayConnection.this
                com.facebook.aura.gateway.HatchGatewayConnectionLogger r2 = r0.logger
                if (r7 == 0) goto L72
                int r0 = r7.length()
                if (r0 == 0) goto L72
                java.lang.String r1 = "vm_auth_token"
            L60:
                java.lang.String r0 = "token_source"
                r2.annotate(r0, r1)
                if (r8 == 0) goto L71
                com.facebook.aura.gateway.HatchGatewayConnection r0 = com.facebook.aura.gateway.HatchGatewayConnection.this
                com.facebook.aura.gateway.HatchGatewayConnectionLogger r1 = r0.logger
                java.lang.String r0 = "credential_failure_detail"
                r1.annotate(r0, r8)
            L71:
                return
            L72:
                java.lang.String r1 = "missing"
                goto L60
            L75:
                if (r0 == 0) goto L51
                java.lang.Integer r1 = r0.validUrlCount
                java.lang.Integer r0 = r0.validCredentialCount
                if (r1 == 0) goto L2e
                goto L1c
            L7e:
                r4 = r0
                goto L8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.annotateCredentialState(com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult, java.lang.String, java.lang.String):void");
        }

        public static /* synthetic */ void annotateCredentialState$default(GatewayConnectionEngineHost gatewayConnectionEngineHost, HatchVmRepository.FetchAndCacheLeasedVmResult fetchAndCacheLeasedVmResult, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            gatewayConnectionEngineHost.annotateCredentialState(fetchAndCacheLeasedVmResult, str, str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object awaitPongOrEnd(X.HoC r8, com.facebook.aura.gateway.GatewayTransportSession r9, X.HtJ<? super kotlin.Unit> r10) {
            /*
                r7 = this;
                boolean r0 = r10 instanceof com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1
                if (r0 == 0) goto L5d
                r6 = r10
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1 r6 = (com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L5d
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r1 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L23
                if (r0 != r4) goto L63
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L23:
                X.Hwg.A00(r1)
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C9273GCa.A05
                X.78T r0 = r6.getContext()
                X.GCa r3 = new X.GCa
                r3.<init>(r0)
                X.GCk r1 = r8.AIE()
                r2 = 0
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1 r0 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$1
                r0.<init>(r2)
                r3.A06(r0, r1)
                X.Hsz<kotlin.Unit> r0 = r9.ended
                X.GBM r0 = (X.GBM) r0
                X.GCl r1 = r0.A0H()
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2 r0 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$2$2
                r0.<init>(r2)
                r3.A07(r0, r1)
                r6.L$0 = r2
                r6.L$1 = r2
                r6.L$2 = r2
                r6.label = r4
                java.lang.Object r0 = X.C9273GCa.A03(r6, r3)
                if (r0 != r5) goto L20
                return r5
            L5d:
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1 r6 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1
                r6.<init>(r7, r10)
                goto L12
            L63:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.awaitPongOrEnd(X.HoC, com.facebook.aura.gateway.GatewayTransportSession, X.HtJ):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008a -> B:12:0x003f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object awaitPongWhileReceiving(X.HoC r16, com.facebook.aura.gateway.GatewayTransportSession r17, long r18, X.HtJ<? super java.lang.Boolean> r20) {
            /*
                r15 = this;
                r5 = r20
                r2 = r18
                r10 = r17
                r13 = r16
                boolean r0 = r5 instanceof com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$1
                r20 = r15
                if (r0 == 0) goto La5
                r11 = r5
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$1 r11 = (com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$1) r11
                int r4 = r11.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r4 & r1
                if (r0 == 0) goto La5
                int r4 = r4 - r1
                r11.label = r4
            L1c:
                java.lang.Object r1 = r11.result
                X.Hji r14 = X.EnumC10460Hji.A02
                int r4 = r11.label
                r19 = 1
                if (r4 == 0) goto L8d
                r0 = r19
                if (r4 != r0) goto Lb5
                int r12 = r11.I$0
                long r8 = r11.J$3
                long r6 = r11.J$2
                long r4 = r11.J$1
                long r2 = r11.J$0
                java.lang.Object r10 = r11.L$1
                com.facebook.aura.gateway.GatewayTransportSession r10 = (com.facebook.aura.gateway.GatewayTransportSession) r10
                java.lang.Object r13 = r11.L$0
                X.HoC r13 = (X.HoC) r13
                X.Hwg.A00(r1)
            L3f:
                if (r1 != 0) goto Lac
                long r0 = r10.lastFrameAtNs
                long r0 = r0 + r4
                long r15 = java.lang.Math.min(r0, r6)
                int r0 = (r15 > r8 ? 1 : (r15 == r8 ? 0 : -1))
                if (r0 <= 0) goto Lac
                if (r12 != 0) goto L55
                java.lang.String r1 = "HatchGatewayConnection"
                java.lang.String r0 = "Keepalive pong late, but frames kept arriving; waiting for it"
                X.CFK.A06(r1, r0)
            L55:
                r8 = r15
                r12 = 1
            L57:
                long r15 = java.lang.System.nanoTime()
                long r0 = r8 - r15
                long r17 = X.BV4.A05(r0)
                r0 = 0
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2 r16 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2
                r15 = r0
                r1 = r16
                r0 = r20
                r1.<init>(r0, r13, r10, r15)
                r11.L$0 = r13
                r11.L$1 = r10
                r11.J$0 = r2
                r11.J$1 = r4
                r11.J$2 = r6
                r11.J$3 = r8
                r11.I$0 = r12
                r0 = r17
                r11.J$4 = r0
                r0 = r19
                r11.label = r0
                r15 = r16
                r0 = r17
                java.lang.Object r1 = X.GAX.A01(r11, r15, r0)
                if (r1 != r14) goto L3f
                return r14
            L8d:
                X.Hwg.A00(r1)
                r0 = 120000000000(0x1bf08eb000, double:5.9287877501E-313)
                long r6 = r2 + r0
                r0 = 15000000000(0x37e11d600, double:7.4109846876E-314)
                long r8 = r2 + r0
                r4 = 15000000000(0x37e11d600, double:7.4109846876E-314)
                r12 = 0
                goto L57
            La5:
                com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$1 r11 = new com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$1
                r11.<init>(r15, r5)
                goto L1c
            Lac:
                boolean r0 = X.AnonymousClass002.A1L(r12)
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
                return r14
            Lb5:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.awaitPongWhileReceiving(X.HoC, com.facebook.aura.gateway.GatewayTransportSession, long, X.HtJ):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HatchGatewayConnectionLogger.FailureReason credentialFailureReason(HatchVmRepository.FetchAndCacheLeasedVmResult.Failure failure, boolean z) {
            if (!z) {
                String str = failure.errorType;
                if (HatchVmRepositoryKt.ERROR_TYPE_NO_VALID_VM_CREDENTIAL.equals(str)) {
                    return HatchGatewayConnectionLogger.FailureReason.NO_VALID_VM_CREDENTIAL;
                }
                if (HatchVmRepositoryKt.ERROR_TYPE_NO_VALID_VM_URL.equals(str)) {
                    return HatchGatewayConnectionLogger.FailureReason.NO_VALID_VM_URL;
                }
            }
            return HatchGatewayConnectionLogger.FailureReason.CREDENTIAL_FETCH_FAILED;
        }

        private final String currentConnectPhase() {
            return this.connectStage.getConnectPhase();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int currentRetryCount() {
            ConnectionPhase value = HatchGatewayConnection.this.getEngine().phase.getValue();
            if (C7384Etj.areEqual(value, ConnectionPhase.Connecting.INSTANCE) || C7384Etj.areEqual(value, ConnectionPhase.StorageRecoveryConnected.INSTANCE)) {
                return 0;
            }
            if (value instanceof ConnectionPhase.Reconnecting) {
                return ((ConnectionPhase.Reconnecting) value).attempt;
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void endAttemptContinuity() {
            synchronized (this.attemptContinuityLock) {
                this.attemptContinuity = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleFailure(GatewayTransportSession gatewayTransportSession, long j, String str, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, HatchWsFailure hatchWsFailure, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, PinnedHostData pinnedHostData) {
            HatchGatewayConnectionLogger.FailureReason failureReasonClassifyFailureReason;
            String strA0Y;
            int iIntValue;
            String strExtractHatcheryVMId;
            Throwable th = hatchWsFailure.cause;
            String message = hatchWsFailure.logDiagnostic;
            if (message != null) {
                String message2 = th.getMessage();
                if (message2 != null) {
                    message = FGI.A0U(message2, "; ", message);
                }
            } else {
                message = th.getMessage();
            }
            HatchConnectTimeout hatchConnectTimeout = hatchWsFailure.connectTimeout;
            if (hatchConnectTimeout != null) {
                HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
                this.connectStage = HatchGatewayConnectionKt.getGatewayConnectStage(hatchConnectTimeout);
                BV5.A1G(this, hatchGatewayConnection);
                hatchGatewayConnection.logger.annotate(HatchGatewayConnectionKt.ANNOTATION_CONNECT_TIMEOUT_BUDGET_MS, hatchConnectTimeout.getTimeoutMs());
                Integer elapsedMs = hatchConnectTimeout.getElapsedMs();
                if (elapsedMs != null) {
                    hatchGatewayConnection.logger.annotate(HatchGatewayConnectionKt.ANNOTATION_CONNECT_TIMEOUT_ELAPSED_MS, elapsedMs.intValue());
                }
            }
            HatchGatewayConnectionLogger hatchGatewayConnectionLogger = HatchGatewayConnection.this.logger;
            hatchGatewayConnectionLogger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(hatchGatewayConnectionLogger.classifyDisconnectReason(hatchWsFailure), HatchGatewayConnection.this.logger.disconnectDetail(hatchWsFailure), false, HatchGatewayConnection.this.logger.transportDropDetail$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(hatchWsFailure), null);
            CFK.A08(HatchGatewayConnectionKt.TAG, FGI.A0M("WebSocket failure: ", message), th);
            boolean zIsCvmCredentialRequired = HatchGatewayConnectionKt.isCvmCredentialRequired(hatchWsFailure.noiseHandshakeOutcome);
            if (hatchConnectTimeout != null) {
                failureReasonClassifyFailureReason = HatchGatewayConnectionLogger.FailureReason.TIMEOUT;
            } else if (zIsCvmCredentialRequired) {
                failureReasonClassifyFailureReason = HatchGatewayConnectionLogger.FailureReason.CVM_CREDENTIAL_REQUIRED;
            } else {
                HatchGatewayConnection hatchGatewayConnection2 = HatchGatewayConnection.this;
                failureReasonClassifyFailureReason = hatchGatewayConnection2.logger.classifyFailureReason(th, hatchGatewayConnection2.hasValidatedInternetForLogging(), hatchWsFailure.httpCode);
            }
            Integer num = hatchWsFailure.httpCode;
            if (num == null || num.intValue() != 502 || hatchConnectTimeout != null || zIsCvmCredentialRequired) {
                HatchGatewayConnectionLogger hatchGatewayConnectionLogger2 = HatchGatewayConnection.this.logger;
                if (hatchConnectTimeout == null || (strA0Y = hatchConnectTimeout.getErrorType()) == null) {
                    strA0Y = C3cI.A0Y(th);
                }
                hatchGatewayConnectionLogger2.logFailure(failureReasonClassifyFailureReason, strA0Y, message, hatchWsFailure.httpCode, null, this.connectStage.getConnectPhase(), failureReasonClassifyFailureReason.getValue());
                if (zIsCvmCredentialRequired && hatchConnectTimeout == null) {
                    endAttemptContinuity();
                } else {
                    noteAttemptActivity();
                }
            } else {
                String strA0Y2 = C3cI.A0Y(th);
                if (message == null) {
                    message = strA0Y2;
                }
                this.deferredBadGatewayDiagnostics = new DeferredBadGatewayDiagnostics(j, strA0Y2, message);
            }
            NoiseFailureDisposition noiseFailureDispositionClassifyNoiseFailure = HatchGatewayConnectionKt.classifyNoiseFailure(noisePrivateAuthAttempt, hatchVmConfidentiality, hatchWsFailure.noiseHandshakeOutcome, th.getMessage());
            HatchVmConfidentiality hatchVmConfidentiality2 = noiseFailureDispositionClassifyNoiseFailure.learnedConfidentiality;
            if (hatchVmConfidentiality2 != null) {
                String strExtractHatcheryVMId2 = HatcheryVMIdUtilsKt.extractHatcheryVMId(str);
                if (!HatchGatewayConnectionKt.isCvmCredentialRequired(noiseFailureDispositionClassifyNoiseFailure.forwardedOutcome)) {
                    strExtractHatcheryVMId2 = null;
                }
                recordVmConfidentiality(str, hatchVmConfidentiality2, strExtractHatcheryVMId2);
            }
            settleLegacySecret(pinnedHostData, HatchGatewayConnectionKt.attestedHostDataVerdict(noisePrivateAuthAttempt, hatchWsFailure.noiseHandshakeOutcome, th.getMessage()));
            Integer num2 = hatchWsFailure.httpCode;
            if (num2 != null && ((iIntValue = num2.intValue()) == 400 || iIntValue == 502)) {
                int iCurrentRetryCount = currentRetryCount();
                String str2 = gatewayTransportSession.connectionAttemptId;
                GatewayConnectionCycleStart gatewayConnectionCycleStart = gatewayTransportSession.connectionCycleStart;
                String str3 = HatchGatewayConnection.this.currentWsUrl;
                if (str3 != null && (strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(str3)) != null) {
                    HatchGatewayConnection hatchGatewayConnection3 = HatchGatewayConnection.this;
                    AnonymousClass001.A1J(new HatchGatewayConnection$GatewayConnectionEngineHost$handleFailure$4$1(hatchGatewayConnection3, strExtractHatcheryVMId, iCurrentRetryCount, str2, gatewayConnectionCycleStart, null), hatchGatewayConnection3.scope);
                }
            }
            g0w.invoke(th.getMessage(), hatchWsFailure.httpCode, noiseFailureDispositionClassifyNoiseFailure.forwardedOutcome);
        }

        public static /* synthetic */ void handleFailure$default(GatewayConnectionEngineHost gatewayConnectionEngineHost, GatewayTransportSession gatewayTransportSession, long j, String str, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, HatchWsFailure hatchWsFailure, G0W g0w, PinnedHostData pinnedHostData, int i, Object obj) {
            if ((i & 128) != 0) {
                pinnedHostData = null;
            }
            gatewayConnectionEngineHost.handleFailure(gatewayTransportSession, j, str, noisePrivateAuthAttempt, hatchVmConfidentiality, hatchWsFailure, g0w, pinnedHostData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAwaitingSubscribe(int i, long j) {
            ConnectionPhaseSnapshot value = HatchGatewayConnection.this.getEngine().phaseSnapshot.getValue();
            if (this.openEpoch != j || value.connectionCycle != i) {
                return false;
            }
            ConnectionPhase connectionPhase = value.phase;
            return (connectionPhase instanceof ConnectionPhase.Connecting) || (connectionPhase instanceof ConnectionPhase.Reconnecting);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isLivePhase() {
            ConnectionPhase value = HatchGatewayConnection.this.getEngine().phase.getValue();
            return C7384Etj.areEqual(value, ConnectionPhase.Connected.INSTANCE) || C7384Etj.areEqual(value, ConnectionPhase.StorageRecoveryConnected.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logConnectFailure(String str, String str2) {
            CFK.A0G(HatchGatewayConnectionKt.TAG, "Gateway connect failed (errorType=%s errorMessage=%s phase=%s retryCount=%d sessionId=%s)", str, str2, this.connectStage.getConnectPhase(), Integer.valueOf(currentRetryCount()), this.connectionAttemptId);
        }

        private final void logConnectVmAttempt() {
            HatchClientCvmEventLogger hatchClientCvmEventLogger = HatchClientCvmEventLogger.INSTANCE;
            String strCurrentCvmVmId = hatchClientCvmEventLogger.currentCvmVmId();
            synchronized (this.connectVmLock) {
                this.isConnectVmOpen = true;
                if (strCurrentCvmVmId == null || strCurrentCvmVmId.equals(this.connectVmAttemptVmId)) {
                    return;
                }
                this.connectVmAttemptVmId = strCurrentCvmVmId;
                hatchClientCvmEventLogger.logConnectVm(HatchClientCvmOutcome.ATTEMPT);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logCredentialFailure(HatchGatewayConnectionLogger.FailureReason failureReason, String str, String str2) {
            HatchGatewayConnection.this.logger.logFailure(failureReason, str, str2, null, null, HatchGatewayConnectionKt.CONNECT_PHASE_CREDENTIAL_FETCH, null);
            noteAttemptActivity();
            HatchGatewayConnection.this.logger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(HatchGatewayConnectionLogger.DisconnectReason.CREDENTIAL_ERROR, failureReason.getValue(), false, null, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logCredentialSubspan(Long l, Long l2) {
            if (l == null || l2 == null) {
                return;
            }
            HatchGatewayConnection.this.logger.logPoint(HatchGatewayConnectionLogger.Point.CREDENTIAL_FETCH_START, l.longValue());
            HatchGatewayConnection.this.logger.logPoint(HatchGatewayConnectionLogger.Point.CREDENTIAL_FETCH_END, l2.longValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logTransportReadyIfAvailable(GatewayTransportSession gatewayTransportSession, Long l) {
            Long lConsumeTimestamp;
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            synchronized (gatewayTransportSession) {
                if (hatchGatewayConnection.activeSession == gatewayTransportSession && (lConsumeTimestamp = gatewayTransportSession.transportReadyPoint.consumeTimestamp(l, gatewayTransportSession.webSocketSession.getTransportReadyTimestampNs())) != null) {
                    long jLongValue = lConsumeTimestamp.longValue();
                    this.connectStage = HatchGatewayConnectionKt.afterTransportReady(this.connectStage);
                    BV5.A1G(this, hatchGatewayConnection);
                    hatchGatewayConnection.logger.logPoint(HatchGatewayConnectionLogger.Point.WS_TRANSPORT_READY, jLongValue);
                }
            }
        }

        public static /* synthetic */ void logTransportReadyIfAvailable$default(GatewayConnectionEngineHost gatewayConnectionEngineHost, GatewayTransportSession gatewayTransportSession, Long l, int i, Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            gatewayConnectionEngineHost.logTransportReadyIfAvailable(gatewayTransportSession, l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logWebSocketUpgradeIfAvailable(GatewayTransportSession gatewayTransportSession, Long l) {
            Long lConsumeTimestamp;
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            synchronized (gatewayTransportSession) {
                if (hatchGatewayConnection.activeSession == gatewayTransportSession && (lConsumeTimestamp = gatewayTransportSession.webSocketUpgradePoint.consumeTimestamp(l, gatewayTransportSession.webSocketSession.getWebSocketUpgradeTimestampNs())) != null) {
                    long jLongValue = lConsumeTimestamp.longValue();
                    this.connectStage = HatchGatewayConnectionKt.afterWebSocketUpgrade(this.connectStage);
                    BV5.A1G(this, hatchGatewayConnection);
                    hatchGatewayConnection.logger.logPoint(HatchGatewayConnectionLogger.Point.WS_UPGRADED, jLongValue);
                    String regionHint = gatewayTransportSession.webSocketSession.getRegionHint();
                    if (regionHint != null) {
                        hatchGatewayConnection.logger.annotate("region_hint_received", regionHint);
                        if (gatewayTransportSession.sentRegionHint != null) {
                            hatchGatewayConnection.logger.annotate("region_hint_mismatch", String.valueOf(!r0.equals(regionHint)));
                        }
                    }
                    HatchGatewayPrefsStore.Companion.getInstance(hatchGatewayConnection.userSession).setGatewayRegionHint(gatewayTransportSession.vmId, regionHint);
                }
            }
        }

        public static /* synthetic */ void logWebSocketUpgradeIfAvailable$default(GatewayConnectionEngineHost gatewayConnectionEngineHost, GatewayTransportSession gatewayTransportSession, Long l, int i, Object obj) {
            if ((i & 2) != 0) {
                l = null;
            }
            gatewayConnectionEngineHost.logWebSocketUpgradeIfAvailable(gatewayTransportSession, l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String lowCardinalityCredentialFailureDetail(HatchVmRepository.FetchAndCacheLeasedVmResult.Failure failure) {
            String str;
            String str2 = failure.errorMessage;
            int iHashCode = str2.hashCode();
            if (iHashCode != -1511339120) {
                if (iHashCode != -877163654) {
                    if (iHashCode == -132152268) {
                        str = HatchVmRepositoryKt.ERROR_MESSAGE_EMPTY_VM_LIST;
                    }
                } else if (str2.equals(HatchVmRepositoryKt.ERROR_MESSAGE_ALL_VMS_MISSING_VM_WS_URL)) {
                    return str2;
                }
                return null;
            }
            str = HatchVmRepositoryKt.ERROR_MESSAGE_ALL_VMS_MISSING_VM_AUTH_TOKEN;
            if (str2.equals(str)) {
                return str2;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void noteAttemptActivity() {
            synchronized (this.attemptContinuityLock) {
                AttemptContinuity attemptContinuity = this.attemptContinuity;
                if (attemptContinuity != null) {
                    this.attemptContinuity = new AttemptContinuity(attemptContinuity.openedAtMs, RealtimeSinceBootClock.A00.now(), attemptContinuity.cycle);
                }
            }
        }

        private final void recordVmConfidentiality(String str, HatchVmConfidentiality hatchVmConfidentiality, String str2) {
            String strExtractHatcheryVMId;
            if (str == null || (strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(str)) == null) {
                return;
            }
            HatchGatewayPrefsStore companion = HatchGatewayPrefsStore.Companion.getInstance(HatchGatewayConnection.this.userSession);
            if (str2 != null && hatchVmConfidentiality == HatchVmConfidentiality.CONFIDENTIAL) {
                companion.recordHandshakeProvenCvm(str2);
            }
            companion.setVmConfidentiality(strExtractHatcheryVMId, hatchVmConfidentiality);
            HatchGatewayConnection.this.publishVmAttribution();
        }

        public static /* synthetic */ void recordVmConfidentiality$default(GatewayConnectionEngineHost gatewayConnectionEngineHost, String str, HatchVmConfidentiality hatchVmConfidentiality, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            gatewayConnectionEngineHost.recordVmConfidentiality(str, hatchVmConfidentiality, str2);
        }

        private final void settleLegacySecret(PinnedHostData pinnedHostData, AttestedHostDataVerdict attestedHostDataVerdict) {
            if (pinnedHostData == null || attestedHostDataVerdict == null) {
                return;
            }
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            AnonymousClass001.A1J(new HatchGatewayConnection$GatewayConnectionEngineHost$settleLegacySecret$1(hatchGatewayConnection, attestedHostDataVerdict, pinnedHostData, null), hatchGatewayConnection.scope);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x001a, B:10:0x0025, B:11:0x002e, B:12:0x0031), top: B:18:0x000b }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void startAttemptCycle() {
            /*
                r17 = this;
                com.facebook.common.time.RealtimeSinceBootClock r0 = com.facebook.common.time.RealtimeSinceBootClock.A00
                long r10 = r0.now()
                r6 = r17
                java.lang.Object r5 = r6.attemptContinuityLock
                monitor-enter(r5)
                com.facebook.aura.gateway.AttemptContinuity r7 = r6.attemptContinuity     // Catch: java.lang.Throwable -> L44
                if (r7 == 0) goto L31
                long r0 = r7.lastActivityMs     // Catch: java.lang.Throwable -> L44
                long r3 = r10 - r0
                r1 = 90000(0x15f90, double:4.4466E-319)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 > 0) goto L31
                long r8 = r7.openedAtMs     // Catch: java.lang.Throwable -> L44
                long r3 = r10 - r8
                r1 = 600000(0x927c0, double:2.964394E-318)
                int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r0 > 0) goto L31
                int r0 = r7.cycle     // Catch: java.lang.Throwable -> L44
                int r12 = r0 + 1
                com.facebook.aura.gateway.AttemptContinuity r7 = new com.facebook.aura.gateway.AttemptContinuity     // Catch: java.lang.Throwable -> L44
                r7.<init>(r8, r10, r12)     // Catch: java.lang.Throwable -> L44
            L2e:
                r6.attemptContinuity = r7     // Catch: java.lang.Throwable -> L44
                goto L42
            L31:
                java.lang.String r0 = X.BV5.A0j()     // Catch: java.lang.Throwable -> L44
                r6.connectionAttemptId = r0     // Catch: java.lang.Throwable -> L44
                r17 = 1
                com.facebook.aura.gateway.AttemptContinuity r7 = new com.facebook.aura.gateway.AttemptContinuity     // Catch: java.lang.Throwable -> L44
                r12 = r7
                r13 = r10
                r15 = r10
                r12.<init>(r13, r15, r17)     // Catch: java.lang.Throwable -> L44
                goto L2e
            L42:
                monitor-exit(r5)
                return
            L44:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.startAttemptCycle():void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wireSession(HatchWebSocketSession hatchWebSocketSession, GatewayTransportSession gatewayTransportSession, long j, String str, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, PinnedHostData pinnedHostData, Function0<Unit> function0, G0U<? super String, Unit> g0u, G0V<? super Integer, ? super String, Unit> g0v, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w) {
            Iterator<? extends HoC> it = this.sessionCollectorJobs.iterator();
            while (it.hasNext()) {
                it.next().A5w(null);
            }
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            C3UX c3ux = hatchGatewayConnection.scope;
            Integer num = C79.A0K;
            HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2 hatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2 = new HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2(hatchWebSocketSession, hatchGatewayConnection, gatewayTransportSession, null);
            C6ys c6ys = C6ys.A00;
            C10533Hqc c10533HqcA02 = GAo.A02(num, c6ys, hatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2, c3ux);
            HatchGatewayConnection hatchGatewayConnection2 = HatchGatewayConnection.this;
            C3UX c3ux2 = hatchGatewayConnection2.scope;
            this.sessionCollectorJobs = Arrays.asList(c10533HqcA02, GAo.A02(C79.A00, c6ys, new HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3(hatchWebSocketSession, hatchGatewayConnection2, gatewayTransportSession, this, j, str, noisePrivateAuthAttempt, hatchVmConfidentiality, pinnedHostData, function0, g0u, g0w, g0v, null), c3ux2));
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void cancelPreparedTransport() {
            HatchGatewayPreconnect.INSTANCE.cancelParkedGatewayTransport(HatchGatewayConnection.this.userSession);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void closeTransport() {
            InterfaceC10560Hsz<Unit> interfaceC10560Hsz;
            boolean zA1X = AnonymousClass002.A1X(this.openJob);
            HoC hoC = this.openJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.openJob = null;
            this.openEpoch = -1L;
            this.deferredBadGatewayDiagnostics = null;
            GatewayTransportSession gatewayTransportSession = HatchGatewayConnection.this.activeSession;
            if (gatewayTransportSession != null) {
                logWebSocketMilestonesIfAvailable(gatewayTransportSession);
            }
            if (HatchGatewayConnection.this.activeSession != null || zA1X) {
                HatchGatewayConnection.this.logger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(AuraNetworkMonitor._state.getValue() instanceof AuraNetworkState.Offline ? HatchGatewayConnectionLogger.DisconnectReason.NETWORK_CHANGE : !AuraAppLifecycleManager.INSTANCE.isAppInForeground() ? HatchGatewayConnectionLogger.DisconnectReason.APP_BACKGROUNDED : HatchGatewayConnectionLogger.DisconnectReason.CLIENT_CLOSE, null, true, null, null);
            }
            this.connectStage = GatewayConnectStage.UNKNOWN;
            Iterator<? extends HoC> it = this.sessionCollectorJobs.iterator();
            while (it.hasNext()) {
                it.next().A5w(null);
            }
            this.sessionCollectorJobs = C0881AGi.A00;
            HatchWebSocketSession hatchWebSocketSession = HatchGatewayConnection.this.transport;
            if (hatchWebSocketSession != null) {
                hatchWebSocketSession.close(1000, "Closing");
            }
            HatchGatewayConnection.this.transport = null;
            GatewayTransportSession gatewayTransportSession2 = HatchGatewayConnection.this.activeSession;
            if (gatewayTransportSession2 != null && (interfaceC10560Hsz = gatewayTransportSession2.ended) != null) {
                C3cG.A1F(interfaceC10560Hsz, Unit.INSTANCE);
            }
            HatchGatewayConnection.this.activeSession = null;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void closeTransportForNoActiveDemand(long j) {
            this.noActiveDemandEpoch = j;
            boolean z = false;
            if (this.connectionAttemptIdCycle == HatchGatewayConnection.this.getEngine().phaseSnapshot.getValue().connectionCycle) {
                z = true;
                HatchGatewayConnection.this.logger.logBackgroundCancellation(this.connectionAttemptId, ((CH0) HatchGatewayConnection.this.userSession).A01);
            }
            closeTransport();
            boolean zLogAbandonedOpenCancellation = logAbandonedOpenCancellation(j);
            if (z || zLogAbandonedOpenCancellation) {
                ((MetaAnalyticsInstance) BV5.A0Z(65550)).triggerUploadNow();
            }
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void continueVmWakeWait(int i) {
            HatchGatewayConnection.this.logger.continueVmWakeWait(this.connectionAttemptId, i);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void failPendingRpcRequests() {
            HatchGatewayConnection.this.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().cancelPendingRequests();
        }

        public final String getConnectedVmId() {
            return this.connectedVmId;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void onConnectionCycleStarted(int i, boolean z) {
            String strA0a;
            if (z) {
                try {
                    if (HatchGatewayConnection.this.isVmDisabled() || !HatchGatewayConnection.this.ownsCurrentSession() || (strA0a = C3cG.A0a(HatchGatewayPrefsStore.Companion.getInstance(HatchGatewayConnection.this.userSession))) == null || C7BY.A0j(strA0a) || !HatchGatewayConnectionKt.isBackgroundCycleWakeEnabled()) {
                        return;
                    }
                    BV4.A1B(i, HatchGatewayConnectionKt.TAG, "Background connection cycle wake (cycle=%d)");
                    AnonymousClass001.A1J(new HatchGatewayConnection$GatewayConnectionEngineHost$onConnectionCycleStarted$1(strA0a, null), HatchGatewayConnection.this.scope);
                } catch (Exception e) {
                    CFK.A08(HatchGatewayConnectionKt.TAG, FGI.A0I("Background connection cycle wake failed (cycle=", i, ")"), e);
                }
            }
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void onIntentionalDisconnect() {
            HatchAgentExecution.Companion.getInstance(HatchGatewayConnection.this.userSession).stopAll();
            endAttemptContinuity();
            HatchGatewayConnection.this.logger.logCancel(HatchGatewayConnectionLogger.CancellationReason.INTENTIONAL_DISCONNECT);
            HatchGatewayConnection.this.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().resetState();
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void prepareTransport() {
            if (!HatchGatewayConnection.this.ownsCurrentSession() || HatchGatewayConnection.this.isVmDisabled()) {
                return;
            }
            String gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(HatchGatewayConnection.this.userSession).getGatewayUrl();
            if (gatewayUrl.length() <= 0) {
                gatewayUrl = null;
            }
            HatchGatewayPreconnect.INSTANCE.parkGatewayTransport(HatchGatewayConnection.this.userSession, gatewayUrl);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void resetDeltaState() {
            HatchGatewayConnection.this.protocol.resetDeltaState();
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void sendKeepalivePing(Presence presence) {
            GatewayTransportSession gatewayTransportSession;
            C7384Etj.A0Y(presence, 0);
            if (!isLivePhase() || (gatewayTransportSession = HatchGatewayConnection.this.activeSession) == null) {
                return;
            }
            String str = HatchGatewayConnection.this.currentWsUrl;
            C2nw c2nw = new C2nw();
            C7qW.A06("nonce", BV5.A0j(), c2nw);
            C7qW.A06("presence", HatchGatewayConnectionKt.getWireValue(presence), c2nw);
            JsonObject jsonObjectA00 = c2nw.A00();
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            AnonymousClass001.A1J(new HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1(this, gatewayTransportSession, str, hatchGatewayConnection, presence, jsonObjectA00, null), hatchGatewayConnection.scope);
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void setVmStarting(boolean z) {
            HatchVmStateStore.Companion.getInstance(HatchGatewayConnection.this.userSession).setStarting$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean logAbandonedOpenCancellation(long j) {
            noteAttemptActivity();
            boolean zA1M = AnonymousClass002.A1M((this.noActiveDemandEpoch > j ? 1 : (this.noActiveDemandEpoch == j ? 0 : -1)));
            boolean zLogCancel = HatchGatewayConnection.this.logger.logCancel(zA1M ? HatchGatewayConnectionLogger.CancellationReason.NO_ACTIVE_DEMAND : HatchGatewayConnectionLogger.CancellationReason.SUPERSEDED);
            if (zLogCancel && zA1M) {
                this.noActiveDemandEpoch = -1L;
            }
            return zLogCancel;
        }

        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        public void ensurePrimarySubscribePending() {
            refreshVmStateForSubscribe("subscribe_ack_timeout");
            HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
            hatchGatewayConnection.protocol.ensurePrimarySubscribePending(new HatchGatewayConnection$GatewayConnectionEngineHost$ensurePrimarySubscribePending$1(hatchGatewayConnection));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r3
  0x001b: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v4 java.lang.String) binds: [B:11:0x0019, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[PHI: r3
  0x001f: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:11:0x0019, B:13:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.facebook.aura.gateway.connection.ConnectionEngineHost
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void failBadGatewayAttempt(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            /*
                r9 = this;
                X.AnonymousClass003.A0u(r10, r11)
                com.facebook.aura.gateway.DeferredBadGatewayDiagnostics r5 = r9.deferredBadGatewayDiagnostics
                r6 = 0
                if (r5 == 0) goto L3d
                long r2 = r5.epoch
                long r0 = r9.openEpoch
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto L3d
            L10:
                r9.deferredBadGatewayDiagnostics = r6
                if (r5 == 0) goto L18
                java.lang.String r3 = r5.errorType
                if (r3 != 0) goto L1b
            L18:
                r3 = r10
                if (r5 == 0) goto L1f
            L1b:
                java.lang.String r4 = r5.errorMessage
                if (r4 != 0) goto L20
            L1f:
                r4 = r11
            L20:
                r9.logConnectFailure(r3, r4)
                com.facebook.aura.gateway.HatchGatewayConnection r0 = com.facebook.aura.gateway.HatchGatewayConnection.this
                com.facebook.aura.gateway.HatchGatewayConnectionLogger r1 = r0.logger
                com.facebook.aura.gateway.HatchGatewayConnectionLogger$FailureReason r2 = com.facebook.aura.gateway.HatchGatewayConnectionLogger.FailureReason.NETWORK_ERROR
                r0 = 502(0x1f6, float:7.03E-43)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                com.facebook.aura.gateway.GatewayConnectStage r0 = r9.connectStage
                java.lang.String r7 = r0.getConnectPhase()
                r8 = r12
                r1.logFailure(r2, r3, r4, r5, r6, r7, r8)
                r9.noteAttemptActivity()
                return
            L3d:
                r5 = r6
                goto L10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.GatewayConnectionEngineHost.failBadGatewayAttempt(java.lang.String, java.lang.String, java.lang.String):void");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {760, 768}, m = "acquireConnectionForNoiseHttpDemand", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$1, reason: invalid class name and case insensitive filesystem */
    public final class C121011 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C121011(HtJ<? super C121011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.acquireConnectionForNoiseHttpDemand(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {567}, m = "awaitConnected", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$1, reason: invalid class name and case insensitive filesystem */
    public final class C121021 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C121021(HtJ<? super C121021> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.awaitConnected(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$2", f = "HatchGatewayConnection.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = hatchGatewayConnectionState;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchGatewayConnectionState hatchGatewayConnectionState = (HatchGatewayConnectionState) this.L$0;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Hwg.A00(obj);
            return Boolean.valueOf((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) || ((hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) && ((HatchGatewayConnectionState.Disconnected) hatchGatewayConnectionState).reason == HatchGatewayConnectionState.Reason.OFFLINE));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {575}, m = "awaitConnected", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$3, reason: invalid class name */
    public final class AnonymousClass3 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.awaitConnected(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$4", f = "HatchGatewayConnection.kt", l = {575}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayConnection.this.new AnonymousClass4(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchGatewayConnection.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection hatchGatewayConnection = HatchGatewayConnection.this;
                this.label = 1;
                if (hatchGatewayConnection.awaitConnected(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {779}, m = "awaitStorageRecoveryReconnect", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C121031 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C121031(HtJ<? super C121031> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.awaitStorageRecoveryReconnect(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$2", f = "HatchGatewayConnection.kt", l = {AuraVictoryGleamKt.VICTORY_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$2, reason: invalid class name and case insensitive filesystem */
    public final class C121042 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$2$1", f = "HatchGatewayConnection.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<ConnectionPhase, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.G0V
            public final Object invoke(ConnectionPhase connectionPhase, HtJ<? super Boolean> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = connectionPhase;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                ConnectionPhase connectionPhase = (ConnectionPhase) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return Boolean.valueOf(C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connected.INSTANCE) || C7384Etj.areEqual(connectionPhase, ConnectionPhase.StorageRecoveryConnected.INSTANCE) || ((connectionPhase instanceof ConnectionPhase.Failed) && ((ConnectionPhase.Failed) connectionPhase).retriesExhausted));
            }
        }

        public C121042(HtJ<? super C121042> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayConnection.this.new C121042(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return HatchGatewayConnection.this.new C121042(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<ConnectionPhase> c1bn = HatchGatewayConnection.this.getEngine().phase;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return C60O.A0h(obj, ConnectionPhase.Connected.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {905}, m = "cancelChat", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$cancelChat$1, reason: invalid class name and case insensitive filesystem */
    public final class C121051 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121051(HtJ<? super C121051> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.cancelChat(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {693}, m = "fetchAndConnect", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$fetchAndConnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C121061 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C121061(HtJ<? super C121061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.fetchAndConnect(false, false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {731, 744, 749}, m = "forceReconnectForCredential", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$forceReconnectForCredential$1, reason: invalid class name and case insensitive filesystem */
    public final class C121071 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C121071(HtJ<? super C121071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.forceReconnectForCredential(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$markServiceRestartPending$1", f = "HatchGatewayConnection.kt", l = {635}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$markServiceRestartPending$1, reason: invalid class name and case insensitive filesystem */
    public final class C121081 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $notice;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121081(long j, HtJ<? super C121081> htJ) {
            super(2, htJ);
            this.$notice = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGatewayConnection.this.new C121081(this.$notice, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = ConnectionConfig.DEFAULT.serviceRestartHintTtlMs;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchGatewayConnection.this.expireServiceRestartPending(this.$notice);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C121081) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$onPhaseChanged$1, reason: invalid class name and case insensitive filesystem */
    public final class C121091 extends AbstractC7559F3s implements G0U<HatchGatewayStateSnapshot, HatchGatewayStateSnapshot> {
        public final /* synthetic */ int $connectionCycle;
        public final /* synthetic */ HatchGatewayConnectionState $mapped;
        public final /* synthetic */ ConnectionPhase $phase;

        @Override // X.G0U
        public final HatchGatewayStateSnapshot invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
            C7384Etj.A0Y(hatchGatewayStateSnapshot, 0);
            return hatchGatewayStateSnapshot.copy(this.$mapped, HatchGatewayConnectionStateKt.afterConnectionPhase(hatchGatewayStateSnapshot.authentication, this.$phase), this.$connectionCycle);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121091(HatchGatewayConnectionState hatchGatewayConnectionState, ConnectionPhase connectionPhase, int i) {
            super(1);
            this.$mapped = hatchGatewayConnectionState;
            this.$phase = connectionPhase;
            this.$connectionCycle = i;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {776, 776}, m = "reconnectAfterStorageRecovery", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$reconnectAfterStorageRecovery$1, reason: invalid class name and case insensitive filesystem */
    public final class C121101 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C121101(HtJ<? super C121101> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.reconnectAfterStorageRecovery(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {1101, 1110}, m = "resetBootstrap", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$1, reason: invalid class name and case insensitive filesystem */
    public final class C121111 extends HzP {
        public Object L$0;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C121111(HtJ<? super C121111> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnection.this.resetBootstrap(null, this);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$2, reason: invalid class name and case insensitive filesystem */
    public final class C121122 extends AbstractC7559F3s implements G0U<HatchGatewayStateSnapshot, HatchGatewayStateSnapshot> {
        public static final C121122 INSTANCE = new C121122();

        public C121122() {
            super(1);
        }

        @Override // X.G0U
        public final HatchGatewayStateSnapshot invoke(HatchGatewayStateSnapshot hatchGatewayStateSnapshot) {
            C7384Etj.A0Y(hatchGatewayStateSnapshot, 0);
            return hatchGatewayStateSnapshot.copy(HatchGatewayConnectionState.Resetting.INSTANCE, HatchCvmAuthenticationState.Disabled.INSTANCE, hatchGatewayStateSnapshot.connectionCycle);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$showServiceNotice$1, reason: invalid class name and case insensitive filesystem */
    public final class C121131 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ int $code;
        public final /* synthetic */ HatchGatewayConnection this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121131(int i, HatchGatewayConnection hatchGatewayConnection) {
            super(0);
            this.$code = i;
            this.this$0 = hatchGatewayConnection;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            CFK.A03(Integer.valueOf(this.$code), HatchGatewayConnectionKt.TAG, "service.notice toast dismissed: code=%d");
            this.this$0.serviceNoticeShowing.set(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    private final synchronized void clearServiceRestartPending() {
        AnonymousClass004.A1D(false, this._serviceRestartPending);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void expireServiceRestartPending(long j) {
        if (j == this.serviceRestartNoticeCount) {
            AnonymousClass004.A1D(false, this._serviceRestartPending);
        }
    }

    private final synchronized void markServiceRestartPending() {
        long j = this.serviceRestartNoticeCount + 1;
        this.serviceRestartNoticeCount = j;
        HtJ htJA14 = C3cI.A14(this._serviceRestartPending, AnonymousClass001.A0i());
        AnonymousClass001.A1J(new C121081(j, htJA14), this.scope);
    }

    public static /* synthetic */ Object sendRequestAndWaitDeferredForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$default(HatchGatewayConnection hatchGatewayConnection, RpcMethod rpcMethod, G0U g0u, long j, HtJ htJ, int i, Object obj) {
        long j2 = j;
        if ((i & 4) != 0) {
            j2 = 15000;
        }
        return hatchGatewayConnection.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitDeferredForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(rpcMethod, g0u, j2, htJ);
    }

    public static /* synthetic */ Object sendRequestAndWaitForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$default(HatchGatewayConnection hatchGatewayConnection, RpcMethod rpcMethod, JsonElement jsonElement, long j, HtJ htJ, int i, Object obj) {
        long j2 = j;
        if ((i & 4) != 0) {
            j2 = 15000;
        }
        return hatchGatewayConnection.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(rpcMethod, jsonElement, j2, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void updateGatewayState(G0U<? super HatchGatewayStateSnapshot, HatchGatewayStateSnapshot> g0u) {
        HatchGatewayStateSnapshot hatchGatewayStateSnapshotInvoke = g0u.invoke(this._gatewayState.getValue());
        this._gatewayState.Af8(hatchGatewayStateSnapshotInvoke);
        this._connectionState.Af8(hatchGatewayStateSnapshotInvoke.connection);
        this._cvmAuthenticationState.Af8(hatchGatewayStateSnapshotInvoke.authentication);
    }

    public final void applyLocalAiIdentityName(String str) {
        C7384Etj.A0Y(str, 0);
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().applyLocalAiIdentityName(str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cleared = true;
        HatchAgentExecution.Companion.getInstance(this.userSession).clearUserData();
        C4oT c4oT = this.gatewayPrefs;
        InterfaceC3137BzH interfaceC3137BzH = this.gatewayRouteListener;
        LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) c4oT;
        synchronized (lightSharedPreferencesImpl) {
            C7384Etj.A0Y(interfaceC3137BzH, 1);
            Map<InterfaceC3137BzH, Handler> map = lightSharedPreferencesImpl.A07.get(VmAuthTokenKt.KEY_GATEWAY_URL);
            if (map != null) {
                map.remove(interfaceC3137BzH);
            }
        }
        HatchGatewayPreconnect.INSTANCE.cancelParkedGatewayTransport(this.userSession);
        getEngine().shutdown();
        this.engineHost.clearUserData();
        HatchVmLoggingContext.INSTANCE.clearForLogout();
    }

    public final void confirmThreadSession(String str) {
        C7384Etj.A0Y(str, 0);
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().confirmThreadSession(str);
    }

    public final void onServiceNotice$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.logger.logServiceNotice(i, str);
        showServiceNotice(i, str);
        if (ConnectionReducerKt.isPlannedRestartNotice(i) && (this.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected)) {
            markServiceRestartPending();
        }
        getEngine().noteServiceNotice(i, str);
    }

    public final void onSubscribeRejected$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(String str) {
        GatewayConnectionEngineHost gatewayConnectionEngineHost;
        String str2;
        C7384Etj.A0Y(str, 0);
        if (str.equalsIgnoreCase(HatchGatewayConnectionKt.SERVICE_CODE_STORAGE_FULL)) {
            getEngine().enterStorageRecovery();
            CFK.A05(HatchGatewayConnectionKt.TAG, "Gateway entered storage recovery after chat.subscribe http_507");
            return;
        }
        if (str.equalsIgnoreCase(HatchGatewayConnectionKt.SUBSCRIBE_ERROR_CODE_BAD_REQUEST)) {
            gatewayConnectionEngineHost = this.engineHost;
            str2 = "subscribe_http_400";
        } else {
            if (!str.equalsIgnoreCase(HatchGatewayConnectionKt.SUBSCRIBE_ERROR_CODE_BAD_GATEWAY)) {
                return;
            }
            gatewayConnectionEngineHost = this.engineHost;
            str2 = "subscribe_http_502";
        }
        gatewayConnectionEngineHost.refreshVmStateForSubscribe(str2);
    }

    public final boolean recoverFromSuspectedDeadConnection(String str) {
        C7384Etj.A0Y(str, 0);
        boolean z = C60Q.A0I(this).connection instanceof HatchGatewayConnectionState.Connected;
        if (z) {
            CFK.A0H(HatchGatewayConnectionKt.TAG, "Suspected dead gateway socket while Connected (%s) \u2014 forcing reconnect", str);
            this.logger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(HatchGatewayConnectionLogger.DisconnectReason.CLIENT_RECONNECT, str, false, null, null);
            getEngine().recoverFromSuspectedDeadConnection(str);
        }
        return z;
    }

    public final void send(String str) {
        C7384Etj.A0Y(str, 0);
        HatchWebSocketSession hatchWebSocketSession = this.transport;
        if (hatchWebSocketSession != null) {
            hatchWebSocketSession.send(str);
        }
    }

    public final void sendChatMessage(String str, List<HatchAttachment> list, Map<String, ? extends Object> map, String str2, String str3) {
        AnonymousClass002.A1C(str, 0, str3);
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendChatMessage(str, list, map, str2, str3);
    }

    public final Object sendRequestAndWait(RpcMethod rpcMethod, long j, HtJ<? super JsonElement> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitInternal(rpcMethod, null, j, htJ);
    }

    public final void setPrimarySessionId(String str) {
        C7384Etj.A0Y(str, 0);
        this.protocol.setPrimarySessionId(str);
    }

    public final void subscribeToSession(String str) {
        C7384Etj.A0Y(str, 0);
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().subscribeToSession(str);
    }

    public final void unsubscribeFromSession(String str) {
        C7384Etj.A0Y(str, 0);
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().unsubscribeFromSession(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> activeConnectionHolds() {
        if (this.cleared) {
            return C0881AGi.A00;
        }
        ConnectionLifecycleSnapshot connectionLifecycleSnapshotEngineLifecycleSnapshot = engineLifecycleSnapshot();
        AII aiiA17 = AIM.A17();
        if (connectionLifecycleSnapshotEngineLifecycleSnapshot.isBackgroundSessionActive) {
            aiiA17.add("background_session");
        }
        if (connectionLifecycleSnapshotEngineLifecycleSnapshot.isAssistOverlayActive) {
            aiiA17.add("assist_overlay");
        }
        if (C3cH.A1R(HatchNodeOperationLease.hasHostLease)) {
            aiiA17.add("host_lease");
        }
        if (C3cH.A1R(HatchNodeOperationLease.hasOperationLease)) {
            aiiA17.add(C3cF.A00(47));
        }
        if (connectionLifecycleSnapshotEngineLifecycleSnapshot.isAgentExecutionActive) {
            aiiA17.add("agent_execution");
        }
        if (connectionLifecycleSnapshotEngineLifecycleSnapshot.isLiveSessionActive) {
            aiiA17.add("live_session");
        }
        return AIM.A18(aiiA17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitStorageRecoveryReconnect(X.HtJ<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121031
            if (r0 == 0) goto L44
            r4 = r6
            com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$1 r4 = (com.facebook.aura.gateway.HatchGatewayConnection.C121031) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L4a
            X.Hwg.A00(r2)
        L20:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L2d
            boolean r0 = r2.booleanValue()
        L28:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L2d:
            r0 = 0
            goto L28
        L2f:
            X.Hwg.A00(r2)
            r0 = 0
            com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$2 r2 = new com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$2
            r2.<init>(r0)
            r4.label = r1
            r0 = 45000(0xafc8, double:2.2233E-319)
            java.lang.Object r2 = X.GAX.A01(r4, r2, r0)
            if (r2 != r3) goto L20
            return r3
        L44:
            com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$1 r4 = new com.facebook.aura.gateway.HatchGatewayConnection$awaitStorageRecoveryReconnect$1
            r4.<init>(r6)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.awaitStorageRecoveryReconnect(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot engineLifecycleSnapshot() {
        /*
            r7 = this;
            com.facebook.aura.lifecycle.AuraAppLifecycleManager r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.INSTANCE
            boolean r2 = r0.isAppInForeground()
            com.facebook.aura.gateway.HatchBackgroundSession r0 = com.facebook.aura.gateway.HatchBackgroundSession.INSTANCE
            boolean r3 = r0.isActive()
            boolean r4 = r7.assistOverlayActive
            com.facebook.aura.nodes.transport.HatchNodeOperationLease r0 = com.facebook.aura.nodes.transport.HatchNodeOperationLease.INSTANCE
            boolean r5 = r0.isHeld()
            com.facebook.aura.gateway.HatchAgentExecution$Companion r1 = com.facebook.aura.gateway.HatchAgentExecution.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchAgentExecution r0 = r1.getInstance(r0)
            boolean r0 = r0.isActive()
            if (r0 != 0) goto L31
            com.facebook.aura.backgroundwork.api.BackgroundWork r1 = com.facebook.aura.backgroundwork.api.BackgroundWork.INSTANCE
            X.CGz r0 = r7.userSession
            X.1BN r0 = r1.activeHeadline(r0)
            java.lang.Object r0 = r0.getValue()
            r6 = 0
            if (r0 == 0) goto L32
        L31:
            r6 = 1
        L32:
            com.facebook.aura.livesession.api.LiveSessions r1 = com.facebook.aura.livesession.api.LiveSessions.INSTANCE
            X.CGz r0 = r7.userSession
            X.1BN r0 = r1.isActive(r0)
            boolean r7 = X.C3cH.A1R(r0)
            com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot r1 = new com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.engineLifecycleSnapshot():com.facebook.aura.gateway.connection.ConnectionLifecycleSnapshot");
    }

    public static /* synthetic */ Object fetchChatHistory$default(HatchGatewayConnection hatchGatewayConnection, int i, Long l, String str, HtJ htJ, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 50;
        }
        if ((i2 & 2) != 0) {
            l = null;
        }
        return hatchGatewayConnection.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatHandler.fetchChatHistory(i, l, str, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectionEngine getEngine() {
        return (ConnectionEngine) this.engine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasValidatedInternetForLogging() {
        AuraNetworkState value = AuraNetworkMonitor.state.getValue();
        return (value instanceof AuraNetworkState.Online) && ((AuraNetworkState.Online) value).isValidated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVmDisabled() {
        return C3cH.A1R(this.vmDisabledStore.isVmDisabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVmProvisioned() {
        AuraUserData auraUserData = (AuraUserData) C60P.A1J(AuraViewerDataProvider.Companion, this.userSession);
        if (auraUserData != null) {
            return AnonymousClass002.A1b(auraUserData.hasProvisionedVm, true);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStaleTransportOpen(String str) {
        CFK.A0E(HatchGatewayConnectionKt.TAG, "Rejecting gateway connection from a non-current session at %s", new Throwable("stale gateway connection attempt"), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPhaseChanged(ConnectionPhase connectionPhase, int i) {
        if (C7384Etj.areEqual(connectionPhase, ConnectionPhase.Connected.INSTANCE)) {
            clearServiceRestartPending();
        }
        AnonymousClass004.A1D(C7384Etj.areEqual(connectionPhase, ConnectionPhase.StorageRecoveryConnected.INSTANCE), this._storageRecoveryConnected);
        HatchGatewayConnectionState gatewayConnectionState = ConnectionStateMapperKt.toGatewayConnectionState(connectionPhase);
        if (gatewayConnectionState instanceof HatchGatewayConnectionState.Connected) {
            getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().markAgentStatusConnectionFloor();
        }
        updateGatewayState(new C121091(gatewayConnectionState, connectionPhase, i));
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().updateConnectionState(gatewayConnectionState);
        if (!(gatewayConnectionState instanceof HatchGatewayConnectionState.Connecting) && !(gatewayConnectionState instanceof HatchGatewayConnectionState.Reconnecting)) {
            HatchVmStateStore.Companion.getInstance(this.userSession).clearStarting$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
        }
        ConnectionPhase connectionPhase2 = this.lastPhase;
        ConnectionPhase.Connected connected = ConnectionPhase.Connected.INSTANCE;
        if (C7384Etj.areEqual(connectionPhase, connected) && !C7384Etj.areEqual(connectionPhase2, connected)) {
            getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onConnected();
            this.engineHost.logConnectVmOutcome(HatchClientCvmOutcome.SUCCESS);
        }
        if (connectionPhase instanceof ConnectionPhase.Failed) {
            ConnectionPhase.Failed failed = (ConnectionPhase.Failed) connectionPhase;
            CFK.A0H(HatchGatewayConnectionKt.TAG, "Gateway failed: cause=%s retriesExhausted=%b message=%s", failed.cause, Boolean.valueOf(failed.retriesExhausted), failed.message);
            this.engineHost.logConnectVmOutcome(HatchClientCvmOutcome.FAILURE);
        }
        this.lastPhase = connectionPhase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ownsCurrentSession() {
        return AuraSessionManager.INSTANCE.isCurrentSession(this.userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishVmAttribution() {
        String strExtractHatcheryVMId;
        String strA0m = this.currentWsUrl;
        String host = null;
        if (strA0m == null) {
            strA0m = C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession);
            if (strA0m.length() <= 0) {
                strA0m = null;
            }
        }
        HatchVmLoggingContext hatchVmLoggingContext = HatchVmLoggingContext.INSTANCE;
        if (strA0m != null) {
            strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(strA0m);
            Uri uriA02 = C7Je.A02(strA0m);
            if (uriA02 != null) {
                host = uriA02.getHost();
            }
        } else {
            strExtractHatcheryVMId = null;
        }
        hatchVmLoggingContext.publish(strExtractHatcheryVMId, host, resolveIsCvm());
        HatchClientCvmEventLogger.INSTANCE.logPendingAppOpen();
    }

    private final Boolean resolveIsCvm() {
        boolean z;
        ConfidentialSessionGate companion = ConfidentialSessionGate.Companion.getInstance(this.userSession);
        if (companion.isConfidentialVmForAnalyticsMode()) {
            z = true;
        } else {
            if (!companion.isStandardVm()) {
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resolveNoisePrivateAuth(String str, HtJ<? super ResolvedNoisePrivateAuth> htJ) {
        return HatchGatewayConnectionKt.resolveNoisePrivateAuth(this.userSession, str, HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getVmConfidentiality(), htJ);
    }

    public static /* synthetic */ Object searchChat$default(HatchGatewayConnection hatchGatewayConnection, String str, int i, boolean z, Long l, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 20;
        }
        boolean zA1K = C3cG.A1K(i2 & 4, z);
        if ((i2 & 8) != 0) {
            l = null;
        }
        return hatchGatewayConnection.searchChat(str, i, zA1K, l, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendChatMessage$default(HatchGatewayConnection hatchGatewayConnection, String str, List list, Map map, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        hatchGatewayConnection.sendChatMessage(str, list, map, str2, str3);
    }

    public static /* synthetic */ Object sendRequestAndWait$default(HatchGatewayConnection hatchGatewayConnection, RpcMethod rpcMethod, long j, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 15000;
        }
        return hatchGatewayConnection.sendRequestAndWait(rpcMethod, j, htJ);
    }

    private final void showServiceNotice(int i, String str) {
        String str2;
        if (str.length() != 0) {
            if (!AuraAppLifecycleManager.INSTANCE.isAppInForeground()) {
                str2 = "service.notice toast ignored, app backgrounded: code=%d";
            } else if (HatchCvmMigrationStore.Companion.getInstance(this.userSession).isFollowingTransfer) {
                str2 = "service.notice toast ignored, data transfer in progress: code=%d";
            } else if (HatchCvmReplaceStoreKt.forVm(HatchCvmReplaceStore.Companion.getInstance(this.userSession).replacement.getValue(), C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession)) != null) {
                str2 = "service.notice toast ignored, CVM replacement in progress: code=%d";
            } else {
                if (this.serviceNoticeShowing.compareAndSet(false, true)) {
                    ToastApi.INSTANCE.showToast(new AuraToast.ToastArgs(str, null, AuraToast.Duration.SHORT, null, AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, new C121131(i, this), null, null, AuraIconSize.MEDIUM, null));
                    return;
                }
                str2 = "service.notice toast ignored, one already showing: code=%d";
            }
            CFK.A03(Integer.valueOf(i), HatchGatewayConnectionKt.TAG, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireConnectionForNoiseHttpDemand(X.HtJ<? super com.facebook.aura.gateway.connection.ConnectionDemandOutcome> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121011
            if (r0 == 0) goto L7f
            r5 = r9
            com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$1 r5 = (com.facebook.aura.gateway.HatchGatewayConnection.C121011) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L24
            if (r0 == r7) goto L50
            if (r0 != r4) goto L85
            X.Hwg.A00(r1)
        L23:
            return r1
        L24:
            X.Hwg.A00(r1)
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r1 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            X.CGz r0 = r8.userSession
            com.facebook.aura.user.provider.AuraViewerDataProvider r0 = r1.getInstance(r0)
            X.1BN<com.facebook.aura.user.provider.AuraUserData> r3 = r0.userData
            java.lang.Object r0 = r3.getValue()
            com.facebook.aura.user.provider.AuraUserData r0 = (com.facebook.aura.user.provider.AuraUserData) r0
            if (r0 == 0) goto L3d
            java.lang.Boolean r1 = r0.hasProvisionedVm
            if (r1 != 0) goto L53
        L3d:
            r0 = 0
            com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1 r2 = new com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$hasProvisionedVm$1
            r2.<init>(r3, r0)
            r5.L$0 = r0
            r5.label = r7
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r1 = X.GAX.A01(r5, r2, r0)
            if (r1 != r6) goto L53
            return r6
        L50:
            X.Hwg.A00(r1)
        L53:
            boolean r0 = X.C3cG.A1P(r1, r7)
            if (r0 != 0) goto L67
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "HatchGatewayConnection"
            java.lang.String r0 = "Noise HTTP demand unavailable: hasProvisionedVm=%s"
            X.CFK.A0H(r1, r0, r2)
        L64:
            com.facebook.aura.gateway.connection.ConnectionDemandOutcome r1 = com.facebook.aura.gateway.connection.ConnectionDemandOutcome.UNAVAILABLE
            return r1
        L67:
            boolean r0 = r8.isVmDisabled()
            if (r0 != 0) goto L64
            com.facebook.aura.gateway.connection.ConnectionEngine r1 = r8.getEngine()
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r1 = r1.acquireForDemand(r5)
            if (r1 != r6) goto L23
            return r6
        L7f:
            com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$1 r5 = new com.facebook.aura.gateway.HatchGatewayConnection$acquireConnectionForNoiseHttpDemand$1
            r5.<init>(r9)
            goto L12
        L85:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.acquireConnectionForNoiseHttpDemand(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitConnected(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121021
            if (r0 == 0) goto L54
            r5 = r7
            com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$1 r5 = (com.facebook.aura.gateway.HatchGatewayConnection.C121021) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L5a
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.1BN<com.facebook.aura.gateway.HatchGatewayStateSnapshot> r0 = r6.gatewayState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.gateway.HatchGatewayStateSnapshot r0 = (com.facebook.aura.gateway.HatchGatewayStateSnapshot) r0
            com.facebook.aura.gateway.HatchGatewayConnectionState r1 = r0.connection
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            if (r0 != 0) goto L20
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected
            if (r0 == 0) goto L41
            com.facebook.aura.gateway.HatchGatewayConnectionState$Disconnected r1 = (com.facebook.aura.gateway.HatchGatewayConnectionState.Disconnected) r1
            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r1 = r1.reason
            com.facebook.aura.gateway.HatchGatewayConnectionState$Reason r0 = com.facebook.aura.gateway.HatchGatewayConnectionState.Reason.OFFLINE
            if (r1 != r0) goto L41
            goto L20
        L41:
            X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r2 = r6.connectionState
            r1 = 0
            com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$2 r0 = new com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$2
            r0.<init>(r1)
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r2)
            if (r0 != r4) goto L20
            return r4
        L54:
            com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$1 r5 = new com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$1
            r5.<init>(r7)
            goto L12
        L5a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.awaitConnected(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object cancelChat(java.lang.String r8, X.HtJ<? super kotlinx.serialization.json.JsonElement> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121051
            if (r0 == 0) goto L26
            r6 = r9
            com.facebook.aura.gateway.HatchGatewayConnection$cancelChat$1 r6 = (com.facebook.aura.gateway.HatchGatewayConnection.C121051) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2c
            java.lang.Object r3 = r6.L$2
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r2 = r6.L$1
            com.facebook.aura.gateway.HatchAgentExecution r2 = (com.facebook.aura.gateway.HatchAgentExecution) r2
            goto L54
        L26:
            com.facebook.aura.gateway.HatchGatewayConnection$cancelChat$1 r6 = new com.facebook.aura.gateway.HatchGatewayConnection$cancelChat$1
            r6.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r0)
            com.facebook.aura.gateway.HatchAgentExecution$Companion r1 = com.facebook.aura.gateway.HatchAgentExecution.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.gateway.HatchAgentExecution r2 = r1.getInstance(r0)
            java.util.Set r3 = r2.activeRequestIds(r8)
            com.facebook.aura.gateway.HatchGatewayEventsHandler r1 = r7.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Throwable -> L5d
            r6.L$1 = r2     // Catch: java.lang.Throwable -> L5d
            r6.L$2 = r3     // Catch: java.lang.Throwable -> L5d
            r6.label = r4     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r1.sendChatCancel(r8, r6)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r5) goto L57
            return r5
        L54:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L5d
        L57:
            kotlinx.serialization.json.JsonElement r0 = (kotlinx.serialization.json.JsonElement) r0     // Catch: java.lang.Throwable -> L5d
            r2.cancelRequests(r3)
            return r0
        L5d:
            r0 = move-exception
            r2.cancelRequests(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.cancelChat(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndConnect(boolean r6, boolean r7, java.lang.String r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121061
            if (r0 == 0) goto L3a
            r4 = r9
            com.facebook.aura.gateway.HatchGatewayConnection$fetchAndConnect$1 r4 = (com.facebook.aura.gateway.HatchGatewayConnection.C121061) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L40
            X.Hwg.A00(r3)
        L20:
            boolean r0 = r3 instanceof com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.Z$0 = r6
            r4.Z$1 = r7
            r4.label = r1
            java.lang.Object r3 = r5.requestConnect(r6, r7, r8, r4)
            if (r3 != r2) goto L20
            return r2
        L3a:
            com.facebook.aura.gateway.HatchGatewayConnection$fetchAndConnect$1 r4 = new com.facebook.aura.gateway.HatchGatewayConnection$fetchAndConnect$1
            r4.<init>(r9)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.fetchAndConnect(boolean, boolean, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object forceReconnectForCredential(X.HtJ<? super com.facebook.aura.gateway.connection.ConnectRequestResult> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121071
            if (r0 == 0) goto Lc5
            r4 = r14
            com.facebook.aura.gateway.HatchGatewayConnection$forceReconnectForCredential$1 r4 = (com.facebook.aura.gateway.HatchGatewayConnection.C121071) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc5
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 3
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 == r3) goto L65
            if (r0 == r1) goto L99
            if (r0 != r6) goto Lcc
            X.Hwg.A00(r2)
        L26:
            return r2
        L27:
            X.Hwg.A00(r2)
            boolean r0 = r13.isVmDisabled()
            if (r0 != 0) goto L4f
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r2 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            X.CGz r0 = r13.userSession
            java.lang.Object r0 = X.C60P.A1J(r2, r0)
            com.facebook.aura.user.provider.AuraUserData r0 = (com.facebook.aura.user.provider.AuraUserData) r0
            if (r0 == 0) goto L52
            java.lang.Boolean r2 = r0.hasProvisionedVm
        L3e:
            boolean r0 = X.AnonymousClass002.A1b(r2, r3)
            if (r0 != 0) goto L54
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = "HatchGatewayConnection"
            java.lang.String r0 = "Credential reconnect rejected: hasProvisionedVm=%s"
            X.CFK.A0H(r1, r0, r2)
        L4f:
            com.facebook.aura.gateway.connection.ConnectRequestResult$Rejected r2 = com.facebook.aura.gateway.connection.ConnectRequestResult.Rejected.INSTANCE
            return r2
        L52:
            r2 = 0
            goto L3e
        L54:
            com.facebook.aura.gateway.connection.ConnectionEngine r7 = r13.getEngine()
            r2 = 0
            r4.L$0 = r2
            r4.label = r3
            r0 = 0
            java.lang.Object r2 = r7.connect(r3, r0, r2, r4)
            if (r2 != r5) goto L68
            return r5
        L65:
            X.Hwg.A00(r2)
        L68:
            com.facebook.aura.gateway.connection.ConnectRequestResult r2 = (com.facebook.aura.gateway.connection.ConnectRequestResult) r2
            boolean r0 = r2 instanceof com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted
            if (r0 == 0) goto L26
            r0 = r2
            com.facebook.aura.gateway.connection.ConnectRequestResult$Accepted r0 = (com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted) r0
            boolean r0 = r0.startedFreshCycle
            if (r0 != 0) goto L26
            com.facebook.aura.gateway.HatchGatewayConnectionLogger r7 = r13.logger
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$DisconnectReason r8 = com.facebook.aura.gateway.HatchGatewayConnectionLogger.DisconnectReason.CLIENT_RECONNECT
            r11 = 0
            java.lang.String r9 = "credential_available"
            r10 = 0
            r12 = r11
            r7.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r8, r9, r10, r11, r12)
            com.facebook.aura.gateway.connection.ConnectionEngine r0 = r13.getEngine()
            r0.recoverFromSuspectedDeadConnection(r9)
            com.facebook.aura.gateway.connection.ConnectionEngine r0 = r13.getEngine()
            r4.L$0 = r11
            r4.L$1 = r11
            r4.label = r1
            java.lang.Object r2 = r0.connect(r3, r10, r11, r4)
            if (r2 != r5) goto L9c
            return r5
        L99:
            X.Hwg.A00(r2)
        L9c:
            com.facebook.aura.gateway.connection.ConnectRequestResult r2 = (com.facebook.aura.gateway.connection.ConnectRequestResult) r2
            boolean r0 = r2 instanceof com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted
            if (r0 == 0) goto L26
            r0 = r2
            com.facebook.aura.gateway.connection.ConnectRequestResult$Accepted r0 = (com.facebook.aura.gateway.connection.ConnectRequestResult.Accepted) r0
            boolean r0 = r0.startedFreshCycle
            if (r0 != 0) goto L26
            com.facebook.aura.gateway.connection.ConnectionEngine r0 = r13.getEngine()
            r0.disconnect()
            com.facebook.aura.gateway.connection.ConnectionEngine r2 = r13.getEngine()
            r1 = 0
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r1
            r4.label = r6
            r0 = 0
            java.lang.Object r2 = r2.connect(r3, r0, r1, r4)
            if (r2 != r5) goto L26
            return r5
        Lc5:
            com.facebook.aura.gateway.HatchGatewayConnection$forceReconnectForCredential$1 r4 = new com.facebook.aura.gateway.HatchGatewayConnection$forceReconnectForCredential$1
            r4.<init>(r14)
            goto L12
        Lcc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.forceReconnectForCredential(X.HtJ):java.lang.Object");
    }

    public final C22I<ConnectionClosed> getConnectionClosedEvents() {
        return this.connectionClosedEvents;
    }

    public final C1BN<HatchGatewayConnectionState> getConnectionState() {
        return this.connectionState;
    }

    public final String getCurrentEffectiveWsUrl() {
        return this.currentEffectiveWsUrl;
    }

    public final ReplyElementSupport getCurrentReplyElementSupport() {
        return this.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected ? this.protocol.replyElementSupport.getValue() : new ReplyElementSupport(AGH.A0E(), A3q.A00);
    }

    public final String getCurrentWsUrl() {
        return this.currentWsUrl;
    }

    public final C1BN<HatchCvmAuthenticationState> getCvmAuthenticationState() {
        return this.cvmAuthenticationState;
    }

    public final HatchGatewayEventsHandler getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        return (HatchGatewayEventsHandler) this.eventsHandler$delegate.getValue();
    }

    public final C1BN<HatchGatewayStateSnapshot> getGatewayState() {
        return this.gatewayState;
    }

    public final C1BN<String> getPrimarySessionId() {
        return this.protocol.primarySessionId;
    }

    public final C1BN<ReplyElementSupport> getReplyElementSupport() {
        return this.protocol.replyElementSupport;
    }

    public final C1BN<Boolean> getServiceRestartPending() {
        return this.serviceRestartPending;
    }

    public final C1BN<Boolean> getStorageRecoveryConnected() {
        return this.storageRecoveryConnected;
    }

    public final AbstractC3358CGz getUserSession() {
        return this.userSession;
    }

    public final boolean hasConnectedTo(String str) {
        return str != null && str.equals(this.engineHost.connectedVmId);
    }

    public final boolean isAssistOverlayActive() {
        return this.assistOverlayActive;
    }

    public final String lastConnectFailure() {
        return this.logger.lastFailureLabel;
    }

    public final Object performClientReset(Context context, HtJ<? super Unit> htJ) {
        HatchGatewayPrefsStore.Companion.getInstance(this.userSession).clearIdentity("VM reset", context, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconnectAfterStorageRecovery(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121101
            if (r0 == 0) goto L44
            r5 = r7
            com.facebook.aura.gateway.HatchGatewayConnection$reconnectAfterStorageRecovery$1 r5 = (com.facebook.aura.gateway.HatchGatewayConnection.C121101) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 2
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L32
            if (r1 != r3) goto L4a
            X.Hwg.A00(r0)
        L23:
            return r0
        L24:
            X.Hwg.A00(r0)
            r5.label = r2
            r1 = 0
            r0 = 0
            java.lang.Object r0 = r6.fetchAndConnect(r2, r0, r1, r5)
            if (r0 != r4) goto L35
            return r4
        L32:
            X.Hwg.A00(r0)
        L35:
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L4f
            r5.label = r3
            java.lang.Object r0 = r6.awaitStorageRecoveryReconnect(r5)
            if (r0 != r4) goto L23
            return r4
        L44:
            com.facebook.aura.gateway.HatchGatewayConnection$reconnectAfterStorageRecovery$1 r5 = new com.facebook.aura.gateway.HatchGatewayConnection$reconnectAfterStorageRecovery$1
            r5.<init>(r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L4f:
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.reconnectAfterStorageRecovery(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resetBootstrap(android.content.Context r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchGatewayConnection.C121111
            if (r0 == 0) goto L61
            r6 = r9
            com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$1 r6 = (com.facebook.aura.gateway.HatchGatewayConnection.C121111) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L45
            if (r0 != r4) goto L67
            X.Hwg.A00(r1)
        L23:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L28:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$2 r0 = com.facebook.aura.gateway.HatchGatewayConnection.C121122.INSTANCE
            r7.updateGatewayState(r0)
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$ok$1 r0 = new com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$ok$1
            r0.<init>(r7, r1)
            r6.L$0 = r8
            r6.label = r3
            java.lang.Object r1 = X.GAo.A00(r6, r2, r0)
            if (r1 != r5) goto L4b
            return r5
        L45:
            java.lang.Object r0 = r6.L$0
            android.content.Context r8 = X.C60P.A02(r0, r1)
        L4b:
            boolean r1 = X.AnonymousClass001.A1X(r1)
            if (r1 != 0) goto L53
            r3 = 0
            goto L23
        L53:
            r0 = 0
            r6.L$0 = r0
            r6.Z$0 = r1
            r6.label = r4
            java.lang.Object r0 = r7.performClientReset(r8, r6)
            if (r0 != r5) goto L23
            return r5
        L61:
            com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$1 r6 = new com.facebook.aura.gateway.HatchGatewayConnection$resetBootstrap$1
            r6.<init>(r9)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.resetBootstrap(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendPrepared$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(X.G0U<? super X.HtJ<? super java.lang.String>, ? extends java.lang.Object> r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.gateway.HatchGatewayConnection$sendPrepared$1
            if (r0 == 0) goto L52
            r6 = r9
            com.facebook.aura.gateway.HatchGatewayConnection$sendPrepared$1 r6 = (com.facebook.aura.gateway.HatchGatewayConnection$sendPrepared$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L58
            java.lang.Object r1 = r6.L$1
            com.facebook.aura.network.transport.HatchWebSocketSession r1 = (com.facebook.aura.network.transport.HatchWebSocketSession) r1
            X.Hwg.A00(r5)
        L25:
            java.lang.String r5 = (java.lang.String) r5
            X.C3cG.A1H(r6)
            com.facebook.aura.network.transport.HatchWebSocketSession r0 = r7.transport
            if (r0 != r1) goto L35
            boolean r0 = r1.send(r5)
            if (r0 == 0) goto L35
            r3 = 1
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3a:
            X.Hwg.A00(r5)
            X.C3cG.A1H(r6)
            com.facebook.aura.network.transport.HatchWebSocketSession r1 = r7.transport
            if (r1 == 0) goto L35
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r5 = r8.invoke(r6)
            if (r5 != r4) goto L25
            return r4
        L52:
            com.facebook.aura.gateway.HatchGatewayConnection$sendPrepared$1 r6 = new com.facebook.aura.gateway.HatchGatewayConnection$sendPrepared$1
            r6.<init>(r7, r9)
            goto L12
        L58:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.sendPrepared$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(X.G0U, X.HtJ):java.lang.Object");
    }

    public final void setAssistOverlayActive(boolean z) {
        this.assistOverlayActive = z;
        getEngine().refreshLifecycle();
    }

    public final void setBackgroundMode(boolean z) {
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchGatewayConnection getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGatewayConnection) abstractC3358CGz.A03(HatchGatewayConnection.class, new HatchGatewayConnection$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayConnection(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        if (!AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz)) {
            CFK.A0L(HatchGatewayConnectionKt.TAG, new Throwable("stale gateway creation site"), "Creating a gateway for a non-current session");
        }
        this.protocol = new JarvisProtocol(abstractC3358CGz);
        HzC hzCA01 = C78T.A01(AnonymousClass001.A0y(), null);
        this.scope = hzCA01;
        this.vmDisabledStore = HatchVmDisabledStore.Companion.getInstance(abstractC3358CGz);
        C4oT c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        this.gatewayPrefs = c4oTUserPrefs;
        InterfaceC3137BzH interfaceC3137BzH = new InterfaceC3137BzH() { // from class: com.facebook.aura.gateway.HatchGatewayConnection$gatewayRouteListener$1

            @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$gatewayRouteListener$1$1", f = "HatchGatewayConnection.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.gateway.HatchGatewayConnection$gatewayRouteListener$1$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public int label;
                public final /* synthetic */ HatchGatewayConnection this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.this$0 = hatchGatewayConnection;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass1(this.this$0, htJ);
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    HatchGatewayPreconnect.INSTANCE.cancelParkedTransportForChangedRoute(this.this$0.userSession);
                    return Unit.INSTANCE;
                }
            }

            @Override // X.InterfaceC3137BzH
            public final void onSharedPreferenceChanged(C4oT c4oT, String str) {
                HatchGatewayConnection hatchGatewayConnection = this.this$0;
                AnonymousClass001.A1J(new AnonymousClass1(hatchGatewayConnection, null), hatchGatewayConnection.scope);
            }
        };
        this.gatewayRouteListener = interfaceC3137BzH;
        this.logger = new HatchGatewayConnectionLogger(new HatchGatewayConnection$logger$1(this));
        Object[] objArr = null == true ? 1 : 0;
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchGatewayStateSnapshot(null, objArr, 0, 7, null == true ? 1 : 0));
        this._gatewayState = c9286GCnA14;
        C3Pi c3PiA11 = C3cG.A11(c9286GCnA14);
        this.gatewayState = c3PiA11;
        C9286GCn c9286GCnA01 = HnJ.A01(((HatchGatewayStateSnapshot) c3PiA11.getValue()).connection);
        this._connectionState = c9286GCnA01;
        this.connectionState = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(((HatchGatewayStateSnapshot) c3PiA11.getValue()).authentication);
        this._cvmAuthenticationState = c9286GCnA012;
        this.cvmAuthenticationState = C3cG.A11(c9286GCnA012);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._storageRecoveryConnected = c9286GCnA142;
        this.storageRecoveryConnected = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(false);
        this._serviceRestartPending = c9286GCnA143;
        this.serviceRestartPending = C3cG.A11(c9286GCnA143);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 4);
        this._connectionClosedEvents = c9290GCrA12;
        this.connectionClosedEvents = C3pd.A00(c9290GCrA12);
        this.eventsHandler$delegate = AbstractC5321DgF.A03(new HatchGatewayConnection$eventsHandler$2(this));
        this.engineHost = new GatewayConnectionEngineHost();
        this.engine$delegate = AbstractC5321DgF.A03(new HatchGatewayConnection$engine$2(this));
        this.serviceNoticeShowing = new AtomicBoolean(false);
        LightSharedPreferencesImpl lightSharedPreferencesImpl = (LightSharedPreferencesImpl) c4oTUserPrefs;
        synchronized (lightSharedPreferencesImpl) {
            Handler handler = LightSharedPreferencesImpl.A0C;
            Map<String, Map<InterfaceC3137BzH, Handler>> map = lightSharedPreferencesImpl.A07;
            Map<InterfaceC3137BzH, Handler> map2 = map.get(VmAuthTokenKt.KEY_GATEWAY_URL);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(VmAuthTokenKt.KEY_GATEWAY_URL, map2);
            }
            map2.put(interfaceC3137BzH, handler);
        }
        HatchVmLoggingContext.INSTANCE.reopenForSession();
        publishVmAttribution();
        getEngine();
        GAo.A02(num, C6ys.A00, new AnonymousClass1(null), hzCA01);
    }

    public final void clearMilestoneVideo() {
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().clearMilestoneVideo();
    }

    public final Object fetchChatHistory(int i, Long l, String str, HtJ<? super ChatHistoryFetchResult> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatHandler.fetchChatHistory(i, l, str, htJ);
    }

    public final Object fetchMessageSeq(String str, HtJ<? super Long> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().fetchMessageSeq(str, htJ);
    }

    public final Object fetchUnreadCount(String str, HtJ<? super Integer> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatHandler.fetchUnreadCount(str, htJ);
    }

    public final Object fetchUnreadState(String str, HtJ<? super ChatUnreadState> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatHandler.fetchUnreadState(str, htJ);
    }

    public final C1BN<Integer> getActiveSubAgentCount() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().activeSubAgentCount;
    }

    public final C1BN<List<HatchSubAgent>> getActiveSubAgents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().activeSubAgents;
    }

    public final C22I<ActivityUpdatedEvent> getActivityUpdateEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().activityUpdateEvents;
    }

    public final long getAgentStatusConnectionFloor() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().agentStatusAdmissionFloor.get();
    }

    public final C22I<AgentStatusPayload> getAgentStatusEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().agentStatusEvents;
    }

    public final C1BN<AiIdentity> getAiIdentity() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().aiIdentity;
    }

    public final C22I<JsonObject> getApprovalsSnapshotEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().approvalsSnapshotEvents;
    }

    public final C22I<JsonObject> getArtifactItemsRemoved() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactItemsRemoved;
    }

    public final C22I<JsonObject> getArtifactItemsUpdated() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactItemsUpdated;
    }

    public final C22I<JsonObject> getArtifactsSnapshotEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().artifactsSnapshotEvents;
    }

    public final C22I<HatchChatEvent> getChatEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatEvents;
    }

    public final HatchAiIdentityHandler.AvatarImageKey getCommittedAvatarImageKey() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().aiIdentityHandler.getCommittedAvatarImageKey();
    }

    public final C1BN<List<HatchSubAgent>> getCompletedSubAgents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().completedSubAgents;
    }

    public final long getCurrentAgentStatusSequence() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().agentStatusSequence.get();
    }

    public final C22I<DeliveryAck> getDeliveryAcks() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().deliveryAcks;
    }

    public final C22I<DeliveryError> getDeliveryErrors() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().deliveryErrors;
    }

    public final C22I<FeedUpdateEvent> getFeedUpdateEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().feedUpdateEvents;
    }

    public final C1BN<FileUpdateEvent> getFileUpdateEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().fileUpdateEvents;
    }

    public final C22I<JsonObject> getGoalUpdatedEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().goalUpdatedEvents;
    }

    public final C20Q<Boolean> getHasPendingRequests() {
        return GDB.A01(new HatchGatewayConnection$special$$inlined$map$1(getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().pendingRequestCount));
    }

    public final C1BN<Long> getIdentityInvalidationGeneration() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().aiIdentityHandler.identityInvalidationGeneration;
    }

    public final C1BN<Long> getIdentityRefreshGeneration() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().aiIdentityHandler.identityRefreshGeneration;
    }

    public final C1BN<String> getMilestoneVideoUrl() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().milestoneVideoUrl;
    }

    public final C22I<Unit> getNavigationTabOrderUpdated() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().navigationTabOrderUpdated;
    }

    public final G0U<JsonElement, Unit> getOnClientInvokeRequest() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onClientInvokeRequest;
    }

    public final G0V<String, String, Unit> getOnHeartbeatNotification() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onHeartbeatNotification;
    }

    public final C22I<SessionUpdatedEvent> getSessionUpdatedEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sessionUpdatedEvents;
    }

    public final C22I<Unit> getTasksUpdateEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().tasksUpdateEvents;
    }

    public final C22I<ThemeUpdateEvent> getThemeUpdateEvents() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().themeUpdateEvents;
    }

    public final C22I<TransportRejection> getTransportRejections() {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().transportRejections;
    }

    public final boolean isConnected() {
        return (C60Q.A0I(this).connection instanceof HatchGatewayConnectionState.Connected) || (C60Q.A0I(this).connection instanceof HatchGatewayConnectionState.Resetting);
    }

    public final boolean isStorageRecoveryConnected() {
        return C7384Etj.areEqual(getEngine().phase.getValue(), ConnectionPhase.StorageRecoveryConnected.INSTANCE);
    }

    public final Object markChatAsSeen(String str, HtJ<? super MarkChatAsSeenResult> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatHandler.markChatAsSeen(str, htJ);
    }

    public final void prepareGatewayTransport() {
        getEngine().prepareTransport();
    }

    public final void refreshIdentity() {
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().refreshIdentity();
    }

    public final Object requestConnect(boolean z, boolean z2, String str, HtJ<? super ConnectRequestResult> htJ) {
        if (!isVmDisabled()) {
            AuraUserData auraUserData = (AuraUserData) C60P.A1J(AuraViewerDataProvider.Companion, this.userSession);
            Boolean bool = auraUserData != null ? auraUserData.hasProvisionedVm : null;
            if (AnonymousClass002.A1b(bool, true)) {
                return getEngine().connect(z, z2, str, htJ);
            }
            CFK.A03(bool, HatchGatewayConnectionKt.TAG, "Connect skipped: hasProvisionedVm=%s");
        }
        return ConnectRequestResult.Rejected.INSTANCE;
    }

    public final Object searchChat(String str, int i, boolean z, Long l, HtJ<? super HatchSearchResult> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().searchChat(str, i, z, l, htJ);
    }

    public final Object sendRequestAndWaitDeferredForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(RpcMethod rpcMethod, G0U<? super HtJ<? super JsonElement>, ? extends Object> g0u, long j, HtJ<? super JsonElement> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitDeferredForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(rpcMethod, g0u, j, htJ);
    }

    public final Object sendRequestAndWaitForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(RpcMethod rpcMethod, JsonElement jsonElement, long j, HtJ<? super JsonElement> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitForNodeTransport$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(rpcMethod, jsonElement, j, htJ);
    }

    public final Object sendRequestAndWaitFromJsonString(RpcMethod rpcMethod, String str, long j, HtJ<? super JsonElement> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().sendRequestAndWaitInternal(rpcMethod, str, j, htJ);
    }

    public final void setAfterChatEventSeq(String str, long j) {
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().setAfterChatEventSeq(str, j);
    }

    public final void setOnClientInvokeRequest(G0U<? super JsonElement, Unit> g0u) {
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onClientInvokeRequest = g0u;
    }

    public final void setOnHeartbeatNotification(G0V<? super String, ? super String, Unit> g0v) {
        getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onHeartbeatNotification = g0v;
    }

    public final Object setPaused(HtJ<? super Unit> htJ) {
        getEngine().pause();
        return Unit.INSTANCE;
    }

    public final Object subscribeArtifacts(HtJ<? super Unit> htJ) {
        return C3cG.A0U(getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().subscribeArtifacts(htJ));
    }

    public final Object toggleReaction(String str, String str2, String str3, HtJ<? super List<String>> htJ) {
        return getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatHandler.toggleReaction(str, str2, str3, htJ);
    }

    public /* synthetic */ HatchGatewayConnection(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public static /* synthetic */ Object sendRequestAndWait$default(HatchGatewayConnection hatchGatewayConnection, RpcMethod rpcMethod, Object obj, long j, HtJ htJ, int i, Object obj2) {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitConnected(long r6, X.HtJ<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchGatewayConnection.AnonymousClass3
            if (r0 == 0) goto L3c
            r4 = r8
            com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$3 r4 = (com.facebook.aura.gateway.HatchGatewayConnection.AnonymousClass3) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L42
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L23
            r2 = 0
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L28:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$4 r0 = new com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$4
            r0.<init>(r1)
            r4.J$0 = r6
            r4.label = r2
            java.lang.Object r1 = X.GAX.A01(r4, r0, r6)
            if (r1 != r3) goto L20
            return r3
        L3c:
            com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$3 r4 = new com.facebook.aura.gateway.HatchGatewayConnection$awaitConnected$3
            r4.<init>(r8)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnection.awaitConnected(long, X.HtJ):java.lang.Object");
    }

    public final /* synthetic */ <P> Object sendRequestAndWait(RpcMethod rpcMethod, P p, long j, HtJ<? super JsonElement> htJ) {
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }
}

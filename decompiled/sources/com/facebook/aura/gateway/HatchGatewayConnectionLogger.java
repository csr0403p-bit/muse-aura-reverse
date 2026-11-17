package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFI;
import X.BQG;
import X.BV4;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.Ey9;
import android.os.SystemClock;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.hatch.HatchSessionId;
import com.facebook.aura.analytics.plugins.implementations.analyticsdecorator.AuraAnalyticsDecoratorImplementation;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.gateway.connection.ConnectionReducerKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.network.noise.AuraNoiseVmTransport;
import com.facebook.aura.network.transport.HatchConnectTimeout;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchWsFailure;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.perf.HatchQplLogger;
import com.facebook.aura.startup.AuraStartupMetricsRecorder;
import com.facebook.aura.utils.HatchUtil;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchGatewayConnectionLogger {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final Function0<List<String>> activeHolds;
    public volatile int currentInstanceKey;
    public final Object dropLock;
    public volatile boolean hasEverConnected;
    public final AtomicInteger instanceKeyCounter;
    public ConnectionDrop lastDrop;
    public volatile String lastErrorConnectionAttemptId;
    public volatile String lastErrorMessage;
    public volatile String lastErrorType;
    public volatile String lastFailureLabel;
    public volatile FailureReason lastFailureReason;
    public volatile Integer lastHttpStatusCode;
    public Long liveConnectionSinceElapsedMs;
    public volatile ParkedTiming parkedTiming;
    public volatile Integer pendingServiceNoticeCode;
    public volatile String pendingServiceNoticeMessage;
    public volatile Integer pendingWsCloseCode;
    public final Object stageLock;
    public final Map<Point, Long> stageTimestampsNs;
    public final AtomicBoolean traceEnded;
    public volatile String vmWakeWaitConnectionAttemptId;
    public volatile int vmWakeWaitRetryCount;
    public volatile Long vmWakeWaitStartedAtNs;
    public volatile Integer vmWakeWaitTraceKey;

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionLogger$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<List<? extends String>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ List<? extends String> invoke() {
            return C0881AGi.A00;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            return C0881AGi.A00;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CancellationReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CancellationReason[] $VALUES;
        public static final CancellationReason INTENTIONAL_DISCONNECT;
        public static final CancellationReason NETWORK_UNAVAILABLE;
        public static final CancellationReason NO_ACTIVE_DEMAND;
        public static final CancellationReason SUPERSEDED;
        public static final CancellationReason VM_WAKE_BACKGROUNDED;
        public final String value;

        static {
            CancellationReason cancellationReason = new CancellationReason("NO_ACTIVE_DEMAND", 0, "no_active_demand");
            NO_ACTIVE_DEMAND = cancellationReason;
            CancellationReason cancellationReason2 = new CancellationReason("VM_WAKE_BACKGROUNDED", 1, "vm_wake_backgrounded");
            VM_WAKE_BACKGROUNDED = cancellationReason2;
            CancellationReason cancellationReason3 = new CancellationReason("SUPERSEDED", 2, "superseded");
            SUPERSEDED = cancellationReason3;
            CancellationReason cancellationReason4 = new CancellationReason("INTENTIONAL_DISCONNECT", 3, "intentional_disconnect");
            INTENTIONAL_DISCONNECT = cancellationReason4;
            CancellationReason cancellationReason5 = new CancellationReason("NETWORK_UNAVAILABLE", 4, "network_unavailable");
            NETWORK_UNAVAILABLE = cancellationReason5;
            CancellationReason[] cancellationReasonArr = {cancellationReason, cancellationReason2, cancellationReason3, cancellationReason4, cancellationReason5};
            $VALUES = cancellationReasonArr;
            $ENTRIES = C3cG.A0w(cancellationReasonArr);
        }

        public static Ey9<CancellationReason> getEntries() {
            return $ENTRIES;
        }

        public static CancellationReason valueOf(String str) {
            return (CancellationReason) Enum.valueOf(CancellationReason.class, str);
        }

        public static CancellationReason[] values() {
            return (CancellationReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public CancellationReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final class Companion {
        public final String getAppSessionId() {
            return HatchSessionId.INSTANCE.get();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class ConnectionDrop {
        public final boolean appForeground;
        public final Long connectionAgeMs;
        public final String detail;
        public final long droppedAtElapsedMs;
        public final boolean foregroundService;
        public final String holds;
        public final KeepaliveDropDetail keepalive;
        public final DisconnectReason reason;
        public final TransportDropDetail transport;

        public ConnectionDrop(DisconnectReason disconnectReason, String str, TransportDropDetail transportDropDetail, KeepaliveDropDetail keepaliveDropDetail, Long l, boolean z, long j, boolean z2, String str2) {
            C60O.A1N(disconnectReason, 0, str2);
            this.reason = disconnectReason;
            this.detail = str;
            this.transport = transportDropDetail;
            this.keepalive = keepaliveDropDetail;
            this.connectionAgeMs = l;
            this.appForeground = z;
            this.droppedAtElapsedMs = j;
            this.foregroundService = z2;
            this.holds = str2;
        }

        public final boolean getAppForeground() {
            return this.appForeground;
        }

        public final Long getConnectionAgeMs() {
            return this.connectionAgeMs;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final long getDroppedAtElapsedMs() {
            return this.droppedAtElapsedMs;
        }

        public final boolean getForegroundService() {
            return this.foregroundService;
        }

        public final String getHolds() {
            return this.holds;
        }

        public final KeepaliveDropDetail getKeepalive() {
            return this.keepalive;
        }

        public final DisconnectReason getReason() {
            return this.reason;
        }

        public final TransportDropDetail getTransport() {
            return this.transport;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DisconnectReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ DisconnectReason[] $VALUES;
        public static final DisconnectReason APP_BACKGROUNDED;
        public static final DisconnectReason CLIENT_CLOSE;
        public static final DisconnectReason CLIENT_RECONNECT;
        public static final DisconnectReason CREDENTIAL_ERROR;
        public static final DisconnectReason KEEPALIVE_TIMEOUT;
        public static final DisconnectReason NETWORK_CHANGE;
        public static final DisconnectReason SERVER_CLOSE;
        public static final DisconnectReason TRANSPORT_ERROR;
        public static final DisconnectReason TRANSPORT_PING_TIMEOUT;
        public static final DisconnectReason UNKNOWN;
        public final String value;

        static {
            DisconnectReason disconnectReason = new DisconnectReason("KEEPALIVE_TIMEOUT", 0, "keepalive_timeout");
            KEEPALIVE_TIMEOUT = disconnectReason;
            DisconnectReason disconnectReason2 = new DisconnectReason("TRANSPORT_PING_TIMEOUT", 1, "transport_ping_timeout");
            TRANSPORT_PING_TIMEOUT = disconnectReason2;
            DisconnectReason disconnectReason3 = new DisconnectReason("NETWORK_CHANGE", 2, "network_change");
            NETWORK_CHANGE = disconnectReason3;
            DisconnectReason disconnectReason4 = new DisconnectReason("APP_BACKGROUNDED", 3, ErrorReportingConstants.APP_BACKGROUNDED);
            APP_BACKGROUNDED = disconnectReason4;
            DisconnectReason disconnectReason5 = new DisconnectReason("SERVER_CLOSE", 4, "server_close");
            SERVER_CLOSE = disconnectReason5;
            DisconnectReason disconnectReason6 = new DisconnectReason("TRANSPORT_ERROR", 5, HatchVmRepositoryKt.ERROR_MESSAGE_TRANSPORT_ERROR);
            TRANSPORT_ERROR = disconnectReason6;
            DisconnectReason disconnectReason7 = new DisconnectReason("CLIENT_RECONNECT", 6, "client_reconnect");
            CLIENT_RECONNECT = disconnectReason7;
            DisconnectReason disconnectReason8 = new DisconnectReason("CLIENT_CLOSE", 7, "client_close");
            CLIENT_CLOSE = disconnectReason8;
            DisconnectReason disconnectReason9 = new DisconnectReason("CREDENTIAL_ERROR", 8, "credential_error");
            CREDENTIAL_ERROR = disconnectReason9;
            DisconnectReason disconnectReason10 = new DisconnectReason("UNKNOWN", 9, "unknown");
            UNKNOWN = disconnectReason10;
            DisconnectReason[] disconnectReasonArr = {disconnectReason, disconnectReason2, disconnectReason3, disconnectReason4, disconnectReason5, disconnectReason6, disconnectReason7, disconnectReason8, disconnectReason9, disconnectReason10};
            $VALUES = disconnectReasonArr;
            $ENTRIES = C3cG.A0w(disconnectReasonArr);
        }

        public static Ey9<DisconnectReason> getEntries() {
            return $ENTRIES;
        }

        public static DisconnectReason valueOf(String str) {
            return (DisconnectReason) Enum.valueOf(DisconnectReason.class, str);
        }

        public static DisconnectReason[] values() {
            return (DisconnectReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public DisconnectReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FailureReason {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ FailureReason[] $VALUES;
        public static final FailureReason AUTH_FAILED;
        public static final FailureReason CREDENTIAL_FETCH_FAILED;
        public static final FailureReason CVM_CREDENTIAL_REQUIRED;
        public static final FailureReason NETWORK_ERROR;
        public static final FailureReason NO_INTERNET;
        public static final FailureReason NO_VALID_VM_CREDENTIAL;
        public static final FailureReason NO_VALID_VM_URL;
        public static final FailureReason SERVER_CLOSE;
        public static final FailureReason STORAGE_RECOVERY_REQUIRED;
        public static final FailureReason TIMEOUT;
        public final String value;

        static {
            FailureReason failureReason = new FailureReason("AUTH_FAILED", 0, "auth_failed");
            AUTH_FAILED = failureReason;
            FailureReason failureReason2 = new FailureReason("TIMEOUT", 1, "timeout");
            TIMEOUT = failureReason2;
            FailureReason failureReason3 = new FailureReason("NETWORK_ERROR", 2, "network_error");
            NETWORK_ERROR = failureReason3;
            FailureReason failureReason4 = new FailureReason("NO_INTERNET", 3, "no_internet");
            NO_INTERNET = failureReason4;
            FailureReason failureReason5 = new FailureReason("CREDENTIAL_FETCH_FAILED", 4, "credential_fetch_failed");
            CREDENTIAL_FETCH_FAILED = failureReason5;
            FailureReason failureReason6 = new FailureReason("NO_VALID_VM_URL", 5, "no_valid_vm_url");
            NO_VALID_VM_URL = failureReason6;
            FailureReason failureReason7 = new FailureReason("NO_VALID_VM_CREDENTIAL", 6, "no_valid_vm_credential");
            NO_VALID_VM_CREDENTIAL = failureReason7;
            FailureReason failureReason8 = new FailureReason("SERVER_CLOSE", 7, "server_close");
            SERVER_CLOSE = failureReason8;
            FailureReason failureReason9 = new FailureReason("CVM_CREDENTIAL_REQUIRED", 8, "cvm_credential_required");
            CVM_CREDENTIAL_REQUIRED = failureReason9;
            FailureReason failureReason10 = new FailureReason("STORAGE_RECOVERY_REQUIRED", 9, ConnectionReducerKt.CONNECT_ERROR_TYPE_STORAGE_RECOVERY);
            STORAGE_RECOVERY_REQUIRED = failureReason10;
            FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3, failureReason4, failureReason5, failureReason6, failureReason7, failureReason8, failureReason9, failureReason10};
            $VALUES = failureReasonArr;
            $ENTRIES = C3cG.A0w(failureReasonArr);
        }

        public static Ey9<FailureReason> getEntries() {
            return $ENTRIES;
        }

        public static FailureReason valueOf(String str) {
            return (FailureReason) Enum.valueOf(FailureReason.class, str);
        }

        public static FailureReason[] values() {
            return (FailureReason[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public FailureReason(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final class FinishedStageTrace {
        public static final int $stable = 8;
        public final int key;
        public final ParkedTiming parkedTiming;
        public final Map<Point, Long> timestamps;

        public FinishedStageTrace(int i, Map<Point, Long> map, ParkedTiming parkedTiming) {
            C7384Etj.A0Y(map, 1);
            this.key = i;
            this.timestamps = map;
            this.parkedTiming = parkedTiming;
        }

        public final int getKey() {
            return this.key;
        }

        public final ParkedTiming getParkedTiming() {
            return this.parkedTiming;
        }

        public final Map<Point, Long> getTimestamps() {
            return this.timestamps;
        }
    }

    public final class KeepaliveDropDetail {
        public static final int $stable = 0;
        public final String presence;
        public final long waitUptimeMs;

        public KeepaliveDropDetail(String str, long j) {
            C7384Etj.A0Y(str, 0);
            this.presence = str;
            this.waitUptimeMs = j;
        }

        public final String getPresence() {
            return this.presence;
        }

        public final long getWaitUptimeMs() {
            return this.waitUptimeMs;
        }
    }

    public final class ParkedTiming {
        public static final int $stable = 0;
        public final long ageMsAtTake;
        public final boolean inFlightAtClaim;
        public final Long remainingWaitMs;
        public final Long transportDurationMs;

        public final long getAgeMsAtTake() {
            return this.ageMsAtTake;
        }

        public final boolean getInFlightAtClaim() {
            return this.inFlightAtClaim;
        }

        public final Long getRemainingWaitMs() {
            return this.remainingWaitMs;
        }

        public final Long getTransportDurationMs() {
            return this.transportDurationMs;
        }

        public ParkedTiming(Long l, long j, boolean z, Long l2) {
            this.transportDurationMs = l;
            this.ageMsAtTake = j;
            this.inFlightAtClaim = z;
            this.remainingWaitMs = l2;
        }

        public /* synthetic */ ParkedTiming(Long l, long j, boolean z, Long l2, int i, C06H c06h) {
            this(l, j, C3cG.A1K(i & 4, z), (i & 8) != 0 ? null : l2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Point {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Point[] $VALUES;
        public static final Point CHAT_SUBSCRIBE_END;
        public static final Point CHAT_SUBSCRIBE_START;
        public static final Point CREDENTIAL_FETCH_END;
        public static final Point CREDENTIAL_FETCH_START;
        public static final Point VM_WAKE_WAIT;
        public static final Point WS_CONNECT_END;
        public static final Point WS_CONNECT_START;
        public static final Point WS_TRANSPORT_READY;
        public static final Point WS_UPGRADED;
        public final String value;

        static {
            Point point = new Point("CREDENTIAL_FETCH_START", 0, "CREDENTIAL_FETCH_START");
            CREDENTIAL_FETCH_START = point;
            Point point2 = new Point("CREDENTIAL_FETCH_END", 1, "CREDENTIAL_FETCH_END");
            CREDENTIAL_FETCH_END = point2;
            Point point3 = new Point("WS_CONNECT_START", 2, "WS_CONNECT_START");
            WS_CONNECT_START = point3;
            Point point4 = new Point("WS_TRANSPORT_READY", 3, "WS_TRANSPORT_READY");
            WS_TRANSPORT_READY = point4;
            Point point5 = new Point("WS_UPGRADED", 4, "WS_UPGRADED");
            WS_UPGRADED = point5;
            Point point6 = new Point("WS_CONNECT_END", 5, "WS_CONNECT_END");
            WS_CONNECT_END = point6;
            Point point7 = new Point("CHAT_SUBSCRIBE_START", 6, "CHAT_SUBSCRIBE_START");
            CHAT_SUBSCRIBE_START = point7;
            Point point8 = new Point("CHAT_SUBSCRIBE_END", 7, "CHAT_SUBSCRIBE_END");
            CHAT_SUBSCRIBE_END = point8;
            Point point9 = new Point("VM_WAKE_WAIT", 8, "vm_wake_wait");
            VM_WAKE_WAIT = point9;
            Point[] pointArr = {point, point2, point3, point4, point5, point6, point7, point8, point9};
            $VALUES = pointArr;
            $ENTRIES = C3cG.A0w(pointArr);
        }

        public static Ey9<Point> getEntries() {
            return $ENTRIES;
        }

        public static Point valueOf(String str) {
            return (Point) Enum.valueOf(Point.class, str);
        }

        public static Point[] values() {
            return (Point[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Point(String str, int i, String str2) {
            this.value = str2;
        }
    }

    public final class TransportDropDetail {
        public static final int $stable = 0;
        public final String socketError;
        public final String stage;

        public final String getSocketError() {
            return this.socketError;
        }

        public final String getStage() {
            return this.stage;
        }

        public TransportDropDetail(String str, String str2) {
            this.stage = str;
            this.socketError = str2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayConnectionLogger(Function0<? extends List<String>> function0) {
        C7384Etj.A0Y(function0, 0);
        this.activeHolds = function0;
        this.dropLock = C3cG.A0T();
        this.instanceKeyCounter = BV4.A13(0);
        this.traceEnded = BV4.A12(true);
        this.stageLock = C3cG.A0T();
        this.stageTimestampsNs = C3cG.A0j();
    }

    private final void annotateAttemptCycle(int i, int i2) {
        if (i > 1) {
            HatchQplLogger.INSTANCE.markerAnnotate(734867743, "connection_attempt_cycle", String.valueOf(i), i2);
        }
    }

    private final boolean annotateVmWakeWait(int i) {
        Long l;
        synchronized (this.stageLock) {
            Integer num = this.vmWakeWaitTraceKey;
            if (num == null || num.intValue() != i || (l = this.vmWakeWaitStartedAtNs) == null) {
                return false;
            }
            annotateVmWakeWait(i, l.longValue(), System.nanoTime(), this.vmWakeWaitRetryCount);
            return true;
        }
    }

    private final void clearLastError() {
        this.lastFailureReason = null;
        this.lastHttpStatusCode = null;
        this.lastErrorType = null;
        this.lastErrorMessage = null;
        this.lastFailureLabel = null;
    }

    private final void clearPendingServiceNotice() {
        this.pendingServiceNoticeCode = null;
        this.pendingServiceNoticeMessage = null;
    }

    public final void annotate(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        C7384Etj.A0Y(str2, 1);
        HatchQplLogger.INSTANCE.markerAnnotate(734867743, str, str2, this.currentInstanceKey);
    }

    public final FailureReason classifyFailureReason(Throwable th, boolean z, Integer num) {
        int iIntValue;
        C7384Etj.A0Y(th, 0);
        return (num == null || !((iIntValue = num.intValue()) == 401 || iIntValue == 400 || iIntValue == 403)) ? !z ? FailureReason.NO_INTERNET : th instanceof SocketTimeoutException ? FailureReason.TIMEOUT : FailureReason.NETWORK_ERROR : FailureReason.AUTH_FAILED;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:4:0x000c, B:8:0x0016, B:10:0x001c, B:13:0x0034, B:15:0x0041, B:16:0x0045, B:12:0x0023), top: B:27:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void continueVmWakeWait(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            X.C7384Etj.A0Y(r12, r0)
            long r9 = java.lang.System.nanoTime()
            r5 = r11
            java.lang.Object r4 = r11.stageLock
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.traceEnded     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L16
            monitor-exit(r4)
            return
        L16:
            java.lang.Integer r0 = r11.vmWakeWaitTraceKey     // Catch: java.lang.Throwable -> L69
            int r2 = r11.currentInstanceKey     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L23
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L69
            r1 = 0
            if (r0 == r2) goto L34
        L23:
            r1 = 1
            int r0 = r11.currentInstanceKey     // Catch: java.lang.Throwable -> L69
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L69
            r11.vmWakeWaitTraceKey = r0     // Catch: java.lang.Throwable -> L69
            r11.vmWakeWaitConnectionAttemptId = r12     // Catch: java.lang.Throwable -> L69
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L69
            r11.vmWakeWaitStartedAtNs = r0     // Catch: java.lang.Throwable -> L69
        L34:
            r11 = r13
            r5.vmWakeWaitRetryCount = r13     // Catch: java.lang.Throwable -> L69
            int r6 = r5.currentInstanceKey     // Catch: java.lang.Throwable -> L69
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Long r0 = r5.vmWakeWaitStartedAtNs     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L4a
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L69
        L45:
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L69
            goto L4c
        L4a:
            r0 = r9
            goto L45
        L4c:
            monitor-exit(r4)
            boolean r0 = r2.booleanValue()
            if (r0 == 0) goto L61
            com.facebook.aura.perf.HatchQplLogger r2 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$Point r0 = com.facebook.aura.gateway.HatchGatewayConnectionLogger.Point.VM_WAKE_WAIT
            java.lang.String r1 = r0.getValue()
            r0 = 734867743(0x2bcd311f, float:1.457976E-12)
            r2.markerPoint(r0, r1, r6)
        L61:
            long r7 = r3.longValue()
            r5.annotateVmWakeWait(r6, r7, r9, r11)
            return
        L69:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.continueVmWakeWait(java.lang.String, int):void");
    }

    public final String disconnectDetail(HatchWsFailure hatchWsFailure) {
        int iOrdinal;
        C7384Etj.A0Y(hatchWsFailure, 0);
        HatchConnectTimeout hatchConnectTimeout = hatchWsFailure.connectTimeout;
        Integer num = hatchWsFailure.httpCode;
        if (hatchWsFailure.transportPingTimedOut) {
            return "transport_ping_timeout";
        }
        if (hatchConnectTimeout != null) {
            return hatchConnectTimeout.getErrorType();
        }
        if (num != null) {
            return AnonymousClass007.A0a("http_", num);
        }
        HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome = hatchWsFailure.noiseHandshakeOutcome;
        if (hatchNoiseHandshakeOutcome != null && (iOrdinal = hatchNoiseHandshakeOutcome.ordinal()) != -1) {
            if (iOrdinal == 2) {
                return "noise_enrollment_required";
            }
            if (iOrdinal == 3) {
                return "noise_key_required";
            }
            if (iOrdinal == 4) {
                return "noise_verification_failed";
            }
            if (iOrdinal != 0 && iOrdinal != 1) {
                throw C3cG.A0q();
            }
        }
        return disconnectDetail(hatchWsFailure.cause);
    }

    public final boolean logCancel(CancellationReason cancellationReason) {
        C7384Etj.A0Y(cancellationReason, 0);
        FinishedStageTrace finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = finishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
        if (finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway == null) {
            return false;
        }
        if (!endVmWakeWaitCancellation(finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, cancellationReason.getValue())) {
            int i = finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway.key;
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734867743, "cancellation_reason", cancellationReason.getValue(), i);
            annotateStageDurations(finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
            annotateAppState(i, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_END);
            hatchQplLogger.markerEnd(734867743, (short) 4, i);
            clearVmWakeWait();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logFailure(com.facebook.aura.gateway.HatchGatewayConnectionLogger.FailureReason r13, java.lang.String r14, java.lang.String r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19) {
        /*
            r12 = this;
            r0 = 0
            X.C7384Etj.A0Y(r13, r0)
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$FinishedStageTrace r6 = r12.finishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()
            if (r6 == 0) goto Lc2
            int r4 = r6.key
            boolean r11 = r12.annotateVmWakeWait(r4)
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$FailureReason r5 = com.facebook.aura.gateway.HatchGatewayConnectionLogger.FailureReason.CVM_CREDENTIAL_REQUIRED
            boolean r10 = X.AnonymousClass002.A1Z(r13, r5)
            if (r11 == 0) goto Lc6
            if (r10 != 0) goto Lc6
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$FailureReason r3 = com.facebook.aura.gateway.HatchGatewayConnectionLogger.FailureReason.NETWORK_ERROR
        L1c:
            r0 = 502(0x1f6, float:7.03E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L22:
            r2 = 734867743(0x2bcd311f, float:1.457976E-12)
            if (r11 == 0) goto L41
            if (r10 != 0) goto L41
            com.facebook.aura.perf.HatchQplLogger r8 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            java.lang.String r1 = "vm_wake_terminal_reason"
            java.lang.String r0 = r13.getValue()
            r8.markerAnnotate(r2, r1, r0, r4)
            if (r16 == 0) goto L41
            int r1 = r16.intValue()
            java.lang.String r0 = "vm_wake_terminal_http_status_code"
            r8.markerAnnotate(r2, r0, r1, r4)
        L41:
            r12.lastFailureReason = r3
            r12.lastHttpStatusCode = r7
            r12.lastErrorType = r14
            r12.lastErrorMessage = r15
            r8 = r18
            java.lang.String r0 = r12.failureLabel(r8, r3, r7)
            r12.lastFailureLabel = r0
            com.facebook.aura.perf.HatchQplLogger r1 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            java.lang.String r9 = "failure_reason"
            java.lang.String r0 = r3.getValue()
            r1.markerAnnotate(r2, r9, r0, r4)
            if (r18 == 0) goto L63
            java.lang.String r0 = "failure_phase"
            r1.markerAnnotate(r2, r0, r8, r4)
        L63:
            if (r14 == 0) goto L6a
            java.lang.String r0 = "error_type"
            r1.markerAnnotate(r2, r0, r14, r4)
        L6a:
            if (r15 == 0) goto L79
            com.facebook.aura.perf.HatchQplLogger r8 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = X.BQG.A17(r15, r0)
            java.lang.String r0 = "error_message"
            r8.markerAnnotate(r2, r0, r1, r4)
        L79:
            if (r7 == 0) goto L86
            int r7 = r7.intValue()
            com.facebook.aura.perf.HatchQplLogger r1 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            java.lang.String r0 = "http_status_code"
            r1.markerAnnotate(r2, r0, r7, r4)
        L86:
            if (r11 == 0) goto L9a
            if (r10 != 0) goto L9a
            com.facebook.aura.perf.HatchQplLogger r1 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            if (r19 != 0) goto Lc3
            if (r14 != 0) goto L94
            java.lang.String r14 = r13.getValue()
        L94:
            java.lang.String r0 = "vm_wake_wait_end_reason"
            r1.markerAnnotate(r2, r0, r14, r4)
        L9a:
            if (r17 == 0) goto Lae
            int r7 = r17.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r12.pendingWsCloseCode = r0
            com.facebook.aura.perf.HatchQplLogger r1 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            java.lang.String r0 = "ws_close_code"
            r1.markerAnnotate(r2, r0, r7, r4)
        Lae:
            r1 = 3
            if (r3 != r5) goto Lb2
            r1 = 2
        Lb2:
            r12.annotateStageDurations(r6)
            java.lang.String r0 = "app_state_at_end"
            r12.annotateAppState(r4, r0)
            com.facebook.aura.perf.HatchQplLogger r0 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            r0.markerEnd(r2, r1, r4)
            r12.clearVmWakeWait()
        Lc2:
            return
        Lc3:
            r14 = r19
            goto L94
        Lc6:
            r3 = r13
            if (r11 == 0) goto Lcd
            if (r10 != 0) goto Lcd
            goto L1c
        Lcd:
            r7 = r16
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.logFailure(com.facebook.aura.gateway.HatchGatewayConnectionLogger$FailureReason, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public final void logPoint(Point point) {
        Integer numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway;
        C7384Etj.A0Y(point, 0);
        synchronized (this.stageLock) {
            numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = recordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(point, System.nanoTime());
        }
        if (numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway != null) {
            HatchQplLogger.INSTANCE.markerPoint(734867743, point.getValue(), numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway.intValue());
        }
    }

    public final void logServiceNotice(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.pendingServiceNoticeCode = Integer.valueOf(i);
        this.pendingServiceNoticeMessage = BQG.A17(str, 200);
    }

    public final void onConnected() {
        this.hasEverConnected = true;
        synchronized (this.dropLock) {
            this.liveConnectionSinceElapsedMs = C3cI.A0O();
            this.lastDrop = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.gateway.HatchGatewayConnectionLogger.DisconnectReason r16, java.lang.String r17, boolean r18, com.facebook.aura.gateway.HatchGatewayConnectionLogger.TransportDropDetail r19, com.facebook.aura.gateway.HatchGatewayConnectionLogger.KeepaliveDropDetail r20) {
        /*
            r15 = this;
            r0 = 0
            r5 = r16
            X.C7384Etj.A0Y(r5, r0)
            long r11 = android.os.SystemClock.elapsedRealtime()
            X.1BN<java.lang.Boolean> r0 = com.facebook.aura.nodes.transport.HatchNodeServiceState.isForeground
            java.lang.Object r0 = r0.getValue()
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 != 0) goto L1f
            com.facebook.aura.gateway.NodeForegroundServiceState r0 = com.facebook.aura.gateway.NodeForegroundServiceState.INSTANCE
            boolean r0 = r0.isForeground()
            r13 = 0
            if (r0 == 0) goto L20
        L1f:
            r13 = 1
        L20:
            kotlin.jvm.functions.Function0<java.util.List<java.lang.String>> r0 = r15.activeHolds
            java.lang.Object r1 = r0.invoke()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.String r0 = ","
            r3 = 0
            java.lang.String r14 = X.AbstractC06907md.A01(r0, r1, r3)
            int r0 = r14.length()
            if (r0 != 0) goto L37
            java.lang.String r14 = "none"
        L37:
            java.lang.Object r2 = r15.dropLock
            monitor-enter(r2)
            java.lang.Long r1 = r15.liveConnectionSinceElapsedMs     // Catch: java.lang.Throwable -> L6e
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$ConnectionDrop r0 = r15.lastDrop     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L45
            if (r0 == 0) goto L45
            java.lang.Long r0 = r0.connectionAgeMs     // Catch: java.lang.Throwable -> L6e
            goto L68
        L45:
            r9 = 0
            r15.liveConnectionSinceElapsedMs = r3     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L54
            long r3 = r1.longValue()     // Catch: java.lang.Throwable -> L6e
            long r0 = r11 - r3
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L6e
        L54:
            com.facebook.aura.lifecycle.AuraAppLifecycleManager r0 = com.facebook.aura.lifecycle.AuraAppLifecycleManager.INSTANCE     // Catch: java.lang.Throwable -> L6e
            boolean r10 = r0.isAppInForeground()     // Catch: java.lang.Throwable -> L6e
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$ConnectionDrop r4 = new com.facebook.aura.gateway.HatchGatewayConnectionLogger$ConnectionDrop     // Catch: java.lang.Throwable -> L6e
            r6 = r17
            r7 = r19
            r8 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r14)     // Catch: java.lang.Throwable -> L6e
            r15.lastDrop = r4     // Catch: java.lang.Throwable -> L6e
            goto L6c
        L68:
            if (r0 != 0) goto L6c
            if (r18 == 0) goto L45
        L6c:
            monitor-exit(r2)
            return
        L6e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.gateway.HatchGatewayConnectionLogger$DisconnectReason, java.lang.String, boolean, com.facebook.aura.gateway.HatchGatewayConnectionLogger$TransportDropDetail, com.facebook.aura.gateway.HatchGatewayConnectionLogger$KeepaliveDropDetail):void");
    }

    public final Integer recordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(Point point, long j) {
        C7384Etj.A0Y(point, 0);
        synchronized (this.stageLock) {
            if (this.traceEnded.get()) {
                return null;
            }
            this.stageTimestampsNs.putIfAbsent(point, Long.valueOf(j));
            return Integer.valueOf(this.currentInstanceKey);
        }
    }

    public final void startMarker(String str, int i, String str2, String str3, boolean z) {
        AnonymousClass005.A11(str, str2, str3, 0);
        if (isVmWakeWaitActive(str)) {
            return;
        }
        endSupersededVmWakeWaitIfActive();
        clearVmWakeWait();
        int iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = beginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
        clearPendingServiceNotice();
        resetLastErrorForCycle(str);
        this.pendingWsCloseCode = null;
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734867743, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, false);
        annotateAppState(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_START);
        hatchQplLogger.markerAnnotate(734867743, "app_session_id", HatchSessionId.INSTANCE.get(), iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateAppUid(str3, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "connection_attempt_id", str, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateAttemptCycle(i, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "connect_source", str2, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "is_reconnect", false, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "reconnect_attempt", HatchPriceImpressionEventDataKt.NO_DISCOUNT, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, AuraStartupMetricsRecorder.ANNOTATION_NOISE_ENABLED, AuraNoiseVmTransport.isEnabled, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "run_in_background_enabled", z, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateNetwork(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateLastDrop(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, false);
        annotateLastError(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
    }

    public final void startReconnectMarker(int i, Integer num, String str, int i2, String str2, String str3, boolean z) {
        C7384Etj.A0Y(str, 2);
        AnonymousClass003.A0y(str2, str3);
        if (isVmWakeWaitActive(str)) {
            return;
        }
        endSupersededVmWakeWaitIfActive();
        clearVmWakeWait();
        int iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = beginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
        resetLastErrorForCycle(str);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerStart(734867743, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, false);
        annotateAppState(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_START);
        hatchQplLogger.markerAnnotate(734867743, "app_session_id", HatchSessionId.INSTANCE.get(), iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateAppUid(str3, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "connection_attempt_id", str, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateAttemptCycle(i2, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "connect_source", str2, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "is_reconnect", this.hasEverConnected, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "reconnect_attempt", String.valueOf(i), iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, AuraStartupMetricsRecorder.ANNOTATION_NOISE_ENABLED, AuraNoiseVmTransport.isEnabled, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        hatchQplLogger.markerAnnotate(734867743, "run_in_background_enabled", z, iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateNetwork(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        annotateLastDrop(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, true);
        if (num != null) {
            this.pendingWsCloseCode = num;
        }
        Integer num2 = this.pendingWsCloseCode;
        if (num2 != null) {
            hatchQplLogger.markerAnnotate(734867743, "ws_close_code", num2.intValue(), iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        }
        annotateLastError(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
        flushPendingServiceNotice(iBeginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.HatchGatewayConnectionLogger.TransportDropDetail transportDropDetail$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.network.transport.HatchWsFailure r5) {
        /*
            r4 = this;
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            java.lang.String r3 = r5.logDiagnostic
            r2 = 0
            if (r3 != 0) goto La
            return r2
        La:
            java.lang.Integer r0 = r5.httpCode
            if (r0 != 0) goto L13
            com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome r1 = r5.noiseHandshakeOutcome
            r0 = 1
            if (r1 == 0) goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = r4.mnsStage(r3)
            if (r0 == 0) goto L22
            java.lang.String r0 = X.AnonymousClass001.A0u(r3)
            java.lang.String r2 = r4.socketErrorOf(r0)
        L22:
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$TransportDropDetail r0 = new com.facebook.aura.gateway.HatchGatewayConnectionLogger$TransportDropDetail
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.transportDropDetail$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(com.facebook.aura.network.transport.HatchWsFailure):com.facebook.aura.gateway.HatchGatewayConnectionLogger$TransportDropDetail");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchNoiseHandshakeOutcome.values().length];
            try {
                AnonymousClass002.A13(HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchNoiseHandshakeOutcome.KEY_REQUIRED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void annotateAppState(int i, String str) {
        String str2 = AuraAppLifecycleManager.INSTANCE.isAppInForeground() ? "foreground" : "background";
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734867743, "app_state", str2, i);
        hatchQplLogger.markerAnnotate(734867743, str, str2, i);
    }

    private final void annotateAppUid(String str, int i) {
        if (!HatchUtil.INSTANCE.isViewerEmployee() || str.length() <= 0) {
            return;
        }
        HatchQplLogger.INSTANCE.markerAnnotate(734867743, AuraAnalyticsDecoratorImplementation.TIME_SPENT_APP_UID, str, i);
    }

    private final void annotateLastDrop(int i, boolean z) {
        ConnectionDrop connectionDrop;
        DisconnectReason disconnectReason;
        String str;
        String str2;
        synchronized (this.dropLock) {
            connectionDrop = this.lastDrop;
        }
        if (connectionDrop != null || z) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            if (connectionDrop == null || (disconnectReason = connectionDrop.reason) == null) {
                disconnectReason = DisconnectReason.UNKNOWN;
            }
            hatchQplLogger.markerAnnotate(734867743, "disconnect_reason", disconnectReason.getValue(), i);
            if (connectionDrop != null) {
                String str3 = connectionDrop.detail;
                if (str3 != null) {
                    HatchQplLogger.INSTANCE.markerAnnotate(734867743, "disconnect_detail", str3, i);
                }
                Long l = connectionDrop.connectionAgeMs;
                if (l != null) {
                    long jLongValue = l.longValue();
                    HatchQplLogger hatchQplLogger2 = HatchQplLogger.INSTANCE;
                    if (jLongValue > 2147483647L) {
                        jLongValue = 2147483647L;
                    }
                    hatchQplLogger2.markerAnnotate(734867743, "prev_connection_age_ms", (int) jLongValue, i);
                }
                HatchQplLogger hatchQplLogger3 = HatchQplLogger.INSTANCE;
                hatchQplLogger3.markerAnnotate(734867743, "prev_drop_app_state", connectionDrop.appForeground ? "foreground" : "background", i);
                long jElapsedRealtime = SystemClock.elapsedRealtime() - connectionDrop.droppedAtElapsedMs;
                if (jElapsedRealtime > 2147483647L) {
                    jElapsedRealtime = 2147483647L;
                }
                hatchQplLogger3.markerAnnotate(734867743, "prev_drop_ms_ago", (int) jElapsedRealtime, i);
                TransportDropDetail transportDropDetail = connectionDrop.transport;
                if (transportDropDetail != null && (str2 = transportDropDetail.stage) != null) {
                    hatchQplLogger3.markerAnnotate(734867743, "disconnect_transport_stage", str2, i);
                }
                TransportDropDetail transportDropDetail2 = connectionDrop.transport;
                if (transportDropDetail2 != null && (str = transportDropDetail2.socketError) != null) {
                    hatchQplLogger3.markerAnnotate(734867743, "disconnect_socket_error", str, i);
                }
                KeepaliveDropDetail keepaliveDropDetail = connectionDrop.keepalive;
                if (keepaliveDropDetail != null) {
                    hatchQplLogger3.markerAnnotate(734867743, "prev_drop_keepalive_presence", keepaliveDropDetail.presence, i);
                    long j = keepaliveDropDetail.waitUptimeMs;
                    if (j > 2147483647L) {
                        j = 2147483647L;
                    }
                    hatchQplLogger3.markerAnnotate(734867743, "prev_drop_wait_uptime_ms", (int) j, i);
                }
                hatchQplLogger3.markerAnnotate(734867743, "prev_drop_foreground_service", connectionDrop.foregroundService, i);
                hatchQplLogger3.markerAnnotate(734867743, "prev_drop_holds", connectionDrop.holds, i);
            }
        }
    }

    public static /* synthetic */ void annotateLastDrop$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        hatchGatewayConnectionLogger.annotateLastDrop(i, z);
    }

    private final void annotateLastError(int i) {
        String value;
        String strA17;
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        FailureReason failureReason = this.lastFailureReason;
        String str = "none";
        if (failureReason == null || (value = failureReason.getValue()) == null) {
            value = "none";
        }
        hatchQplLogger.markerAnnotate(734867743, "last_failure_reason", value, i);
        String str2 = this.lastErrorType;
        if (str2 == null) {
            str2 = "none";
        }
        hatchQplLogger.markerAnnotate(734867743, "last_error_type", str2, i);
        String str3 = this.lastErrorMessage;
        if (str3 != null && (strA17 = BQG.A17(str3, 200)) != null) {
            str = strA17;
        }
        hatchQplLogger.markerAnnotate(734867743, "last_error_message", str, i);
        Integer num = this.lastHttpStatusCode;
        if (num != null) {
            hatchQplLogger.markerAnnotate(734867743, "last_http_status_code", num.intValue(), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void annotateNetwork(int r6) {
        /*
            r5 = this;
            X.1BN<com.facebook.aura.network.state.AuraNetworkState> r0 = com.facebook.aura.network.state.AuraNetworkMonitor.state
            java.lang.Object r5 = r0.getValue()
            com.facebook.aura.network.state.AuraNetworkState r5 = (com.facebook.aura.network.state.AuraNetworkState) r5
            com.facebook.aura.perf.HatchQplLogger r4 = com.facebook.aura.perf.HatchQplLogger.INSTANCE
            boolean r3 = r5 instanceof com.facebook.aura.network.state.AuraNetworkState.Online
            if (r3 == 0) goto L2f
            r0 = r5
            com.facebook.aura.network.state.AuraNetworkState$Online r0 = (com.facebook.aura.network.state.AuraNetworkState.Online) r0
            com.facebook.aura.network.state.Transport r0 = r0.transport
            java.lang.String r1 = r0.name()
        L17:
            r2 = 734867743(0x2bcd311f, float:1.457976E-12)
            java.lang.String r0 = "network_transport"
            r4.markerAnnotate(r2, r0, r1, r6)
            if (r3 == 0) goto L28
            com.facebook.aura.network.state.AuraNetworkState$Online r5 = (com.facebook.aura.network.state.AuraNetworkState.Online) r5
            boolean r0 = r5.isValidated
            r1 = 1
            if (r0 != 0) goto L29
        L28:
            r1 = 0
        L29:
            java.lang.String r0 = "network_validated"
            r4.markerAnnotate(r2, r0, r1, r6)
            return
        L2f:
            com.facebook.aura.network.state.AuraNetworkState$Offline r0 = com.facebook.aura.network.state.AuraNetworkState.Offline.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 == 0) goto L3a
            java.lang.String r1 = "offline"
            goto L17
        L3a:
            com.facebook.aura.network.state.AuraNetworkState$Unknown r0 = com.facebook.aura.network.state.AuraNetworkState.Unknown.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = "unknown"
            goto L17
        L46:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.annotateNetwork(int):void");
    }

    private final void annotateStageDurations(FinishedStageTrace finishedStageTrace) {
        int i = finishedStageTrace.key;
        Iterator itA0n = AnonymousClass002.A0n(GatewayConnectStageDurations.Companion.compute(finishedStageTrace.timestamps, finishedStageTrace.parkedTiming).asAnnotations());
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            String str = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            if (jLongValue > 2147483647L) {
                jLongValue = 2147483647L;
            }
            hatchQplLogger.markerAnnotate(734867743, str, (int) jLongValue, i);
        }
        ParkedTiming parkedTiming = finishedStageTrace.parkedTiming;
        if (parkedTiming != null) {
            HatchQplLogger hatchQplLogger2 = HatchQplLogger.INSTANCE;
            hatchQplLogger2.markerAnnotate(734867743, "parked_hit", true, i);
            long j = parkedTiming.ageMsAtTake;
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                hatchQplLogger2.markerAnnotate(734867743, "parked_age_ms", (int) j, i);
            }
            hatchQplLogger2.markerAnnotate(734867743, "preconnect_in_flight_at_claim", parkedTiming.inFlightAtClaim, i);
            Iterator itA0n2 = AnonymousClass002.A0n(AnonymousClass007.A0d("preconnect_remaining_wait_ms", parkedTiming.remainingWaitMs, C3cG.A0r("parked_transport_duration_ms", parkedTiming.transportDurationMs)));
            while (itA0n2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itA0n2.next();
                String str2 = (String) entry2.getKey();
                Number number = (Number) entry2.getValue();
                if (number != null) {
                    long jLongValue2 = number.longValue();
                    if (jLongValue2 >= 0) {
                        if (jLongValue2 > 2147483647L) {
                            jLongValue2 = 2147483647L;
                        }
                        hatchQplLogger2.markerAnnotate(734867743, str2, (int) jLongValue2, i);
                    }
                }
            }
        }
    }

    private final DisconnectReason classifyDisconnectReason(Throwable th) {
        return th instanceof SocketTimeoutException ? DisconnectReason.KEEPALIVE_TIMEOUT : ((th instanceof UnknownHostException) || (th instanceof ConnectException)) ? DisconnectReason.NETWORK_CHANGE : DisconnectReason.TRANSPORT_ERROR;
    }

    public static /* synthetic */ FailureReason classifyFailureReason$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, Throwable th, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return hatchGatewayConnectionLogger.classifyFailureReason(th, z, num);
    }

    private final void clearVmWakeWait() {
        synchronized (this.stageLock) {
            this.vmWakeWaitTraceKey = null;
            this.vmWakeWaitConnectionAttemptId = null;
            this.vmWakeWaitStartedAtNs = null;
            this.vmWakeWaitRetryCount = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void endSupersededVmWakeWaitIfActive() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.stageLock
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.traceEnded     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L18
            java.lang.Integer r0 = r4.vmWakeWaitTraceKey     // Catch: java.lang.Throwable -> L22
            int r2 = r4.currentInstanceKey     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L18
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L22
            r0 = 1
            if (r1 == r2) goto L19
        L18:
            r0 = 0
        L19:
            monitor-exit(r3)
            if (r0 == 0) goto L21
            com.facebook.aura.gateway.HatchGatewayConnectionLogger$CancellationReason r0 = com.facebook.aura.gateway.HatchGatewayConnectionLogger.CancellationReason.SUPERSEDED
            r4.logCancel(r0)
        L21:
            return
        L22:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.endSupersededVmWakeWaitIfActive():void");
    }

    private final boolean endVmWakeWaitCancellation(FinishedStageTrace finishedStageTrace, String str) {
        int i = finishedStageTrace.key;
        if (!annotateVmWakeWait(i)) {
            return false;
        }
        FailureReason failureReason = FailureReason.NETWORK_ERROR;
        this.lastFailureReason = failureReason;
        this.lastHttpStatusCode = 502;
        this.lastErrorType = str;
        this.lastErrorMessage = null;
        this.lastFailureLabel = failureLabel(null, failureReason, 502);
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734867743, HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, failureReason.getValue(), i);
        hatchQplLogger.markerAnnotate(734867743, "http_status_code", 502, i);
        hatchQplLogger.markerAnnotate(734867743, "error_type", str, i);
        hatchQplLogger.markerAnnotate(734867743, HatchGatewayConnectionLoggerKt.ANNOTATION_VM_WAKE_TERMINAL_REASON, str, i);
        hatchQplLogger.markerAnnotate(734867743, "cancellation_reason", str, i);
        if (C7384Etj.areEqual(str, CancellationReason.NO_ACTIVE_DEMAND.getValue())) {
            hatchQplLogger.markerAnnotate(734867743, "cancellation_timestamp_ms", String.valueOf(System.currentTimeMillis()), i);
        }
        hatchQplLogger.markerAnnotate(734867743, "vm_wake_wait_end_reason", str, i);
        annotateStageDurations(finishedStageTrace);
        annotateAppState(i, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_END);
        hatchQplLogger.markerEnd(734867743, (short) 3, i);
        clearVmWakeWait();
        return true;
    }

    private final void flushPendingServiceNotice(int i) {
        Integer num = this.pendingServiceNoticeCode;
        if (num != null) {
            int iIntValue = num.intValue();
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            hatchQplLogger.markerAnnotate(734867743, "service_notice_code", iIntValue, i);
            String str = this.pendingServiceNoticeMessage;
            if (str != null) {
                hatchQplLogger.markerAnnotate(734867743, "service_notice_message", str, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean isVmWakeWaitActive(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r3.stageLock
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.traceEnded     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L20
            java.lang.Integer r0 = r3.vmWakeWaitTraceKey     // Catch: java.lang.Throwable -> L23
            int r1 = r3.currentInstanceKey     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L20
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L23
            if (r0 != r1) goto L20
            java.lang.String r0 = r3.vmWakeWaitConnectionAttemptId     // Catch: java.lang.Throwable -> L23
            boolean r1 = X.C7384Etj.areEqual(r0, r4)     // Catch: java.lang.Throwable -> L23
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            monitor-exit(r2)
            return r0
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionLogger.isVmWakeWaitActive(java.lang.String):boolean");
    }

    public static /* synthetic */ void logFailure$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, FailureReason failureReason, String str, String str2, Integer num, Integer num2, String str3, String str4, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        hatchGatewayConnectionLogger.logFailure(failureReason, str, str2, num, num2, str3, str4);
    }

    public static /* synthetic */ void logSuccess$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        hatchGatewayConnectionLogger.logSuccess(str);
    }

    private final String mnsStage(String str) {
        String strA0U = C7BY.A0U(str, HatchGatewayConnectionLoggerKt.MNS_STAGE_KEY, "");
        String strA0S = C7BY.A0S(strA0U, strA0U, ';');
        int length = strA0S.length();
        if (1 <= length && length < 49) {
            int i = 0;
            do {
                char cCharAt = strA0S.charAt(i);
                if ('a' <= cCharAt) {
                    if (cCharAt >= '{') {
                    }
                    i++;
                } else {
                    if ('0' > cCharAt || (cCharAt >= ':' && cCharAt != '_')) {
                    }
                    i++;
                }
            } while (i < length);
            return strA0S;
        }
        return null;
    }

    private final int nextInstanceKey() {
        int iIncrementAndGet = this.instanceKeyCounter.incrementAndGet();
        this.currentInstanceKey = iIncrementAndGet;
        return iIncrementAndGet;
    }

    public static /* synthetic */ void recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, DisconnectReason disconnectReason, String str, boolean z, TransportDropDetail transportDropDetail, KeepaliveDropDetail keepaliveDropDetail, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            transportDropDetail = null;
        }
        if ((i & 16) != 0) {
            keepaliveDropDetail = null;
        }
        hatchGatewayConnectionLogger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(disconnectReason, str, z, transportDropDetail, keepaliveDropDetail);
    }

    public static /* synthetic */ void recordParkedTiming$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, Long l, long j, boolean z, Long l2, int i, Object obj) {
        boolean zA1K = C3cG.A1K(i & 4, z);
        if ((i & 8) != 0) {
            l2 = null;
        }
        hatchGatewayConnectionLogger.recordParkedTiming(l, j, zA1K, l2);
    }

    private final void resetLastErrorForCycle(String str) {
        if (C7384Etj.areEqual(str, this.lastErrorConnectionAttemptId)) {
            return;
        }
        clearLastError();
        this.lastErrorConnectionAttemptId = str;
    }

    private final String socketErrorOf(String str) {
        return C7BY.A0q(str, "connection abort", false) ? "connection_aborted" : (C7BY.A0q(str, "connection reset", false) || C7BY.A0q(str, "reset by peer", false) || C7BY.A0q(str, "was reset", false)) ? "connection_reset" : C7BY.A0q(str, "broken pipe", false) ? "broken_pipe" : C7BY.A0q(str, "connection refused", false) ? "connection_refused" : (C7BY.A0q(str, "unreachable", false) || C7BY.A0q(str, "no route to host", false)) ? "unreachable" : (C7BY.A0q(str, "timed out", false) || C7BY.A0q(str, "timeout", false)) ? "timed_out" : C7BY.A0q(str, "end of file", false) ? "eof" : DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    public static /* synthetic */ void startReconnectMarker$default(HatchGatewayConnectionLogger hatchGatewayConnectionLogger, int i, Integer num, String str, int i2, String str2, String str3, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            num = null;
        }
        hatchGatewayConnectionLogger.startReconnectMarker(i, num, str, i2, str2, str3, z);
    }

    public final int beginStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        int iNextInstanceKey;
        synchronized (this.stageLock) {
            this.stageTimestampsNs.clear();
            this.parkedTiming = null;
            this.traceEnded.set(false);
            iNextInstanceKey = nextInstanceKey();
        }
        return iNextInstanceKey;
    }

    public final FinishedStageTrace finishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        synchronized (this.stageLock) {
            if (!C3cI.A1W(this.traceEnded)) {
                return null;
            }
            return new FinishedStageTrace(this.currentInstanceKey, AGH.A0A(this.stageTimestampsNs), this.parkedTiming);
        }
    }

    public final ParkedTiming getParkedTiming() {
        return this.parkedTiming;
    }

    public final String lastFailureLabel() {
        return this.lastFailureLabel;
    }

    public final ParkedTiming parkedTimingSnapshot$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        ParkedTiming parkedTiming;
        synchronized (this.stageLock) {
            parkedTiming = this.parkedTiming;
        }
        return parkedTiming;
    }

    public final void recordParkedTiming(Long l, long j, boolean z, Long l2) {
        synchronized (this.stageLock) {
            if (!this.traceEnded.get()) {
                this.parkedTiming = new ParkedTiming(l, j, z, l2);
            }
        }
    }

    public final void resetStageState$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        synchronized (this.stageLock) {
            this.stageTimestampsNs.clear();
            this.parkedTiming = null;
            this.traceEnded.set(false);
        }
    }

    public final GatewayConnectStageDurations stageDurationsSnapshot$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        GatewayConnectStageDurations gatewayConnectStageDurationsCompute;
        synchronized (this.stageLock) {
            gatewayConnectStageDurationsCompute = GatewayConnectStageDurations.Companion.compute(AGH.A0A(this.stageTimestampsNs), this.parkedTiming);
        }
        return gatewayConnectStageDurationsCompute;
    }

    public final Map<Point, Long> stageTimestampsSnapshot$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway() {
        Map<Point, Long> mapA0A;
        synchronized (this.stageLock) {
            mapA0A = AGH.A0A(this.stageTimestampsNs);
        }
        return mapA0A;
    }

    private final String failureLabel(String str, FailureReason failureReason, Integer num) {
        return C3cH.A0e(":", BFI.A0F(new Object[]{str, failureReason.getValue(), num}));
    }

    public final long captureTimestamp() {
        return System.nanoTime();
    }

    public final void logBackgroundCancellation(String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        FinishedStageTrace finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = finishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
        int iIncrementAndGet = finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway != null ? finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway.key : this.instanceKeyCounter.incrementAndGet();
        CancellationReason cancellationReason = CancellationReason.NO_ACTIVE_DEMAND;
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway != null) {
            if (C60O.A0g().isMarkerOn(734867743, iIncrementAndGet)) {
                if (annotateVmWakeWait(iIncrementAndGet)) {
                    cancellationReason = CancellationReason.VM_WAKE_BACKGROUNDED;
                    hatchQplLogger.markerAnnotate(734867743, "vm_wake_wait_end_reason", cancellationReason.getValue(), iIncrementAndGet);
                }
                annotateStageDurations(finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
            }
            clearVmWakeWait();
        }
        hatchQplLogger.markerStart(734867743, iIncrementAndGet, zA1b);
        annotateAppState(iIncrementAndGet, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_START);
        annotateAppUid(str2, iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734867743, "app_session_id", HatchSessionId.INSTANCE.get(), iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734867743, "connection_attempt_id", str, iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734867743, "trace_kind", "lifecycle_cancellation", iIncrementAndGet);
        annotateLastError(iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734867743, "cancellation_reason", cancellationReason.getValue(), iIncrementAndGet);
        hatchQplLogger.markerAnnotate(734867743, "cancellation_timestamp_ms", String.valueOf(System.currentTimeMillis()), iIncrementAndGet);
        annotateAppState(iIncrementAndGet, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_END);
        hatchQplLogger.markerEnd(734867743, (short) 630, iIncrementAndGet);
        clearVmWakeWait();
    }

    public final void logSuccess(String str) {
        FinishedStageTrace finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = finishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
        if (finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway != null) {
            int i = finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway.key;
            annotateVmWakeWait(i);
            if (str != null) {
                HatchQplLogger.INSTANCE.markerAnnotate(734867743, "established_connection_id", str, i);
            }
            Integer num = this.pendingWsCloseCode;
            if (num != null) {
                HatchQplLogger.INSTANCE.markerAnnotate(734867743, "ws_close_code", num.intValue(), i);
            }
            flushPendingServiceNotice(i);
            clearPendingServiceNotice();
            clearLastError();
            this.pendingWsCloseCode = null;
            annotateStageDurations(finishedStageTraceFinishStageTrace$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway);
            annotateAppState(i, HatchGatewayConnectionLoggerKt.ANNOTATION_APP_STATE_AT_END);
            HatchQplLogger.INSTANCE.markerEnd(734867743, (short) 2, i);
            clearVmWakeWait();
        }
    }

    public /* synthetic */ HatchGatewayConnectionLogger(Function0 function0, int i, C06H c06h) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    private final void annotateVmWakeWait(int i, long j, long j2, int i2) {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        hatchQplLogger.markerAnnotate(734867743, "vm_wake_retry_count", i2, i);
        long j3 = j2 - j;
        if (j3 < 0) {
            j3 = 0;
        }
        long jA05 = BV4.A05(j3);
        if (jA05 > 2147483647L) {
            jA05 = 2147483647L;
        }
        hatchQplLogger.markerAnnotate(734867743, "vm_wake_wait_ms", (int) jA05, i);
    }

    private final String disconnectDetail(Throwable th) {
        if (th instanceof IOException) {
            return "io";
        }
        return DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    public final void annotate(String str, int i) {
        C7384Etj.A0Y(str, 0);
        HatchQplLogger.INSTANCE.markerAnnotate(734867743, str, i, this.currentInstanceKey);
    }

    public final DisconnectReason classifyDisconnectReason(HatchWsFailure hatchWsFailure) {
        C7384Etj.A0Y(hatchWsFailure, 0);
        if (hatchWsFailure.transportPingTimedOut) {
            return DisconnectReason.TRANSPORT_PING_TIMEOUT;
        }
        return classifyDisconnectReason(hatchWsFailure.cause);
    }

    public final void logPoint(Point point, long j) {
        C7384Etj.A0Y(point, 0);
        Integer numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = recordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(point, j);
        if (numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway != null) {
            HatchQplLogger.INSTANCE.markerPoint(734867743, point.getValue(), numRecordStagePoint$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway.intValue(), j);
        }
    }

    public HatchGatewayConnectionLogger() {
        this(AnonymousClass1.INSTANCE);
    }
}

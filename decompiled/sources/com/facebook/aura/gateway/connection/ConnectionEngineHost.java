package com.facebook.aura.gateway.connection;

import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public interface ConnectionEngineHost {

    /* renamed from: com.facebook.aura.gateway.connection.ConnectionEngineHost$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$cancelPreparedTransport(ConnectionEngineHost connectionEngineHost) {
        }

        public static void $default$prepareTransport(ConnectionEngineHost connectionEngineHost) {
        }

        public static /* synthetic */ void access$cancelPreparedTransport$jd(ConnectionEngineHost connectionEngineHost) {
        }

        public static /* synthetic */ void access$prepareTransport$jd(ConnectionEngineHost connectionEngineHost) {
        }

        public static void $default$failBadGatewayAttempt(ConnectionEngineHost connectionEngineHost, String str, String str2, String str3) {
            AnonymousClass003.A0x(str, str2);
            connectionEngineHost.failConnectAttempt(str, str2);
        }

        public static /* synthetic */ void access$failBadGatewayAttempt$jd(ConnectionEngineHost connectionEngineHost, String str, String str2, String str3) {
            AnonymousClass003.A0x(str, str2);
            connectionEngineHost.failConnectAttempt(str, str2);
        }

        public static void $default$continueVmWakeWait(ConnectionEngineHost connectionEngineHost, int i) {
        }

        public static void $default$setVmStarting(ConnectionEngineHost connectionEngineHost, boolean z) {
        }

        public static /* synthetic */ void access$continueVmWakeWait$jd(ConnectionEngineHost connectionEngineHost, int i) {
        }

        public static /* synthetic */ void access$setVmStarting$jd(ConnectionEngineHost connectionEngineHost, boolean z) {
        }

        public static void $default$onConnectionCycleStarted(ConnectionEngineHost connectionEngineHost, int i, boolean z) {
        }

        public static /* synthetic */ void access$onConnectionCycleStarted$jd(ConnectionEngineHost connectionEngineHost, int i, boolean z) {
        }

        public static void $default$recordKeepaliveDrop(ConnectionEngineHost connectionEngineHost, boolean z, Presence presence, long j) {
        }

        public static /* synthetic */ void access$recordKeepaliveDrop$jd(ConnectionEngineHost connectionEngineHost, boolean z, Presence presence, long j) {
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static void recordKeepaliveDrop(ConnectionEngineHost connectionEngineHost, boolean z, Presence presence, long j) {
            C7384Etj.A0Y(presence, 2);
        }

        @Deprecated
        public static void cancelPreparedTransport(ConnectionEngineHost connectionEngineHost) {
        }

        @Deprecated
        public static void prepareTransport(ConnectionEngineHost connectionEngineHost) {
        }

        @Deprecated
        public static void failBadGatewayAttempt(ConnectionEngineHost connectionEngineHost, String str, String str2, String str3) {
            AnonymousClass003.A0x(str, str2);
            connectionEngineHost.failConnectAttempt(str, str2);
        }

        @Deprecated
        public static void closeTransportForNoActiveDemand(ConnectionEngineHost connectionEngineHost, long j) {
            connectionEngineHost.closeTransport();
        }

        @Deprecated
        public static void continueVmWakeWait(ConnectionEngineHost connectionEngineHost, int i) {
        }

        @Deprecated
        public static void setVmStarting(ConnectionEngineHost connectionEngineHost, boolean z) {
        }

        @Deprecated
        public static void onConnectionCycleStarted(ConnectionEngineHost connectionEngineHost, int i, boolean z) {
        }
    }

    void cancelConnectAttempt(ConnectAttemptCancellation connectAttemptCancellation);

    void cancelPreparedTransport();

    void closeTransport();

    void closeTransportForNoActiveDemand(long j);

    void continueVmWakeWait(int i);

    void emitConnectionClosed(int i, String str);

    void ensurePrimarySubscribePending();

    void failBadGatewayAttempt(String str, String str2, String str3);

    void failConnectAttempt(String str, String str2);

    void failPendingRpcRequests();

    void onConnectionCycleStarted(int i, boolean z);

    void onIntentionalDisconnect();

    void openTransport(long j, int i, boolean z, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, G0V<? super Integer, ? super String, Unit> g0v, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, G0V<? super String, ? super String, Unit> g0v2);

    void performReset(G0U<? super Boolean, Unit> g0u);

    void prepareTransport();

    void recordKeepaliveDrop(boolean z, Presence presence, long j);

    void resetDeltaState();

    void runPauseStatusCheck(long j, Function0<Unit> function0);

    void sendKeepalivePing(Presence presence);

    void setVmStarting(boolean z);
}

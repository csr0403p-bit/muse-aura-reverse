package com.facebook.aura.gateway.connection;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes6.dex */
public interface ConnectionEffect {

    public final class CancelConnectAttempt extends C06G implements ConnectionEffect {
        public final ConnectAttemptCancellation reason;

        public CancelConnectAttempt(ConnectAttemptCancellation connectAttemptCancellation) {
            C7384Etj.A0Y(connectAttemptCancellation, 0);
            this.reason = connectAttemptCancellation;
        }

        public final CancelConnectAttempt copy(ConnectAttemptCancellation connectAttemptCancellation) {
            C7384Etj.A0Y(connectAttemptCancellation, 0);
            return new CancelConnectAttempt(connectAttemptCancellation);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof CancelConnectAttempt) && this.reason == ((CancelConnectAttempt) obj).reason);
        }

        public static /* synthetic */ CancelConnectAttempt copy$default(CancelConnectAttempt cancelConnectAttempt, ConnectAttemptCancellation connectAttemptCancellation, int i, Object obj) {
            if ((i & 1) != 0) {
                connectAttemptCancellation = cancelConnectAttempt.reason;
            }
            C7384Etj.A0Y(connectAttemptCancellation, 0);
            return new CancelConnectAttempt(connectAttemptCancellation);
        }

        public final ConnectAttemptCancellation component1() {
            return this.reason;
        }

        public final ConnectAttemptCancellation getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class CancelExhaustionCooldown implements ConnectionEffect {
        public static final CancelExhaustionCooldown INSTANCE = new CancelExhaustionCooldown();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelExhaustionCooldown);
        }

        public String toString() {
            return "CancelExhaustionCooldown";
        }

        public int hashCode() {
            return 810477484;
        }
    }

    public final class CancelHandshakeWatchdog implements ConnectionEffect {
        public static final CancelHandshakeWatchdog INSTANCE = new CancelHandshakeWatchdog();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelHandshakeWatchdog);
        }

        public String toString() {
            return "CancelHandshakeWatchdog";
        }

        public int hashCode() {
            return -633661631;
        }
    }

    public final class CancelKeepaliveTimer implements ConnectionEffect {
        public static final CancelKeepaliveTimer INSTANCE = new CancelKeepaliveTimer();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelKeepaliveTimer);
        }

        public String toString() {
            return "CancelKeepaliveTimer";
        }

        public int hashCode() {
            return 394541248;
        }
    }

    public final class CancelReconnectTimer implements ConnectionEffect {
        public static final CancelReconnectTimer INSTANCE = new CancelReconnectTimer();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelReconnectTimer);
        }

        public String toString() {
            return "CancelReconnectTimer";
        }

        public int hashCode() {
            return -1114770639;
        }
    }

    public final class CancelStabilityTimer implements ConnectionEffect {
        public static final CancelStabilityTimer INSTANCE = new CancelStabilityTimer();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelStabilityTimer);
        }

        public String toString() {
            return "CancelStabilityTimer";
        }

        public int hashCode() {
            return 930581023;
        }
    }

    public final class CloseTransport implements ConnectionEffect {
        public static final CloseTransport INSTANCE = new CloseTransport();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseTransport);
        }

        public String toString() {
            return "CloseTransport";
        }

        public int hashCode() {
            return -1465864518;
        }
    }

    public final class ContinueVmWakeWait extends C06G implements ConnectionEffect {
        public final int retryCount;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ContinueVmWakeWait) && this.retryCount == ((ContinueVmWakeWait) obj).retryCount);
        }

        public static /* synthetic */ ContinueVmWakeWait copy$default(ContinueVmWakeWait continueVmWakeWait, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = continueVmWakeWait.retryCount;
            }
            return new ContinueVmWakeWait(i);
        }

        public final int component1() {
            return this.retryCount;
        }

        public final ContinueVmWakeWait copy(int i) {
            return new ContinueVmWakeWait(i);
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public int hashCode() {
            return this.retryCount;
        }

        public ContinueVmWakeWait(int i) {
            this.retryCount = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class EmitConnectionClosed extends C06G implements ConnectionEffect {
        public final int code;
        public final String reason;

        public EmitConnectionClosed(int i, String str) {
            C7384Etj.A0Y(str, 1);
            this.code = i;
            this.reason = str;
        }

        public final EmitConnectionClosed copy(int i, String str) {
            C7384Etj.A0Y(str, 1);
            return new EmitConnectionClosed(i, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EmitConnectionClosed) {
                    EmitConnectionClosed emitConnectionClosed = (EmitConnectionClosed) obj;
                    if (this.code != emitConnectionClosed.code || !C7384Etj.areEqual(this.reason, emitConnectionClosed.reason)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ EmitConnectionClosed copy$default(EmitConnectionClosed emitConnectionClosed, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = emitConnectionClosed.code;
            }
            if ((i2 & 2) != 0) {
                str = emitConnectionClosed.reason;
            }
            C7384Etj.A0Y(str, 1);
            return new EmitConnectionClosed(i, str);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.reason;
        }

        public final int getCode() {
            return this.code;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.reason, this.code * 31);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class EnsurePrimarySubscribePending implements ConnectionEffect {
        public static final EnsurePrimarySubscribePending INSTANCE = new EnsurePrimarySubscribePending();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EnsurePrimarySubscribePending);
        }

        public String toString() {
            return "EnsurePrimarySubscribePending";
        }

        public int hashCode() {
            return -2075428056;
        }
    }

    public final class FailBadGatewayAttempt extends C06G implements ConnectionEffect {
        public final String errorMessage;
        public final String errorType;
        public final String vmWakeWaitEndReason;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FailBadGatewayAttempt) {
                    FailBadGatewayAttempt failBadGatewayAttempt = (FailBadGatewayAttempt) obj;
                    if (!C7384Etj.areEqual(this.errorType, failBadGatewayAttempt.errorType) || !C7384Etj.areEqual(this.errorMessage, failBadGatewayAttempt.errorMessage) || !C7384Etj.areEqual(this.vmWakeWaitEndReason, failBadGatewayAttempt.vmWakeWaitEndReason)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FailBadGatewayAttempt copy$default(FailBadGatewayAttempt failBadGatewayAttempt, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failBadGatewayAttempt.errorType;
            }
            if ((i & 2) != 0) {
                str2 = failBadGatewayAttempt.errorMessage;
            }
            if ((i & 4) != 0) {
                str3 = failBadGatewayAttempt.vmWakeWaitEndReason;
            }
            return failBadGatewayAttempt.copy(str, str2, str3);
        }

        public final String component1() {
            return this.errorType;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final String component3() {
            return this.vmWakeWaitEndReason;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public final String getVmWakeWaitEndReason() {
            return this.vmWakeWaitEndReason;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.errorMessage, AnonymousClass001.A0G(this.errorType)) + AnonymousClass006.A0G(this.vmWakeWaitEndReason);
        }

        public FailBadGatewayAttempt(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.errorType = str;
            this.errorMessage = str2;
            this.vmWakeWaitEndReason = str3;
        }

        public final FailBadGatewayAttempt copy(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            return new FailBadGatewayAttempt(str, str2, str3);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ FailBadGatewayAttempt(String str, String str2, String str3, int i, C06H c06h) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }

    public final class FailConnectAttempt extends C06G implements ConnectionEffect {
        public final String errorMessage;
        public final String errorType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FailConnectAttempt) {
                    FailConnectAttempt failConnectAttempt = (FailConnectAttempt) obj;
                    if (!C7384Etj.areEqual(this.errorType, failConnectAttempt.errorType) || !C7384Etj.areEqual(this.errorMessage, failConnectAttempt.errorMessage)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ FailConnectAttempt copy$default(FailConnectAttempt failConnectAttempt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failConnectAttempt.errorType;
            }
            if ((i & 2) != 0) {
                str2 = failConnectAttempt.errorMessage;
            }
            AnonymousClass003.A0u(str, str2);
            return new FailConnectAttempt(str, str2);
        }

        public final String component1() {
            return this.errorType;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getErrorType() {
            return this.errorType;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.errorMessage, AnonymousClass001.A0G(this.errorType));
        }

        public FailConnectAttempt(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.errorType = str;
            this.errorMessage = str2;
        }

        public final FailConnectAttempt copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new FailConnectAttempt(str, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class FailPendingRpcRequests implements ConnectionEffect {
        public static final FailPendingRpcRequests INSTANCE = new FailPendingRpcRequests();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FailPendingRpcRequests);
        }

        public String toString() {
            return "FailPendingRpcRequests";
        }

        public int hashCode() {
            return -97411047;
        }
    }

    public final class NotifyIntentionalDisconnect implements ConnectionEffect {
        public static final NotifyIntentionalDisconnect INSTANCE = new NotifyIntentionalDisconnect();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NotifyIntentionalDisconnect);
        }

        public String toString() {
            return "NotifyIntentionalDisconnect";
        }

        public int hashCode() {
            return -54837951;
        }
    }

    public final class OpenTransport extends C06G implements ConnectionEffect {
        public final int connectionCycle;
        public final long epoch;
        public final boolean forceCredentialRefresh;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OpenTransport) {
                    OpenTransport openTransport = (OpenTransport) obj;
                    if (this.epoch != openTransport.epoch || this.connectionCycle != openTransport.connectionCycle || this.forceCredentialRefresh != openTransport.forceCredentialRefresh) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ OpenTransport copy$default(OpenTransport openTransport, long j, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = openTransport.epoch;
            }
            if ((i2 & 2) != 0) {
                i = openTransport.connectionCycle;
            }
            if ((i2 & 4) != 0) {
                z = openTransport.forceCredentialRefresh;
            }
            return new OpenTransport(j, i, z);
        }

        public final long component1() {
            return this.epoch;
        }

        public final int component2() {
            return this.connectionCycle;
        }

        public final boolean component3() {
            return this.forceCredentialRefresh;
        }

        public final OpenTransport copy(long j, int i, boolean z) {
            return new OpenTransport(j, i, z);
        }

        public final int getConnectionCycle() {
            return this.connectionCycle;
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public final boolean getForceCredentialRefresh() {
            return this.forceCredentialRefresh;
        }

        public int hashCode() {
            return C0KA.A00((C3cI.A01(this.epoch) + this.connectionCycle) * 31, this.forceCredentialRefresh);
        }

        public OpenTransport(long j, int i, boolean z) {
            this.epoch = j;
            this.connectionCycle = i;
            this.forceCredentialRefresh = z;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ OpenTransport(long j, int i, boolean z, int i2, C06H c06h) {
            this(j, i, AnonymousClass005.A1O(i2, z));
        }
    }

    public final class PerformReset implements ConnectionEffect {
        public static final PerformReset INSTANCE = new PerformReset();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PerformReset);
        }

        public String toString() {
            return "PerformReset";
        }

        public int hashCode() {
            return 1045204823;
        }
    }

    public final class RecordKeepaliveDrop extends C06G implements ConnectionEffect {
        public final boolean latePong;
        public final Presence presence;
        public final long waitMs;

        public RecordKeepaliveDrop(boolean z, Presence presence, long j) {
            C7384Etj.A0Y(presence, 1);
            this.latePong = z;
            this.presence = presence;
            this.waitMs = j;
        }

        public final RecordKeepaliveDrop copy(boolean z, Presence presence, long j) {
            C7384Etj.A0Y(presence, 1);
            return new RecordKeepaliveDrop(z, presence, j);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RecordKeepaliveDrop) {
                    RecordKeepaliveDrop recordKeepaliveDrop = (RecordKeepaliveDrop) obj;
                    if (this.latePong != recordKeepaliveDrop.latePong || this.presence != recordKeepaliveDrop.presence || this.waitMs != recordKeepaliveDrop.waitMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ RecordKeepaliveDrop copy$default(RecordKeepaliveDrop recordKeepaliveDrop, boolean z, Presence presence, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = recordKeepaliveDrop.latePong;
            }
            if ((i & 2) != 0) {
                presence = recordKeepaliveDrop.presence;
            }
            if ((i & 4) != 0) {
                j = recordKeepaliveDrop.waitMs;
            }
            return recordKeepaliveDrop.copy(z, presence, j);
        }

        public final boolean component1() {
            return this.latePong;
        }

        public final Presence component2() {
            return this.presence;
        }

        public final long component3() {
            return this.waitMs;
        }

        public final boolean getLatePong() {
            return this.latePong;
        }

        public final Presence getPresence() {
            return this.presence;
        }

        public final long getWaitMs() {
            return this.waitMs;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.waitMs, AnonymousClass005.A0F(this.presence, C0KA.A02(this.latePong)));
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ResetDeltaState implements ConnectionEffect {
        public static final ResetDeltaState INSTANCE = new ResetDeltaState();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetDeltaState);
        }

        public String toString() {
            return "ResetDeltaState";
        }

        public int hashCode() {
            return 1370432735;
        }
    }

    public final class RunPauseStatusCheck extends C06G implements ConnectionEffect {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof RunPauseStatusCheck) && this.epoch == ((RunPauseStatusCheck) obj).epoch);
        }

        public static /* synthetic */ RunPauseStatusCheck copy$default(RunPauseStatusCheck runPauseStatusCheck, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = runPauseStatusCheck.epoch;
            }
            return new RunPauseStatusCheck(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final RunPauseStatusCheck copy(long j) {
            return new RunPauseStatusCheck(j);
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public RunPauseStatusCheck(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ScheduleExhaustionCooldown extends C06G implements ConnectionEffect {
        public final long delayMs;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScheduleExhaustionCooldown) && this.delayMs == ((ScheduleExhaustionCooldown) obj).delayMs);
        }

        public static /* synthetic */ ScheduleExhaustionCooldown copy$default(ScheduleExhaustionCooldown scheduleExhaustionCooldown, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = scheduleExhaustionCooldown.delayMs;
            }
            return new ScheduleExhaustionCooldown(j);
        }

        public final long component1() {
            return this.delayMs;
        }

        public final ScheduleExhaustionCooldown copy(long j) {
            return new ScheduleExhaustionCooldown(j);
        }

        public final long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.delayMs);
        }

        public ScheduleExhaustionCooldown(long j) {
            this.delayMs = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ScheduleKeepaliveTimer extends C06G implements ConnectionEffect {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScheduleKeepaliveTimer) && this.epoch == ((ScheduleKeepaliveTimer) obj).epoch);
        }

        public static /* synthetic */ ScheduleKeepaliveTimer copy$default(ScheduleKeepaliveTimer scheduleKeepaliveTimer, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = scheduleKeepaliveTimer.epoch;
            }
            return new ScheduleKeepaliveTimer(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final ScheduleKeepaliveTimer copy(long j) {
            return new ScheduleKeepaliveTimer(j);
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public ScheduleKeepaliveTimer(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ScheduleReconnectTimer extends C06G implements ConnectionEffect {
        public final long delayMs;
        public final long epoch;
        public final boolean jitter;

        public static /* synthetic */ ScheduleReconnectTimer copy$default(ScheduleReconnectTimer scheduleReconnectTimer, long j, long j2, boolean z, int i, Object obj) {
            long j3 = j;
            long j4 = j2;
            boolean z2 = z;
            if ((i & 1) != 0) {
                j3 = scheduleReconnectTimer.delayMs;
            }
            if ((i & 2) != 0) {
                j4 = scheduleReconnectTimer.epoch;
            }
            if ((i & 4) != 0) {
                z2 = scheduleReconnectTimer.jitter;
            }
            return new ScheduleReconnectTimer(j3, j4, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ScheduleReconnectTimer) {
                    ScheduleReconnectTimer scheduleReconnectTimer = (ScheduleReconnectTimer) obj;
                    if (this.delayMs != scheduleReconnectTimer.delayMs || this.epoch != scheduleReconnectTimer.epoch || this.jitter != scheduleReconnectTimer.jitter) {
                    }
                }
                return false;
            }
            return true;
        }

        public final long component1() {
            return this.delayMs;
        }

        public final long component2() {
            return this.epoch;
        }

        public final boolean component3() {
            return this.jitter;
        }

        public final ScheduleReconnectTimer copy(long j, long j2, boolean z) {
            return new ScheduleReconnectTimer(j, j2, z);
        }

        public final long getDelayMs() {
            return this.delayMs;
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public final boolean getJitter() {
            return this.jitter;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A06(this.epoch, AnonymousClass005.A07(this.delayMs)), this.jitter);
        }

        public ScheduleReconnectTimer(long j, long j2, boolean z) {
            this.delayMs = j;
            this.epoch = j2;
            this.jitter = z;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ScheduleReconnectTimer(long j, long j2, boolean z, int i, C06H c06h) {
            this(j, j2, C3cG.A1K(i & 4, z));
        }
    }

    public final class ScheduleStabilityTimer extends C06G implements ConnectionEffect {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ScheduleStabilityTimer) && this.epoch == ((ScheduleStabilityTimer) obj).epoch);
        }

        public static /* synthetic */ ScheduleStabilityTimer copy$default(ScheduleStabilityTimer scheduleStabilityTimer, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = scheduleStabilityTimer.epoch;
            }
            return new ScheduleStabilityTimer(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final ScheduleStabilityTimer copy(long j) {
            return new ScheduleStabilityTimer(j);
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public ScheduleStabilityTimer(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SendKeepalivePing extends C06G implements ConnectionEffect {
        public final Presence presence;

        public SendKeepalivePing(Presence presence) {
            C7384Etj.A0Y(presence, 0);
            this.presence = presence;
        }

        public final SendKeepalivePing copy(Presence presence) {
            C7384Etj.A0Y(presence, 0);
            return new SendKeepalivePing(presence);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SendKeepalivePing) && this.presence == ((SendKeepalivePing) obj).presence);
        }

        public static /* synthetic */ SendKeepalivePing copy$default(SendKeepalivePing sendKeepalivePing, Presence presence, int i, Object obj) {
            if ((i & 1) != 0) {
                presence = sendKeepalivePing.presence;
            }
            C7384Etj.A0Y(presence, 0);
            return new SendKeepalivePing(presence);
        }

        public final Presence component1() {
            return this.presence;
        }

        public final Presence getPresence() {
            return this.presence;
        }

        public int hashCode() {
            return this.presence.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SetVmStarting extends C06G implements ConnectionEffect {
        public final boolean isStarting;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof SetVmStarting) && this.isStarting == ((SetVmStarting) obj).isStarting);
        }

        public static /* synthetic */ SetVmStarting copy$default(SetVmStarting setVmStarting, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = setVmStarting.isStarting;
            }
            return new SetVmStarting(z);
        }

        public final boolean component1() {
            return this.isStarting;
        }

        public final SetVmStarting copy(boolean z) {
            return new SetVmStarting(z);
        }

        public int hashCode() {
            return this.isStarting ? 1231 : 1237;
        }

        public final boolean isStarting() {
            return this.isStarting;
        }

        public SetVmStarting(boolean z) {
            this.isStarting = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StartHandshakeWatchdog extends C06G implements ConnectionEffect {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof StartHandshakeWatchdog) && this.epoch == ((StartHandshakeWatchdog) obj).epoch);
        }

        public static /* synthetic */ StartHandshakeWatchdog copy$default(StartHandshakeWatchdog startHandshakeWatchdog, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = startHandshakeWatchdog.epoch;
            }
            return new StartHandshakeWatchdog(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final StartHandshakeWatchdog copy(long j) {
            return new StartHandshakeWatchdog(j);
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public StartHandshakeWatchdog(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class StartSubscribeWatchdog extends C06G implements ConnectionEffect {
        public final long epoch;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof StartSubscribeWatchdog) && this.epoch == ((StartSubscribeWatchdog) obj).epoch);
        }

        public static /* synthetic */ StartSubscribeWatchdog copy$default(StartSubscribeWatchdog startSubscribeWatchdog, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = startSubscribeWatchdog.epoch;
            }
            return new StartSubscribeWatchdog(j);
        }

        public final long component1() {
            return this.epoch;
        }

        public final StartSubscribeWatchdog copy(long j) {
            return new StartSubscribeWatchdog(j);
        }

        public final long getEpoch() {
            return this.epoch;
        }

        public int hashCode() {
            return AnonymousClass002.A0A(this.epoch);
        }

        public StartSubscribeWatchdog(long j) {
            this.epoch = j;
        }

        public String toString() {
            return super.toString();
        }
    }
}

package com.facebook.aura.gateway.connection;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.gateway.connection.ConnectionPhase;

/* loaded from: classes6.dex */
public final class ConnectionState extends C06G {
    public static final Companion Companion = new Companion();
    public static final ConnectionState INITIAL = new ConnectionState(ConnectionPhase.Idle.INSTANCE, 0, 0, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0, false, true, false, false, false, true, false, false);
    public final int connectionCycle;
    public final int credentialRefreshAttempt;
    public final long epoch;
    public final int fastReconnectAttempts;
    public final boolean intentionalDisconnect;
    public final boolean isAgentExecutionActive;
    public final boolean isAppForeground;
    public final boolean isAssistOverlayActive;
    public final boolean isBackgroundSessionActive;
    public final boolean isLiveSessionActive;
    public final boolean isNodeOperationActive;
    public final boolean isOnline;
    public final ConnectionPhase phase;
    public final int reconnectAttempt;
    public final ReconnectMode reconnectMode;
    public final long subscribeStartedAtMs;
    public final boolean vmInventoryRefreshAttempted;
    public final int vmWakeWaitRetryCount;
    public final boolean vmWakeWaitSpent;
    public final Long vmWakeWaitStartedAtMs;

    public final class Companion {
        public final ConnectionState getINITIAL() {
            return ConnectionState.INITIAL;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public ConnectionState() {
        this(ConnectionPhase.Idle.INSTANCE, 0L, 0, 0, ReconnectMode.REGULAR, 0, null, 0, false, 0, false, 0L, false, true, false, false, false, true, false, false);
    }

    public final ConnectionState copy(ConnectionPhase connectionPhase, long j, int i, int i2, ReconnectMode reconnectMode, int i3, Long l, int i4, boolean z, int i5, boolean z2, long j2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C7384Etj.A0Y(connectionPhase, 0);
        C7384Etj.A0Y(reconnectMode, 4);
        return new ConnectionState(connectionPhase, j, i, i2, reconnectMode, i3, l, i4, z, i5, z2, j2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionState) {
                ConnectionState connectionState = (ConnectionState) obj;
                if (!C7384Etj.areEqual(this.phase, connectionState.phase) || this.epoch != connectionState.epoch || this.connectionCycle != connectionState.connectionCycle || this.reconnectAttempt != connectionState.reconnectAttempt || this.reconnectMode != connectionState.reconnectMode || this.fastReconnectAttempts != connectionState.fastReconnectAttempts || !C7384Etj.areEqual(this.vmWakeWaitStartedAtMs, connectionState.vmWakeWaitStartedAtMs) || this.vmWakeWaitRetryCount != connectionState.vmWakeWaitRetryCount || this.vmWakeWaitSpent != connectionState.vmWakeWaitSpent || this.credentialRefreshAttempt != connectionState.credentialRefreshAttempt || this.vmInventoryRefreshAttempted != connectionState.vmInventoryRefreshAttempted || this.subscribeStartedAtMs != connectionState.subscribeStartedAtMs || this.intentionalDisconnect != connectionState.intentionalDisconnect || this.isAppForeground != connectionState.isAppForeground || this.isBackgroundSessionActive != connectionState.isBackgroundSessionActive || this.isAssistOverlayActive != connectionState.isAssistOverlayActive || this.isNodeOperationActive != connectionState.isNodeOperationActive || this.isOnline != connectionState.isOnline || this.isAgentExecutionActive != connectionState.isAgentExecutionActive || this.isLiveSessionActive != connectionState.isLiveSessionActive) {
                }
            }
            return false;
        }
        return true;
    }

    public final ConnectionPhase component1() {
        return this.phase;
    }

    public final int component10() {
        return this.credentialRefreshAttempt;
    }

    public final boolean component11() {
        return this.vmInventoryRefreshAttempted;
    }

    public final long component12() {
        return this.subscribeStartedAtMs;
    }

    public final boolean component13() {
        return this.intentionalDisconnect;
    }

    public final boolean component14() {
        return this.isAppForeground;
    }

    public final boolean component15() {
        return this.isBackgroundSessionActive;
    }

    public final boolean component16() {
        return this.isAssistOverlayActive;
    }

    public final boolean component17() {
        return this.isNodeOperationActive;
    }

    public final boolean component18() {
        return this.isOnline;
    }

    public final boolean component19() {
        return this.isAgentExecutionActive;
    }

    public final long component2() {
        return this.epoch;
    }

    public final boolean component20() {
        return this.isLiveSessionActive;
    }

    public final int component3() {
        return this.connectionCycle;
    }

    public final int component4() {
        return this.reconnectAttempt;
    }

    public final ReconnectMode component5() {
        return this.reconnectMode;
    }

    public final int component6() {
        return this.fastReconnectAttempts;
    }

    public final Long component7() {
        return this.vmWakeWaitStartedAtMs;
    }

    public final int component8() {
        return this.vmWakeWaitRetryCount;
    }

    public final boolean component9() {
        return this.vmWakeWaitSpent;
    }

    public final int getConnectionCycle() {
        return this.connectionCycle;
    }

    public final int getCredentialRefreshAttempt() {
        return this.credentialRefreshAttempt;
    }

    public final long getEpoch() {
        return this.epoch;
    }

    public final int getFastReconnectAttempts() {
        return this.fastReconnectAttempts;
    }

    public final boolean getIntentionalDisconnect() {
        return this.intentionalDisconnect;
    }

    public final ConnectionPhase getPhase() {
        return this.phase;
    }

    public final int getReconnectAttempt() {
        return this.reconnectAttempt;
    }

    public final ReconnectMode getReconnectMode() {
        return this.reconnectMode;
    }

    public final boolean getServiceMode() {
        return AnonymousClass002.A1Z(this.reconnectMode, ReconnectMode.SERVICE);
    }

    public final long getSubscribeStartedAtMs() {
        return this.subscribeStartedAtMs;
    }

    public final boolean getVmInventoryRefreshAttempted() {
        return this.vmInventoryRefreshAttempted;
    }

    public final int getVmWakeWaitRetryCount() {
        return this.vmWakeWaitRetryCount;
    }

    public final boolean getVmWakeWaitSpent() {
        return this.vmWakeWaitSpent;
    }

    public final Long getVmWakeWaitStartedAtMs() {
        return this.vmWakeWaitStartedAtMs;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass006.A06(this.subscribeStartedAtMs, C0KA.A01((C0KA.A01((((((AnonymousClass005.A0F(this.reconnectMode, (((AnonymousClass006.A06(this.epoch, AnonymousClass005.A0E(this.phase)) + this.connectionCycle) * 31) + this.reconnectAttempt) * 31) + this.fastReconnectAttempts) * 31) + AnonymousClass006.A0D(this.vmWakeWaitStartedAtMs)) * 31) + this.vmWakeWaitRetryCount) * 31, this.vmWakeWaitSpent) + this.credentialRefreshAttempt) * 31, this.vmInventoryRefreshAttempted)), this.intentionalDisconnect), this.isAppForeground), this.isBackgroundSessionActive), this.isAssistOverlayActive), this.isNodeOperationActive), this.isOnline), this.isAgentExecutionActive), this.isLiveSessionActive);
    }

    public final boolean isAgentExecutionActive() {
        return this.isAgentExecutionActive;
    }

    public final boolean isAppForeground() {
        return this.isAppForeground;
    }

    public final boolean isAssistOverlayActive() {
        return this.isAssistOverlayActive;
    }

    public final boolean isBackgroundSessionActive() {
        return this.isBackgroundSessionActive;
    }

    public final boolean isLiveSessionActive() {
        return this.isLiveSessionActive;
    }

    public final boolean isNodeOperationActive() {
        return this.isNodeOperationActive;
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public String toString() {
        return super.toString();
    }

    public static /* synthetic */ ConnectionState copy$default(ConnectionState connectionState, ConnectionPhase connectionPhase, long j, int i, int i2, ReconnectMode reconnectMode, int i3, Long l, int i4, boolean z, int i5, boolean z2, long j2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, Object obj) {
        ConnectionPhase connectionPhase2 = connectionPhase;
        long j3 = j;
        int i7 = i;
        int i8 = i2;
        ReconnectMode reconnectMode2 = reconnectMode;
        int i9 = i3;
        Long l2 = l;
        int i10 = i4;
        boolean z11 = z;
        int i11 = i5;
        boolean z12 = z2;
        long j4 = j2;
        boolean z13 = z3;
        boolean z14 = z4;
        boolean z15 = z5;
        boolean z16 = z6;
        boolean z17 = z7;
        boolean z18 = z8;
        boolean z19 = z9;
        boolean z20 = z10;
        if ((i6 & 1) != 0) {
            connectionPhase2 = connectionState.phase;
        }
        if ((i6 & 2) != 0) {
            j3 = connectionState.epoch;
        }
        if ((i6 & 4) != 0) {
            i7 = connectionState.connectionCycle;
        }
        if ((i6 & 8) != 0) {
            i8 = connectionState.reconnectAttempt;
        }
        if ((i6 & 16) != 0) {
            reconnectMode2 = connectionState.reconnectMode;
        }
        if ((i6 & 32) != 0) {
            i9 = connectionState.fastReconnectAttempts;
        }
        if ((i6 & 64) != 0) {
            l2 = connectionState.vmWakeWaitStartedAtMs;
        }
        if ((i6 & 128) != 0) {
            i10 = connectionState.vmWakeWaitRetryCount;
        }
        if ((i6 & 256) != 0) {
            z11 = connectionState.vmWakeWaitSpent;
        }
        if ((i6 & 512) != 0) {
            i11 = connectionState.credentialRefreshAttempt;
        }
        if ((i6 & 1024) != 0) {
            z12 = connectionState.vmInventoryRefreshAttempted;
        }
        if ((i6 & 2048) != 0) {
            j4 = connectionState.subscribeStartedAtMs;
        }
        if ((i6 & 4096) != 0) {
            z13 = connectionState.intentionalDisconnect;
        }
        if ((i6 & 8192) != 0) {
            z14 = connectionState.isAppForeground;
        }
        if ((i6 & 16384) != 0) {
            z15 = connectionState.isBackgroundSessionActive;
        }
        if ((i6 & 32768) != 0) {
            z16 = connectionState.isAssistOverlayActive;
        }
        if ((i6 & 65536) != 0) {
            z17 = connectionState.isNodeOperationActive;
        }
        if ((i6 & 131072) != 0) {
            z18 = connectionState.isOnline;
        }
        if ((i6 & 262144) != 0) {
            z19 = connectionState.isAgentExecutionActive;
        }
        if ((i6 & 524288) != 0) {
            z20 = connectionState.isLiveSessionActive;
        }
        boolean z21 = z12;
        return connectionState.copy(connectionPhase2, j3, i7, i8, reconnectMode2, i9, l2, i10, z11, i11, z21, j4, z13, z14, z15, z16, z17, z18, z19, z20);
    }

    public /* synthetic */ ConnectionState(ConnectionPhase connectionPhase, long j, int i, int i2, ReconnectMode reconnectMode, int i3, Long l, int i4, boolean z, int i5, boolean z2, long j2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, C06H c06h) {
        this((i6 & 1) != 0 ? ConnectionPhase.Idle.INSTANCE : connectionPhase, (i6 & 2) != 0 ? 0L : j, (i6 & 4) != 0 ? 0 : i, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? ReconnectMode.REGULAR : reconnectMode, (i6 & 32) != 0 ? 0 : i3, (i6 & 64) != 0 ? null : l, (i6 & 128) != 0 ? 0 : i4, C3cG.A1K(i6 & 256, z), (i6 & 512) != 0 ? 0 : i5, C3cG.A1K(i6 & 1024, z2), (i6 & 2048) != 0 ? 0L : j2, C3cG.A1K(i6 & 4096, z3), (i6 & 8192) != 0 ? true : z4, C3cG.A1K(i6 & 16384, z5), C3cH.A1L(i6, 32768, z6), C3cH.A1L(i6, 65536, z7), (i6 & 131072) == 0 ? z8 : true, C3cH.A1L(i6, 262144, z9), C3cH.A1L(i6, 524288, z10));
    }

    public ConnectionState(ConnectionPhase connectionPhase, long j, int i, int i2, ReconnectMode reconnectMode, int i3, Long l, int i4, boolean z, int i5, boolean z2, long j2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C7384Etj.A0Y(connectionPhase, 0);
        C7384Etj.A0Y(reconnectMode, 4);
        this.phase = connectionPhase;
        this.epoch = j;
        this.connectionCycle = i;
        this.reconnectAttempt = i2;
        this.reconnectMode = reconnectMode;
        this.fastReconnectAttempts = i3;
        this.vmWakeWaitStartedAtMs = l;
        this.vmWakeWaitRetryCount = i4;
        this.vmWakeWaitSpent = z;
        this.credentialRefreshAttempt = i5;
        this.vmInventoryRefreshAttempted = z2;
        this.subscribeStartedAtMs = j2;
        this.intentionalDisconnect = z3;
        this.isAppForeground = z4;
        this.isBackgroundSessionActive = z5;
        this.isAssistOverlayActive = z6;
        this.isNodeOperationActive = z7;
        this.isOnline = z8;
        this.isAgentExecutionActive = z9;
        this.isLiveSessionActive = z10;
    }
}

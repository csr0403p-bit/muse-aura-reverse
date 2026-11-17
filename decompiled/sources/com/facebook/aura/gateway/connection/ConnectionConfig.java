package com.facebook.aura.gateway.connection;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.HsK;

/* loaded from: classes6.dex */
public final class ConnectionConfig extends C06G {
    public static final Companion Companion = new Companion();
    public static final ConnectionConfig DEFAULT;
    public final int activeWorkFastRetries;
    public final long activeWorkMaxBackoffDelayMs;
    public final double backoffMultiplier;
    public final int badGatewayMaxReconnectAttempts;
    public final long badGatewayRetryDelayMs;
    public final long connectionStabilityThresholdMs;
    public final long handshakeStallTimeoutMs;
    public final long initialBackoffDelayMs;
    public final long keepaliveIntervalMs;
    public final long maxBackoffDelayMs;
    public final int maxCredentialRefreshAttempts;
    public final int maxReconnectAttempts;
    public final long retriesExhaustedCooldownMs;
    public final long serviceReconnectIntervalMs;
    public final int serviceReconnectMaxAttempts;
    public final long serviceRestartHintTtlMs;
    public final long subscribeAckMaxWaitMs;
    public final long subscribeAckTimeoutMs;
    public final int vmInventoryRefreshAfterFailedAttempts;
    public final Long vmWakeRetryDelayMs;
    public final long vmWakeWaitBudgetMs;

    public final class Companion {
        public final ConnectionConfig getDEFAULT() {
            return ConnectionConfig.DEFAULT;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        long j = 0;
        DEFAULT = new ConnectionConfig(i, j, j, j, i, 0.0d, j, i, null, j, j, j, j, j, j, j, i, i, j, j, i, 2097151, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionConfig) {
                ConnectionConfig connectionConfig = (ConnectionConfig) obj;
                if (this.maxReconnectAttempts != connectionConfig.maxReconnectAttempts || this.initialBackoffDelayMs != connectionConfig.initialBackoffDelayMs || this.maxBackoffDelayMs != connectionConfig.maxBackoffDelayMs || this.activeWorkMaxBackoffDelayMs != connectionConfig.activeWorkMaxBackoffDelayMs || this.activeWorkFastRetries != connectionConfig.activeWorkFastRetries || Double.compare(this.backoffMultiplier, connectionConfig.backoffMultiplier) != 0 || this.badGatewayRetryDelayMs != connectionConfig.badGatewayRetryDelayMs || this.badGatewayMaxReconnectAttempts != connectionConfig.badGatewayMaxReconnectAttempts || !C7384Etj.areEqual(this.vmWakeRetryDelayMs, connectionConfig.vmWakeRetryDelayMs) || this.vmWakeWaitBudgetMs != connectionConfig.vmWakeWaitBudgetMs || this.connectionStabilityThresholdMs != connectionConfig.connectionStabilityThresholdMs || this.retriesExhaustedCooldownMs != connectionConfig.retriesExhaustedCooldownMs || this.keepaliveIntervalMs != connectionConfig.keepaliveIntervalMs || this.handshakeStallTimeoutMs != connectionConfig.handshakeStallTimeoutMs || this.subscribeAckTimeoutMs != connectionConfig.subscribeAckTimeoutMs || this.subscribeAckMaxWaitMs != connectionConfig.subscribeAckMaxWaitMs || this.maxCredentialRefreshAttempts != connectionConfig.maxCredentialRefreshAttempts || this.vmInventoryRefreshAfterFailedAttempts != connectionConfig.vmInventoryRefreshAfterFailedAttempts || this.serviceRestartHintTtlMs != connectionConfig.serviceRestartHintTtlMs || this.serviceReconnectIntervalMs != connectionConfig.serviceReconnectIntervalMs || this.serviceReconnectMaxAttempts != connectionConfig.serviceReconnectMaxAttempts) {
                }
            }
            return false;
        }
        return true;
    }

    public final int component1() {
        return this.maxReconnectAttempts;
    }

    public final long component10() {
        return this.vmWakeWaitBudgetMs;
    }

    public final long component11() {
        return this.connectionStabilityThresholdMs;
    }

    public final long component12() {
        return this.retriesExhaustedCooldownMs;
    }

    public final long component13() {
        return this.keepaliveIntervalMs;
    }

    public final long component14() {
        return this.handshakeStallTimeoutMs;
    }

    public final long component15() {
        return this.subscribeAckTimeoutMs;
    }

    public final long component16() {
        return this.subscribeAckMaxWaitMs;
    }

    public final int component17() {
        return this.maxCredentialRefreshAttempts;
    }

    public final int component18() {
        return this.vmInventoryRefreshAfterFailedAttempts;
    }

    public final long component19() {
        return this.serviceRestartHintTtlMs;
    }

    public final long component2() {
        return this.initialBackoffDelayMs;
    }

    public final long component20() {
        return this.serviceReconnectIntervalMs;
    }

    public final int component21() {
        return this.serviceReconnectMaxAttempts;
    }

    public final long component3() {
        return this.maxBackoffDelayMs;
    }

    public final long component4() {
        return this.activeWorkMaxBackoffDelayMs;
    }

    public final int component5() {
        return this.activeWorkFastRetries;
    }

    public final double component6() {
        return this.backoffMultiplier;
    }

    public final long component7() {
        return this.badGatewayRetryDelayMs;
    }

    public final int component8() {
        return this.badGatewayMaxReconnectAttempts;
    }

    public final Long component9() {
        return this.vmWakeRetryDelayMs;
    }

    public final int getActiveWorkFastRetries() {
        return this.activeWorkFastRetries;
    }

    public final long getActiveWorkMaxBackoffDelayMs() {
        return this.activeWorkMaxBackoffDelayMs;
    }

    public final double getBackoffMultiplier() {
        return this.backoffMultiplier;
    }

    public final int getBadGatewayMaxReconnectAttempts() {
        return this.badGatewayMaxReconnectAttempts;
    }

    public final long getBadGatewayRetryDelayMs() {
        return this.badGatewayRetryDelayMs;
    }

    public final long getConnectionStabilityThresholdMs() {
        return this.connectionStabilityThresholdMs;
    }

    public final long getHandshakeStallTimeoutMs() {
        return this.handshakeStallTimeoutMs;
    }

    public final long getInitialBackoffDelayMs() {
        return this.initialBackoffDelayMs;
    }

    public final long getKeepaliveIntervalMs() {
        return this.keepaliveIntervalMs;
    }

    public final long getMaxBackoffDelayMs() {
        return this.maxBackoffDelayMs;
    }

    public final int getMaxCredentialRefreshAttempts() {
        return this.maxCredentialRefreshAttempts;
    }

    public final int getMaxReconnectAttempts() {
        return this.maxReconnectAttempts;
    }

    public final long getRetriesExhaustedCooldownMs() {
        return this.retriesExhaustedCooldownMs;
    }

    public final long getServiceReconnectIntervalMs() {
        return this.serviceReconnectIntervalMs;
    }

    public final int getServiceReconnectMaxAttempts() {
        return this.serviceReconnectMaxAttempts;
    }

    public final long getServiceRestartHintTtlMs() {
        return this.serviceRestartHintTtlMs;
    }

    public final long getSubscribeAckMaxWaitMs() {
        return this.subscribeAckMaxWaitMs;
    }

    public final long getSubscribeAckTimeoutMs() {
        return this.subscribeAckTimeoutMs;
    }

    public final int getVmInventoryRefreshAfterFailedAttempts() {
        return this.vmInventoryRefreshAfterFailedAttempts;
    }

    public final Long getVmWakeRetryDelayMs() {
        return this.vmWakeRetryDelayMs;
    }

    public final long getVmWakeWaitBudgetMs() {
        return this.vmWakeWaitBudgetMs;
    }

    public int hashCode() {
        return AnonymousClass006.A06(this.serviceReconnectIntervalMs, AnonymousClass006.A06(this.serviceRestartHintTtlMs, (((AnonymousClass006.A06(this.subscribeAckMaxWaitMs, AnonymousClass006.A06(this.subscribeAckTimeoutMs, AnonymousClass006.A06(this.handshakeStallTimeoutMs, AnonymousClass006.A06(this.keepaliveIntervalMs, AnonymousClass006.A06(this.retriesExhaustedCooldownMs, AnonymousClass006.A06(this.connectionStabilityThresholdMs, AnonymousClass006.A06(this.vmWakeWaitBudgetMs, (((AnonymousClass006.A06(this.badGatewayRetryDelayMs, HsK.A01(this.backoffMultiplier, (AnonymousClass006.A06(this.activeWorkMaxBackoffDelayMs, AnonymousClass006.A06(this.maxBackoffDelayMs, AnonymousClass006.A06(this.initialBackoffDelayMs, this.maxReconnectAttempts * 31))) + this.activeWorkFastRetries) * 31)) + this.badGatewayMaxReconnectAttempts) * 31) + AnonymousClass006.A0D(this.vmWakeRetryDelayMs)) * 31))))))) + this.maxCredentialRefreshAttempts) * 31) + this.vmInventoryRefreshAfterFailedAttempts) * 31)) + this.serviceReconnectMaxAttempts;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionConfig() {
        int i = 0;
        long j = 0;
        double d = 0.0d;
        this(i, j, j, j, i, d, j, i, null, j, j, j, j, j, j, j, i, i, j, j, i, 2097151, 0 == true ? 1 : 0);
    }

    public String toString() {
        return super.toString();
    }

    public final ConnectionConfig copy(int i, long j, long j2, long j3, int i2, double d, long j4, int i3, Long l, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i4, int i5, long j12, long j13, int i6) {
        return new ConnectionConfig(i, j, j2, j3, i2, d, j4, i3, l, j5, j6, j7, j8, j9, j10, j11, i4, i5, j12, j13, i6);
    }

    public static /* synthetic */ ConnectionConfig copy$default(ConnectionConfig connectionConfig, int i, long j, long j2, long j3, int i2, double d, long j4, int i3, Long l, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i4, int i5, long j12, long j13, int i6, int i7, Object obj) {
        int i8 = i;
        long j14 = j2;
        long j15 = j3;
        int i9 = i2;
        double d2 = d;
        long j16 = j4;
        int i10 = i3;
        Long l2 = l;
        long j17 = j9;
        long j18 = j10;
        long j19 = j11;
        int i11 = i4;
        long j20 = j12;
        long j21 = j13;
        long j22 = j;
        long j23 = j5;
        long j24 = j6;
        long j25 = j7;
        long j26 = j8;
        int i12 = i5;
        int i13 = i6;
        if ((i7 & 1) != 0) {
            i8 = connectionConfig.maxReconnectAttempts;
        }
        if ((i7 & 2) != 0) {
            j22 = connectionConfig.initialBackoffDelayMs;
        }
        if ((i7 & 4) != 0) {
            j14 = connectionConfig.maxBackoffDelayMs;
        }
        if ((i7 & 8) != 0) {
            j15 = connectionConfig.activeWorkMaxBackoffDelayMs;
        }
        if ((i7 & 16) != 0) {
            i9 = connectionConfig.activeWorkFastRetries;
        }
        if ((i7 & 32) != 0) {
            d2 = connectionConfig.backoffMultiplier;
        }
        if ((i7 & 64) != 0) {
            j16 = connectionConfig.badGatewayRetryDelayMs;
        }
        if ((i7 & 128) != 0) {
            i10 = connectionConfig.badGatewayMaxReconnectAttempts;
        }
        if ((i7 & 256) != 0) {
            l2 = connectionConfig.vmWakeRetryDelayMs;
        }
        if ((i7 & 512) != 0) {
            j23 = connectionConfig.vmWakeWaitBudgetMs;
        }
        if ((i7 & 1024) != 0) {
            j24 = connectionConfig.connectionStabilityThresholdMs;
        }
        if ((i7 & 2048) != 0) {
            j25 = connectionConfig.retriesExhaustedCooldownMs;
        }
        if ((i7 & 4096) != 0) {
            j26 = connectionConfig.keepaliveIntervalMs;
        }
        if ((i7 & 8192) != 0) {
            j17 = connectionConfig.handshakeStallTimeoutMs;
        }
        if ((i7 & 16384) != 0) {
            j18 = connectionConfig.subscribeAckTimeoutMs;
        }
        if ((i7 & 32768) != 0) {
            j19 = connectionConfig.subscribeAckMaxWaitMs;
        }
        if ((i7 & 65536) != 0) {
            i11 = connectionConfig.maxCredentialRefreshAttempts;
        }
        if ((i7 & 131072) != 0) {
            i12 = connectionConfig.vmInventoryRefreshAfterFailedAttempts;
        }
        if ((i7 & 262144) != 0) {
            j20 = connectionConfig.serviceRestartHintTtlMs;
        }
        if ((i7 & 524288) != 0) {
            j21 = connectionConfig.serviceReconnectIntervalMs;
        }
        if ((i7 & 1048576) != 0) {
            i13 = connectionConfig.serviceReconnectMaxAttempts;
        }
        int i14 = i13;
        return new ConnectionConfig(i8, j22, j14, j15, i9, d2, j16, i10, l2, j23, j24, j25, j26, j17, j18, j19, i11, i12, j20, j21, i14);
    }

    public ConnectionConfig(int i, long j, long j2, long j3, int i2, double d, long j4, int i3, Long l, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i4, int i5, long j12, long j13, int i6) {
        this.maxReconnectAttempts = i;
        this.initialBackoffDelayMs = j;
        this.maxBackoffDelayMs = j2;
        this.activeWorkMaxBackoffDelayMs = j3;
        this.activeWorkFastRetries = i2;
        this.backoffMultiplier = d;
        this.badGatewayRetryDelayMs = j4;
        this.badGatewayMaxReconnectAttempts = i3;
        this.vmWakeRetryDelayMs = l;
        this.vmWakeWaitBudgetMs = j5;
        this.connectionStabilityThresholdMs = j6;
        this.retriesExhaustedCooldownMs = j7;
        this.keepaliveIntervalMs = j8;
        this.handshakeStallTimeoutMs = j9;
        this.subscribeAckTimeoutMs = j10;
        this.subscribeAckMaxWaitMs = j11;
        this.maxCredentialRefreshAttempts = i4;
        this.vmInventoryRefreshAfterFailedAttempts = i5;
        this.serviceRestartHintTtlMs = j12;
        this.serviceReconnectIntervalMs = j13;
        this.serviceReconnectMaxAttempts = i6;
    }

    public /* synthetic */ ConnectionConfig(int i, long j, long j2, long j3, int i2, double d, long j4, int i3, Long l, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i4, int i5, long j12, long j13, int i6, int i7, C06H c06h) {
        this((i7 & 1) != 0 ? 10 : i, (i7 & 2) != 0 ? 1000L : j, (i7 & 4) != 0 ? 30000L : j2, (i7 & 8) != 0 ? 4000L : j3, (i7 & 16) != 0 ? 15 : i2, (i7 & 32) != 0 ? 2.0d : d, (i7 & 64) == 0 ? j4 : 1000L, (i7 & 128) != 0 ? 40 : i3, (i7 & 256) != 0 ? null : l, (i7 & 512) != 0 ? 15000L : j5, (i7 & 1024) != 0 ? 5000L : j6, (i7 & 2048) != 0 ? 60000L : j7, (i7 & 4096) != 0 ? 30000L : j8, (i7 & 8192) == 0 ? j9 : 15000L, (i7 & 16384) == 0 ? j10 : 5000L, (32768 & i7) != 0 ? 30000L : j11, (65536 & i7) != 0 ? 3 : i4, (i7 & 131072) != 0 ? 1 : i5, (i7 & 262144) != 0 ? 30000L : j12, (i7 & 524288) != 0 ? 9000L : j13, (i7 & 1048576) != 0 ? 40 : i6);
    }
}

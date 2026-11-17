package com.facebook.aura.gateway;

import X.AnonymousClass003;
import X.BV5;
import X.GAt;
import X.InterfaceC10560Hsz;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class GatewayTransportSession {
    public final String connectionAttemptId;
    public final GatewayConnectionCycleStart connectionCycleStart;
    public final InterfaceC10560Hsz<Unit> ended;
    public final long epoch;
    public final AtomicLong lastAckedPingSentAtNs;
    public volatile long lastFrameAtNs;
    public final String sentRegionHint;
    public final ConnectionPointTracker transportReadyPoint;
    public final String vmId;
    public final HatchWebSocketSession webSocketSession;
    public final ConnectionPointTracker webSocketUpgradePoint;

    public final String getConnectionAttemptId() {
        return this.connectionAttemptId;
    }

    public final GatewayConnectionCycleStart getConnectionCycleStart() {
        return this.connectionCycleStart;
    }

    public final InterfaceC10560Hsz<Unit> getEnded() {
        return this.ended;
    }

    public final long getEpoch() {
        return this.epoch;
    }

    public final AtomicLong getLastAckedPingSentAtNs() {
        return this.lastAckedPingSentAtNs;
    }

    public final long getLastFrameAtNs() {
        return this.lastFrameAtNs;
    }

    public final String getSentRegionHint() {
        return this.sentRegionHint;
    }

    public final ConnectionPointTracker getTransportReadyPoint() {
        return this.transportReadyPoint;
    }

    public final String getVmId() {
        return this.vmId;
    }

    public final HatchWebSocketSession getWebSocketSession() {
        return this.webSocketSession;
    }

    public final ConnectionPointTracker getWebSocketUpgradePoint() {
        return this.webSocketUpgradePoint;
    }

    public GatewayTransportSession(HatchWebSocketSession hatchWebSocketSession, String str, GatewayConnectionCycleStart gatewayConnectionCycleStart, String str2, String str3, long j) {
        AnonymousClass003.A0u(hatchWebSocketSession, str);
        this.webSocketSession = hatchWebSocketSession;
        this.connectionAttemptId = str;
        this.connectionCycleStart = gatewayConnectionCycleStart;
        this.vmId = str2;
        this.sentRegionHint = str3;
        this.epoch = j;
        this.transportReadyPoint = new ConnectionPointTracker();
        this.webSocketUpgradePoint = new ConnectionPointTracker();
        this.ended = new GAt(null);
        this.lastAckedPingSentAtNs = BV5.A19();
    }

    public final void setLastFrameAtNs(long j) {
        this.lastFrameAtNs = j;
    }
}

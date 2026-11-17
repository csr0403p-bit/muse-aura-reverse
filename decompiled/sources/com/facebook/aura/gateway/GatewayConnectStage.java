package com.facebook.aura.gateway;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class GatewayConnectStage {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ GatewayConnectStage[] $VALUES;
    public static final GatewayConnectStage AWAITING_NOISE_READY;
    public static final GatewayConnectStage AWAITING_SUBSCRIBE_ACK;
    public static final GatewayConnectStage AWAITING_WEBSOCKET_UPGRADE;
    public static final GatewayConnectStage FETCHING_GATEWAY_URL;
    public static final GatewayConnectStage OPENING_WEBSOCKET;
    public static final GatewayConnectStage RESOLVING_GATEWAY_URL;
    public static final GatewayConnectStage UNKNOWN;
    public final String connectPhase;
    public final String timeoutDetail;

    static {
        GatewayConnectStage gatewayConnectStage = new GatewayConnectStage("RESOLVING_GATEWAY_URL", 0, "handshake_timeout_resolving_gateway_url", HatchGatewayConnectionKt.CONNECT_PHASE_CREDENTIAL_FETCH);
        RESOLVING_GATEWAY_URL = gatewayConnectStage;
        GatewayConnectStage gatewayConnectStage2 = new GatewayConnectStage("FETCHING_GATEWAY_URL", 1, "handshake_timeout_fetching_gateway_url", HatchGatewayConnectionKt.CONNECT_PHASE_CREDENTIAL_FETCH);
        FETCHING_GATEWAY_URL = gatewayConnectStage2;
        GatewayConnectStage gatewayConnectStage3 = new GatewayConnectStage("OPENING_WEBSOCKET", 2, "handshake_timeout_opening_websocket", HatchGatewayConnectionKt.CONNECT_PHASE_WS_OPEN);
        OPENING_WEBSOCKET = gatewayConnectStage3;
        GatewayConnectStage gatewayConnectStage4 = new GatewayConnectStage("AWAITING_WEBSOCKET_UPGRADE", 3, "handshake_timeout_awaiting_websocket_upgrade", HatchGatewayConnectionKt.CONNECT_PHASE_WS_UPGRADE);
        AWAITING_WEBSOCKET_UPGRADE = gatewayConnectStage4;
        GatewayConnectStage gatewayConnectStage5 = new GatewayConnectStage("AWAITING_NOISE_READY", 4, "handshake_timeout_awaiting_noise_ready", HatchGatewayConnectionKt.CONNECT_PHASE_NOISE_HANDSHAKE);
        AWAITING_NOISE_READY = gatewayConnectStage5;
        GatewayConnectStage gatewayConnectStage6 = new GatewayConnectStage("AWAITING_SUBSCRIBE_ACK", 5, "handshake_timeout_awaiting_chat_subscribe_ack", HatchGatewayConnectionKt.CONNECT_PHASE_WS_SUBSCRIBE_ACK);
        AWAITING_SUBSCRIBE_ACK = gatewayConnectStage6;
        GatewayConnectStage gatewayConnectStage7 = new GatewayConnectStage("UNKNOWN", 6, "handshake_timeout_unknown_phase", HatchGatewayConnectionKt.CONNECT_PHASE_CREDENTIAL_FETCH);
        UNKNOWN = gatewayConnectStage7;
        GatewayConnectStage[] gatewayConnectStageArr = {gatewayConnectStage, gatewayConnectStage2, gatewayConnectStage3, gatewayConnectStage4, gatewayConnectStage5, gatewayConnectStage6, gatewayConnectStage7};
        $VALUES = gatewayConnectStageArr;
        $ENTRIES = C3cG.A0w(gatewayConnectStageArr);
    }

    public static Ey9<GatewayConnectStage> getEntries() {
        return $ENTRIES;
    }

    public static GatewayConnectStage valueOf(String str) {
        return (GatewayConnectStage) Enum.valueOf(GatewayConnectStage.class, str);
    }

    public static GatewayConnectStage[] values() {
        return (GatewayConnectStage[]) $VALUES.clone();
    }

    public final String getConnectPhase() {
        return this.connectPhase;
    }

    public final String getTimeoutDetail() {
        return this.timeoutDetail;
    }

    public GatewayConnectStage(String str, int i, String str2, String str3) {
        this.timeoutDetail = str2;
        this.connectPhase = str3;
    }
}

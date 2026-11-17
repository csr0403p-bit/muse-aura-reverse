package com.facebook.aura.gateway;

import X.AIW;
import X.BV4;
import X.C06H;
import X.C0924AIa;
import X.C7384Etj;
import com.facebook.aura.gateway.HatchGatewayConnectionLogger;
import java.util.Map;

/* loaded from: classes5.dex */
public final class GatewayConnectStageDurations {
    public static final int $stable = 0;
    public static final String ANNOTATION_CHAT_SUBSCRIBE_DURATION_MS = "chat_subscribe_duration_ms";
    public static final String ANNOTATION_CREDENTIAL_FETCH_DURATION_MS = "credential_fetch_duration_ms";
    public static final String ANNOTATION_NOISE_HANDSHAKE_DURATION_MS = "noise_handshake_duration_ms";
    public static final String ANNOTATION_WS_TRANSPORT_DURATION_MS = "ws_transport_duration_ms";
    public static final String ANNOTATION_WS_UPGRADE_DURATION_MS = "ws_upgrade_duration_ms";
    public static final Companion Companion = new Companion();
    public final Long chatSubscribeMs;
    public final Long credentialFetchMs;
    public final Long noiseHandshakeMs;
    public final Long wsTransportMs;
    public final Long wsUpgradeMs;

    public final class Companion {
        public final GatewayConnectStageDurations compute(Map<HatchGatewayConnectionLogger.Point, Long> map, HatchGatewayConnectionLogger.ParkedTiming parkedTiming) {
            Long lCompute$durationMs;
            C7384Etj.A0Y(map, 0);
            Long lCompute$durationMs2 = compute$durationMs(map, HatchGatewayConnectionLogger.Point.CREDENTIAL_FETCH_START, HatchGatewayConnectionLogger.Point.CREDENTIAL_FETCH_END);
            if (parkedTiming == null || (lCompute$durationMs = parkedTiming.transportDurationMs) == null || lCompute$durationMs.longValue() < 0) {
                lCompute$durationMs = compute$durationMs(map, HatchGatewayConnectionLogger.Point.WS_CONNECT_START, HatchGatewayConnectionLogger.Point.WS_TRANSPORT_READY);
            }
            return new GatewayConnectStageDurations(lCompute$durationMs2, lCompute$durationMs, compute$durationMs(map, HatchGatewayConnectionLogger.Point.WS_TRANSPORT_READY, HatchGatewayConnectionLogger.Point.WS_UPGRADED), compute$durationMs(map, HatchGatewayConnectionLogger.Point.WS_UPGRADED, HatchGatewayConnectionLogger.Point.WS_CONNECT_END), compute$durationMs(map, HatchGatewayConnectionLogger.Point.CHAT_SUBSCRIBE_START, HatchGatewayConnectionLogger.Point.CHAT_SUBSCRIBE_END));
        }

        public static /* synthetic */ GatewayConnectStageDurations compute$default(Companion companion, Map map, HatchGatewayConnectionLogger.ParkedTiming parkedTiming, int i, Object obj) {
            if ((i & 2) != 0) {
                parkedTiming = null;
            }
            return companion.compute(map, parkedTiming);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public static final Long compute$durationMs(Map<HatchGatewayConnectionLogger.Point, Long> map, HatchGatewayConnectionLogger.Point point, HatchGatewayConnectionLogger.Point point2) {
            Number numberA0b = BV4.A0b(point, map);
            if (numberA0b == null) {
                return null;
            }
            long jLongValue = numberA0b.longValue();
            Number numberA0b2 = BV4.A0b(point2, map);
            if (numberA0b2 == null) {
                return null;
            }
            long jLongValue2 = numberA0b2.longValue();
            if (jLongValue2 >= jLongValue) {
                return Long.valueOf(BV4.A05(jLongValue2 - jLongValue));
            }
            return null;
        }

        public Companion() {
        }
    }

    public final Map<String, Long> asAnnotations() {
        C0924AIa c0924AIa = new C0924AIa();
        Long l = this.credentialFetchMs;
        if (l != null) {
            c0924AIa.put(ANNOTATION_CREDENTIAL_FETCH_DURATION_MS, l);
        }
        Long l2 = this.wsTransportMs;
        if (l2 != null) {
            c0924AIa.put(ANNOTATION_WS_TRANSPORT_DURATION_MS, l2);
        }
        Long l3 = this.wsUpgradeMs;
        if (l3 != null) {
            c0924AIa.put(ANNOTATION_WS_UPGRADE_DURATION_MS, l3);
        }
        Long l4 = this.noiseHandshakeMs;
        if (l4 != null) {
            c0924AIa.put(ANNOTATION_NOISE_HANDSHAKE_DURATION_MS, l4);
        }
        Long l5 = this.chatSubscribeMs;
        if (l5 != null) {
            c0924AIa.put(ANNOTATION_CHAT_SUBSCRIBE_DURATION_MS, l5);
        }
        return AIW.A0K(c0924AIa);
    }

    public final Long getChatSubscribeMs() {
        return this.chatSubscribeMs;
    }

    public final Long getCredentialFetchMs() {
        return this.credentialFetchMs;
    }

    public final Long getNoiseHandshakeMs() {
        return this.noiseHandshakeMs;
    }

    public final Long getWsTransportMs() {
        return this.wsTransportMs;
    }

    public final Long getWsUpgradeMs() {
        return this.wsUpgradeMs;
    }

    public GatewayConnectStageDurations(Long l, Long l2, Long l3, Long l4, Long l5) {
        this.credentialFetchMs = l;
        this.wsTransportMs = l2;
        this.wsUpgradeMs = l3;
        this.noiseHandshakeMs = l4;
        this.chatSubscribeMs = l5;
    }
}

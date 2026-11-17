package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BV4;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionLogger;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchWebSocketPreconnectTiming;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsEvent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3", f = "HatchGatewayConnection.kt", l = {1746}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchVmConfidentiality $confidentialityBeforeAttempt;
    public final /* synthetic */ long $epoch;
    public final /* synthetic */ G0V<Integer, String, Unit> $onClosed;
    public final /* synthetic */ G0W<String, Integer, HatchNoiseHandshakeOutcome, Unit> $onFailed;
    public final /* synthetic */ G0U<String, Unit> $onOpened;
    public final /* synthetic */ Function0<Unit> $onSubscribing;
    public final /* synthetic */ PinnedHostData $pinnedHostData;
    public final /* synthetic */ NoisePrivateAuthAttempt $privateAuthAttempt;
    public final /* synthetic */ GatewayTransportSession $session;
    public final /* synthetic */ HatchWebSocketSession $wsSession;
    public final /* synthetic */ String $wsUrl;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3(HatchWebSocketSession hatchWebSocketSession, HatchGatewayConnection hatchGatewayConnection, GatewayTransportSession gatewayTransportSession, HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, long j, String str, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, PinnedHostData pinnedHostData, Function0<Unit> function0, G0U<? super String, Unit> g0u, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, G0V<? super Integer, ? super String, Unit> g0v, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3> htJ) {
        super(2, htJ);
        this.$wsSession = hatchWebSocketSession;
        this.this$0 = hatchGatewayConnection;
        this.$session = gatewayTransportSession;
        this.this$1 = gatewayConnectionEngineHost;
        this.$epoch = j;
        this.$wsUrl = str;
        this.$privateAuthAttempt = noisePrivateAuthAttempt;
        this.$confidentialityBeforeAttempt = hatchVmConfidentiality;
        this.$pinnedHostData = pinnedHostData;
        this.$onSubscribing = function0;
        this.$onOpened = g0u;
        this.$onFailed = g0w;
        this.$onClosed = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3(this.$wsSession, this.this$0, this.$session, this.this$1, this.$epoch, this.$wsUrl, this.$privateAuthAttempt, this.$confidentialityBeforeAttempt, this.$pinnedHostData, this.$onSubscribing, this.$onOpened, this.$onFailed, this.$onClosed, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<HatchWsEvent> connectionEvents = this.$wsSession.getConnectionEvents();
            final HatchGatewayConnection hatchGatewayConnection = this.this$0;
            final GatewayTransportSession gatewayTransportSession = this.$session;
            final HatchWebSocketSession hatchWebSocketSession = this.$wsSession;
            final HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost = this.this$1;
            final long j = this.$epoch;
            final String str = this.$wsUrl;
            final NoisePrivateAuthAttempt noisePrivateAuthAttempt = this.$privateAuthAttempt;
            final HatchVmConfidentiality hatchVmConfidentiality = this.$confidentialityBeforeAttempt;
            final PinnedHostData pinnedHostData = this.$pinnedHostData;
            final Function0<Unit> function0 = this.$onSubscribing;
            final G0U<String, Unit> g0u = this.$onOpened;
            final G0W<String, Integer, HatchNoiseHandshakeOutcome, Unit> g0w = this.$onFailed;
            final G0V<Integer, String, Unit> g0v = this.$onClosed;
            C20Z<? super HatchWsEvent> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3.1
                public final Object emit(HatchWsEvent hatchWsEvent, HtJ<? super Unit> htJ) {
                    HatchWsEvent.WebSocketUpgraded webSocketUpgraded;
                    HatchWsEvent.TransportReady transportReady;
                    if (hatchGatewayConnection.activeSession == gatewayTransportSession) {
                        HatchWebSocketPreconnectTiming preconnectTiming = hatchWebSocketSession.getPreconnectTiming();
                        if (preconnectTiming != null) {
                            hatchGatewayConnection.logger.recordParkedTiming(preconnectTiming.transportDurationMs, preconnectTiming.ageMsAtClaim, preconnectTiming.inFlightAtClaim, preconnectTiming.remainingWaitMs);
                        }
                        boolean z = hatchWsEvent instanceof HatchWsEvent.TransportReady;
                        Long lA0S = null;
                        gatewayConnectionEngineHost.logTransportReadyIfAvailable(gatewayTransportSession, (!z || (transportReady = (HatchWsEvent.TransportReady) hatchWsEvent) == null) ? null : C3cG.A0S(transportReady.timestampNs));
                        HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost2 = gatewayConnectionEngineHost;
                        GatewayTransportSession gatewayTransportSession2 = gatewayTransportSession;
                        boolean z2 = hatchWsEvent instanceof HatchWsEvent.WebSocketUpgraded;
                        if (z2 && (webSocketUpgraded = (HatchWsEvent.WebSocketUpgraded) hatchWsEvent) != null) {
                            lA0S = C3cG.A0S(webSocketUpgraded.timestampNs);
                        }
                        gatewayConnectionEngineHost2.logWebSocketUpgradeIfAvailable(gatewayTransportSession2, lA0S);
                        if (!(hatchWsEvent instanceof HatchWsEvent.PreconnectTiming) && !z && !z2) {
                            if (hatchWsEvent instanceof HatchWsEvent.Open) {
                                HatchWsEvent.Open open = (HatchWsEvent.Open) hatchWsEvent;
                                gatewayConnectionEngineHost.handleOpen(gatewayTransportSession, j, str, noisePrivateAuthAttempt, hatchVmConfidentiality, pinnedHostData, BV4.A0i("X-Connection-Id", open.handshakeHeaders), open.noiseHandshakeOutcome, function0, g0u, g0w);
                            } else if (!(hatchWsEvent instanceof HatchWsEvent.Closing)) {
                                if (hatchWsEvent instanceof HatchWsEvent.Closed) {
                                    C3cG.A1F(gatewayTransportSession.ended, Unit.INSTANCE);
                                    HatchWsEvent.Closed closed = (HatchWsEvent.Closed) hatchWsEvent;
                                    gatewayConnectionEngineHost.lastCloseCode = C3cG.A0R(closed.code);
                                    hatchGatewayConnection.logger.recordDrop$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(HatchGatewayConnectionLogger.DisconnectReason.SERVER_CLOSE, null, false, null, null);
                                    CFK.A0H(HatchGatewayConnectionKt.TAG, "WebSocket closed: code=%d reason=%s", C3cG.A0R(closed.code), closed.reason);
                                    g0v.invoke(C3cG.A0R(closed.code), closed.reason);
                                } else {
                                    if (!(hatchWsEvent instanceof HatchWsEvent.Failed)) {
                                        throw C3cG.A0q();
                                    }
                                    C3cG.A1F(gatewayTransportSession.ended, Unit.INSTANCE);
                                    gatewayConnectionEngineHost.handleFailure(gatewayTransportSession, j, str, noisePrivateAuthAttempt, hatchVmConfidentiality, ((HatchWsEvent.Failed) hatchWsEvent).failure, g0w, pinnedHostData);
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchWsEvent) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (connectionEvents.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

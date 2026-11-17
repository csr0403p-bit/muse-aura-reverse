package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC7559F3s;
import X.BV4;
import X.CFK;
import X.G0U;
import X.G0W;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionLogger;
import com.facebook.aura.gateway.store.HatchCvmChipClaimStore;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchWsFailure;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$4 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchVmConfidentiality $confidentialityBeforeAttempt;
    public final /* synthetic */ String $connectionId;
    public final /* synthetic */ long $epoch;
    public final /* synthetic */ HatchNoiseHandshakeOutcome $noiseHandshakeOutcome;
    public final /* synthetic */ G0W<String, Integer, HatchNoiseHandshakeOutcome, Unit> $onFailed;
    public final /* synthetic */ G0U<String, Unit> $onOpened;
    public final /* synthetic */ NoisePrivateAuthAttempt $privateAuthAttempt;
    public final /* synthetic */ GatewayTransportSession $session;
    public final /* synthetic */ String $wsUrl;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$0;
    public final /* synthetic */ HatchGatewayConnection this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayConnection$GatewayConnectionEngineHost$handleOpen$4(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str, HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, GatewayTransportSession gatewayTransportSession, long j, NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, G0W<? super String, ? super Integer, ? super HatchNoiseHandshakeOutcome, Unit> g0w, HatchGatewayConnection hatchGatewayConnection, String str2, G0U<? super String, Unit> g0u) {
        super(0);
        this.$noiseHandshakeOutcome = hatchNoiseHandshakeOutcome;
        this.$wsUrl = str;
        this.this$0 = gatewayConnectionEngineHost;
        this.$session = gatewayTransportSession;
        this.$epoch = j;
        this.$privateAuthAttempt = noisePrivateAuthAttempt;
        this.$confidentialityBeforeAttempt = hatchVmConfidentiality;
        this.$onFailed = g0w;
        this.this$1 = hatchGatewayConnection;
        this.$connectionId = str2;
        this.$onOpened = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$noiseHandshakeOutcome == HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED && !HatchCvmChipClaimStore.INSTANCE.clearProvisioning(HatchGatewayConnectionKt.requireHatcheryVmId(this.$wsUrl))) {
            HatchGatewayConnection.GatewayConnectionEngineHost.handleFailure$default(this.this$0, this.$session, this.$epoch, this.$wsUrl, this.$privateAuthAttempt, this.$confidentialityBeforeAttempt, new HatchWsFailure(BV4.A0K("cvm.provisioning_pin_retirement_failed"), null, AGH.A0E(), null, null, null, false), this.$onFailed, null, 128, null);
            return;
        }
        this.this$0.connectedVmId = HatcheryVMIdUtilsKt.extractHatcheryVMId(this.$wsUrl);
        int iCurrentRetryCount = this.this$0.currentRetryCount();
        this.this$1.logger.logPoint(HatchGatewayConnectionLogger.Point.CHAT_SUBSCRIBE_END);
        this.this$1.logger.logSuccess(this.$connectionId);
        this.this$0.endAttemptContinuity();
        this.this$1.logger.onConnected();
        String str = this.$connectionId;
        if (str == null) {
            str = "none";
        }
        CFK.A01(str, Integer.valueOf(iCurrentRetryCount), this.this$0.connectionAttemptId, HatchGatewayConnectionKt.TAG, "Gateway connected (connId=%s retryCount=%d sessionId=%s)");
        this.$onOpened.invoke(this.$connectionId);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}

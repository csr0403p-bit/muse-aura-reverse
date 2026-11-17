package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2", f = "HatchGatewayConnection.kt", l = {2460}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HoC $pong;
    public final /* synthetic */ GatewayTransportSession $session;
    public int label;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2(HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, HoC hoC, GatewayTransportSession gatewayTransportSession, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2> htJ) {
        super(2, htJ);
        this.this$0 = gatewayConnectionEngineHost;
        this.$pong = hoC;
        this.$session = gatewayTransportSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2(this.this$0, this.$pong, this.$session, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost = this.this$0;
            HoC hoC = this.$pong;
            GatewayTransportSession gatewayTransportSession = this.$session;
            this.label = 1;
            if (gatewayConnectionEngineHost.awaitPongOrEnd(hoC, gatewayTransportSession, this) == enumC10460Hji) {
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
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongWhileReceiving$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

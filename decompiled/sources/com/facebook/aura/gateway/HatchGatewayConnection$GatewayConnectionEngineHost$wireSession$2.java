package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.transport.HatchWebSocketSession;
import com.facebook.aura.network.transport.HatchWsMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2", f = "HatchGatewayConnection.kt", l = {1736}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ GatewayTransportSession $session;
    public final /* synthetic */ HatchWebSocketSession $wsSession;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2(HatchWebSocketSession hatchWebSocketSession, HatchGatewayConnection hatchGatewayConnection, GatewayTransportSession gatewayTransportSession, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2> htJ) {
        super(2, htJ);
        this.$wsSession = hatchWebSocketSession;
        this.this$0 = hatchGatewayConnection;
        this.$session = gatewayTransportSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2(this.$wsSession, this.this$0, this.$session, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<HatchWsMessage> incomingMessages = this.$wsSession.getIncomingMessages();
            final HatchGatewayConnection hatchGatewayConnection = this.this$0;
            final GatewayTransportSession gatewayTransportSession = this.$session;
            C20Z<? super HatchWsMessage> c20z = new C20Z() { // from class: com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2.1
                public final Object emit(HatchWsMessage hatchWsMessage, HtJ<? super Unit> htJ) {
                    GatewayTransportSession gatewayTransportSession2 = hatchGatewayConnection.activeSession;
                    GatewayTransportSession gatewayTransportSession3 = gatewayTransportSession;
                    if (gatewayTransportSession2 == gatewayTransportSession3) {
                        gatewayTransportSession3.lastFrameAtNs = System.nanoTime();
                        if (hatchWsMessage instanceof HatchWsMessage.Text) {
                            Object objOnMessage = hatchGatewayConnection.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().onMessage(((HatchWsMessage.Text) hatchWsMessage).text, htJ);
                            if (objOnMessage == EnumC10460Hji.A02) {
                                return objOnMessage;
                            }
                        } else {
                            if (!(hatchWsMessage instanceof HatchWsMessage.Binary)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CFK.A06(HatchGatewayConnectionKt.TAG, "Unexpected binary frame; dropping");
                        }
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchWsMessage) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (incomingMessages.collect(c20z, this) == enumC10460Hji) {
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
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$wireSession$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

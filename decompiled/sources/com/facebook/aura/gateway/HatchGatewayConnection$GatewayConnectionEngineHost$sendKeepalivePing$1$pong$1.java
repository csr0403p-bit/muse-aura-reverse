package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1", f = "HatchGatewayConnection.kt", l = {2404}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super JsonElement>, Object> {
    public final /* synthetic */ JsonObject $params;
    public int label;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1(HatchGatewayConnection hatchGatewayConnection, JsonObject jsonObject, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1> htJ) {
        super(2, htJ);
        this.this$0 = hatchGatewayConnection;
        this.$params = jsonObject;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1(this.this$0, this.$params, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayEventsHandler eventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = this.this$0.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway();
                JsonObject jsonObject = this.$params;
                this.label = 1;
                obj = eventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway.sendKeepaliveRequest$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(jsonObject, 120000L, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return (JsonElement) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0D(HatchGatewayConnectionKt.TAG, "Keepalive ping send/await failed: %s", e2, e2.getMessage());
            return null;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super JsonElement> htJ) {
        return ((HatchGatewayConnection$GatewayConnectionEngineHost$sendKeepalivePing$1$pong$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

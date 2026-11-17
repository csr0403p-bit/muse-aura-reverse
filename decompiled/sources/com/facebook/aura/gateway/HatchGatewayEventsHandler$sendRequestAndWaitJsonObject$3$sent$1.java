package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.network.api.RpcMethod;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1", f = "HatchGatewayEventsHandler.kt", l = {612}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1 extends AbstractC07127nr implements G0U<HtJ<? super String>, Object> {
    public final /* synthetic */ RpcMethod $method;
    public final /* synthetic */ G0U<HtJ<? super JsonElement>, Object> $prepareParams;
    public final /* synthetic */ String $requestId;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ HatchGatewayEventsHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1(String str, RpcMethod rpcMethod, G0U<? super HtJ<? super JsonElement>, ? extends Object> g0u, HatchGatewayEventsHandler hatchGatewayEventsHandler, HtJ<? super HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1> htJ) {
        super(1, htJ);
        this.$requestId = str;
        this.$method = rpcMethod;
        this.$prepareParams = g0u;
        this.this$0 = hatchGatewayEventsHandler;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1(this.$requestId, this.$method, this.$prepareParams, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String strA0d;
        RpcMethod rpcMethod;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            strA0d = this.$requestId;
            rpcMethod = this.$method;
            G0U<HtJ<? super JsonElement>, Object> g0u = this.$prepareParams;
            this.L$0 = strA0d;
            this.L$1 = rpcMethod;
            this.label = 1;
            obj = g0u.invoke(this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            rpcMethod = (RpcMethod) this.L$1;
            strA0d = C3cG.A0d(this.L$0, obj);
        }
        String strBuildGatewayRequestBody = JarvisProtocolJsonKt.buildGatewayRequestBody(strA0d, rpcMethod, (JsonElement) obj);
        this.this$0.recordOutbound(strBuildGatewayRequestBody, this.$requestId, this.$method.getValue());
        return strBuildGatewayRequestBody;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super String> htJ) {
        return ((HatchGatewayEventsHandler$sendRequestAndWaitJsonObject$3$sent$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}

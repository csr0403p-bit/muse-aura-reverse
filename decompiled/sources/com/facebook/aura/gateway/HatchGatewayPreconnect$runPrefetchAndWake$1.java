package com.facebook.aura.gateway;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayPreconnect", f = "HatchGatewayPreconnect.kt", l = {174}, m = "runPrefetchAndWake$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayPreconnect$runPrefetchAndWake$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchGatewayPreconnect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayPreconnect$runPrefetchAndWake$1(HatchGatewayPreconnect hatchGatewayPreconnect, HtJ<? super HatchGatewayPreconnect$runPrefetchAndWake$1> htJ) {
        super(htJ);
        this.this$0 = hatchGatewayPreconnect;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runPrefetchAndWake$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(null, this);
    }
}

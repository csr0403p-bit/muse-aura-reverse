package com.facebook.aura.gateway;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection", f = "HatchGatewayConnection.kt", l = {585}, m = "sendPrepared$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway", v = 2)
/* loaded from: classes3.dex */
public final class HatchGatewayConnection$sendPrepared$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchGatewayConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$sendPrepared$1(HatchGatewayConnection hatchGatewayConnection, HtJ<? super HatchGatewayConnection$sendPrepared$1> htJ) {
        super(htJ);
        this.this$0 = hatchGatewayConnection;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendPrepared$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(null, this);
    }
}

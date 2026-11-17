package com.facebook.aura.gateway;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchGatewayConnection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnection$GatewayConnectionEngineHost", f = "HatchGatewayConnection.kt", l = {2826}, m = "awaitPongOrEnd", v = 2)
/* loaded from: classes5.dex */
public final class HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchGatewayConnection.GatewayConnectionEngineHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1(HatchGatewayConnection.GatewayConnectionEngineHost gatewayConnectionEngineHost, HtJ<? super HatchGatewayConnection$GatewayConnectionEngineHost$awaitPongOrEnd$1> htJ) {
        super(htJ);
        this.this$0 = gatewayConnectionEngineHost;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitPongOrEnd(null, null, this);
    }
}

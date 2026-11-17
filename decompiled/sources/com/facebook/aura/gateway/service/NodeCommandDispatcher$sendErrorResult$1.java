package com.facebook.aura.gateway.service;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.service.NodeCommandDispatcher", f = "NodeCommandDispatcher.kt", l = {99}, m = "sendErrorResult$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service", v = 2)
/* loaded from: classes3.dex */
public final class NodeCommandDispatcher$sendErrorResult$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NodeCommandDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCommandDispatcher$sendErrorResult$1(NodeCommandDispatcher nodeCommandDispatcher, HtJ<? super NodeCommandDispatcher$sendErrorResult$1> htJ) {
        super(htJ);
        this.this$0 = nodeCommandDispatcher;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendErrorResult$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(null, null, null, null, this);
    }
}

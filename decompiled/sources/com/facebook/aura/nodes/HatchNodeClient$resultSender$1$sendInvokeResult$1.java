package com.facebook.aura.nodes;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$resultSender$1", f = "HatchNodeClient.kt", l = {346}, m = "sendInvokeResult", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeClient$resultSender$1$sendInvokeResult$1 extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchNodeClient$resultSender$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$resultSender$1$sendInvokeResult$1(HatchNodeClient$resultSender$1 hatchNodeClient$resultSender$1, HtJ<? super HatchNodeClient$resultSender$1$sendInvokeResult$1> htJ) {
        super(htJ);
        this.this$0 = hatchNodeClient$resultSender$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendInvokeResult(null, null, null, this);
    }
}

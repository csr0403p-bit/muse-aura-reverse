package com.facebook.aura.nodes;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$proactiveConnectionGate$1", f = "HatchNodeClient.kt", l = {269}, m = "awaitConnected", v = 2)
/* loaded from: classes2.dex */
public final class HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1 extends HzP {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchNodeClient$proactiveConnectionGate$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1(HatchNodeClient$proactiveConnectionGate$1 hatchNodeClient$proactiveConnectionGate$1, HtJ<? super HatchNodeClient$proactiveConnectionGate$1$awaitConnected$1> htJ) {
        super(htJ);
        this.this$0 = hatchNodeClient$proactiveConnectionGate$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitConnected(0L, this);
    }
}

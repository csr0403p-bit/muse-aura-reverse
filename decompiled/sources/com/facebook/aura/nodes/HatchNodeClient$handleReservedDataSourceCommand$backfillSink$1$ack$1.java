package com.facebook.aura.nodes;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1", f = "HatchNodeClient.kt", l = {1401}, m = "ack", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1(HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1 hatchNodeClient$handleReservedDataSourceCommand$backfillSink$1, HtJ<? super HatchNodeClient$handleReservedDataSourceCommand$backfillSink$1$ack$1> htJ) {
        super(htJ);
        this.this$0 = hatchNodeClient$handleReservedDataSourceCommand$backfillSink$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.ack(null, this);
    }
}

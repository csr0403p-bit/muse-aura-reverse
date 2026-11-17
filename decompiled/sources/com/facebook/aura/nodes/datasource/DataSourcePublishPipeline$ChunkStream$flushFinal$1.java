package com.facebook.aura.nodes.datasource;

import X.HtJ;
import X.HzP;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream", f = "DataSourcePublishPipeline.kt", l = {430, 457}, m = "flushFinal", v = 2)
/* loaded from: classes6.dex */
public final class DataSourcePublishPipeline$ChunkStream$flushFinal$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataSourcePublishPipeline.ChunkStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSourcePublishPipeline$ChunkStream$flushFinal$1(DataSourcePublishPipeline.ChunkStream chunkStream, HtJ<? super DataSourcePublishPipeline$ChunkStream$flushFinal$1> htJ) {
        super(htJ);
        this.this$0 = chunkStream;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flushFinal(null, null, this);
    }
}

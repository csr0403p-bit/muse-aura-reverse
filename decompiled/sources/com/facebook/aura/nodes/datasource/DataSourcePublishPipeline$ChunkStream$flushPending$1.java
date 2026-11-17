package com.facebook.aura.nodes.datasource;

import X.HtJ;
import X.HzP;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream", f = "DataSourcePublishPipeline.kt", l = {423}, m = "flushPending", v = 2)
/* loaded from: classes6.dex */
public final class DataSourcePublishPipeline$ChunkStream$flushPending$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataSourcePublishPipeline.ChunkStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSourcePublishPipeline$ChunkStream$flushPending$1(DataSourcePublishPipeline.ChunkStream chunkStream, HtJ<? super DataSourcePublishPipeline$ChunkStream$flushPending$1> htJ) {
        super(htJ);
        this.this$0 = chunkStream;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.flushPending(null, this);
    }
}

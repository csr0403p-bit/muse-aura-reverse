package com.facebook.aura.nodes.datasource;

import X.HtJ;
import X.HzP;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import com.facebook.aura.utils.MC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.datasource.DataSourcePublishPipeline$ChunkStream", f = "DataSourcePublishPipeline.kt", l = {MC.xe_feta_entrypoint_rl.__CONFIG__, 378}, m = "emit", v = 2)
/* loaded from: classes6.dex */
public final class DataSourcePublishPipeline$ChunkStream$emit$1 extends HzP {
    public long J$0;
    public long J$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DataSourcePublishPipeline.ChunkStream this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSourcePublishPipeline$ChunkStream$emit$1(DataSourcePublishPipeline.ChunkStream chunkStream, HtJ<? super DataSourcePublishPipeline$ChunkStream$emit$1> htJ) {
        super(htJ);
        this.this$0 = chunkStream;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, null, 0L, this);
    }
}

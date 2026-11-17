package X;

import com.meta.health.core.MetaHealthQuery;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.core.MetaHealthQuery", f = "MetaHealthQuery.kt", l = {183}, m = "queryCombinedStatistics", v = 2)
/* renamed from: X.Fvc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8977Fvc extends HzP {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaHealthQuery this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8977Fvc(MetaHealthQuery metaHealthQuery, HtJ<? super C8977Fvc> htJ) {
        super(htJ);
        this.this$0 = metaHealthQuery;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A05(null, null, null, null, null, this);
    }
}

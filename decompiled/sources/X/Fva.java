package X;

import com.meta.health.core.MetaHealthQuery;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.core.MetaHealthQuery", f = "MetaHealthQuery.kt", l = {382, 423, 454}, m = "startObserving", v = 2)
/* loaded from: classes6.dex */
public final class Fva extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MetaHealthQuery this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fva(MetaHealthQuery metaHealthQuery, HtJ<? super Fva> htJ) {
        super(htJ);
        this.this$0 = metaHealthQuery;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02(null, null, this, null);
    }
}

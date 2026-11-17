package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.RetriableApiExecutor", f = "RetriableApiExecutor.kt", l = {72, 84, 115, 123, 126}, m = "executeWithRetry", v = 2)
/* renamed from: X.Geh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9728Geh<T> extends HzP {
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public long J$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RetriableApiExecutor this$0;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RetriableApiExecutor.A00(null, this.this$0, null, null, this, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9728Geh(RetriableApiExecutor retriableApiExecutor, HtJ<? super C9728Geh> htJ) {
        super(htJ);
        this.this$0 = retriableApiExecutor;
    }
}

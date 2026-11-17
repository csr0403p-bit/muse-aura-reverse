package X;

import androidx.room.coroutines.PooledConnectionImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
/* loaded from: classes5.dex */
public final class EJS<R> extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PooledConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EJS(PooledConnectionImpl pooledConnectionImpl, HtJ<? super EJS> htJ) {
        super(htJ);
        this.this$0 = pooledConnectionImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PooledConnectionImpl.A01(null, this.this$0, this, null);
    }
}

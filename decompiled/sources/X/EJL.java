package X;

import androidx.room.coroutines.ConnectionPoolImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {131, 135, 154, 159}, m = "useConnection")
/* loaded from: classes5.dex */
public final class EJL<R> extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConnectionPoolImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EJL(ConnectionPoolImpl connectionPoolImpl, HtJ<? super EJL> htJ) {
        super(htJ);
        this.this$0 = connectionPoolImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.AiC(false, null, this);
    }
}

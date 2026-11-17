package X;

import androidx.room.coroutines.PassthroughConnection;
import androidx.room.coroutines.PooledConnectionImpl;

/* loaded from: classes5.dex */
public final class EZF extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EZF(Object obj, PassthroughConnection passthroughConnection, HtJ<? super EZF> htJ) {
        super(passthroughConnection);
        this.$t = htJ;
        this.A04 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        Object obj2 = this.A04;
        switch (i) {
            case 0:
                return ((PassthroughConnection) obj2).AiF(null, null, this);
            case 1:
                return PooledConnectionImpl.A00(null, (PooledConnectionImpl) obj2, this);
            default:
                return ((F5B) obj2).emit(null, this);
        }
    }
}

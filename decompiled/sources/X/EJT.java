package X;

import androidx.room.coroutines.PassthroughConnection;

/* loaded from: classes5.dex */
public final class EJT<T> implements EJE<T>, EJF {
    public final /* synthetic */ PassthroughConnection A00;

    public EJT(PassthroughConnection passthroughConnection) {
        this.A00 = passthroughConnection;
    }

    @Override // X.EJF
    public final EJV AJP() {
        return this.A00.A02;
    }

    @Override // X.EJD
    public final <R> Object AiF(String str, G0U<? super EIK, ? extends R> g0u, HtJ<? super R> htJ) {
        return this.A00.AiF(str, g0u, htJ);
    }
}

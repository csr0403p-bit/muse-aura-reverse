package X;

import androidx.room.coroutines.PooledConnectionImpl;

/* renamed from: X.EJe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6602EJe implements C78X {
    public final PooledConnectionImpl A00;
    public final C78I<C6602EJe> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/78I<LX/EJe;>;Landroidx/room/coroutines/PooledConnectionImpl;)V */
    public C6602EJe(PooledConnectionImpl pooledConnectionImpl, C78I c78i) {
        C7384Etj.A0Y(pooledConnectionImpl, 1);
        this.A01 = c78i;
        this.A00 = pooledConnectionImpl;
    }

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public final C78I<C6602EJe> getKey() {
        return this.A01;
    }

    @Override // X.C78X, X.C78T
    public final <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}

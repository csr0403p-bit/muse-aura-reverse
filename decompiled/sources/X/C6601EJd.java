package X;

import androidx.room.coroutines.PassthroughConnection;

/* renamed from: X.EJd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6601EJd implements C78X {
    public static final C6603EJf A01 = new C6603EJf();
    public final PassthroughConnection A00;

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public final C78I<C6601EJd> getKey() {
        return A01;
    }

    public C6601EJd(PassthroughConnection passthroughConnection) {
        this.A00 = passthroughConnection;
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

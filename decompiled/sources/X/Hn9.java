package X;

/* loaded from: classes6.dex */
public final class Hn9 implements C78X, C78I<Hn9> {
    public static final Hn9 A00 = new Hn9();

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public final C78I<?> getKey() {
        return this;
    }

    @Override // X.C78X, X.C78T
    public final /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}

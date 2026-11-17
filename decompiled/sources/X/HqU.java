package X;

/* loaded from: classes6.dex */
public abstract class HqU implements C78X {
    public final C78I<?> key;

    public HqU(C78I<?> c78i) {
        C7384Etj.A0Y(c78i, 0);
        this.key = c78i;
    }

    @Override // X.C78T
    public /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public C78I<?> getKey() {
        return this.key;
    }

    @Override // X.C78X, X.C78T
    public /* bridge */ <E extends C78X> E get(C78I<E> c78i) {
        return (E) C78W.A00(this, c78i);
    }

    @Override // X.C78T
    public /* bridge */ C78T minusKey(C78I<?> c78i) {
        return C78W.A01(this, c78i);
    }

    @Override // X.C78T
    public /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}

package X;

/* renamed from: X.78J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C78J implements C78X, C78I<C78J> {
    public static final C78J A00 = new C78J();

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X
    public final C78I<C78J> getKey() {
        return A00;
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

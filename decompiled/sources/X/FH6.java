package X;

/* loaded from: classes6.dex */
public final class FH6 implements C78T {
    public final Throwable A00;
    public final /* synthetic */ C78T A01;

    @Override // X.C78T
    public final <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        return (R) this.A01.fold(r, g0v);
    }

    @Override // X.C78T
    public final <E extends C78X> E get(C78I<E> c78i) {
        return (E) this.A01.get(c78i);
    }

    @Override // X.C78T
    public final C78T minusKey(C78I<?> c78i) {
        return this.A01.minusKey(c78i);
    }

    @Override // X.C78T
    public final C78T plus(C78T c78t) {
        return this.A01.plus(c78t);
    }

    public FH6(C78T c78t, Throwable th) {
        this.A01 = c78t;
        this.A00 = th;
    }
}

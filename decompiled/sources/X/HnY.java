package X;

/* loaded from: classes6.dex */
public final class HnY<T> implements GC7<T> {
    public final T A00;
    public final ThreadLocal<T> A01;
    public final C78I<?> A02;

    @Override // X.C78T
    public final /* bridge */ <R> R fold(R r, G0V<? super R, ? super C78X, ? extends R> g0v) {
        C7384Etj.A0Y(g0v, 2);
        return g0v.invoke(r, this);
    }

    @Override // X.C78X, X.C78T
    public final <E extends C78X> E get(C78I<E> c78i) {
        if (this.A02.equals(c78i)) {
            return this;
        }
        return null;
    }

    @Override // X.C78X
    public final C78I<?> getKey() {
        return this.A02;
    }

    @Override // X.C78T
    public final C78T minusKey(C78I<?> c78i) {
        if (this.A02.equals(c78i)) {
            this = (HnY<T>) C6ys.A00;
        }
        return this;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ThreadLocal(value=");
        sbA0x.append(this.A00);
        sbA0x.append(", threadLocal = ");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public HnY(T t, ThreadLocal<T> threadLocal) {
        this.A00 = t;
        this.A01 = threadLocal;
        this.A02 = new Htu(threadLocal);
    }

    @Override // X.C78T
    public final /* bridge */ C78T plus(C78T c78t) {
        return C78W.A02(this, c78t);
    }
}

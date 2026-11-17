package X;

/* loaded from: classes5.dex */
public final class EYM<T> extends AbstractC6748EYi<T> {
    public AbstractC6735EXt<T> A00 = null;

    @Override // X.AbstractC6735EXt
    public final T read(EY1 ey1) {
        AbstractC6735EXt<T> abstractC6735EXt = this.A00;
        if (abstractC6735EXt != null) {
            return abstractC6735EXt.read(ey1);
        }
        throw C3cG.A0Q("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, T t) {
        AbstractC6735EXt<T> abstractC6735EXt = this.A00;
        if (abstractC6735EXt == null) {
            throw C3cG.A0Q("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC6735EXt.write(c6733EXr, t);
    }
}

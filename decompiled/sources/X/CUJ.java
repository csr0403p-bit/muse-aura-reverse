package X;

/* loaded from: classes5.dex */
public final class CUJ<T> implements CUK<T> {
    public static final Object A02 = C3cG.A0T();
    public volatile CUK<T> A00;
    public volatile Object A01 = A02;

    @Override // X.CUK
    public final T get() {
        T t;
        T t2 = (T) this.A01;
        Object obj = A02;
        if (t2 != obj) {
            return t2;
        }
        synchronized (this) {
            t = (T) this.A01;
            if (t == obj) {
                t = this.A00.get();
                this.A01 = t;
                this.A00 = null;
            }
        }
        return t;
    }

    public CUJ(CUK<T> cuk) {
        this.A00 = cuk;
    }
}

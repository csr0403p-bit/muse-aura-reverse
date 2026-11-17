package X;

/* loaded from: classes5.dex */
public abstract class C6X<T> implements F18<T> {
    public T t;

    public static <T> F18<T> of(F18<T> f18) {
        return new F4A(f18, 1);
    }

    public abstract T create();

    @Override // X.F18
    public synchronized T get() {
        T tCreate;
        tCreate = this.t;
        if (tCreate == null) {
            tCreate = create();
            this.t = tCreate;
        }
        return tCreate;
    }

    public static <T> F18<T> of(T t) {
        return new F4A(t, 0);
    }
}

package X;

/* loaded from: classes5.dex */
public interface F18<T> {
    T get();

    static C4Z A00(C3241C4y c3241C4y) {
        F18 f4a = c3241C4y.A09;
        if (f4a == null) {
            f4a = new F4A(c3241C4y, 11);
            c3241C4y.A09 = f4a;
        }
        return (C4Z) f4a.get();
    }
}

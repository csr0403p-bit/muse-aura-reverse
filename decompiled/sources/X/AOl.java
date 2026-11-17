package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class AOl<T, V extends AOd> implements C31w<T, V> {
    public final G0U<V, T> A00;
    public final G0U<T, V> A01;

    public static AOd A00(Object obj, Object obj2) {
        return ((AOl) obj).A01.invoke(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AOl(G0U<? super T, ? extends V> g0u, G0U<? super V, ? extends T> g0u2) {
        this.A01 = g0u;
        this.A00 = g0u2;
    }
}

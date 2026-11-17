package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AGZ<K, V> implements Map.Entry<K, V>, A3a {
    public final K A00;
    public final V A01;
    public final G0V<K, V, V> A02;

    /* JADX WARN: Multi-variable type inference failed */
    public AGZ(K k, V v, G0V<? super K, ? super V, ? extends V> g0v) {
        C7384Etj.A0Y(g0v, 2);
        this.A00 = k;
        this.A01 = v;
        this.A02 = g0v;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        return this.A02.invoke(getKey(), v);
    }
}

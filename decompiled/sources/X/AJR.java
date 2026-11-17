package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AJR<K, V> extends AFP<K, V> implements Map.Entry<K, V>, A3a {
    public V A00;
    public final AJQ<K, V> A01;

    @Override // X.AFP, java.util.Map.Entry
    public final V getValue() {
        return this.A00;
    }

    public AJR(AJQ<K, V> ajq, K k, V v) {
        super(k, v);
        this.A01 = ajq;
        this.A00 = v;
    }
}

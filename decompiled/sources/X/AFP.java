package X;

import java.util.Map;

/* loaded from: classes4.dex */
public class AFP<K, V> implements Map.Entry<K, V>, BOA {
    public final K A00;
    public final V A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        if (entry == null || !C7384Etj.areEqual(entry.getKey(), getKey())) {
            return false;
        }
        return C8j3.A1W(entry.getValue(), getValue(), false);
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.A01;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        if (!(this instanceof AJR)) {
            throw C8j4.A10();
        }
        AJR ajr = (AJR) this;
        V value = ajr.getValue();
        ajr.A00 = v;
        AJQ<K, V> ajq = ajr.A01;
        K key = ajr.getKey();
        AJT<K, V, Map.Entry<K, V>> ajt = ajq.A00;
        C0958AJl<K, V> c0958AJl = ajt.A03;
        if (c0958AJl.containsKey(key)) {
            if (ajt.hasNext()) {
                Object objA03 = ajt.A03();
                c0958AJl.put(key, v);
                AJT.A00(ajt, c0958AJl.A01, objA03, C60R.A01(objA03), 0);
            } else {
                c0958AJl.put(key, v);
            }
            ajt.A00 = c0958AJl.A00;
        }
        return value;
    }

    public AFP(K k, V v) {
        this.A00 = k;
        this.A01 = v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return C60R.A01(getKey()) ^ C8j4.A0E(getValue(), 0);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(getKey());
        sbA0w.append('=');
        return C8j3.A14(getValue(), sbA0w);
    }
}

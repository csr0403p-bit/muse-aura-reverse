package X;

import java.util.Map;

/* loaded from: classes4.dex */
public class AFQ<K, V> implements Map.Entry<K, V>, BOA {
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
    public final V getValue() {
        return this instanceof C0960AJn ? ((C0960AJn) this).A00.A02 : this instanceof AJD ? ((AJD) this).A00 : this.A01;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        V value;
        if (this instanceof C0960AJn) {
            C0960AJn c0960AJn = (C0960AJn) this;
            AK6<V> ak6 = c0960AJn.A00;
            value = ak6.A02;
            AK6<V> ak62 = new AK6<>(v, ak6.A01, ak6.A00);
            c0960AJn.A00 = ak62;
            C0954AJh<K, V> c0954AJh = c0960AJn.A02;
            C0955AJi<K, AK6<V>> c0955AJi = c0954AJh.A03;
            int i = c0955AJi.A01;
            int i2 = c0960AJn.A01;
            K key = c0960AJn.getKey();
            if (i == i2) {
                c0954AJh.A01 = null;
                c0955AJi.put(key, ak62);
            } else if (c0954AJh.containsKey(key)) {
                c0954AJh.put(key, v);
                return value;
            }
        } else {
            if (!(this instanceof AJD)) {
                throw C8j4.A10();
            }
            AJD ajd = (AJD) this;
            value = ajd.getValue();
            ajd.A00 = v;
            AJC<K, V> ajc = ajd.A01;
            K key2 = ajd.getKey();
            AJF<K, V, Map.Entry<K, V>> ajf = ajc.A00;
            C0955AJi<K, V> c0955AJi2 = ajf.A03;
            if (c0955AJi2.containsKey(key2)) {
                if (ajf.hasNext()) {
                    Object objA03 = ajf.A03();
                    c0955AJi2.put(key2, v);
                    AJF.A00(objA03, ajf, c0955AJi2.A04, C8j4.A0C(objA03), 0, 0, false);
                } else {
                    c0955AJi2.put(key2, v);
                }
                ajf.A00 = c0955AJi2.A00;
                return value;
            }
        }
        return value;
    }

    public AFQ(K k, V v) {
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

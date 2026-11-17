package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AId<K, V> implements Map.Entry<K, V>, A3a {
    public final int A00;
    public final int A01;
    public final C0924AIa<K, V> A02;

    private final void A00() {
        C0924AIa<K, V> c0924AIa = this.A02;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        if (c0924AIa.modCount != this.A00) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (C7384Etj.areEqual(entry.getKey(), getKey()) && C7384Etj.areEqual(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    public AId(C0924AIa<K, V> c0924AIa, int i) {
        this.A02 = c0924AIa;
        this.A01 = i;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        this.A00 = c0924AIa.modCount;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        A00();
        C0924AIa<K, V> c0924AIa = this.A02;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        return c0924AIa.keysArray[this.A01];
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        A00();
        C0924AIa<K, V> c0924AIa = this.A02;
        C0924AIa c0924AIa2 = C0924AIa.A00;
        V[] vArr = c0924AIa.valuesArray;
        C7384Etj.A0X(vArr);
        return vArr[this.A01];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return C60R.A01(getKey()) ^ C8j4.A0E(getValue(), 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        A00();
        C0924AIa<K, V> c0924AIa = this.A02;
        c0924AIa.A06();
        V[] vArr = c0924AIa.valuesArray;
        if (vArr == null) {
            vArr = (V[]) new Object[c0924AIa.keysArray.length];
            c0924AIa.valuesArray = vArr;
        }
        int i = this.A01;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(getKey());
        sbA0w.append('=');
        return C8j3.A14(getValue(), sbA0w);
    }
}

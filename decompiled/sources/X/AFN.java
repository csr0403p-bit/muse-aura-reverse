package X;

import java.util.Map;

/* loaded from: classes4.dex */
public final class AFN<K, V> implements Map.Entry<K, V>, BOA {
    public final K A00;
    public final V A01;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AFN) {
                AFN afn = (AFN) obj;
                if (!C7384Etj.areEqual(this.A00, afn.A00) || !C7384Etj.areEqual(this.A01, afn.A01)) {
                }
            }
            return false;
        }
        return true;
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
    public final int hashCode() {
        return (AnonymousClass006.A0D(this.A00) * 31) + C3cH.A02(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MapEntry(key=");
        sbA0x.append(this.A00);
        sbA0x.append(", value=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public AFN(K k, V v) {
        this.A00 = k;
        this.A01 = v;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw C8j4.A10();
    }
}

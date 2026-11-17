package X;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.Dfn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5304Dfn<K, V> implements Iterable<Map.Entry<K, V>> {
    public C5307Dfq<K, V> A01;
    public C5307Dfq<K, V> A02;
    public final WeakHashMap<Dg2<K, V>, Boolean> A03 = new WeakHashMap<>();
    public int A00 = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5304Dfn) {
            C5304Dfn c5304Dfn = (C5304Dfn) obj;
            if (this.A00 == c5304Dfn.A00) {
                Iterator<Map.Entry<K, V>> it = iterator();
                Iterator<Map.Entry<K, V>> it2 = c5304Dfn.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(it);
                    Map.Entry<K, V> next = it2.next();
                    if (entryA0l == null) {
                        if (next != null) {
                            break;
                        }
                    } else if (!entryA0l.equals(next)) {
                        return false;
                    }
                }
                if (it.hasNext() || it2.hasNext()) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public C5307Dfq<K, V> A00(K k) {
        C5307Dfq<K, V> c5307Dfq = this.A02;
        while (c5307Dfq != null && !c5307Dfq.A02.equals(k)) {
            c5307Dfq = c5307Dfq.A00;
        }
        return c5307Dfq;
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        C5307Dfq<K, V> c5307Dfq = this.A02;
        C5307Dfq<K, V> c5307Dfq2 = this.A01;
        C5315Dfy c5315Dfy = new C5315Dfy();
        c5315Dfy.A00 = c5307Dfq2;
        c5315Dfy.A01 = c5307Dfq;
        BV4.A1G(c5315Dfy, this.A03, false);
        return c5315Dfy;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            BV4.A1O(sbA0x, it.next());
            if (it.hasNext()) {
                C8j3.A1K(sbA0x);
            }
        }
        return AnonymousClass001.A0v("]", sbA0x);
    }

    public V A01(K k) {
        C5307Dfq<K, V> c5307DfqA00 = A00(k);
        if (c5307DfqA00 == null) {
            return null;
        }
        this.A00--;
        WeakHashMap<Dg2<K, V>, Boolean> weakHashMap = this.A03;
        if (!weakHashMap.isEmpty()) {
            Iterator itA0y = BV5.A0y(weakHashMap);
            while (itA0y.hasNext()) {
                ((Dg2) itA0y.next()).A00(c5307DfqA00);
            }
        }
        C5307Dfq<K, V> c5307Dfq = c5307DfqA00.A01;
        C5307Dfq<K, V> c5307Dfq2 = c5307DfqA00.A00;
        if (c5307Dfq != null) {
            c5307Dfq.A00 = c5307Dfq2;
        } else {
            this.A02 = c5307Dfq2;
        }
        C5307Dfq<K, V> c5307Dfq3 = c5307DfqA00.A00;
        if (c5307Dfq3 != null) {
            c5307Dfq3.A01 = c5307Dfq;
        } else {
            this.A01 = c5307Dfq;
        }
        c5307DfqA00.A00 = null;
        c5307DfqA00.A01 = null;
        return c5307DfqA00.A03;
    }

    public V A02(K k, V v) {
        C5307Dfq<K, V> c5307DfqA00 = A00(k);
        if (c5307DfqA00 != null) {
            return c5307DfqA00.A03;
        }
        C5307Dfq<K, V> c5307Dfq = new C5307Dfq<>(k, v);
        this.A00++;
        C5307Dfq<K, V> c5307Dfq2 = this.A01;
        if (c5307Dfq2 == null) {
            this.A02 = c5307Dfq;
        } else {
            c5307Dfq2.A00 = c5307Dfq;
            c5307Dfq.A01 = c5307Dfq2;
        }
        this.A01 = c5307Dfq;
        return null;
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += C3cH.A0l(it).hashCode();
        }
        return iHashCode;
    }
}

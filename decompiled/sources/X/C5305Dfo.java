package X;

import java.util.HashMap;

/* renamed from: X.Dfo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5305Dfo<K, V> extends C5304Dfn<K, V> {
    public final HashMap<K, C5307Dfq<K, V>> A00 = BV4.A0u();

    @Override // X.C5304Dfn
    public final C5307Dfq<K, V> A00(K k) {
        return this.A00.get(k);
    }

    @Override // X.C5304Dfn
    public final V A01(K k) {
        V v = (V) super.A01(k);
        this.A00.remove(k);
        return v;
    }

    @Override // X.C5304Dfn
    public final V A02(K k, V v) {
        C5307Dfq<K, V> c5307DfqA00 = A00(k);
        if (c5307DfqA00 != null) {
            return c5307DfqA00.A03;
        }
        HashMap<K, C5307Dfq<K, V>> map = this.A00;
        C5307Dfq<K, V> c5307Dfq = new C5307Dfq<>(k, v);
        super.A00++;
        C5307Dfq<K, V> c5307Dfq2 = this.A01;
        if (c5307Dfq2 == null) {
            this.A02 = c5307Dfq;
        } else {
            c5307Dfq2.A00 = c5307Dfq;
            c5307Dfq.A01 = c5307Dfq2;
        }
        this.A01 = c5307Dfq;
        map.put(k, c5307Dfq);
        return null;
    }
}

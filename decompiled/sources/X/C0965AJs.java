package X;

import java.util.Iterator;

/* renamed from: X.AJs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0965AJs<K, V> implements Iterator<K>, BOA {
    public final C0964AJr<K, V> A00;

    public C0965AJs(C0953AJg<K, V> c0953AJg) {
        C7384Etj.A0Y(c0953AJg, 0);
        this.A00 = new C0964AJr<>(c0953AJg.A00, c0953AJg.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        C0964AJr<K, V> c0964AJr = this.A00;
        K k = (K) c0964AJr.A00;
        c0964AJr.next();
        return k;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}

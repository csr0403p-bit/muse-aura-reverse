package X;

import java.util.Iterator;

/* renamed from: X.AJt, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0966AJt<K, V> implements Iterator<V>, BOA {
    public final C0964AJr<K, V> A00;

    public C0966AJt(C0953AJg<K, V> c0953AJg) {
        C7384Etj.A0Y(c0953AJg, 0);
        this.A00 = new C0964AJr<>(c0953AJg.A00, c0953AJg.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        return this.A00.next().A02;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}

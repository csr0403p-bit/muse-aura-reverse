package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AJq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0963AJq<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, BOA {
    public final C0964AJr<K, V> A00;

    public C0963AJq(C0953AJg<K, V> c0953AJg) {
        C7384Etj.A0Y(c0953AJg, 0);
        this.A00 = new C0964AJr<>(c0953AJg.A00, c0953AJg.A02);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C0964AJr<K, V> c0964AJr = this.A00;
        return new AFQ(c0964AJr.A00, c0964AJr.next().A02);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}

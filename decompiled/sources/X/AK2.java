package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AK2 implements Iterator, BOA {
    public final C0961AJo<K, V> A00;

    public AK2(C0954AJh<K, V> c0954AJh) {
        C7384Etj.A0Y(c0954AJh, 0);
        this.A00 = new C0961AJo(c0954AJh.A00, c0954AJh);
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
        this.A00.remove();
    }
}

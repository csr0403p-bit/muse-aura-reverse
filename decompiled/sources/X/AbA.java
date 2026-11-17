package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AbA<T> implements Iterator<C2273BRq<? extends T>>, BOA {
    public int A00;
    public final Iterator<T> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public AbA(Iterator<? extends T> it) {
        C7384Etj.A0Y(it, 0);
        this.A01 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= 0) {
            return new C2273BRq(i, this.A01.next());
        }
        AbstractC0885AGm.A14();
        throw F60.createAndThrow();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}

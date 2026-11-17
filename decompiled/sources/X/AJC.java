package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AJC implements Iterator, BOA {
    public final AJF<K, V, Map.Entry<K, V>> A00;

    public AJC(C0955AJi<K, V> c0955AJi) {
        C7384Etj.A0Y(c0955AJi, 0);
        AJH[] ajhArr = new AJH[8];
        int i = 0;
        do {
            ajhArr[i] = new AJE(this);
            i++;
        } while (i < 8);
        this.A00 = new AJF(c0955AJi, ajhArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A00.remove();
    }
}

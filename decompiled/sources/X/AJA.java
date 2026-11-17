package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AJA<K, V> extends AbstractC0934AIl<V> implements Collection<V>, InterfaceC0884AGl {
    public final C0955AJi<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        C0955AJi<K, V> c0955AJi = this.A00;
        C7384Etj.A0Y(c0955AJi, 0);
        AJH[] ajhArr = new AJH[8];
        int i = 0;
        do {
            ajhArr[i] = new AJK();
            i++;
        } while (i < 8);
        return new AJ9(c0955AJi, ajhArr);
    }

    public AJA(C0955AJi<K, V> c0955AJi) {
        this.A00 = c0955AJi;
    }

    @Override // X.AbstractC0934AIl, java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw C8j3.A17();
    }
}

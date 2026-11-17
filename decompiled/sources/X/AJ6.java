package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AJ6<K, V> extends AbstractC0935AIm<K> implements Set<K>, AGM {
    public final C0955AJi<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        C0955AJi<K, V> c0955AJi = this.A00;
        C7384Etj.A0Y(c0955AJi, 0);
        AJH[] ajhArr = new AJH[8];
        int i = 0;
        do {
            ajhArr[i] = new AJJ();
            i++;
        } while (i < 8);
        return new AJ8(c0955AJi, ajhArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0955AJi<K, V> c0955AJi = this.A00;
        if (!c0955AJi.containsKey(obj)) {
            return false;
        }
        c0955AJi.remove(obj);
        return true;
    }

    public AJ6(C0955AJi<K, V> c0955AJi) {
        this.A00 = c0955AJi;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw C8j3.A17();
    }
}

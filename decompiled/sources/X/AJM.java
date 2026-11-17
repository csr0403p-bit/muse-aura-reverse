package X;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AJM<K, V> extends AbstractC0935AIm<K> implements Set<K>, AGM {
    public final C0958AJl<K, V> A00;

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
        C0958AJl<K, V> c0958AJl = this.A00;
        AJV[] ajvArr = new AJV[8];
        int i = 0;
        do {
            ajvArr[i] = new AJX();
            i++;
        } while (i < 8);
        return new AJO(c0958AJl, ajvArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0958AJl<K, V> c0958AJl = this.A00;
        if (!c0958AJl.containsKey(obj)) {
            return false;
        }
        c0958AJl.remove(obj);
        return true;
    }

    public AJM(C0958AJl<K, V> c0958AJl) {
        this.A00 = c0958AJl;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw C8j3.A17();
    }
}

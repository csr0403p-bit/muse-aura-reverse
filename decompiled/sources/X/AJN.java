package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AJN<K, V> extends AbstractC0934AIl<V> implements Collection<V>, InterfaceC0884AGl {
    public final C0958AJl<K, V> A00;

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
        C0958AJl<K, V> c0958AJl = this.A00;
        AJV[] ajvArr = new AJV[8];
        int i = 0;
        do {
            ajvArr[i] = new AJY();
            i++;
        } while (i < 8);
        return new AJP(c0958AJl, ajvArr);
    }

    public AJN(C0958AJl<K, V> c0958AJl) {
        this.A00 = c0958AJl;
    }

    @Override // X.AbstractC0934AIl, java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw C8j3.A17();
    }
}

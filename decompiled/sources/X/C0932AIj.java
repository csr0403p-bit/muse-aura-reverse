package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AIj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0932AIj<K, V> extends AbstractC0935AIm<K> implements Set<K>, AGM {
    public final C0954AJh<K, V> A00;

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
        return new AK1(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0954AJh<K, V> c0954AJh = this.A00;
        if (!c0954AJh.containsKey(obj)) {
            return false;
        }
        c0954AJh.remove(obj);
        return true;
    }

    public C0932AIj(C0954AJh<K, V> c0954AJh) {
        this.A00 = c0954AJh;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        throw C8j3.A17();
    }
}

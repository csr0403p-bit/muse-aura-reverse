package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AIZ<E> extends AbstractC0935AIm<E> implements Set<E>, AGM {
    public final C0924AIa<E, ?> A00;

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.A00.A06();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.A00.A06();
        return super.retainAll(collection);
    }

    @Override // X.AbstractC0935AIm
    public final int A00() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C0929AIg(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C0924AIa<E, ?> c0924AIa = this.A00;
        c0924AIa.A06();
        int iA00 = C0924AIa.A00(obj, c0924AIa);
        if (iA00 < 0) {
            return false;
        }
        C0924AIa.A03(c0924AIa, iA00);
        return true;
    }

    public AIZ(C0924AIa<E, ?> c0924AIa) {
        this.A00 = c0924AIa;
    }

    @Override // X.AbstractC0935AIm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        throw C8j3.A17();
    }
}

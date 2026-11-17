package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.AIc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0926AIc<V> extends AbstractC0934AIl<V> implements Collection<V>, InterfaceC0884AGl {
    public final C0924AIa<?, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.A00.A06();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        this.A00.A06();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new C0928AIf(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        C0924AIa<?, V> c0924AIa = this.A00;
        c0924AIa.A06();
        int i = c0924AIa.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (c0924AIa.presenceArray[i] >= 0) {
                V[] vArr = c0924AIa.valuesArray;
                C7384Etj.A0X(vArr);
                if (C7384Etj.areEqual(vArr[i], obj)) {
                    C0924AIa.A03(c0924AIa, i);
                    return true;
                }
            }
        }
    }

    public C0926AIc(C0924AIa<?, V> c0924AIa) {
        this.A00 = c0924AIa;
    }

    @Override // X.AbstractC0934AIl, java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v) {
        throw C8j3.A17();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw C8j3.A17();
    }
}

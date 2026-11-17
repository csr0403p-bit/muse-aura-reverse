package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class AGQ<T> implements Set<T>, BOA {
    public final AbstractC0916AHs<T> A00;

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.A00.A05(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return BL3.A0C(new C2324BTy(this, null, 4));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A05(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.A01);
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    public AGQ(AbstractC0916AHs<T> abstractC0916AHs) {
        this.A00 = abstractC0916AHs;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

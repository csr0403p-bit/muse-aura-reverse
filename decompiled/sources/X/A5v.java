package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class A5v<T> implements Collection<T>, BOA {
    public final T[] A00;
    public final boolean A01;

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (!C8j4.A1Z(collection)) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return BFI.A0J(obj, this.A00);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new F3E(this.A00);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.length;
    }

    public A5v(T[] tArr, boolean z) {
        this.A00 = tArr;
        this.A01 = z;
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.A00;
        if (this.A01 && tArr.getClass().equals(Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C7384Etj.A0U(objArrCopyOf);
        return objArrCopyOf;
    }
}

package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: X.Ew1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7439Ew1<E> extends AbstractList<E> implements RandomAccess {
    public final ArrayList<E> A00;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        ArrayList<E> arrayList = this.A00;
        if (e == null) {
            throw BV4.A0a("Element must be non-null");
        }
        arrayList.add(i, e);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return this.A00.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        return this.A00.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        return this.A00.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        return this.A00.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        return this.A00.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        return this.A00.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        ArrayList<E> arrayList = this.A00;
        if (e != null) {
            return arrayList.set(i, e);
        }
        throw BV4.A0a("Element must be non-null");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.A00.toArray(tArr);
    }

    public C7439Ew1(ArrayList<E> arrayList) {
        arrayList.getClass();
        this.A00 = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.A00.toArray();
    }
}

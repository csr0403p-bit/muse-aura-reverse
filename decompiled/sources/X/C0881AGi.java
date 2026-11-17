package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.AGi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0881AGi implements List, Serializable, RandomAccess, BOA {
    public static final C0881AGi A00 = new C0881AGi();
    public static final long serialVersionUID = -7390468764508069838L;

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        return -1;
    }

    private final Object readResolve() {
        return A00;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        throw new IndexOutOfBoundsException(FGI.A0G("Empty list doesn't contain element at index ", '.', i));
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return A3p.A00;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return A3p.A00;
        }
        throw new IndexOutOfBoundsException(FGI.A0H("Index: ", i));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw C8j3.A0y("fromIndex: ", ", toIndex: ", i, i2);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return C8j4.A1Z(collection);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return A3p.A00;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

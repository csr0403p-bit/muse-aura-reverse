package X;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes4.dex */
public final class A48 extends A49 implements List<B9B>, BOA {
    public final List<B9B> A00;

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof A48) && C7384Etj.areEqual(this.A00, ((A48) obj).A00));
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof B9B) {
            return this.A00.contains(obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ B9B get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof B9B) {
            return this.A00.indexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<B9B> iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof B9B) {
            return this.A00.lastIndexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<B9B> listIterator(int i) {
        return this.A00.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public final List<B9B> subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("FontListFontFamily(fonts="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A48(List<? extends B9B> list) {
        this.A00 = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends B9B> collection) {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ B9B remove(int i) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw C8j4.A10();
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<B9B> unaryOperator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ B9B set(int i, B9B b9b) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super B9B> comparator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, B9B b9b) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends B9B> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final ListIterator<B9B> listIterator() {
        return this.A00.listIterator();
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

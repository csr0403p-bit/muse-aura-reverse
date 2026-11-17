package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: classes4.dex */
public final class A4A implements List<A4B>, BOA {
    public final List<A4B> A00 = new SnapshotStateList();

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof A4B) {
            return this.A00.contains(obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ A4B get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof A4B) {
            return this.A00.indexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<A4B> iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof A4B) {
            return this.A00.lastIndexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<A4B> listIterator(int i) {
        return this.A00.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public final List<A4B> subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends A4B> collection) {
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
    public final /* bridge */ /* synthetic */ A4B remove(int i) {
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
    public final void replaceAll(UnaryOperator<A4B> unaryOperator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ A4B set(int i, A4B a4b) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super A4B> comparator) {
        throw C8j4.A10();
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, A4B a4b) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends A4B> collection) {
        throw C8j4.A10();
    }

    @Override // java.util.List
    public final ListIterator<A4B> listIterator() {
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

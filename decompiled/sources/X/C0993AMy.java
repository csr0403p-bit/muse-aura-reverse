package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AMy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0993AMy implements List, InterfaceC0884AGl {
    public final /* synthetic */ ArrayList<E> A00 = C3cG.A0h();

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 0);
        return this.A00.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C7384Etj.A0Y(collection, 0);
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        C7384Etj.A0Y(collection, 0);
        return this.A00.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        C7384Etj.A0Y(collection, 0);
        return this.A00.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e) {
        return this.A00.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.contains(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E, java.lang.Object] */
    @Override // java.util.List
    public final E get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.A00.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.A00.iterator();
        C7384Etj.A0U(it);
        return it;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.A00.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i) {
        ListIterator<E> listIterator = this.A00.listIterator(i);
        C7384Etj.A0U(listIterator);
        return listIterator;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ E remove(int i) {
        return this.A00.remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [E, java.lang.Object] */
    @Override // java.util.List
    public final E set(int i, E e) {
        return this.A00.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i, int i2) {
        List<E> listSubList = this.A00.subList(i, i2);
        C7384Etj.A0U(listSubList);
        return listSubList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    public final E A00() {
        ?? A0H = AbstractC0878AGe.A0H(this);
        remove(size() - 1);
        return A0H;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        this.A00.add(i, e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 1);
        return this.A00.addAll(i, collection);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        ListIterator<E> listIterator = this.A00.listIterator();
        C7384Etj.A0U(listIterator);
        return listIterator;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

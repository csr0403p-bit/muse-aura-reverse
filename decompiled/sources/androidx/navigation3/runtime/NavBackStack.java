package androidx.navigation3.runtime;

import X.AMl;
import X.AN8;
import X.AbstractC0905AHh;
import X.BDs;
import X.C07759in;
import X.C9hr;
import X.InterfaceC0884AGl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlinx.serialization.Serializable;

@Serializable(with = C07759in.class)
/* loaded from: classes4.dex */
public final class NavBackStack implements List, BDs, RandomAccess, InterfaceC0884AGl {
    public static final Companion Companion = new Companion();
    public final SnapshotStateList<T> A00;

    public final class Companion {
        public final <T> C9hr<NavBackStack<T>> serializer(C9hr<T> c9hr) {
            return new C07759in(c9hr);
        }
    }

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        this.A00.AYT(an8);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return this.A00.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return this.A00.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AMl) {
            return this.A00.contains(obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AMl) {
            return this.A00.indexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AMl) {
            return this.A00.lastIndexOf(obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return this.A00.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof AMl) {
            return this.A00.remove(obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.A00.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.A00.retainAll(collection);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return this.A00.set(i, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    public NavBackStack(SnapshotStateList<T> snapshotStateList) {
        this.A00 = snapshotStateList;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // X.BDs
    public final AN8 AQi(AN8 an8, AN8 an82, AN8 an83) {
        return null;
    }

    public NavBackStack() {
        this(new SnapshotStateList());
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        this.A00.add(i, obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return this.A00.addAll(i, collection);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return this.A00.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return this.A00.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

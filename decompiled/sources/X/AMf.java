package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AMf implements List, InterfaceC0884AGl {
    public int A00;
    public int A01;
    public final int A02;
    public final SnapshotStateList<T> A03;

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (collection == null || !collection.isEmpty()) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void A00() {
        if (AMg.A00(this.A03) != this.A01) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > size()) {
            throw C60O.A0i("fromIndex or toIndex are out of bounds");
        }
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        int i3 = this.A02;
        return new AMf(snapshotStateList, i + i3, i2 + i3);
    }

    public AMf(SnapshotStateList<T> snapshotStateList, int i, int i2) {
        this.A03 = snapshotStateList;
        this.A02 = i;
        this.A01 = AMg.A00(snapshotStateList);
        this.A00 = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        snapshotStateList.add(this.A02 + size(), t);
        this.A00 = size() + 1;
        this.A01 = AMg.A00(snapshotStateList);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (size() > 0) {
            A00();
            SnapshotStateList<T> snapshotStateList = this.A03;
            int i = this.A02;
            snapshotStateList.A00(i, size() + i);
            this.A00 = 0;
            this.A01 = AMg.A00(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return C8j3.A1Q(indexOf(obj));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T get(int i) {
        A00();
        AMg.A01(i, size());
        return this.A03.get(this.A02 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        A00();
        int i = this.A02;
        Iterator<Integer> it = ATD.A0C(i, size() + i).iterator();
        while (it.hasNext()) {
            int iA00 = ((BNt) it).A00();
            if (C7384Etj.areEqual(obj, this.A03.get(iA00))) {
                return iA00 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        A00();
        int i = this.A02;
        int size = i + size();
        do {
            size--;
            if (size < i) {
                return -1;
            }
        } while (!C7384Etj.areEqual(obj, this.A03.get(size)));
        return size - i;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        A00();
        F1E f1e = new F1E();
        f1e.element = i - 1;
        return new AMj(this, f1e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        ?? Remove = snapshotStateList.remove(this.A02 + i);
        this.A00 = size() - 1;
        this.A01 = AMg.A00(snapshotStateList);
        return Remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        boolean z;
        Iterator<?> it = collection.iterator();
        while (true) {
            while (it.hasNext()) {
                z = remove(it.next()) || z;
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i;
        InterfaceC0900AHc<? extends T> interfaceC0900AHc;
        Snapshot snapshotA00;
        boolean zA0s;
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        int i2 = this.A02;
        int size = size() + i2;
        int size2 = snapshotStateList.size();
        do {
            synchronized (AMg.A00) {
                AMi aMiA0L = C8j5.A0L(snapshotStateList);
                i = aMiA0L.A00;
                interfaceC0900AHc = aMiA0L.A02;
            }
            C7384Etj.A0X(interfaceC0900AHc);
            AHV ahvA5a = interfaceC0900AHc.A5a();
            ahvA5a.subList(i2, size).retainAll(collection);
            InterfaceC0900AHc interfaceC0900AHcA0U = ahvA5a.A0U();
            if (C7384Etj.areEqual(interfaceC0900AHcA0U, interfaceC0900AHc)) {
                break;
            }
            AN8 an8 = snapshotStateList.A00;
            synchronized (BDh.A08) {
                snapshotA00 = BDh.A00();
                zA0s = C8j5.A0s(interfaceC0900AHcA0U, snapshotA00, snapshotStateList, an8, i);
            }
            BDh.A0G(snapshotA00, snapshotStateList);
        } while (!zA0s);
        int size3 = size2 - snapshotStateList.size();
        if (size3 <= 0) {
            return false;
        }
        this.A01 = AMg.A00(snapshotStateList);
        this.A00 = size() - size3;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T set(int i, T t) {
        AMg.A01(i, size());
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        ?? r1 = snapshotStateList.set(i + this.A02, t);
        this.A01 = AMg.A00(snapshotStateList);
        return r1;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        snapshotStateList.add(this.A02 + i, t);
        this.A00 = size() + 1;
        this.A01 = AMg.A00(snapshotStateList);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        A00();
        SnapshotStateList<T> snapshotStateList = this.A03;
        boolean zAddAll = snapshotStateList.addAll(i + this.A02, collection);
        if (zAddAll) {
            this.A00 = size() + collection.size();
            this.A01 = AMg.A00(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            remove(iIndexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

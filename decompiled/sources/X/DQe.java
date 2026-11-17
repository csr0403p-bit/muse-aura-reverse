package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DQe<K> implements Set<K> {
    public final /* synthetic */ DQd A00;

    public DQe(DQd dQd) {
        this.A00 = dQd;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        DQd dQd = this.A00;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!dQd.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        DQd dQd = this.A00;
        int iA0D = 0;
        for (int size = dQd.size() - 1; size >= 0; size--) {
            iA0D += AnonymousClass006.A0D(dQd.A05(size));
        }
        return iA0D;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<K> iterator() {
        return new C5041DQf(this.A00);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        DQd dQd = this.A00;
        int iA04 = dQd.A04(obj);
        if (iA04 < 0) {
            return false;
        }
        dQd.A06(iA04);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        DQd dQd = this.A00;
        int size = dQd.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            dQd.remove(it.next());
        }
        return AnonymousClass002.A1P(size, dQd.size());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.A00.A0B(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(K k) {
        throw C8j3.A17();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends K> collection) {
        throw C8j3.A17();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) BV8.A1a(tArr, size);
        }
        for (int i = 0; i < size; i++) {
            tArr[i] = this.A00.A05(i);
        }
        BV7.A1P(tArr, tArr.length, size);
        return tArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        DQd dQd = this.A00;
        int size = dQd.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = dQd.A05(i);
        }
        return objArr;
    }
}

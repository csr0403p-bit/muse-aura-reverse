package X;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.DQa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5038DQa<V> implements Collection<V> {
    public final /* synthetic */ DQd A00;

    public C5038DQa(DQd dQd) {
        this.A00 = dQd;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return C8j3.A1Q(this.A00.A03(obj));
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new DQg(this.A00);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        DQd dQd = this.A00;
        int iA03 = dQd.A03(obj);
        if (iA03 < 0) {
            return false;
        }
        dQd.A06(iA03);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        DQd dQd = this.A00;
        int size = dQd.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (collection.contains(dQd.A07(i))) {
                dQd.A06(i);
                i--;
                size--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        DQd dQd = this.A00;
        int size = dQd.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            if (!collection.contains(dQd.A07(i))) {
                dQd.A06(i);
                i--;
                size--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.Collection
    public final boolean add(V v) {
        throw C8j3.A17();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends V> collection) {
        throw C8j3.A17();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) BV8.A1a(tArr, size);
        }
        for (int i = 0; i < size; i++) {
            tArr[i] = this.A00.A07(i);
        }
        BV7.A1P(tArr, tArr.length, size);
        return tArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        DQd dQd = this.A00;
        int size = dQd.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = dQd.A07(i);
        }
        return objArr;
    }
}

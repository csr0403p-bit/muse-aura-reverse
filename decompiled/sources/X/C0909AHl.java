package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AHl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0909AHl implements List, InterfaceC0884AGl {
    public final C0910AHm<T> A00;

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C0897AGz(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        return this.A00.A0G(t);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        C0910AHm<T> c0910AHm = this.A00;
        return c0910AHm.A0F(c0910AHm.A00, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00.A09();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.A0H(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C0910AHm<T> c0910AHm = this.A00;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!c0910AHm.A0H(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        C0910AHm<T> c0910AHm = this.A00;
        Object[] objArr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (C7384Etj.areEqual(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A00 == 0;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        C0910AHm<T> c0910AHm = this.A00;
        T[] tArr = c0910AHm.A01;
        for (int i = c0910AHm.A00 - 1; i >= 0; i--) {
            if (C8j3.A1X(obj, tArr, i)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C0897AGz(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        C0910AHm<T> c0910AHm = this.A00;
        if (collection.isEmpty()) {
            return false;
        }
        int i = c0910AHm.A00;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            c0910AHm.A0I(it.next());
        }
        return i != c0910AHm.A00;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        C0910AHm<T> c0910AHm = this.A00;
        int i = c0910AHm.A00;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(c0910AHm.A01[i2])) {
                c0910AHm.A07(i2);
            }
        }
        return i != c0910AHm.A00;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public C0909AHl(C0910AHm<T> c0910AHm) {
        this.A00 = c0910AHm;
    }

    @Override // java.util.List
    public final T get(int i) {
        AbstractC0906AHi.A00(this, i);
        return this.A00.A01[i];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        AbstractC0906AHi.A00(this, i);
        return this.A00.A07(i);
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        AbstractC0906AHi.A00(this, i);
        T[] tArr = this.A00.A01;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        AbstractC0906AHi.A01(this, i, i2);
        return new AH0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC0905AHh.A01(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        this.A00.A0B(i, t);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return this.A00.A0F(i, collection);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C0897AGz(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.A0I(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

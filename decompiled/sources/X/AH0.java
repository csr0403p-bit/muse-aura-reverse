package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class AH0 implements List, InterfaceC0884AGl {
    public int A00;
    public final int A01;
    public final List<T> A02;

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C0897AGz(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        List<T> list = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        list.add(i, t);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        this.A02.addAll(this.A00, collection);
        int size = collection.size();
        this.A00 += size;
        return AnonymousClass002.A1N(size);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 <= i) {
            while (true) {
                this.A02.remove(i);
                if (i == i2) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.A00 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            if (C8j4.A1Y(obj, this.A02, i2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.A01;
        int i2 = this.A00;
        while (i < i2) {
            if (C8j4.A1Y(obj, this.A02, i)) {
                return i - i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1Q(this.A00, this.A01);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.A00 - 1;
        int i2 = this.A01;
        if (i2 > i) {
            return -1;
        }
        while (!C8j4.A1Y(obj, this.A02, i)) {
            if (i == i2) {
                return -1;
            }
            i--;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C0897AGz(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.A00;
        for (int i2 = this.A01; i2 < i; i2++) {
            List<T> list = this.A02;
            if (C8j4.A1Y(obj, list, i2)) {
                list.remove(i2);
                this.A00--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        int i = this.A00;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return AnonymousClass002.A1P(i, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i = this.A00;
        int i2 = i - 1;
        int i3 = this.A01;
        if (i3 <= i2) {
            while (true) {
                List<T> list = this.A02;
                if (!collection.contains(list.get(i2))) {
                    list.remove(i2);
                    this.A00--;
                }
                if (i2 == i3) {
                    break;
                }
                i2--;
            }
        }
        return AnonymousClass002.A1P(i, this.A00);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00 - this.A01;
    }

    public AH0(List<T> list, int i, int i2) {
        this.A02 = list;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T get(int i) {
        AbstractC0906AHi.A00(this, i);
        return this.A02.get(i + this.A01);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T set(int i, T t) {
        AbstractC0906AHi.A00(this, i);
        return this.A02.set(i + this.A01, t);
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
        this.A02.add(i + this.A01, t);
        this.A00++;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        this.A02.addAll(i + this.A01, collection);
        int size = collection.size();
        this.A00 += size;
        return AnonymousClass002.A1N(size);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C0897AGz(this, 0);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        AbstractC0906AHi.A00(this, i);
        this.A00--;
        return this.A02.remove(i + this.A01);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

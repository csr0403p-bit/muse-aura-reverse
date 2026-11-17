package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.AHn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0911AHn implements List, InterfaceC0884AGl {
    public final C0912AHo<T> A00;

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        C7384Etj.A0Y(collection, 0);
        C0912AHo<T> c0912AHo = this.A00;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c0912AHo.A09(it.next());
        }
        return i != ((AbstractC0913AHp) c0912AHo).A00;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        AbstractC0913AHp abstractC0913AHp = this.A00;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (abstractC0913AHp.A02(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C0896AGy(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        C0912AHo<T> c0912AHo = this.A00;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            c0912AHo.A0A(it.next());
        }
        return i != ((AbstractC0913AHp) c0912AHo).A00;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        C0912AHo<T> c0912AHo = this.A00;
        int i = ((AbstractC0913AHp) c0912AHo).A00;
        Object[] objArr = c0912AHo.A01;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                c0912AHo.A05(i2);
            }
        }
        return AnonymousClass002.A1P(i, ((AbstractC0913AHp) c0912AHo).A00);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        return this.A00.A09(t);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.A00.A06();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return C8j3.A1Q(this.A00.A02(obj));
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.A00.A02(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.A00.A00);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC0913AHp abstractC0913AHp = this.A00;
        Object[] objArr = abstractC0913AHp.A01;
        int i = abstractC0913AHp.A00;
        if (obj == null) {
            do {
                i--;
                if (-1 >= i) {
                    return -1;
                }
            } while (objArr[i] != null);
            return i;
        }
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!obj.equals(objArr[i]));
        return i;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C0896AGy(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A00;
    }

    public C0911AHn(C0912AHo<T> c0912AHo) {
        this.A00 = c0912AHo;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final T get(int i) {
        AbstractC0907AHj.A00(this, i);
        return this.A00.A03(i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        AbstractC0907AHj.A00(this, i);
        return this.A00.A05(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final T set(int i, T t) {
        AbstractC0907AHj.A00(this, i);
        AbstractC0913AHp abstractC0913AHp = this.A00;
        if (i < 0 || i >= abstractC0913AHp.A00) {
            abstractC0913AHp.A04(i);
            throw F60.createAndThrow();
        }
        Object[] objArr = abstractC0913AHp.A01;
        T t2 = objArr[i];
        objArr[i] = t;
        return t2;
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        AbstractC0907AHj.A01(this, i, i2);
        return new AH1(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C8j3.A1Z(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        C0912AHo<T> c0912AHo = this.A00;
        if (i >= 0 && i <= (i2 = ((AbstractC0913AHp) c0912AHo).A00)) {
            int i3 = i2 + 1;
            Object[] objArr = c0912AHo.A01;
            if (objArr.length < i3) {
                C0912AHo.A01(c0912AHo, objArr, i3);
            }
            Object[] objArr2 = c0912AHo.A01;
            int i4 = ((AbstractC0913AHp) c0912AHo).A00;
            if (i != i4) {
                AbstractC0903AHf.A05(objArr2, objArr2, i + 1, i, i4);
            }
            objArr2[i] = t;
            ((AbstractC0913AHp) c0912AHo).A00++;
            return;
        }
        throw C8j3.A0y("Index ", " must be in 0..", i, ((AbstractC0913AHp) c0912AHo).A00);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        C7384Etj.A0Y(collection, 1);
        C0912AHo<T> c0912AHo = this.A00;
        if (i >= 0 && i <= ((AbstractC0913AHp) c0912AHo).A00) {
            int i2 = 0;
            if (collection.isEmpty()) {
                return false;
            }
            int size = ((AbstractC0913AHp) c0912AHo).A00 + collection.size();
            Object[] objArr = c0912AHo.A01;
            if (objArr.length < size) {
                C0912AHo.A01(c0912AHo, objArr, size);
            }
            Object[] objArr2 = c0912AHo.A01;
            if (i != ((AbstractC0913AHp) c0912AHo).A00) {
                AbstractC0903AHf.A05(objArr2, objArr2, collection.size() + i, i, ((AbstractC0913AHp) c0912AHo).A00);
            }
            for (Object obj : collection) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                objArr2[i2 + i] = obj;
                i2 = i3;
            }
            ((AbstractC0913AHp) c0912AHo).A00 += collection.size();
            return true;
        }
        throw C8j3.A0y("Index ", " must be in 0..", i, ((AbstractC0913AHp) c0912AHo).A00);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C0896AGy(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.A00.A0A(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0905AHh.A00(this);
    }
}

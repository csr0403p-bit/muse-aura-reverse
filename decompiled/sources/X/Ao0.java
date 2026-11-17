package X;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Ao0<E> implements Collection<E>, Set<E>, InterfaceC0884AGl, AGM {
    public int A00;
    public int[] A01;
    public Object[] A02;

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 0);
        int size = this.A00 + collection.size();
        int i = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < size) {
            Object[] objArr = this.A02;
            int[] iArr2 = new int[size];
            this.A01 = iArr2;
            this.A02 = new Object[size];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC0903AHf.A05(objArr, this.A02, 0, 0, this.A00);
            }
        }
        if (this.A00 != i) {
            throw new ConcurrentModificationException();
        }
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size()) {
                    try {
                        int i = this.A00;
                        for (int i2 = 0; i2 < i; i2++) {
                            if (set.contains(this.A02[i2])) {
                            }
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        boolean z = false;
        for (int i = this.A00 - 1; -1 < i; i--) {
            if (!AbstractC0878AGe.A0k(collection, this.A02[i])) {
                A01(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        C7384Etj.A0Y(tArr, 0);
        int i = this.A00;
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        } else if (length > i) {
            tArr[i] = null;
        }
        AbstractC0903AHf.A05(this.A02, tArr, 0, 0, this.A00);
        return tArr;
    }

    public static final <E> int A00(Ao0<E> ao0, Object obj, int i) {
        int i2 = ao0.A00;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iA00 = AbstractC1684AoN.A00(ao0.A01, i2, i);
            if (iA00 < 0 || C7384Etj.areEqual(obj, ao0.A02[iA00])) {
                return iA00;
            }
            int i3 = iA00 + 1;
            while (i3 < i2 && ao0.A01[i3] == i) {
                if (C7384Etj.areEqual(obj, ao0.A02[i3])) {
                    return i3;
                }
                i3++;
            }
            do {
                iA00--;
                if (iA00 < 0 || ao0.A01[iA00] != i) {
                    return i3 ^ (-1);
                }
            } while (!C7384Etj.areEqual(obj, ao0.A02[iA00]));
            return iA00;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (I)TE; */
    public final void A01(int i) {
        int i2 = this.A00;
        Object[] objArr = this.A02;
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i2 - i4);
                Object[] objArr2 = this.A02;
                AbstractC0903AHf.A05(objArr2, objArr2, i, i4, i2);
            }
            this.A02[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.A01 = iArr2;
            this.A02 = new Object[i5];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC0903AHf.A05(objArr, this.A02, 0, 0, i);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0903AHf.A03(iArr, this.A01, i, i6, i2);
                AbstractC0903AHf.A05(objArr, this.A02, i, i6, i2);
            }
        }
        if (i2 != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A00 = i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int iHashCode;
        int iA00;
        int i = this.A00;
        if (e == null) {
            iA00 = A00(this, null, 0);
            iHashCode = 0;
        } else {
            iHashCode = e.hashCode();
            iA00 = A00(this, e, iHashCode);
        }
        if (iA00 >= 0) {
            return false;
        }
        int i2 = iA00 ^ (-1);
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i3 = 8;
            if (i >= 8) {
                i3 = (i >> 1) + i;
            } else if (i < 4) {
                i3 = 4;
            }
            Object[] objArr = this.A02;
            int[] iArr2 = new int[i3];
            this.A01 = iArr2;
            this.A02 = new Object[i3];
            if (i != this.A00) {
                throw new ConcurrentModificationException();
            }
            if (i3 != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                AbstractC0903AHf.A05(objArr, this.A02, 0, 0, objArr.length);
            }
        }
        if (i2 < i) {
            int[] iArr3 = this.A01;
            int i4 = i2 + 1;
            AbstractC0903AHf.A03(iArr3, iArr3, i4, i2, i);
            Object[] objArr2 = this.A02;
            AbstractC0903AHf.A05(objArr2, objArr2, i4, i2, i);
        }
        int i5 = this.A00;
        if (i == i5) {
            int[] iArr4 = this.A01;
            if (i2 < iArr4.length) {
                iArr4[i2] = iHashCode;
                this.A02[i2] = e;
                this.A00 = i5 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.A00 != 0) {
            this.A01 = AbstractC1684AoN.A00;
            this.A02 = AbstractC1684AoN.A02;
            this.A00 = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return C8j3.A1Q(obj == null ? A00(this, null, 0) : A00(this, obj, obj.hashCode()));
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00 <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C1676AoD(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA00 = obj == null ? A00(this, null, 0) : A00(this, obj, obj.hashCode());
        if (iA00 < 0) {
            return false;
        }
        A01(iA00);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return this.A00;
    }

    public Ao0(int i) {
        this.A01 = AbstractC1684AoN.A00;
        this.A02 = AbstractC1684AoN.A02;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sb = new StringBuilder(i * 14);
        sb.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                C8j3.A1K(sb);
            }
            Object obj = this.A02[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        return C8j3.A15(sb);
    }

    public Ao0() {
        this(0);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0903AHf.A08(this.A02, 0, this.A00);
    }
}

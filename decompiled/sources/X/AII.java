package X;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class AII extends AIH implements List, Serializable, RandomAccess, InterfaceC0884AGl {
    public static final AII A00;
    public E[] backing = new Object[10];
    public boolean isReadOnly;
    public int length;

    /* JADX WARN: Type inference failed for: r0v1, types: [E[], java.lang.Object[]] */
    static {
        AII aii = new AII();
        aii.backing = new Object[0];
        aii.isReadOnly = true;
        A00 = aii;
    }

    public static final int A00(Collection collection, AII aii, int i, int i2, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = aii.backing;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = aii.backing;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC0903AHf.A05(objArr, objArr, i + i4, i2 + i, aii.length);
        E[] eArr = aii.backing;
        int i7 = aii.length;
        AbstractC0892AGt.A00(eArr, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) aii).modCount++;
        }
        aii.length -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 0);
        A06(this);
        int size = collection.size();
        A05(collection, this, this.length, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (C7384Etj.areEqual(this.backing[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        A06(this);
        return A00(collection, this, 0, this.length, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        A06(this);
        return A00(collection, this, 0, this.length, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        AH7.A04(i, i2, this.length);
        return new AIJ(null, this, this.backing, i, i2 - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C7384Etj.A0Y(tArr, 0);
        int length = tArr.length;
        int i = this.length;
        E[] eArr = this.backing;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, 0, i, tArr.getClass());
            C7384Etj.A0U(tArr2);
            return tArr2;
        }
        AbstractC0903AHf.A05(eArr, tArr, 0, 0, i);
        int i2 = this.length;
        if (i2 >= length) {
            return tArr;
        }
        tArr[i2] = null;
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A02(AII aii, int i) {
        ((AbstractList) aii).modCount++;
        Object[] objArr = aii.backing;
        Object obj = objArr[i];
        int i2 = i + 1;
        System.arraycopy(objArr, i2, objArr, i, aii.length - i2);
        E[] eArr = aii.backing;
        int i3 = aii.length - 1;
        C7384Etj.A0Y(eArr, 0);
        eArr[i3] = 0;
        aii.length--;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [E[], java.lang.Object, java.lang.Object[]] */
    private final void A03(int i, int i2) {
        int i3 = this.length + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.backing;
        int length = objArr.length;
        Object[] objArr2 = objArr;
        if (i3 > length) {
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            ?? CopyOf = Arrays.copyOf(objArr, i4);
            C7384Etj.A0U(CopyOf);
            this.backing = CopyOf;
            objArr2 = CopyOf;
        }
        AbstractC0903AHf.A05(objArr2, objArr2, i + i2, i, this.length);
        this.length += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A04(Object obj, AII aii, int i) {
        ((AbstractList) aii).modCount++;
        aii.A03(i, 1);
        aii.backing[i] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A05(Collection collection, AII aii, int i, int i2) {
        ((AbstractList) aii).modCount++;
        aii.A03(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            aii.backing[i + i3] = it.next();
        }
    }

    public static final void A06(AII aii) {
        if (aii.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public static final void A07(AII aii, int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) aii).modCount++;
        }
        E[] eArr = aii.backing;
        AbstractC0903AHf.A05(eArr, eArr, i, i + i2, aii.length);
        E[] eArr2 = aii.backing;
        int i3 = aii.length;
        AbstractC0892AGt.A00(eArr2, i3 - i2, i3);
        aii.length -= i2;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new C0866A6n(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // X.AIH
    public final int A0R() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.backing;
        int i = this.length;
        if (i != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (!C7384Etj.areEqual(objArr[i2], list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        AH7.A01(i, this.length);
        return this.backing[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.backing;
        int i = this.length;
        int iA01 = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iA01 = (iA01 * 31) + C60R.A01(objArr[i2]);
        }
        return iA01;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.length;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C7384Etj.areEqual(this.backing[i], obj));
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        AH7.A02(i, this.length);
        return new AIL(this, i);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        Object[] objArr = this.backing;
        int i = this.length;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                C8j3.A1K(sb);
            }
            Object obj = objArr[i2];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        return AnonymousClass001.A0v("]", sb);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        A06(this);
        A04(e, this, this.length);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A06(this);
        A07(this, 0, this.length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        A06(this);
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        A0S(iIndexOf);
        return true;
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        A06(this);
        AH7.A01(i, this.length);
        E[] eArr = this.backing;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        A06(this);
        AH7.A02(i, this.length);
        A04(e, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 1);
        A06(this);
        AH7.A02(i, this.length);
        int size = collection.size();
        A05(collection, this, i, size);
        if (size > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0903AHf.A08(this.backing, 0, this.length);
    }
}

package X;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class AIJ extends AIH implements List, Serializable, RandomAccess, InterfaceC0884AGl {
    public E[] backing;
    public int length;
    public final int offset;
    public final AIJ<E> parent;
    public final AII<E> root;

    /* JADX WARN: Incorrect types in method signature: ([TE;IILX/AIJ<TE;>;LX/AII<TE;>;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public AIJ(AIJ aij, AII aii, Object[] objArr, int i, int i2) {
        AnonymousClass002.A1C(objArr, 0, aii);
        this.backing = objArr;
        this.offset = i;
        this.length = i2;
        this.parent = aij;
        this.root = aii;
        ((AbstractList) this).modCount = ((AbstractList) aii).modCount;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 0);
        A07(this);
        A06(this);
        int size = collection.size();
        A05(this.offset + this.length, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        A07(this);
        A06(this);
        return A00(collection, this.offset, this.length, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        C7384Etj.A0Y(collection, 0);
        A07(this);
        A06(this);
        return A00(collection, this.offset, this.length, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        AH7.A04(i, i2, this.length);
        return new AIJ(this, this.root, this.backing, this.offset + i, i2 - i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) {
        C7384Etj.A0Y(tArr, 0);
        A06(this);
        int length = tArr.length;
        int i = this.length;
        E[] eArr = this.backing;
        int i2 = this.offset;
        int i3 = i + i2;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOfRange(eArr, i2, i3, tArr.getClass());
            C7384Etj.A0U(tArr2);
            return tArr2;
        }
        AbstractC0903AHf.A05(eArr, tArr, 0, i2, i3);
        int i4 = this.length;
        if (i4 >= length) {
            return tArr;
        }
        tArr[i4] = null;
        return tArr;
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/Collection<+TE;>;Z)I */
    private final int A00(Collection collection, int i, int i2, boolean z) {
        AIJ<E> aij = this.parent;
        int iA00 = aij != 0 ? aij.A00(collection, i, i2, z) : AII.A00(collection, this.root, i, i2, z);
        if (iA00 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.length -= iA00;
        return iA00;
    }

    public static final Object A02(AIJ aij, int i) {
        ((AbstractList) aij).modCount++;
        AIJ<E> aij2 = aij.parent;
        aij.length--;
        return aij2 != 0 ? A02(aij2, i) : AII.A02(aij.root, i);
    }

    private final void A03(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        AIJ<E> aij = this.parent;
        if (aij != 0) {
            aij.A03(i, i2);
        } else {
            AII.A07(this.root, i, i2);
        }
        this.length -= i2;
    }

    private final void A04(int i, E e) {
        ((AbstractList) this).modCount++;
        AIJ<E> aij = this.parent;
        if (aij != 0) {
            aij.A04(i, e);
        } else {
            AII.A04(e, this.root, i);
        }
        AII<E> aii = this.root;
        AII aii2 = AII.A00;
        this.backing = aii.backing;
        this.length++;
    }

    private final void A05(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        AIJ<E> aij = this.parent;
        if (aij != 0) {
            aij.A05(i, collection, i2);
        } else {
            AII.A05(collection, this.root, i, i2);
        }
        AII<E> aii = this.root;
        AII aii2 = AII.A00;
        this.backing = aii.backing;
        this.length += i2;
    }

    public static final void A06(AIJ aij) {
        if (((AbstractList) aij.root).modCount != ((AbstractList) aij).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public static final void A07(AIJ aij) {
        AII<E> aii = aij.root;
        AII aii2 = AII.A00;
        if (aii.isReadOnly) {
            throw C8j3.A17();
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        AII<E> aii = this.root;
        AII aii2 = AII.A00;
        if (aii.isReadOnly) {
            return new C0866A6n(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        A07(this);
        A06(this);
        A04(this.offset + this.length, e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        A07(this);
        A06(this);
        A03(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        A06(this);
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        Object[] objArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!C7384Etj.areEqual(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        A06(this);
        AH7.A01(i, this.length);
        return this.backing[this.offset + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        A06(this);
        Object[] objArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        int iA01 = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            iA01 = (iA01 * 31) + C60R.A01(objArr[i + i3]);
        }
        return iA01;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        A06(this);
        for (int i = 0; i < this.length; i++) {
            if (C7384Etj.areEqual(this.backing[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        A06(this);
        return AnonymousClass002.A1M(this.length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        A06(this);
        int i = this.length;
        do {
            i--;
            if (i < 0) {
                return -1;
            }
        } while (!C7384Etj.areEqual(this.backing[this.offset + i], obj));
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        A06(this);
        AH7.A02(i, this.length);
        return new AIK(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        A07(this);
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
        A07(this);
        A06(this);
        AH7.A01(i, this.length);
        E[] eArr = this.backing;
        int i2 = this.offset + i;
        E e2 = eArr[i2];
        eArr[i2] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        A06(this);
        Object[] objArr = this.backing;
        int i = this.offset;
        int i2 = this.length;
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                C8j3.A1K(sb);
            }
            Object obj = objArr[i + i3];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        return AnonymousClass001.A0v("]", sb);
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        A07(this);
        A06(this);
        AH7.A02(i, this.length);
        A04(this.offset + i, e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        C7384Etj.A0Y(collection, 1);
        A07(this);
        A06(this);
        AH7.A02(i, this.length);
        int size = collection.size();
        A05(this.offset + i, collection, size);
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
        A06(this);
        E[] eArr = this.backing;
        int i = this.offset;
        return AbstractC0903AHf.A08(eArr, i, this.length + i);
    }
}

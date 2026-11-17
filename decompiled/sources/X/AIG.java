package X;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public final class AIG<E> extends AIH<E> {
    public static final Object[] A03 = new Object[0];
    public int A00;
    public Object[] A01 = A03;
    public int A02;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        if (C8j4.A1Z(collection)) {
            return false;
        }
        ((AbstractList) this).modCount++;
        A01(AIH.A0P(this, collection));
        A03(collection, A00(this));
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        Object[] objArr;
        C7384Etj.A0Y(collection, 0);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.A01.length != 0) {
            int size = this.A00 + size();
            int length = this.A01.length;
            if (size >= length) {
                size -= length;
            }
            int i = this.A00;
            int i2 = i;
            if (i >= size) {
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.A01;
                    Object obj = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.A01[i2] = obj;
                        i2++;
                    }
                    i++;
                }
                int i3 = i2;
                int length2 = this.A01.length;
                if (i2 >= length2) {
                    i3 = i2 - length2;
                }
                i2 = i3;
                for (int i4 = 0; i4 < size; i4++) {
                    Object[] objArr3 = this.A01;
                    Object obj2 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.A01[i3] = obj2;
                        i3++;
                        if (i2 == r0.length - 1) {
                            i3 = 0;
                        }
                        i2 = i3;
                    }
                }
                z = z2;
            } else {
                while (true) {
                    objArr = this.A01;
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = objArr[i];
                    if (collection.contains(obj3)) {
                        z = true;
                    } else {
                        this.A01[i2] = obj3;
                        i2++;
                    }
                    i++;
                }
                AbstractC0903AHf.A04(objArr, i2, size);
            }
            if (z) {
                ((AbstractList) this).modCount++;
                int length3 = i2 - this.A00;
                if (length3 < 0) {
                    length3 += this.A01.length;
                }
                this.A02 = length3;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        Object[] objArr;
        C7384Etj.A0Y(collection, 0);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.A01.length != 0) {
            int size = this.A00 + size();
            int length = this.A01.length;
            if (size >= length) {
                size -= length;
            }
            int i = this.A00;
            int i2 = i;
            if (i >= size) {
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.A01;
                    Object obj = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj)) {
                        this.A01[i2] = obj;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                int i3 = i2;
                int length2 = this.A01.length;
                if (i2 >= length2) {
                    i3 = i2 - length2;
                }
                i2 = i3;
                for (int i4 = 0; i4 < size; i4++) {
                    Object[] objArr3 = this.A01;
                    Object obj2 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj2)) {
                        this.A01[i3] = obj2;
                        i3++;
                        if (i2 == r0.length - 1) {
                            i3 = 0;
                        }
                        i2 = i3;
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                while (true) {
                    objArr = this.A01;
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = objArr[i];
                    if (collection.contains(obj3)) {
                        this.A01[i2] = obj3;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0903AHf.A04(objArr, i2, size);
            }
            if (z) {
                ((AbstractList) this).modCount++;
                int length3 = i2 - this.A00;
                if (length3 < 0) {
                    length3 += this.A01.length;
                }
                this.A02 = length3;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] tArr) throws NegativeArraySizeException {
        C7384Etj.A0Y(tArr, 0);
        if (tArr.length < size()) {
            Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), size());
            C7384Etj.A0Z(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            tArr = (T[]) ((Object[]) objNewInstance);
        }
        int size = this.A00 + size();
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (size >= length) {
            size -= length;
        }
        int i = this.A00;
        if (i < size) {
            AbstractC0903AHf.A05(objArr, tArr, 0, i, size);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.A01;
            AbstractC0903AHf.A05(objArr2, tArr, 0, this.A00, objArr2.length);
            Object[] objArr3 = this.A01;
            AbstractC0903AHf.A05(objArr3, tArr, objArr3.length - this.A00, 0, size);
        }
        int size2 = size();
        C7384Etj.A0Y(tArr, 1);
        if (size2 < tArr.length) {
            tArr[size2] = null;
        }
        return tArr;
    }

    public static int A00(AIG aig) {
        int size = aig.A00 + aig.size();
        int length = aig.A01.length;
        return size >= length ? size - length : size;
    }

    private final void A01(int i) {
        Object[] objArr;
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr2 = this.A01;
        int length = objArr2.length;
        if (i > length) {
            if (objArr2 == A03) {
                if (i < 10) {
                    i = 10;
                }
                objArr = new Object[i];
            } else {
                int i2 = length + (length >> 1);
                if (i2 - i < 0) {
                    i2 = i;
                }
                if (i2 - 2147483639 > 0) {
                    i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
                }
                objArr = new Object[i2];
                int i3 = this.A00;
                System.arraycopy(objArr2, i3, objArr, 0, length - i3);
                Object[] objArr3 = this.A01;
                int length2 = objArr3.length;
                int i4 = this.A00;
                System.arraycopy(objArr3, 0, objArr, length2 - i4, i4);
                this.A00 = 0;
            }
            this.A01 = objArr;
        }
    }

    private final void A02(int i, int i2) {
        Object[] objArr = this.A01;
        if (i < i2) {
            AbstractC0903AHf.A04(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            AbstractC0903AHf.A04(this.A01, 0, i2);
        }
    }

    @Override // X.AIH
    public final int A0R() {
        return this.A02;
    }

    public final void addFirst(E e) {
        ((AbstractList) this).modCount++;
        A01(size() + 1);
        int length = this.A00;
        if (length == 0) {
            Object[] objArr = this.A01;
            C7384Etj.A0Y(objArr, 0);
            length = objArr.length;
        }
        int i = length - 1;
        this.A00 = i;
        this.A01[i] = e;
        this.A02 = size() + 1;
    }

    public final void addLast(E e) {
        ((AbstractList) this).modCount++;
        A01(size() + 1);
        Object[] objArr = this.A01;
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        objArr[size] = e;
        this.A02 = size() + 1;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/Collection<+TE;>;)V */
    private final void A03(Collection collection, int i) {
        Iterator<E> it = collection.iterator();
        int length = this.A01.length;
        while (i < length && it.hasNext()) {
            this.A01[i] = it.next();
            i++;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.A01[i3] = it.next();
        }
        this.A02 = AIH.A0P(this, collection);
    }

    @Override // X.AIH
    public final E A0S(int i) {
        AH7.A01(i, size());
        if (i == C8j3.A0K(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        ((AbstractList) this).modCount++;
        int i2 = this.A00 + i;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        E e = (E) objArr[i2];
        int size = size() >> 1;
        int i3 = this.A00;
        if (i < size) {
            Object[] objArr2 = this.A01;
            if (i2 >= i3) {
                AbstractC0903AHf.A05(objArr2, objArr2, i3 + 1, i3, i2);
            } else {
                AbstractC0903AHf.A05(objArr2, objArr2, 1, 0, i2);
                Object[] objArr3 = this.A01;
                int length2 = objArr3.length - 1;
                objArr3[0] = objArr3[length2];
                int i4 = this.A00;
                System.arraycopy(objArr3, i4, objArr3, i4 + 1, length2 - i4);
            }
            Object[] objArr4 = this.A01;
            int i5 = this.A00;
            objArr4[i5] = null;
            int length3 = objArr4.length - 1;
            int i6 = i5 + 1;
            if (i5 == length3) {
                i6 = 0;
            }
            this.A00 = i6;
        } else {
            int iA0K = i3 + C8j3.A0K(this);
            Object[] objArr5 = this.A01;
            int length4 = objArr5.length;
            if (iA0K >= length4) {
                iA0K -= length4;
            }
            int i7 = i2 + 1;
            if (i2 <= iA0K) {
                System.arraycopy(objArr5, i7, objArr5, i2, (iA0K + 1) - i7);
            } else {
                System.arraycopy(objArr5, i7, objArr5, i2, length4 - i7);
                Object[] objArr6 = this.A01;
                objArr6[objArr6.length - 1] = objArr6[0];
                System.arraycopy(objArr6, 1, objArr6, 0, (iA0K + 1) - 1);
            }
            this.A01[iA0K] = null;
        }
        this.A02 = size() - 1;
        return e;
    }

    public final E A0T() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.A01[this.A00];
    }

    public final E A0U() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.A01[this.A00];
    }

    public final E A0V() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.A01;
        int iA0K = this.A00 + C8j3.A0K(this);
        int length = this.A01.length;
        if (iA0K >= length) {
            iA0K -= length;
        }
        return (E) objArr[iA0K];
    }

    public final E A0W() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.A01;
        int iA0K = this.A00 + C8j3.A0K(this);
        int length = this.A01.length;
        if (iA0K >= length) {
            iA0K -= length;
        }
        return (E) objArr[iA0K];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            A02(this.A00, A00(this));
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return AnonymousClass002.A1P(indexOf(obj), -1);
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        AH7.A01(i, size());
        Object[] objArr = this.A01;
        int i2 = this.A00 + i;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        return (E) objArr[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int iA00 = A00(this);
        int length = this.A00;
        if (length < iA00) {
            while (length < iA00) {
                if (!C7384Etj.areEqual(obj, this.A01[length])) {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.A00) < iA00) {
            return -1;
        }
        int length2 = this.A01.length;
        while (true) {
            if (length >= length2) {
                for (int i = 0; i < iA00; i++) {
                    if (C7384Etj.areEqual(obj, this.A01[i])) {
                        length = i + this.A01.length;
                    }
                }
                return -1;
            }
            if (C7384Etj.areEqual(obj, this.A01[length])) {
                break;
            }
            length++;
        }
        return length - this.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int iA00 = A00(this);
        int i = this.A00;
        if (i < iA00) {
            length = iA00 - 1;
            if (i <= length) {
                while (!C8j3.A1X(obj, this.A01, length)) {
                    if (length != i) {
                        length--;
                    }
                }
                return length - this.A00;
            }
            return -1;
        }
        if (!isEmpty() && this.A00 >= iA00) {
            while (true) {
                iA00--;
                Object[] objArr = this.A01;
                if (-1 >= iA00) {
                    C7384Etj.A0Y(objArr, 0);
                    length = objArr.length - 1;
                    int i2 = this.A00;
                    if (i2 <= length) {
                        while (!C8j3.A1X(obj, this.A01, length)) {
                            if (length != i2) {
                                length--;
                            }
                        }
                    }
                } else if (C8j3.A1X(obj, objArr, iA00)) {
                    length = iA00 + this.A01.length;
                    break;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        A0S(iIndexOf);
        return true;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        Object[] objArr = this.A01;
        int i = this.A00;
        E e = (E) objArr[i];
        objArr[i] = null;
        int i2 = i + 1;
        if (i == objArr.length - 1) {
            i2 = 0;
        }
        this.A00 = i2;
        this.A02 = size() - 1;
        return e;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        int size = this.A00 + (size() - 1);
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (size >= length) {
            size -= length;
        }
        E e = (E) objArr[size];
        objArr[size] = null;
        this.A02 = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AH7.A04(i, i2, size());
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == size()) {
                clear();
                return;
            }
            if (i3 == 1) {
                A0S(i);
                return;
            }
            ((AbstractList) this).modCount++;
            if (i < size() - i2) {
                int i4 = this.A00;
                int length = i4 + (i - 1);
                int length2 = this.A01.length;
                if (length >= length2) {
                    length -= length2;
                }
                int length3 = i4 + (i2 - 1);
                if (length3 >= length2) {
                    length3 -= length2;
                }
                while (i > 0) {
                    int i5 = length + 1;
                    int iMin = Math.min(i, Math.min(i5, length3 + 1));
                    Object[] objArr = this.A01;
                    length3 -= iMin;
                    length -= iMin;
                    AbstractC0903AHf.A05(objArr, objArr, length3 + 1, length + 1, i5);
                    if (length < 0) {
                        length += this.A01.length;
                    }
                    if (length3 < 0) {
                        length3 += this.A01.length;
                    }
                    i -= iMin;
                }
                int i6 = this.A00;
                int i7 = i6 + i3;
                int length4 = this.A01.length;
                if (i7 >= length4) {
                    i7 -= length4;
                }
                A02(i6, i7);
                this.A00 = i7;
            } else {
                int i8 = this.A00;
                int i9 = i8 + i2;
                int length5 = this.A01.length;
                if (i9 >= length5) {
                    i9 -= length5;
                }
                int i10 = i8 + i;
                if (i10 >= length5) {
                    i10 -= length5;
                }
                int size = size();
                while (true) {
                    size -= i2;
                    if (size <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.A01;
                    int length6 = objArr2.length;
                    i2 = Math.min(size, C8j3.A0F(length6, i10, length6 - i9));
                    int i11 = i9 + i2;
                    System.arraycopy(objArr2, i9, objArr2, i10, i11 - i9);
                    i9 = i11;
                    int length7 = this.A01.length;
                    if (i11 >= length7) {
                        i9 = i11 - length7;
                    }
                    i10 += i2;
                    if (i10 >= length7) {
                        i10 -= length7;
                    }
                }
                int size2 = this.A00 + size();
                int length8 = this.A01.length;
                if (size2 >= length8) {
                    size2 -= length8;
                }
                int i12 = size2 - i3;
                if (i12 < 0) {
                    i12 += length8;
                }
                A02(i12, size2);
            }
            this.A02 = size() - i3;
        }
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        AH7.A01(i, size());
        int i2 = this.A00 + i;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        E e2 = (E) objArr[i2];
        objArr[i2] = e;
        return e2;
    }

    @Override // X.AIH, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int length;
        AH7.A02(i, size());
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        ((AbstractList) this).modCount++;
        A01(size() + 1);
        int i2 = this.A00 + i;
        int length2 = this.A01.length;
        if (i2 >= length2) {
            i2 -= length2;
        }
        if (i < ((size() + 1) >> 1)) {
            if (i2 == 0) {
                Object[] objArr = this.A01;
                C7384Etj.A0Y(objArr, 0);
                length = objArr.length - 1;
            } else {
                length = i2 - 1;
            }
            int length3 = this.A00;
            if (length3 == 0) {
                Object[] objArr2 = this.A01;
                C7384Etj.A0Y(objArr2, 0);
                length3 = objArr2.length;
            }
            int i3 = length3 - 1;
            int i4 = this.A00;
            Object[] objArr3 = this.A01;
            if (length >= i4) {
                objArr3[i3] = objArr3[i4];
                int i5 = i4 + 1;
                System.arraycopy(objArr3, i5, objArr3, i4, (length + 1) - i5);
            } else {
                System.arraycopy(objArr3, i4, objArr3, i4 - 1, objArr3.length - i4);
                Object[] objArr4 = this.A01;
                objArr4[objArr4.length - 1] = objArr4[0];
                System.arraycopy(objArr4, 1, objArr4, 0, (length + 1) - 1);
            }
            this.A01[length] = e;
            this.A00 = i3;
        } else {
            int size = this.A00 + size();
            Object[] objArr5 = this.A01;
            int length4 = objArr5.length;
            if (size >= length4) {
                size -= length4;
            }
            if (i2 < size) {
                System.arraycopy(objArr5, i2, objArr5, i2 + 1, size - i2);
            } else {
                System.arraycopy(objArr5, 0, objArr5, 1, size);
                Object[] objArr6 = this.A01;
                int length5 = objArr6.length - 1;
                objArr6[0] = objArr6[length5];
                System.arraycopy(objArr6, i2, objArr6, i2 + 1, length5 - i2);
            }
            this.A01[i2] = e;
        }
        this.A02 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        int length;
        int length2;
        C7384Etj.A0Y(collection, 1);
        AH7.A02(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        ((AbstractList) this).modCount++;
        A01(AIH.A0P(this, collection));
        int size = this.A00 + size();
        int length3 = this.A01.length;
        if (size >= length3) {
            size -= length3;
        }
        int length4 = this.A00 + i;
        if (length4 >= length3) {
            length4 -= length3;
        }
        int size2 = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.A00;
            int length5 = i2 - size2;
            Object[] objArr = this.A01;
            if (length4 >= i2) {
                if (length5 < 0 && (length2 = length - (length5 = length5 + (length = objArr.length))) < length4 - i2) {
                    System.arraycopy(objArr, i2, objArr, length5, (i2 + length2) - i2);
                    Object[] objArr2 = this.A01;
                    AbstractC0903AHf.A05(objArr2, objArr2, 0, this.A00 + length2, length4);
                } else {
                    AbstractC0903AHf.A05(objArr, objArr, length5, i2, length4);
                }
            } else {
                System.arraycopy(objArr, i2, objArr, length5, objArr.length - i2);
                Object[] objArr3 = this.A01;
                int length6 = objArr3.length - size2;
                if (size2 >= length4) {
                    System.arraycopy(objArr3, 0, objArr3, length6, length4);
                } else {
                    System.arraycopy(objArr3, 0, objArr3, length6, size2);
                    Object[] objArr4 = this.A01;
                    AbstractC0903AHf.A05(objArr4, objArr4, 0, size2, length4);
                }
            }
            this.A00 = length5;
            length4 -= size2;
            if (length4 < 0) {
                length4 += this.A01.length;
            }
        } else {
            int i3 = length4 + size2;
            Object[] objArr5 = this.A01;
            if (length4 < size) {
                int i4 = size2 + size;
                int length7 = objArr5.length;
                if (i4 > length7) {
                    if (i3 >= length7) {
                        i3 -= length7;
                        System.arraycopy(objArr5, length4, objArr5, i3, size - length4);
                    } else {
                        int i5 = size - (i4 - length7);
                        System.arraycopy(objArr5, i5, objArr5, 0, size - i5);
                        Object[] objArr6 = this.A01;
                        AbstractC0903AHf.A05(objArr6, objArr6, i3, length4, i5);
                    }
                } else {
                    System.arraycopy(objArr5, length4, objArr5, i3, size - length4);
                }
            } else {
                AbstractC0903AHf.A05(objArr5, objArr5, size2, 0, size);
                Object[] objArr7 = this.A01;
                int length8 = objArr7.length;
                if (i3 >= length8) {
                    System.arraycopy(objArr7, length4, objArr7, i3 - length8, length8 - length4);
                } else {
                    int i6 = length8 - size2;
                    System.arraycopy(objArr7, i6, objArr7, 0, length8 - i6);
                    Object[] objArr8 = this.A01;
                    System.arraycopy(objArr8, length4, objArr8, i3, (objArr8.length - size2) - length4);
                }
            }
        }
        A03(collection, length4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }
}

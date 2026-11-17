package com.google.common.collect;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV4;
import X.BV7;
import X.C8j3;
import X.DNI;
import X.DQR;
import X.DQS;
import X.FGI;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public transient int A00;
    public transient Object A01;
    public transient int[] A02;
    public transient Object[] A03;
    public transient int A04;

    private final Set<E> A01() {
        Object obj = this.A01;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int A02() {
        Preconditions.checkState(AnonymousClass002.A1Y(this.A01), "Arrays already allocated");
        int i = this.A00;
        int iMax = Math.max(4, DNI.A00(1.0d, i + 1));
        this.A01 = DQR.A02(iMax);
        this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(iMax - 1)) & 31);
        this.A02 = new int[i];
        this.A03 = new Object[i];
        return i;
    }

    public final int A03(int entryIndex) {
        if (this instanceof CompactLinkedHashSet) {
            ((CompactLinkedHashSet) this).A02.getClass();
            return r0[entryIndex] - 1;
        }
        int i = entryIndex + 1;
        if (i >= this.A04) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Set<E> A04() {
        int iA03;
        LinkedHashSet linkedHashSet = new LinkedHashSet(((1 << (this.A00 & 31)) - 1) + 1, 1.0f);
        if (!(this instanceof CompactLinkedHashSet)) {
            iA03 = 0;
            if (!isEmpty()) {
            }
            this.A01 = linkedHashSet;
            this.A02 = null;
            this.A03 = null;
            this.A00 += 32;
            return linkedHashSet;
        }
        iA03 = ((CompactLinkedHashSet) this).A00;
        while (iA03 >= 0) {
            Object[] objArr = this.A03;
            objArr.getClass();
            linkedHashSet.add(objArr[iA03]);
            iA03 = A03(iA03);
        }
        this.A01 = linkedHashSet;
        this.A02 = null;
        this.A03 = null;
        this.A00 += 32;
        return linkedHashSet;
    }

    public void A06(int newCapacity) {
        int[] iArr = this.A02;
        iArr.getClass();
        this.A02 = Arrays.copyOf(iArr, newCapacity);
        Object[] objArr = this.A03;
        objArr.getClass();
        this.A03 = Arrays.copyOf(objArr, newCapacity);
    }

    public void A07(int dstIndex, int mask) {
        int i;
        int i2;
        Object obj = this.A01;
        obj.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.A03;
        objArr.getClass();
        int size = size();
        int i3 = size - 1;
        if (dstIndex >= i3) {
            objArr[dstIndex] = null;
            iArr[dstIndex] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[dstIndex] = obj2;
        objArr[i3] = null;
        iArr[dstIndex] = iArr[i3];
        iArr[i3] = 0;
        int iA01 = DNI.A01(AnonymousClass006.A0D(obj2)) & mask;
        int iA00 = DQR.A00(obj, iA01);
        if (iA00 == size) {
            DQR.A03(obj, iA01, dstIndex + 1);
            return;
        }
        do {
            i = iA00 - 1;
            i2 = iArr[i];
            iA00 = i2 & mask;
        } while (iA00 != size);
        iArr[i] = (i2 & (mask ^ (-1))) | ((dstIndex + 1) & mask);
    }

    /* JADX WARN: Incorrect types in method signature: (ITE;II)V */
    public void A08(Object entryIndex, int object, int hash, int mask) {
        int[] iArr = this.A02;
        iArr.getClass();
        iArr[object] = hash & (mask ^ (-1));
        Object[] objArr = this.A03;
        objArr.getClass();
        objArr[object] = entryIndex;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E object) {
        int iMin;
        if (this.A01 == null) {
            A02();
        }
        Set<E> setA01 = A01();
        if (setA01 == null) {
            int[] iArr = this.A02;
            iArr.getClass();
            Object[] objArr = this.A03;
            objArr.getClass();
            int i = this.A04;
            int i2 = i + 1;
            int iA01 = DNI.A01(AnonymousClass006.A0D(object));
            int i3 = (1 << (this.A00 & 31)) - 1;
            int i4 = iA01 & i3;
            Object obj = this.A01;
            obj.getClass();
            int iA00 = DQR.A00(obj, i4);
            if (iA00 != 0) {
                int i5 = i3 ^ (-1);
                int i6 = iA01 & i5;
                int i7 = 0;
                while (true) {
                    int i8 = iA00 - 1;
                    int i9 = iArr[i8];
                    if ((i9 & i5) == i6 && Objects.equal(object, objArr[i8])) {
                        return false;
                    }
                    int i10 = i9 & i3;
                    i7++;
                    if (i10 != 0) {
                        iA00 = i10;
                    } else if (i7 >= 9) {
                        setA01 = A04();
                    } else if (i2 <= i3) {
                        iArr[i8] = (i9 & i5) | (i2 & i3);
                    }
                }
            } else if (i2 <= i3) {
                Object obj2 = this.A01;
                obj2.getClass();
                DQR.A03(obj2, i4, i2);
            } else {
                int i11 = (i3 < 32 ? 4 : 2) * (i3 + 1);
                Object objA02 = DQR.A02(i11);
                int i12 = i11 - 1;
                if (i != 0) {
                    DQR.A03(objA02, iA01 & i12, i + 1);
                }
                Object obj3 = this.A01;
                obj3.getClass();
                int[] iArr2 = this.A02;
                iArr2.getClass();
                for (int i13 = 0; i13 <= i3; i13++) {
                    int iA002 = DQR.A00(obj3, i13);
                    while (iA002 != 0) {
                        int i14 = iA002 - 1;
                        int i15 = iArr2[i14];
                        int i16 = (i15 & (i3 ^ (-1))) | i13;
                        int i17 = i16 & i12;
                        int iA003 = DQR.A00(objA02, i17);
                        DQR.A03(objA02, i17, iA002);
                        iArr2[i14] = (i16 & (i12 ^ (-1))) | (iA003 & i12);
                        iA002 = i15 & i3;
                    }
                }
                this.A01 = objA02;
                this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(i12)) & 31);
                i3 = i12;
            }
            int[] iArr3 = this.A02;
            iArr3.getClass();
            int length = iArr3.length;
            if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                A06(iMin);
            }
            A08(object, i, iA01, i3);
            this.A04 = i2;
            this.A00 += 32;
            return true;
        }
        return setA01.add(object);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (this.A01 != null) {
            this.A00 += 32;
            Set<E> setA01 = A01();
            if (setA01 != null) {
                this.A00 = BV7.A06(size(), 3, 1073741823);
                setA01.clear();
                this.A01 = null;
            } else {
                Object[] objArr = this.A03;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A04, (Object) null);
                Object obj = this.A01;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A02;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A04, 0);
            }
            this.A04 = 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object object) {
        int i;
        if (AnonymousClass002.A1Y(this.A01)) {
            return false;
        }
        Set<E> setA01 = A01();
        if (setA01 != null) {
            return setA01.contains(object);
        }
        int iA01 = DNI.A01(AnonymousClass006.A0D(object));
        int i2 = (1 << (this.A00 & 31)) - 1;
        Object obj = this.A01;
        obj.getClass();
        int iA00 = DQR.A00(obj, iA01 & i2);
        if (iA00 == 0) {
            return false;
        }
        int i3 = i2 ^ (-1);
        int i4 = iA01 & i3;
        do {
            int i5 = iA00 - 1;
            int[] iArr = this.A02;
            iArr.getClass();
            int i6 = iArr[i5];
            if ((i6 & i3) == i4) {
                Object[] objArr = this.A03;
                objArr.getClass();
                if (Objects.equal(object, objArr[i5])) {
                    return true;
                }
            }
            i = i6 & i2;
            iA00 = i;
        } while (i != 0);
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object object) {
        Object obj = this.A01;
        if (AnonymousClass002.A1Y(obj)) {
            return false;
        }
        Set<E> setA01 = A01();
        if (setA01 != null) {
            return setA01.remove(object);
        }
        int i = (1 << (this.A00 & 31)) - 1;
        obj.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.A03;
        objArr.getClass();
        int iA01 = DQR.A01(object, null, obj, iArr, objArr, null, i);
        if (iA01 == -1) {
            return false;
        }
        A07(iA01, i);
        this.A04--;
        this.A00 += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (this.A01 == null) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> setA01 = A01();
        if (setA01 != null) {
            return (T[]) setA01.toArray(tArr);
        }
        Object[] objArr = this.A03;
        objArr.getClass();
        int i = this.A04;
        Preconditions.checkPositionIndexes(0, i, objArr.length);
        int length = tArr.length;
        if (length < i) {
            if (length != 0) {
                tArr = (T[]) Arrays.copyOf(tArr, 0);
            }
            tArr = (T[]) Arrays.copyOf(tArr, i);
        } else {
            BV7.A1P(tArr, length, i);
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }

    public CompactHashSet(int expectedSize) {
        A05(expectedSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(FGI.A0H("Invalid size: ", i));
        }
        A05(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(stream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            stream.writeObject(it.next());
        }
    }

    public void A05(int expectedSize) {
        Preconditions.checkArgument(C8j3.A1Q(expectedSize), "Expected size must be >= 0");
        this.A00 = BV7.A06(expectedSize, 1, 1073741823);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> setA01 = A01();
        return setA01 != null ? setA01.iterator() : new DQS(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> setA01 = A01();
        return setA01 != null ? setA01.size() : this.A04;
    }

    public CompactHashSet() {
        A05(3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (this.A01 == null) {
            return BV4.A1W();
        }
        Set<E> setA01 = A01();
        if (setA01 != null) {
            return setA01.toArray();
        }
        Object[] objArr = this.A03;
        objArr.getClass();
        return Arrays.copyOf(objArr, this.A04);
    }
}

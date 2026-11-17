package com.google.common.collect;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BV6;
import X.BV7;
import X.BV8;
import X.C3cG;
import X.C8j3;
import X.DNI;
import X.DQP;
import X.DQR;
import X.DQU;
import X.DQV;
import X.DQX;
import X.FGI;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object A09 = C3cG.A0T();
    public transient int A00;
    public transient int A01;
    public transient Object A02;
    public transient int[] A03;
    public transient Object[] A04;
    public transient Object[] A05;
    public transient Collection<V> A06;
    public transient Set<Map.Entry<K, V>> A07;
    public transient Set<K> A08;

    public static int A01(CompactHashMap compactHashMap, Object obj) {
        if (!AnonymousClass002.A1Y(compactHashMap.A02)) {
            int iA01 = DNI.A01(AnonymousClass006.A0D(obj));
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            Object obj2 = compactHashMap.A02;
            obj2.getClass();
            int iA00 = DQR.A00(obj2, iA01 & i);
            if (iA00 != 0) {
                int i2 = i ^ (-1);
                int i3 = iA01 & i2;
                do {
                    int i4 = iA00 - 1;
                    int[] iArr = compactHashMap.A03;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = compactHashMap.A04;
                        objArr.getClass();
                        if (Objects.equal(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    iA00 = i5 & i;
                } while (iA00 != 0);
            }
        }
        return -1;
    }

    public static Object A02(CompactHashMap compactHashMap, Object obj) {
        Object obj2 = compactHashMap.A02;
        if (obj2 != null) {
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            int[] iArr = compactHashMap.A03;
            iArr.getClass();
            Object[] objArr = compactHashMap.A04;
            objArr.getClass();
            int iA01 = DQR.A01(obj, null, obj2, iArr, objArr, null, i);
            if (iA01 != -1) {
                Object[] objArr2 = compactHashMap.A05;
                objArr2.getClass();
                Object obj3 = objArr2[iA01];
                compactHashMap.A0A(iA01, i);
                compactHashMap.A01--;
                compactHashMap.A00 += 32;
                return obj3;
            }
        }
        return A09;
    }

    private final void A07(int index) {
        if (this instanceof CompactLinkedHashMap) {
            CompactLinkedHashMap compactLinkedHashMap = (CompactLinkedHashMap) this;
            if (compactLinkedHashMap.accessOrder) {
                compactLinkedHashMap.A02.getClass();
                CompactLinkedHashMap.A00(compactLinkedHashMap, BV6.A03(r0[index]) - 1, compactLinkedHashMap.A04(index));
                CompactLinkedHashMap.A00(compactLinkedHashMap, compactLinkedHashMap.A01, index);
                CompactLinkedHashMap.A00(compactLinkedHashMap, index, -2);
                ((CompactHashMap) compactLinkedHashMap).A00 += 32;
            }
        }
    }

    public int A03() {
        Preconditions.checkState(AnonymousClass002.A1Y(this.A02), "Arrays already allocated");
        int i = this.A00;
        int iMax = Math.max(4, DNI.A00(1.0d, i + 1));
        this.A02 = DQR.A02(iMax);
        this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(iMax - 1)) & 31);
        this.A03 = new int[i];
        this.A04 = new Object[i];
        this.A05 = new Object[i];
        return i;
    }

    public final int A04(int entryIndex) {
        if (this instanceof CompactLinkedHashMap) {
            ((CompactLinkedHashMap) this).A02.getClass();
            return ((int) r0[entryIndex]) - 1;
        }
        int i = entryIndex + 1;
        if (i >= this.A01) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map<K, V> A05() {
        int iA04;
        int i = ((1 << (this.A00 & 31)) - 1) + 1;
        boolean z = this instanceof CompactLinkedHashMap;
        LinkedHashMap linkedHashMap = z ? new LinkedHashMap(i, 1.0f, ((CompactLinkedHashMap) this).accessOrder) : new LinkedHashMap(i, 1.0f);
        if (!z) {
            iA04 = 0;
            if (!isEmpty()) {
            }
            this.A02 = linkedHashMap;
            this.A03 = null;
            this.A04 = null;
            this.A05 = null;
            this.A00 += 32;
            return linkedHashMap;
        }
        iA04 = ((CompactLinkedHashMap) this).A00;
        while (iA04 >= 0) {
            Object[] objArr = this.A04;
            objArr.getClass();
            Object obj = objArr[iA04];
            Object[] objArr2 = this.A05;
            objArr2.getClass();
            ((AbstractMap) linkedHashMap).put(obj, objArr2[iA04]);
            iA04 = A04(iA04);
        }
        this.A02 = linkedHashMap;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A00 += 32;
        return linkedHashMap;
    }

    public final Map<K, V> A06() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public void A09(int newCapacity) {
        int[] iArr = this.A03;
        iArr.getClass();
        this.A03 = Arrays.copyOf(iArr, newCapacity);
        Object[] objArr = this.A04;
        objArr.getClass();
        this.A04 = Arrays.copyOf(objArr, newCapacity);
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        this.A05 = Arrays.copyOf(objArr2, newCapacity);
    }

    public void A0A(int dstIndex, int mask) {
        int i;
        int i2;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.A03;
        iArr.getClass();
        Object[] objArr = this.A04;
        objArr.getClass();
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        int size = size();
        int i3 = size - 1;
        if (dstIndex >= i3) {
            objArr[dstIndex] = null;
            objArr2[dstIndex] = null;
            iArr[dstIndex] = 0;
            return;
        }
        Object obj2 = objArr[i3];
        objArr[dstIndex] = obj2;
        objArr2[dstIndex] = objArr2[i3];
        objArr[i3] = null;
        objArr2[i3] = null;
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

    /* JADX WARN: Incorrect types in method signature: (ITK;TV;II)V */
    public void A0B(Object entryIndex, int key, Object value, int hash, int mask) {
        int[] iArr = this.A03;
        iArr.getClass();
        iArr[key] = hash & (mask ^ (-1));
        Object[] objArr = this.A04;
        objArr.getClass();
        objArr[key] = entryIndex;
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        objArr2[key] = value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map<K, V> mapA06 = A06();
            if (mapA06 != null) {
                this.A00 = BV7.A06(size(), 3, 1073741823);
                mapA06.clear();
                this.A02 = null;
            } else {
                Object[] objArr = this.A04;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A01, (Object) null);
                Object[] objArr2 = this.A05;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.A01, (Object) null);
                Object obj = this.A02;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A03;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A01, 0);
            }
            this.A01 = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.A07;
        if (set != null) {
            return set;
        }
        DQP dqp = new DQP(this);
        this.A07 = dqp;
        return dqp;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.A08;
        if (set != null) {
            return set;
        }
        DQU dqu = new DQU(this);
        this.A08 = dqu;
        return dqu;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V put(K r18, V r19) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.A06;
        if (collection != null) {
            return collection;
        }
        DQV dqv = new DQV(this);
        this.A06 = dqv;
        return dqv;
    }

    public CompactHashMap(int expectedSize) {
        A08(expectedSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream stream) throws ClassNotFoundException, IOException {
        stream.defaultReadObject();
        int i = stream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(FGI.A0H("Invalid size: ", i));
        }
        A08(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(stream.readObject(), stream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeInt(size());
        Map<K, V> mapA06 = A06();
        Iterator itA0n = mapA06 != null ? AnonymousClass002.A0n(mapA06) : new DQX(this);
        while (itA0n.hasNext()) {
            BV8.A1J(stream, itA0n);
        }
    }

    public void A08(int expectedSize) {
        Preconditions.checkArgument(C8j3.A1Q(expectedSize), "Expected size must be >= 0");
        this.A00 = BV7.A06(expectedSize, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object key) {
        Map<K, V> mapA06 = A06();
        return mapA06 != null ? mapA06.containsKey(key) : AnonymousClass002.A1P(A01(this, key), -1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object value) {
        Map<K, V> mapA06 = A06();
        if (mapA06 != null) {
            return mapA06.containsValue(value);
        }
        for (int i = 0; i < this.A01; i++) {
            Object[] objArr = this.A05;
            objArr.getClass();
            if (Objects.equal(value, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> mapA06 = A06();
        if (mapA06 != null) {
            return mapA06.get(obj);
        }
        int iA01 = A01(this, obj);
        if (iA01 == -1) {
            return null;
        }
        A07(iA01);
        Object[] objArr = this.A05;
        objArr.getClass();
        return (V) objArr[iA01];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> mapA06 = A06();
        if (mapA06 != null) {
            return mapA06.remove(obj);
        }
        V v = (V) A02(this, obj);
        if (v == A09) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> mapA06 = A06();
        return mapA06 != null ? mapA06.size() : this.A01;
    }

    public CompactHashMap() {
        A08(3);
    }
}

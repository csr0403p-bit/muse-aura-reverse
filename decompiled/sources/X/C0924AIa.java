package X;

import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.AIa, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0924AIa<K, V> implements Map<K, V>, Serializable, InterfaceC0863A6k {
    public static final C0924AIa A00;
    public C0925AIb<K, V> entriesView;
    public int[] hashArray;
    public int hashShift;
    public boolean isReadOnly;
    public K[] keysArray;
    public AIZ<K> keysView;
    public int length;
    public int maxProbeDistance;
    public int modCount;
    public int[] presenceArray;
    public int size;
    public V[] valuesArray;
    public C0926AIc<V> valuesView;

    static {
        C0924AIa c0924AIa = new C0924AIa(0);
        c0924AIa.isReadOnly = true;
        A00 = c0924AIa;
    }

    public final boolean A07(Map.Entry<? extends K, ? extends V> entry) {
        C7384Etj.A0Y(entry, 0);
        int iA00 = A00(entry.getKey(), this);
        if (iA00 < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C7384Etj.A0X(vArr);
        return C7384Etj.areEqual(vArr[iA00], entry.getValue());
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C7384Etj.A0Y(map, 0);
        A06();
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        A01(setEntrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : setEntrySet) {
            int iA05 = A05(entry.getKey());
            V[] vArr = this.valuesArray;
            if (vArr == null) {
                vArr = (V[]) new Object[this.keysArray.length];
                this.valuesArray = vArr;
            }
            if (iA05 < 0) {
                iA05 = (-iA05) - 1;
                if (!C7384Etj.areEqual(entry.getValue(), vArr[iA05])) {
                }
            }
            vArr[iA05] = entry.getValue();
        }
    }

    public C0924AIa(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        K[] kArr = (K[]) new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.keysArray = kArr;
        this.valuesArray = null;
        this.presenceArray = iArr;
        this.hashArray = new int[iHighestOneBit];
        this.maxProbeDistance = 2;
        this.length = 0;
        this.hashShift = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    private final void A01(int i) {
        K[] kArr = this.keysArray;
        int length = kArr.length;
        int i2 = this.length;
        int i3 = length - i2;
        int size = i2 - size();
        if (i3 < i && i3 + size >= i && size >= length / 4) {
            A04(true);
            return;
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        if (i4 > length) {
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.keysArray = (K[]) C8j3.A1a(kArr, i5);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) C8j3.A1a(vArr, i5) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, i5);
            C7384Etj.A0U(iArrCopyOf);
            this.presenceArray = iArrCopyOf;
            if (i5 < 1) {
                i5 = 1;
            }
            int iHighestOneBit = Integer.highestOneBit(i5 * 3);
            if (iHighestOneBit > this.hashArray.length) {
                A02(iHighestOneBit);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r2[r4] = r6 + 1;
        r7.presenceArray[r6] = r4;
        r6 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(int r8) {
        /*
            r7 = this;
            int r0 = r7.modCount
            int r0 = r0 + 1
            r7.modCount = r0
            int r1 = r7.length
            int r0 = r7.size()
            r6 = 0
            if (r1 <= r0) goto L12
            r7.A04(r6)
        L12:
            int[] r0 = new int[r8]
            r7.hashArray = r0
            int r0 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r0 = r0 + 1
            r7.hashShift = r0
        L1e:
            int r0 = r7.length
            if (r6 >= r0) goto L5e
            int r5 = r6 + 1
            K[] r0 = r7.keysArray
            r0 = r0[r6]
            if (r0 == 0) goto L5c
            int r4 = r0.hashCode()
        L2e:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r0
            int r0 = r7.hashShift
            int r4 = r4 >>> r0
            int r3 = r7.maxProbeDistance
        L37:
            int[] r2 = r7.hashArray
            r0 = r2[r4]
            r1 = 1
            if (r0 != 0) goto L48
            int r0 = r6 + 1
            r2[r4] = r0
            int[] r0 = r7.presenceArray
            r0[r6] = r4
            r6 = r5
            goto L1e
        L48:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L53
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L53:
            int r0 = r4 + (-1)
            if (r4 != 0) goto L5a
            int r4 = r2.length
            int r4 = r4 - r1
            goto L37
        L5a:
            r4 = r0
            goto L37
        L5c:
            r4 = 0
            goto L2e
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0924AIa.A02(int):void");
    }

    public static final void A03(C0924AIa c0924AIa, int i) {
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int iA01;
        int[] iArr2;
        K[] kArr = c0924AIa.keysArray;
        C7384Etj.A0Y(kArr, 0);
        kArr[i] = null;
        V[] vArr = c0924AIa.valuesArray;
        if (vArr != null) {
            vArr[i] = null;
        }
        int length = c0924AIa.presenceArray[i];
        loop0: while (true) {
            i2 = length;
            int i5 = 0;
            do {
                length = length == 0 ? c0924AIa.hashArray.length - 1 : length - 1;
                iArr = c0924AIa.hashArray;
                i3 = iArr[length];
                i5++;
                if (i5 > c0924AIa.maxProbeDistance || i3 == 0) {
                    break loop0;
                }
                i4 = i3 - 1;
                iA01 = ((C60R.A01(c0924AIa.keysArray[i4]) * (-1640531527)) >>> c0924AIa.hashShift) - length;
                iArr2 = c0924AIa.hashArray;
            } while ((iA01 & (iArr2.length - 1)) < i5);
            iArr2[i2] = i3;
            c0924AIa.presenceArray[i4] = i2;
        }
        iArr[i2] = 0;
        c0924AIa.presenceArray[i] = -1;
        c0924AIa.size = c0924AIa.size() - 1;
        c0924AIa.modCount++;
    }

    private final void A04(boolean z) {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.hashArray[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        AbstractC0892AGt.A00(this.keysArray, i3, i);
        if (vArr != null) {
            AbstractC0892AGt.A00(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() throws NotSerializableException {
        if (!this.isReadOnly) {
            throw new NotSerializableException("The map cannot be serialized while it is being built.");
        }
        C0865A6m c0865A6m = new C0865A6m();
        c0865A6m.map = this;
        return c0865A6m;
    }

    public final void A06() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                C7384Etj.A0X(vArr);
                if (C7384Etj.areEqual(vArr[i], obj)) {
                    return true;
                }
            }
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        C0925AIb<K, V> c0925AIb = this.entriesView;
        if (c0925AIb != null) {
            return c0925AIb;
        }
        C0925AIb<K, V> c0925AIb2 = new C0925AIb<>(this);
        this.entriesView = c0925AIb2;
        return c0925AIb2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        C7384Etj.A0Y(setEntrySet, 0);
        for (Map.Entry<K, V> entry : setEntrySet) {
            if (entry == null) {
                return false;
            }
            try {
                if (!A07(entry)) {
                    return false;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0930AIh c0930AIh = new C0930AIh(this);
        int i = 0;
        while (c0930AIh.hasNext()) {
            int i2 = c0930AIh.A00;
            C0924AIa<K, V> c0924AIa = c0930AIh.A03;
            if (i2 >= c0924AIa.length) {
                throw C8j3.A1D();
            }
            c0930AIh.A00 = i2 + 1;
            c0930AIh.A01 = i2;
            int iA01 = C60R.A01(c0924AIa.keysArray[i2]);
            V[] vArr = c0924AIa.valuesArray;
            C7384Etj.A0X(vArr);
            int iA0E = iA01 ^ C8j4.A0E(vArr[c0930AIh.A01], 0);
            c0930AIh.A01();
            i += iA0E;
        }
        return i;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        AIZ<K> aiz = this.keysView;
        if (aiz != null) {
            return aiz;
        }
        AIZ<K> aiz2 = new AIZ<>(this);
        this.keysView = aiz2;
        return aiz2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return this.size;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        C0926AIc<V> c0926AIc = this.valuesView;
        if (c0926AIc != null) {
            return c0926AIc;
        }
        C0926AIc<V> c0926AIc2 = new C0926AIc<>(this);
        this.valuesView = c0926AIc2;
        return c0926AIc2;
    }

    public static final int A00(Object obj, C0924AIa c0924AIa) {
        int iA01 = (C60R.A01(obj) * (-1640531527)) >>> c0924AIa.hashShift;
        int i = c0924AIa.maxProbeDistance;
        while (true) {
            int i2 = c0924AIa.hashArray[iA01];
            if (i2 == 0) {
                break;
            }
            int i3 = i2 - 1;
            if (!C7384Etj.areEqual(c0924AIa.keysArray[i3], obj)) {
                i--;
                if (i < 0) {
                    break;
                }
                iA01 = iA01 == 0 ? c0924AIa.hashArray.length - 1 : iA01 - 1;
            } else {
                return i3;
            }
        }
        return -1;
    }

    public final int A05(K k) {
        A06();
        while (true) {
            int iHashCode = ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
            int i = this.maxProbeDistance * 2;
            int length = this.hashArray.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.hashArray;
                int i3 = iArr[iHashCode];
                if (i3 == 0) {
                    int i4 = this.length;
                    K[] kArr = this.keysArray;
                    if (i4 < kArr.length) {
                        int i5 = i4 + 1;
                        this.length = i5;
                        kArr[i4] = k;
                        this.presenceArray[i4] = iHashCode;
                        iArr[iHashCode] = i5;
                        this.size = size() + 1;
                        this.modCount++;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    A01(1);
                } else {
                    if (C7384Etj.areEqual(this.keysArray[i3 - 1], k)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        A02(this.hashArray.length * 2);
                        break;
                    }
                    iHashCode = iHashCode == 0 ? this.hashArray.length - 1 : iHashCode - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public final void clear() {
        A06();
        int i = this.length;
        int i2 = i - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i4 = iArr[i3];
                if (i4 >= 0) {
                    this.hashArray[i4] = 0;
                    iArr[i3] = -1;
                }
                if (i3 == i2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        AbstractC0892AGt.A00(this.keysArray, 0, i);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            AbstractC0892AGt.A00(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        this.modCount++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return C8j3.A1Q(A00(obj, this));
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int iA00 = A00(obj, this);
        if (iA00 < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C7384Etj.A0X(vArr);
        return vArr[iA00];
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        A06();
        int iA05 = A05(k);
        V[] vArr = this.valuesArray;
        if (vArr == null) {
            vArr = (V[]) new Object[this.keysArray.length];
            this.valuesArray = vArr;
        }
        if (iA05 >= 0) {
            vArr[iA05] = v;
            return null;
        }
        int i = (-iA05) - 1;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        A06();
        int iA00 = A00(obj, this);
        if (iA00 < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C7384Etj.A0X(vArr);
        V v = vArr[iA00];
        A03(this, iA00);
        return v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C0930AIh c0930AIh = new C0930AIh(this);
        int i = 0;
        while (c0930AIh.hasNext()) {
            if (i > 0) {
                C8j3.A1K(sb);
            }
            int i2 = c0930AIh.A00;
            C0924AIa<K, V> c0924AIa = c0930AIh.A03;
            if (i2 >= c0924AIa.length) {
                throw C8j3.A1D();
            }
            c0930AIh.A00 = i2 + 1;
            c0930AIh.A01 = i2;
            K k = c0924AIa.keysArray[i2];
            if (k == c0924AIa) {
                sb.append("(this Map)");
            } else {
                sb.append(k);
            }
            sb.append('=');
            V[] vArr = c0924AIa.valuesArray;
            C7384Etj.A0X(vArr);
            V v = vArr[c0930AIh.A01];
            if (v == c0924AIa) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            c0930AIh.A01();
            i++;
        }
        return AnonymousClass001.A0v("}", sb);
    }

    public C0924AIa() {
        this(8);
    }
}

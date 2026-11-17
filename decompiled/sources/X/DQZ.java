package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes5.dex */
public class DQZ<K, V> {
    public int A00;
    public int[] A01;
    public Object[] A02;

    public final K A05(int i) {
        if (i < 0 || i >= this.A00) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        return (K) this.A02[i << 1];
    }

    public final V A06(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        Object[] objArr = this.A02;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return v;
        }
        int i4 = i2 - 1;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                System.arraycopy(iArr, i5, iArr, i, i2 - i5);
                Object[] objArr2 = this.A02;
                AbstractC0903AHf.A05(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.A02;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            C7384Etj.A0U(iArrCopyOf);
            this.A01 = iArrCopyOf;
            this.A02 = C8j3.A1a(this.A02, i7 << 1);
            if (i2 != this.A00) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0903AHf.A03(iArr, this.A01, 0, 0, i);
                AbstractC0903AHf.A05(objArr, this.A02, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0903AHf.A03(iArr, this.A01, i, i8, i2);
                AbstractC0903AHf.A05(objArr, this.A02, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.A00) {
            throw new ConcurrentModificationException();
        }
        this.A00 = i4;
        return v;
    }

    public final V A07(int i) {
        if (i < 0 || i >= this.A00) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        return (V) this.A02[(i << 1) + 1];
    }

    public final V A08(int i, V v) {
        if (i < 0 || i >= this.A00) {
            throw C60O.A0i(FGI.A0H("Expected index to be within 0..size()-1, but was ", i));
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.A02;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public final void A0A(DQZ<? extends K, ? extends V> dqz) {
        C7384Etj.A0Y(dqz, 0);
        int i = dqz.A00;
        A09(this.A00 + i);
        if (this.A00 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(dqz.A05(i2), dqz.A07(i2));
            }
        } else if (i > 0) {
            AbstractC0903AHf.A03(dqz.A01, this.A01, 0, 0, i);
            AbstractC0903AHf.A05(dqz.A02, this.A02, 0, 0, i << 1);
            this.A00 = i;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DQZ) {
                DQZ dqz = (DQZ) obj;
                if (size() == dqz.size()) {
                    int i = this.A00;
                    for (int i2 = 0; i2 < i; i2++) {
                        K kA05 = A05(i2);
                        V vA07 = A07(i2);
                        Object obj2 = dqz.get(kA05);
                        if (vA07 == null) {
                            if (obj2 == null && dqz.containsKey(kA05)) {
                            }
                            return false;
                        }
                        if (!vA07.equals(obj2)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (size() == map.size()) {
                    int i3 = this.A00;
                    for (int i4 = 0; i4 < i3; i4++) {
                        K kA052 = A05(i4);
                        V vA072 = A07(i4);
                        Object obj3 = map.get(kA052);
                        if (vA072 == null) {
                            if (obj3 == null && map.containsKey(kA052)) {
                            }
                            return false;
                        }
                        if (!vA072.equals(obj3)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private final int A00() {
        int i = this.A00;
        if (i == 0) {
            return -1;
        }
        int iA00 = AbstractC1684AoN.A00(this.A01, i, 0);
        if (iA00 >= 0) {
            Object[] objArr = this.A02;
            if (objArr[iA00 << 1] != null) {
                int i2 = iA00 + 1;
                while (i2 < i && this.A01[i2] == 0) {
                    if (objArr[i2 << 1] == null) {
                        return i2;
                    }
                    i2++;
                }
                do {
                    iA00--;
                    if (iA00 < 0 || this.A01[iA00] != 0) {
                        return i2 ^ (-1);
                    }
                } while (objArr[iA00 << 1] != null);
                return iA00;
            }
        }
        return iA00;
    }

    public static final int A01(DQZ dqz, Object obj, int i) {
        int i2 = dqz.A00;
        if (i2 == 0) {
            return -1;
        }
        int iA00 = AbstractC1684AoN.A00(dqz.A01, i2, i);
        if (iA00 < 0 || obj.equals(dqz.A02[iA00 << 1])) {
            return iA00;
        }
        int i3 = iA00 + 1;
        while (i3 < i2 && dqz.A01[i3] == i) {
            if (obj.equals(dqz.A02[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        do {
            iA00--;
            if (iA00 < 0 || dqz.A01[iA00] != i) {
                return i3 ^ (-1);
            }
        } while (!obj.equals(dqz.A02[iA00 << 1]));
        return iA00;
    }

    public final int A03(V v) {
        int i = this.A00 * 2;
        Object[] objArr = this.A02;
        int i2 = 1;
        if (v == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
                i2 += 2;
            }
            return -1;
        }
        while (i2 < i) {
            if (v.equals(objArr[i2])) {
                return i2 >> 1;
            }
            i2 += 2;
        }
        return -1;
    }

    public final int A04(K k) {
        return k == null ? A00() : A01(this, k, k.hashCode());
    }

    public final void A09(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            C7384Etj.A0U(iArrCopyOf);
            this.A01 = iArrCopyOf;
            this.A02 = C8j3.A1a(this.A02, i * 2);
        }
        if (this.A00 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        if (this.A00 > 0) {
            this.A01 = AbstractC1684AoN.A00;
            this.A02 = AbstractC1684AoN.A02;
            this.A00 = 0;
        }
    }

    public final int hashCode() {
        int[] iArr = this.A01;
        Object[] objArr = this.A02;
        int i = this.A00;
        int i2 = 1;
        int i3 = 0;
        int iA01 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iA01 += C60R.A01(obj) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iA01;
    }

    public final boolean isEmpty() {
        return BV7.A1R(this.A00);
    }

    public final V put(K k, V v) {
        int iHashCode;
        int iA00;
        int i = this.A00;
        if (k != null) {
            iHashCode = k.hashCode();
            iA00 = A01(this, k, iHashCode);
        } else {
            iHashCode = 0;
            iA00 = A00();
        }
        if (iA00 >= 0) {
            int i2 = (iA00 << 1) + 1;
            Object[] objArr = this.A02;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
        int i3 = iA00 ^ (-1);
        int[] iArr = this.A01;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            C7384Etj.A0U(iArrCopyOf);
            this.A01 = iArrCopyOf;
            this.A02 = C8j3.A1a(this.A02, i4 << 1);
            if (i != this.A00) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.A01;
            int i5 = i3 + 1;
            AbstractC0903AHf.A03(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.A02;
            AbstractC0903AHf.A05(objArr2, objArr2, i5 << 1, i3 << 1, this.A00 << 1);
        }
        int i6 = this.A00;
        if (i == i6) {
            int[] iArr3 = this.A01;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.A02;
                int i7 = i3 << 1;
                objArr3[i7] = k;
                objArr3[i7 + 1] = v;
                this.A00 = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final int size() {
        return this.A00;
    }

    public DQZ(int i) {
        this.A01 = i == 0 ? AbstractC1684AoN.A00 : new int[i];
        this.A02 = i == 0 ? AbstractC1684AoN.A02 : new Object[i << 1];
    }

    public static void A02(DQZ dqz, EIK eik, int i) {
        String strALa = eik.ALa(i);
        if (dqz.containsKey(strALa)) {
            return;
        }
        dqz.put(strALa, new ArrayList());
    }

    public final boolean containsKey(K k) {
        return C8j3.A1Q(A04(k));
    }

    public final boolean containsValue(V v) {
        return C8j3.A1Q(A03(v));
    }

    public final V get(K k) {
        int iA04 = A04(k);
        if (iA04 >= 0) {
            return (V) this.A02[(iA04 << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V getOrDefault(Object obj, V v) {
        int iA04 = A04(obj);
        return iA04 >= 0 ? (V) this.A02[(iA04 << 1) + 1] : v;
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final V remove(K k) {
        int iA04 = A04(k);
        if (iA04 >= 0) {
            return A06(iA04);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int iA04 = A04(k);
        if (iA04 >= 0) {
            return A08(iA04, v);
        }
        return null;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int i = this.A00;
        StringBuilder sbA0p = BV4.A0p(i * 28);
        sbA0p.append('{');
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                C8j3.A1K(sbA0p);
            }
            K kA05 = A05(i2);
            if (kA05 != sbA0p) {
                sbA0p.append(kA05);
            } else {
                sbA0p.append("(this Map)");
            }
            sbA0p.append('=');
            V vA07 = A07(i2);
            if (vA07 != sbA0p) {
                sbA0p.append(vA07);
            } else {
                sbA0p.append("(this Map)");
            }
        }
        return C8j3.A15(sbA0p);
    }

    public DQZ() {
        this(0);
    }

    public final boolean remove(K k, V v) {
        int iA04 = A04(k);
        if (iA04 >= 0 && C7384Etj.areEqual(v, A07(iA04))) {
            A06(iA04);
            return true;
        }
        return false;
    }

    public final boolean replace(K k, V v, V v2) {
        int iA04 = A04(k);
        if (iA04 >= 0 && C7384Etj.areEqual(v, A07(iA04))) {
            A08(iA04, v2);
            return true;
        }
        return false;
    }
}

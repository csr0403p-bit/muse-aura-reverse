package X;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class HCD extends AbstractMap implements Serializable {
    public static final Object A09 = C3cG.A0T();
    public transient int A00 = AbstractC7611F5y.A04();
    public transient int A01;
    public transient Object A02;
    public transient int[] A03;
    public transient Object[] A04;
    public transient Object[] A05;
    public transient Collection A06;
    public transient Set A07;
    public transient Set A08;

    public static Object A01(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw BV5.A0Q("must be power of 2 between 2^1 and 2^30: ", i);
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static final int A00(HCD hcd, Object obj) {
        if (!AnonymousClass002.A1Y(hcd.A02)) {
            int iA06 = AbstractC7611F5y.A06(AnonymousClass006.A0D(obj));
            int i = (1 << (hcd.A00 & 31)) - 1;
            Object obj2 = hcd.A02;
            obj2.getClass();
            int iA00 = HCP.A00(obj2, iA06 & i);
            if (iA00 != 0) {
                int i2 = i ^ (-1);
                int i3 = iA06 & i2;
                do {
                    int i4 = iA00 - 1;
                    int[] iArr = hcd.A03;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = hcd.A04;
                        objArr.getClass();
                        if (AbstractC10555Hsi.A00(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    iA00 = i5 & i;
                } while (iA00 != 0);
            }
        }
        return -1;
    }

    public static final Object A02(HCD hcd, Object obj) {
        Object obj2 = hcd.A02;
        if (obj2 != null) {
            int i = (1 << (hcd.A00 & 31)) - 1;
            int[] iArr = hcd.A03;
            iArr.getClass();
            Object[] objArr = hcd.A04;
            objArr.getClass();
            int iA06 = AbstractC7611F5y.A06(AnonymousClass006.A0D(obj));
            int i2 = iA06 & i;
            int iA00 = HCP.A00(obj2, i2);
            if (iA00 != 0) {
                int i3 = i ^ (-1);
                int i4 = iA06 & i3;
                int i5 = -1;
                while (true) {
                    int i6 = iA00 - 1;
                    int i7 = iArr[i6];
                    if ((i7 & i3) != i4 || !AbstractC10555Hsi.A00(obj, objArr[i6])) {
                        iA00 = i7 & i;
                        if (iA00 == 0) {
                            break;
                        }
                        i5 = i6;
                    } else {
                        int i8 = i7 & i;
                        if (i5 == -1) {
                            HCP.A01(obj2, i2, i8);
                        } else {
                            iArr[i5] = (i8 & i) | (iArr[i5] & i3);
                        }
                        if (i6 != -1) {
                            Object[] objArr2 = hcd.A05;
                            objArr2.getClass();
                            Object obj3 = objArr2[i6];
                            hcd.A04(i6, i);
                            hcd.A01--;
                            hcd.A00 += 32;
                            return obj3;
                        }
                    }
                }
            }
        }
        return A09;
    }

    public final Map A03() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void A04(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.A03;
        iArr.getClass();
        Object[] objArr = this.A04;
        objArr.getClass();
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        int size = size();
        int i5 = size - 1;
        if (i >= i5) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[i5];
        objArr[i] = obj2;
        objArr2[i] = objArr2[i5];
        objArr[i5] = null;
        objArr2[i5] = null;
        iArr[i] = iArr[i5];
        iArr[i5] = 0;
        int iA06 = AbstractC7611F5y.A06(AnonymousClass006.A0D(obj2)) & i2;
        int iA00 = HCP.A00(obj, iA06);
        if (iA00 == size) {
            HCP.A01(obj, iA06, i + 1);
            return;
        }
        do {
            i3 = iA00 - 1;
            i4 = iArr[i3];
            iA00 = i4 & i2;
        } while (iA00 != size);
        iArr[i3] = ((i + 1) & i2) | (i4 & (i2 ^ (-1)));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map mapA03 = A03();
            if (mapA03 != null) {
                this.A00 = Math.min(Math.max(size(), 3), 1073741823);
                mapA03.clear();
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
    public final Set entrySet() {
        Set set = this.A08;
        if (set != null) {
            return set;
        }
        HCF hcf = new HCF(this);
        this.A08 = hcf;
        return hcf;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.A07;
        if (set != null) {
            return set;
        }
        HCH hch = new HCH(this);
        this.A07 = hch;
        return hch;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HCD.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A06;
        if (collection != null) {
            return collection;
        }
        HCN hcn = new HCN(this);
        this.A06 = hcn;
        return hcn;
    }

    public HCD() {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapA03 = A03();
        return mapA03 != null ? mapA03.containsKey(obj) : A00(this, obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapA03 = A03();
        if (mapA03 != null) {
            return mapA03.containsValue(obj);
        }
        for (int i = 0; i < this.A01; i++) {
            Object[] objArr = this.A05;
            objArr.getClass();
            if (AbstractC10555Hsi.A00(obj, objArr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapA03 = A03();
        if (mapA03 != null) {
            return mapA03.get(obj);
        }
        int iA00 = A00(this, obj);
        if (iA00 == -1) {
            return null;
        }
        Object[] objArr = this.A05;
        objArr.getClass();
        return objArr[iA00];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapA03 = A03();
        if (mapA03 != null) {
            return mapA03.remove(obj);
        }
        Object objA02 = A02(this, obj);
        if (objA02 == A09) {
            return null;
        }
        return objA02;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapA03 = A03();
        return mapA03 != null ? mapA03.size() : this.A01;
    }

    public HCD(int i) {
    }
}

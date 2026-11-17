package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class GNF extends GNG implements Set {
    public transient GNE A00;

    public static int A00(int i) {
        int iHighestOneBit;
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
            while (iHighestOneBit * 0.7d < iMax) {
                iHighestOneBit <<= 1;
            }
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw C60O.A0i(BV3.A00(56));
            }
        }
        return iHighestOneBit;
    }

    public static GNF A01(Object[] objArr, int i) {
        Object objA0n;
        Object[] objArrCopyOf = objArr;
        if (i == 0) {
            return GNH.A05;
        }
        if (i != 1) {
            int iA00 = A00(i);
            Object[] objArr2 = new Object[iA00];
            int i2 = iA00 - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj = objArrCopyOf[i5];
                if (obj == null) {
                    throw BV4.A0a(FGI.A0H("at index ", i5));
                }
                int iHashCode = obj.hashCode();
                int iA06 = AbstractC7611F5y.A06(iHashCode);
                while (true) {
                    int i6 = iA06 & i2;
                    Object obj2 = objArr2[i6];
                    if (obj2 == null) {
                        objArrCopyOf[i4] = obj;
                        objArr2[i6] = obj;
                        i3 += iHashCode;
                        i4++;
                        break;
                    }
                    if (!obj2.equals(obj)) {
                        iA06++;
                    }
                }
            }
            Arrays.fill(objArrCopyOf, i4, i, (Object) null);
            if (i4 != 1) {
                if (A00(i4) < iA00 / 2) {
                    return A01(objArrCopyOf, i4);
                }
                int length = objArrCopyOf.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                }
                return new GNH(objArrCopyOf, objArr2, i3, i2, i4);
            }
            objA0n = BV6.A0n(objArrCopyOf, 0);
        } else {
            objA0n = BV6.A0n(objArr, 0);
        }
        return new GND(objA0n);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof GNF) && (this instanceof GNH)) {
            obj.getClass();
            if ((obj instanceof GNH) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }
}

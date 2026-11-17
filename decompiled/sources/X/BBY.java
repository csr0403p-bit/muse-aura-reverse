package X;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BBY {
    public static final Comparator<C2233BCd> A00 = new BSF(3);

    public static final Object A01(Object obj, Object obj2, Object obj3) {
        BCG bcg;
        if (!(obj instanceof BCG) || (bcg = (BCG) obj) == null) {
            return null;
        }
        Object obj4 = bcg.A00;
        return (!(C7384Etj.areEqual(obj4, obj2) && C7384Etj.areEqual(bcg.A01, obj3)) && (obj = A01(obj4, obj2, obj3)) == null) ? A01(bcg.A01, obj2, obj3) : obj;
    }

    public static final int A00(List<C2233BCd> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iA00 = C7384Etj.A00(list.get(i3).A00, i);
            if (iA00 < 0) {
                i2 = i3 + 1;
            } else {
                if (iA00 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void A02(BBQ bbq, List<Object> list, int i) {
        if (bbq.A0F(i)) {
            list.add(bbq.A07(i));
            return;
        }
        int[] iArr = bbq.A0C;
        int i2 = i + iArr[(i * 5) + 3];
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            A02(bbq, list, i3);
        }
    }

    public static final void A03(BBJ bbj, Object obj, int i) {
        int iA01 = BBJ.A01(bbj, i);
        Object[] objArr = bbj.A0H;
        Object obj2 = objArr[iA01];
        objArr[iA01] = C78N.A00;
        if (obj == obj2) {
            return;
        }
        StringBuilder sbA0f = C3cG.A0f(obj, "Slot table is out of sync (expected ");
        sbA0f.append(", got ");
        BBL.A01(AnonymousClass007.A0Z(obj2, sbA0f));
        throw F60.createAndThrow();
    }

    public static final void A04(List<C2233BCd> list, int i, int i2) {
        int iA00 = A00(list, i);
        if (iA00 < 0) {
            iA00 = -(iA00 + 1);
        }
        while (iA00 < list.size() && list.get(iA00).A00 < i2) {
            list.remove(iA00);
        }
    }
}

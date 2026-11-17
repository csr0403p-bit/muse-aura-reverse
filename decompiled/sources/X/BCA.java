package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class BCA {
    public static final BBW A01(ApK apK) {
        BBW bbw;
        if ((apK instanceof BBW) && (bbw = (BBW) apK) != null) {
            return bbw;
        }
        BBL.A02("Inconsistent composition");
        throw F60.createAndThrow();
    }

    public static final int A00(ArrayList<BCR> arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = arrayList.get(i4).A00;
            if (i5 < 0) {
                i5 += i2;
            }
            int iA00 = C7384Etj.A00(i5, i);
            if (iA00 < 0) {
                i3 = i4 + 1;
            } else {
                if (iA00 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}

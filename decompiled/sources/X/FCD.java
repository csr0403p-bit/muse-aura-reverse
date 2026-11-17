package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FCD {
    public FDW A00;
    public final FDW A01;

    public final void A00(int i, Object obj) {
        SparseArray<HsM> sparseArrayA00;
        List list;
        if (obj != null) {
            FDW fdwA0B = this.A00;
            if (fdwA0B == null) {
                fdwA0B = this.A01.A0B();
                this.A00 = fdwA0B;
            }
            SparseArray<Object> sparseArray = fdwA0B.A06;
            sparseArray.put(i, obj);
            Object obj2 = sparseArray.get(135);
            if ((obj2 instanceof List) && (list = (List) obj2) != null) {
                ArrayList arrayListA0t = C60Q.A0t(list);
                C0968AJv c0968AJvA0B = ATD.A0B(ATD.A0C(0, C60O.A00(list)), 2);
                int i2 = c0968AJvA0B.A00;
                int i3 = c0968AJvA0B.A01;
                int i4 = c0968AJvA0B.A02;
                if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                    while (true) {
                        if (!C7384Etj.areEqual(list.get(i2), Integer.valueOf(i))) {
                            arrayListA0t.add(list.get(i2));
                            arrayListA0t.add(list.get(i2 + 1));
                        }
                        if (i2 == i3) {
                            break;
                        } else {
                            i2 += i4;
                        }
                    }
                }
                sparseArray.put(135, arrayListA0t);
            }
            if ((fdwA0B.A00 & 8) == 0 || (sparseArrayA00 = fdwA0B.A07.A00()) == null) {
                return;
            }
            sparseArrayA00.remove(i);
        }
    }

    public FCD(FDW fdw) {
        this.A01 = fdw;
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dkw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5578Dkw extends Dl4 {
    @Override // X.DlN
    public final C5585DlC ABN(C5585DlC c5585DlC) {
        if (c5585DlC == null) {
            return null;
        }
        List<Dl9> list = c5585DlC.A03;
        Iterator<Dl9> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b != null && dl9A0b.A06 == 2) {
                i2++;
            }
        }
        if (i2 == 1) {
            return c5585DlC;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it2 = list.iterator();
        while (it2.hasNext()) {
            Dl9 dl9A0b2 = BV6.A0b(it2);
            if (dl9A0b2 == null || dl9A0b2.A06 != 2) {
                arrayListA0h.add(dl9A0b2);
            } else {
                ArrayList arrayListA0h2 = C3cG.A0h();
                Iterator itA02 = Dl9.A02(dl9A0b2);
                int iMax = i;
                while (itA02.hasNext()) {
                    AbstractC5553DkW abstractC5553DkWA0d = BV6.A0d(itA02);
                    int i3 = abstractC5553DkWA0d.A03.A0D;
                    if (i3 > i) {
                        arrayListA0h2.add(abstractC5553DkWA0d);
                        iMax = Math.max(iMax, i3);
                    }
                }
                i = iMax;
                Dl4.A02(dl9A0b2, arrayListA0h, arrayListA0h2, arrayListA0h2.isEmpty() ? 1 : 0);
            }
        }
        return Dl4.A00(c5585DlC, arrayListA0h);
    }
}

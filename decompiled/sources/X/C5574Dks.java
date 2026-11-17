package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dks, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5574Dks extends Dl4 {
    @Override // X.DlN
    public final C5585DlC ABN(C5585DlC c5585DlC) {
        if (c5585DlC == null) {
            return null;
        }
        List<Dl9> list = c5585DlC.A03;
        Iterator<Dl9> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b != null && dl9A0b.A06 == 2) {
                i++;
            }
        }
        if (i != 2) {
            return c5585DlC;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it2 = list.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            Dl9 dl9A0b2 = BV6.A0b(it2);
            if (dl9A0b2 == null || dl9A0b2.A06 != 2) {
                arrayListA0h.add(dl9A0b2);
            } else {
                List<AbstractC5553DkW> list2 = dl9A0b2.A0E;
                int size = (list2.size() + 1) / 2;
                ArrayList arrayListA0t = BV4.A0t(list2);
                C7572F4l.A00(33, arrayListA0t);
                ArrayList arrayListA0h2 = C3cG.A0h();
                if (z) {
                    for (int i2 = 0; i2 < arrayListA0t.size() && i2 < size; i2++) {
                        arrayListA0h2.add(arrayListA0t.get(i2));
                    }
                } else {
                    int size2 = arrayListA0t.size();
                    for (int iMin = size2 - Math.min(size2, size); iMin < arrayListA0t.size(); iMin++) {
                        arrayListA0h2.add(arrayListA0t.get(iMin));
                    }
                }
                Dl4.A02(dl9A0b2, arrayListA0h, arrayListA0h2, arrayListA0h2.isEmpty() ? 1 : 0);
                z = false;
            }
        }
        return Dl4.A00(c5585DlC, arrayListA0h);
    }
}

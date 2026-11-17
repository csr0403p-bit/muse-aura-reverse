package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class Dl4 implements DlN {
    public static C5585DlC A00(C5585DlC c5585DlC, List list) {
        return new C5585DlC(null, c5585DlC.A02, A01(list), Collections.EMPTY_LIST, c5585DlC.A00);
    }

    public static void A02(Dl9 dl9, AbstractCollection abstractCollection, List list, int i) {
        if (i == 0) {
            int i2 = dl9.A05;
            List<C5493DjV> list2 = dl9.A0C;
            List<C5493DjV> list3 = dl9.A0D;
            List<C5493DjV> list4 = dl9.A0F;
            String str = dl9.A0A;
            String str2 = dl9.A0B;
            String str3 = dl9.A09;
            double d = dl9.A00;
            boolean z = dl9.A0G;
            boolean z2 = dl9.A0H;
            int i3 = dl9.A04;
            int i4 = dl9.A03;
            abstractCollection.add(new Dl9(str, str2, str3, dl9.A08, dl9.A07, list, list2, list3, list4, d, dl9.A02, dl9.A01, i2, 2, i3, i4, z, z2));
        }
    }

    public static final List<Dl9> A01(List<Dl9> list) {
        int i;
        HashSet hashSetA13 = C60O.A13();
        Iterator<Dl9> it = list.iterator();
        while (it.hasNext()) {
            Dl9 dl9A0b = BV6.A0b(it);
            if (dl9A0b != null && dl9A0b.A06 == 2) {
                hashSetA13.add(Integer.toString(dl9A0b.A05));
            }
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<Dl9> it2 = list.iterator();
        while (it2.hasNext()) {
            Dl9 dl9A0b2 = BV6.A0b(it2);
            if (dl9A0b2 == null || (i = dl9A0b2.A06) != 2) {
                arrayListA0h.add(dl9A0b2);
            } else {
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (C5493DjV c5493DjV : dl9A0b2.A0F) {
                    if (c5493DjV != null && hashSetA13.contains(c5493DjV.A02)) {
                        arrayListA0h2.add(c5493DjV);
                    }
                }
                int i2 = dl9A0b2.A05;
                List<AbstractC5553DkW> list2 = dl9A0b2.A0E;
                List<C5493DjV> list3 = dl9A0b2.A0C;
                List<C5493DjV> list4 = dl9A0b2.A0D;
                String str = dl9A0b2.A0A;
                String str2 = dl9A0b2.A0B;
                String str3 = dl9A0b2.A09;
                double d = dl9A0b2.A00;
                boolean z = dl9A0b2.A0G;
                boolean z2 = dl9A0b2.A0H;
                arrayListA0h.add(new Dl9(str, str2, str3, dl9A0b2.A08, dl9A0b2.A07, list2, list3, list4, arrayListA0h2, d, dl9A0b2.A02, dl9A0b2.A01, i2, i, dl9A0b2.A04, dl9A0b2.A03, z, z2));
            }
        }
        return arrayListA0h;
    }
}

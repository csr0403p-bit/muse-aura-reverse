package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FDE {
    public static final FDE A00 = new FDE();

    public static final void A00(FDE fde, FDW fdw, Map map, float f) {
        if (fdw.A05 != 17184) {
            if (!fde.A02(fdw, map)) {
                A01(fdw, f);
                return;
            }
            List<FDW> listA0G = fdw.A0G();
            C7384Etj.A0U(listA0G);
            Iterator<FDW> it = listA0G.iterator();
            while (it.hasNext()) {
                FDW fdwA0y = AbstractC7607F5u.A0y(it);
                FDE fde2 = A00;
                C7384Etj.A0X(fdwA0y);
                A00(fde2, fdwA0y, map, f);
            }
        }
    }

    public static final void A01(FDW fdw, float f) {
        Object next;
        Iterator it = AbstractC7608F5v.A15(fdw, 133).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((FDW) next).A05 == 13688) {
                    break;
                }
            }
        }
        FDW fdw2 = (FDW) next;
        (fdw2 != null ? fdw2.A06 : fdw.A06).put(141, Float.valueOf(f));
    }

    private final boolean A02(FDW fdw, Map<Integer, Boolean> map) {
        Integer numValueOf = Integer.valueOf(fdw.A04);
        boolean z = true;
        boolean z2 = true;
        if (map.containsKey(numValueOf)) {
            return C7384Etj.areEqual(map.get(numValueOf), true);
        }
        if (fdw.A05 != 17184) {
            Iterator<FDW> it = fdw.A0G().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    z2 = false;
                    break;
                }
                if (A02(AbstractC7609F5w.A0i(it), map)) {
                    break;
                }
            }
        }
        map.put(numValueOf, z2);
        return z;
    }
}

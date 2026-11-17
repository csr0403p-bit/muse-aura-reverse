package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Hhz {
    public static final Huo A00(C9699Ge6 c9699Ge6, C9691Gdw c9691Gdw) {
        List<String> list = c9691Gdw.A05;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0Y(strA0j, 0);
            GPY gpyABx = c9699Ge6.A03.ABx(strA0j);
            arrayListA0i.add(gpyABx != null ? gpyABx.AFV() : null);
        }
        return A01(arrayListA0i);
    }

    public static final Huo A01(List<C10511HoF> list) {
        HxP hxP;
        Huo huo;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (C10511HoF c10511HoF : list) {
            if (c10511HoF == null || (hxP = c10511HoF.A00) == null) {
                return null;
            }
            int iOrdinal = hxP.ordinal();
            if (iOrdinal == 4) {
                huo = Huo.STANDARD_IAP;
            } else if (iOrdinal == 2) {
                huo = Huo.APPLE_PB;
            } else if (iOrdinal == 1) {
                huo = Huo.APPLE_ACA;
            } else {
                if (iOrdinal != 3) {
                    return null;
                }
                huo = Huo.GOOGLE_GDC;
            }
            arrayListA0i.add(huo);
        }
        return (Huo) AbstractC0878AGe.A0D(AbstractC0878AGe.A0g(arrayListA0i));
    }
}

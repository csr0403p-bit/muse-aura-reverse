package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GOR implements GOU {
    public final GPK A01(String str) {
        Integer num;
        if (!(this instanceof GOQ)) {
            C10574Huh c10574HuhAJI = AJI();
            C7384Etj.A0Y(c10574HuhAJI, 1);
            return str != null ? new GPI(C7BY.A0j(str) ? C79.A0C : C79.A0Z) : new GPH(new GPL(c10574HuhAJI, null, null), C79.A00);
        }
        List list = ((GOQ) this).A00.A04;
        if (list == null) {
            list = C0881AGi.A00;
        }
        if (str == null || !C7BY.A0j(str)) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : list) {
                if (C7384Etj.areEqual(((GOO) obj).A01, str)) {
                    arrayListA0h.add(obj);
                }
            }
            if (arrayListA0h.isEmpty()) {
                num = str == null ? C79.A0K : C79.A0P;
            } else if (arrayListA0h.size() != 1) {
                num = C79.A0W;
            } else {
                GOO goo = (GOO) AbstractC0878AGe.A0J(arrayListA0h);
                String str2 = goo.A02;
                C7384Etj.A0U(str2);
                if (C7BY.A0j(str2)) {
                    num = C79.A0T;
                } else {
                    GOS gos = (GOS) AbstractC0878AGe.A0G(goo.A00.A00);
                    if (gos != null) {
                        int i = (int) (gos.A02 / 10000);
                        String str3 = gos.A04;
                        C7384Etj.A0U(str3);
                        return new GPH(new GPL(new C10574Huh(i, str3), str, str2), str == null ? C79.A00 : C79.A01);
                    }
                    num = C79.A0Y;
                }
            }
        } else {
            num = C79.A0C;
        }
        return new GPI(num);
    }

    public final String toString() {
        String strA01 = C0861A6i.A01(getClass());
        String strAKi = AKi();
        String strAJ2 = AJ2();
        long jAJ3 = AJ3();
        String strAJ4 = AJ4();
        StringBuilder sbA0g = C3cG.A0g(strA01);
        sbA0g.append("(skuId='");
        sbA0g.append(strAKi);
        sbA0g.append("', price='");
        sbA0g.append(strAJ2);
        sbA0g.append("', priceAmountMicros=");
        sbA0g.append(jAJ3);
        sbA0g.append(", priceCurrencyCode='");
        sbA0g.append(strAJ4);
        return AnonymousClass001.A0v("'", sbA0g);
    }
}

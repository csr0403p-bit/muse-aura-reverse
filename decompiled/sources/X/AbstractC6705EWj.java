package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.EWj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6705EWj {
    public static void A01(C6711EWr c6711EWr, C6709EWo c6709EWo, Iterator it, Map map, Map map2) {
        if (!it.hasNext()) {
            c6709EWo.A01.A0B.execute(new RunnableC6706EWl(c6709EWo.A00, c6709EWo, c6709EWo.A02, map2, c6709EWo.A03));
        } else {
            String str = (String) it.next();
            byte[] bArr = (byte[]) BV6.A0l(str, map);
            c6711EWr.A01.Afh((EWA) BV6.A0l(str, c6711EWr.A02), new EWk(c6711EWr, c6709EWo, str, it, map2, map), bArr);
        }
    }

    public static C6713EWt A00(EWJ ewj, Set set) {
        HashMap mapA0u = BV4.A0u();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            EWA ewa = (EWA) it.next();
            Integer num = ewa.A00;
            Integer num2 = C79.A00;
            String strA0M = ewa.A03;
            if (num != num2) {
                strA0M = FGI.A0M("RSA::", strA0M);
            }
            mapA0u.put(strA0M, ewa);
        }
        return new C6713EWt(ewj, mapA0u);
    }
}

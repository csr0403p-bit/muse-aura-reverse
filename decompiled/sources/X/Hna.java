package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Hna {
    public static final Hna A01 = new Hna();
    public final Map<String, GKQ> A00 = BV4.A0u();

    public final synchronized void A00(Map<String, GKQ> values) {
        Iterator itA0n = AnonymousClass002.A0n(values);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            String strA0t = C60O.A0t(entryA0l);
            GKQ gkq = (GKQ) entryA0l.getValue();
            Map<String, GKQ> map = this.A00;
            if (!map.containsKey(strA0t)) {
                map.put(strA0t, gkq);
            } else if (!map.get(strA0t).equals(gkq)) {
                StringBuilder sbA0x = C3cI.A0x("Parameters object with name ", strA0t);
                sbA0x.append(" already exists (");
                sbA0x.append(map.get(strA0t));
                throw BV6.A0u(AnonymousClass006.A0y(gkq, "), cannot insert ", sbA0x));
            }
        }
    }
}

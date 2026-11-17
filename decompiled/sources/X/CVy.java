package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class CVy {
    public final Map A00 = BV4.A0u();

    public CVy(Set set) {
        HashMap mapA0u = BV4.A0u();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            CW1 cw1 = (CW1) it.next();
            if (this.A00.containsKey(C3104ByR.class)) {
                Object obj = mapA0u.get(C3104ByR.class);
                CRy.A03(obj);
                if (0 >= AnonymousClass001.A0F(obj)) {
                }
            }
            this.A00.put(C3104ByR.class, cw1.A00);
            C8j4.A1O(C3104ByR.class, mapA0u, 0);
        }
    }
}

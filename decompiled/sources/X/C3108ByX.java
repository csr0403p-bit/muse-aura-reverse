package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.ByX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3108ByX {
    public final Map A00 = BV4.A0u();
    public final Map A01 = BV4.A0u();

    public final void A00() {
        Map map = this.A00;
        Collection collectionValues = map.values();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(((Map) it.next()).values(), arrayListA0h);
        }
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
        map.clear();
        Map map2 = this.A01;
        Iterator itA10 = BV5.A10(map2);
        while (itA10.hasNext()) {
            itA10.next();
        }
        map2.clear();
    }
}

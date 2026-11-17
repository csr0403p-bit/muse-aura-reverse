package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class G4W {
    public static final Map<String, String> A00(Hkg hkg, List<G4X> list) {
        AnonymousClass003.A0u(hkg, list);
        List<String> list2 = hkg.A02;
        HxE hxEA0r = C3cG.A0r("requested_inapp_skus", AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0W(list2), null));
        List<String> list3 = hkg.A03;
        LinkedHashMap linkedHashMapA05 = AGH.A05(HxE.A01("requested_sku_count", String.valueOf(list2.size() + list3.size()), hxEA0r, C3cG.A0r("requested_subs_skus", AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0W(list3), null))));
        List listA0c = AbstractC0878AGe.A0c(list, new C2FI(new G0U[]{C8631Fhi.A00(15), C8631Fhi.A00(16), C8631Fhi.A00(17)}));
        if (!listA0c.isEmpty()) {
            linkedHashMapA05.put("unfetched_products", AbstractC0878AGe.A0L(",", "", "", listA0c, C8631Fhi.A00(14)));
            ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
            Iterator it = listA0c.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(G4Y.A00(((G4X) it.next()).A01));
            }
            linkedHashMapA05.put("unfetched_product_statuses", AbstractC0878AGe.A0L(",", "", "", AbstractC0878AGe.A0W(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayListA0i))), null));
        }
        return linkedHashMapA05;
    }
}

package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EPP {
    public C7381Etf A00;
    public EQL A02;
    public AbstractC6670EOh A03;
    public EQM A04 = new EQM();
    public EPE A01 = new EPE();

    public EPP() {
        List<EQ9> list = EPO.A02;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (EQ9 eq9 : list) {
            arrayListA0m.add(new HxE(eq9.A01, eq9.A02));
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator it = arrayListA0m.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object obj = ((HxE) next).first;
            Object arrayList = linkedHashMapA0j.get(obj);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMapA0j.put(obj, arrayList);
            }
            ((List) arrayList).add(next);
        }
        ArrayList arrayListA11 = C60O.A11(linkedHashMapA0j.size());
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0i.next();
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(Hr7.A1D(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((HxE) it2.next()).second);
            }
            arrayListA11.add(new HxE(key, AbstractC0878AGe.A0g(arrayList2)));
        }
        this.A00 = new C7381Etf(AGH.A06(arrayListA11));
        this.A02 = new EQL();
        this.A03 = new C6675EOq();
    }
}

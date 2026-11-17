package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DIY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Map<String, AbstractC4959DId> A04;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public DIY(C4958DIb c4958DIb) {
        ?? arrayList;
        LinkedHashMap linkedHashMap;
        C7384Etj.A0Y(c4958DIb, 0);
        ArrayList<AbstractC4959DId> arrayList2 = c4958DIb.A02;
        List list = arrayList2 == null ? C0881AGi.A00 : arrayList2;
        ArrayList<String> arrayList3 = c4958DIb.A03;
        if (arrayList3 != null) {
            arrayList = new ArrayList(Hr7.A1D(arrayList3, 10));
            Iterator<String> it = arrayList3.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C7384Etj.A0Y(next, 0);
                arrayList.add(new DJZ(Long.class, next, 9));
            }
        } else {
            arrayList = C0881AGi.A00;
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayList, list);
        Iterator it2 = arrayListA0P.iterator();
        int i = 5;
        while (it2.hasNext()) {
            AbstractC4959DId abstractC4959DId = (AbstractC4959DId) it2.next();
            abstractC4959DId.A00 = i;
            i += abstractC4959DId.A01;
        }
        this.A01 = c4958DIb.A00;
        this.A02 = c4958DIb.A01;
        if (arrayListA0P.isEmpty()) {
            linkedHashMap = null;
        } else {
            int iA0H = AIW.A0H(Hr7.A1D(arrayListA0P, 10));
            linkedHashMap = new LinkedHashMap(iA0H < 16 ? 16 : iA0H);
            Iterator it3 = arrayListA0P.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                linkedHashMap.put(((AbstractC4959DId) next2).A03, next2);
            }
        }
        this.A04 = linkedHashMap;
        if ((linkedHashMap != null ? linkedHashMap.size() : 0) != (arrayList2 != null ? arrayList2.size() : 0) + (arrayList3 != null ? arrayList3.size() : 0)) {
            throw new IllegalArgumentException("Annotations and points with the same name are not allowed");
        }
        Map<String, AbstractC4959DId> map = this.A04;
        int i2 = 5;
        if (map != null) {
            Iterator<Map.Entry<String, AbstractC4959DId>> it4 = map.entrySet().iterator();
            while (it4.hasNext()) {
                i2 += it4.next().getValue().A01;
            }
        }
        this.A00 = i2;
        this.A03 = c4958DIb.hashCode();
    }
}

package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BTg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2306BTg implements A6F {
    public final int $t;
    public final Object A00;

    public C2306BTg(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.A6F
    public final Bundle Ac4() {
        HxE[] hxEArrA1b;
        if (this.$t == 0) {
            Map<String, List<Object>> mapAXs = ((AFx) this.A00).AXs();
            Bundle bundle = new Bundle();
            Iterator itA0n = AnonymousClass002.A0n(mapAXs);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                String strA0t = C60O.A0t(entryA0l);
                List list = (List) entryA0l.getValue();
                bundle.putParcelableArrayList(strA0t, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            return bundle;
        }
        A6M a6m = (A6M) this.A00;
        Iterator itA0n2 = AnonymousClass002.A0n(AGH.A0A(a6m.A02));
        while (itA0n2.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n2);
            a6m.A00(C60O.A0t(entryA0l2), ((BLG) entryA0l2.getValue()).getValue());
        }
        Iterator itA0n3 = AnonymousClass002.A0n(AGH.A0A(a6m.A03));
        while (itA0n3.hasNext()) {
            Map.Entry entryA0l3 = C3cH.A0l(itA0n3);
            a6m.A00(C60O.A0t(entryA0l3), ((A6F) entryA0l3.getValue()).Ac4());
        }
        Map<String, Object> map = a6m.A04;
        if (map.isEmpty()) {
            hxEArrA1b = new HxE[0];
        } else {
            ArrayList arrayListA11 = C60O.A11(map.size());
            Iterator itA0n4 = AnonymousClass002.A0n(map);
            while (itA0n4.hasNext()) {
                C8j5.A0q(arrayListA11, itA0n4);
            }
            hxEArrA1b = C8j3.A1b(arrayListA11);
        }
        return AbstractC0849A5g.A00(hxEArrA1b);
    }
}

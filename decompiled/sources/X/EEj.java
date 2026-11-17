package X;

import android.util.Log;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes5.dex */
public final class EEj {
    public final Map<Integer, TreeMap<Integer, AbstractC6554EEq>> A00 = C3cG.A0j();

    public final void A00(AbstractC6554EEq abstractC6554EEq) {
        C7384Etj.A0Y(abstractC6554EEq, 0);
        int i = abstractC6554EEq.startVersion;
        int i2 = abstractC6554EEq.endVersion;
        Map<Integer, TreeMap<Integer, AbstractC6554EEq>> map = this.A00;
        Integer numValueOf = Integer.valueOf(i);
        TreeMap<Integer, AbstractC6554EEq> treeMap = map.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap<>();
            map.put(numValueOf, treeMap);
        }
        TreeMap<Integer, AbstractC6554EEq> treeMap2 = treeMap;
        Integer numValueOf2 = Integer.valueOf(i2);
        if (treeMap2.containsKey(numValueOf2)) {
            StringBuilder sb = new StringBuilder("Overriding migration ");
            sb.append(treeMap2.get(numValueOf2));
            sb.append(" with ");
            sb.append(abstractC6554EEq);
            Log.w("ROOM", sb.toString());
        }
        treeMap2.put(numValueOf2, abstractC6554EEq);
    }
}

package X;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GGd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9367GGd implements GH3 {
    @Override // X.GH3
    public final int AKS(Object obj, Object obj2, int i) {
        AbstractMap abstractMap = (AbstractMap) obj;
        C9368GGe c9368GGe = (C9368GGe) obj2;
        int iA03 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator itA0i = C3cG.A0i(abstractMap);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                Object key = entryA0l.getKey();
                Object value = entryA0l.getValue();
                int iA06 = GHG.A06(i);
                C9374GGk<K, V> c9374GGk = c9368GGe.A00;
                int iA00 = GGJ.A00(c9374GGk.A00, key) + GGJ.A00(c9374GGk.A01, value);
                iA03 += iA06 + GGI.A03(iA00) + iA00;
            }
        }
        return iA03;
    }
}

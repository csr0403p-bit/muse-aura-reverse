package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CrU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4256CrU {
    public final int A00;
    public final Map<String, List<String>> A01;

    public C4256CrU(String[] strArr, String[] strArr2, int i) {
        this.A00 = i;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i2 = 0; i2 < iMin; i2++) {
            String str = strArr[i2];
            ((List) C60R.A0Z(C60Q.A0g(str), linkedHashMapA0j)).add(strArr2[i2]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(linkedHashMapA0j.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            linkedHashMap.put(entryA0l.getKey(), AbstractC0878AGe.A0X((Iterable) entryA0l.getValue()));
        }
        this.A01 = linkedHashMap;
    }
}

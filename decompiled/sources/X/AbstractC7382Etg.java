package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Etg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7382Etg {
    public static final long A00(Map map, boolean z) {
        String strA0n;
        if (map == null) {
            return -1L;
        }
        List listA01 = A01("Content-Range", map, z);
        int i = 0;
        if (listA01 == null || listA01.isEmpty()) {
            List listA012 = A01("Content-Length", map, z);
            if (listA012 == null || listA012.isEmpty()) {
                return -1L;
            }
            strA0n = C60Q.A0n(listA012, 0);
        } else {
            String strA0n2 = C60Q.A0n(listA01, 0);
            String strA0g = BV4.A0g(C7BY.A09(strA0n2, '/', C8j3.A0J(strA0n2, 0) - 1), strA0n2);
            int length = strA0g.length() - 1;
            boolean z2 = false;
            while (i <= length) {
                int i2 = length;
                if (!z2) {
                    i2 = i;
                }
                boolean zA1S = BV7.A1S(strA0g.charAt(i2), 32);
                if (z2) {
                    if (!zA1S) {
                        break;
                    }
                    length--;
                } else if (zA1S) {
                    i++;
                } else {
                    z2 = true;
                }
            }
            strA0n = strA0g.subSequence(i, length + 1).toString();
        }
        return Long.parseLong(strA0n);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;+Ljava/util/List<Ljava/lang/String;>;>;Ljava/lang/String;Z)Ljava/util/List<Ljava/lang/String;>; */
    public static final List A01(String str, Map map, boolean z) {
        if (!map.containsKey(str)) {
            if (!z) {
                return null;
            }
            str = C60Q.A0g(str);
            if (!map.containsKey(str)) {
                return null;
            }
        }
        return BV4.A0z(str, map);
    }

    public static final Map<String, List<String>> A02(Map<String, List<String>> map) {
        LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            AnonymousClass006.A1R(linkedHashMapA0I, C3cH.A0l(itA0n));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(linkedHashMapA0I.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMapA0I);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            Iterable iterable = (Iterable) entryA0l.getValue();
            ArrayList arrayListA0i = AnonymousClass003.A0i(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                BV6.A1S(arrayListA0i, it);
            }
            linkedHashMap.put(key, arrayListA0i);
        }
        return AGH.A0A(linkedHashMap);
    }
}

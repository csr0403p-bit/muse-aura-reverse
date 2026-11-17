package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7mB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mB {
    public static C7381Etf A01(Map<C7mC, String> map) {
        HashMap map2 = new HashMap();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            map2.put(entry.getKey(), Collections.singleton(entry.getValue()));
        }
        return new C7381Etf(Collections.unmodifiableMap(map2));
    }

    public static C7381Etf A02(Set<C7mC> set) {
        HashMap map = new HashMap();
        Iterator<C7mC> it = set.iterator();
        while (it.hasNext()) {
            map.put(it.next(), Collections.unmodifiableSet(new HashSet(Collections.singletonList("*|all_packages|*"))));
        }
        return new C7381Etf(Collections.unmodifiableMap(map));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<LX/7mC;>;Ljava/lang/String;)LX/Etf; */
    public static C7381Etf A00(String str, Set set) {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Collections.singletonList(str)));
        HashMap map = new HashMap();
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(setUnmodifiableSet);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            map.put(it.next(), setUnmodifiableSet2);
        }
        return new C7381Etf(Collections.unmodifiableMap(map));
    }
}

package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.EuX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7394EuX {
    public final Map A00;

    public /* synthetic */ C7394EuX(Map map) {
        this.A00 = map;
    }

    public final HashMap A00(Collection collection) {
        Set setUnmodifiableSet;
        HashMap mapA0u = BV4.A0u();
        Map map = this.A00;
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            Object next = itA11.next();
            if (map.containsKey(next)) {
                HashSet hashSetA13 = C60O.A13();
                Iterator itA0n = AnonymousClass002.A0n((Map) map.get(next));
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    if (collection.contains(entryA0l.getKey())) {
                        hashSetA13.add(entryA0l.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSetA13);
            } else {
                setUnmodifiableSet = Collections.EMPTY_SET;
            }
            mapA0u.put(next, setUnmodifiableSet);
        }
        return mapA0u;
    }
}

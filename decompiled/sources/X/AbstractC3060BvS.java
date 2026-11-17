package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BvS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3060BvS extends BXq {
    public static final <K, V> List<HxE<K, V>> A0B(Map<? extends K, ? extends V> map) {
        if (map.size() != 0) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            if (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (!itA0n.hasNext()) {
                    return Collections.singletonList(C3cG.A0r(entryA0l.getKey(), entryA0l.getValue()));
                }
                ArrayList arrayListA11 = C60O.A11(map.size());
                AnonymousClass002.A1J(entryA0l.getKey(), entryA0l.getValue(), arrayListA11);
                do {
                    C8j5.A0q(arrayListA11, itA0n);
                } while (itA0n.hasNext());
                return arrayListA11;
            }
        }
        return C0881AGi.A00;
    }
}

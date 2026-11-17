package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class F1I {
    public static boolean A00(Collection collection, Set set) {
        boolean zRemove;
        collection.getClass();
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            zRemove = false;
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
        } else {
            Iterator it2 = set.iterator();
            zRemove = false;
            while (it2.hasNext()) {
                zRemove = BV8.A1Z(it2.next(), collection, it2, zRemove);
            }
        }
        return zRemove;
    }
}

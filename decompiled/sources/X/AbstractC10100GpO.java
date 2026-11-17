package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.GpO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10100GpO {
    public static boolean A01(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection != null) {
            return collection2 == null ? collection.contains(obj) : !collection2.contains(obj) || collection.contains(obj);
        }
        if (collection2 != null) {
            return !collection2.contains(obj);
        }
        return false;
    }

    public static C10126Gpr A00(Set<String> set, Set<String> set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return new C10126Gpr(set, set2);
    }
}

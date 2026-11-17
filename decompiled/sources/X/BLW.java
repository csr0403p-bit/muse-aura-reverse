package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class BLW extends AIX {
    public static final <T> Set<T> A05(T... tArr) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (T t : tArr) {
            if (t != null) {
                linkedHashSetA0k.add(t);
            }
        }
        return linkedHashSetA0k;
    }
}

package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Fnp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8829Fnp {
    public static final C7381Etf A00;

    static {
        Set<C7mC> set = AbstractC10402HbJ.A11;
        Set setUnmodifiableSet = Collections.unmodifiableSet(BV5.A0v(new String[]{"com.facebook.appmanager", "com.facebook.system", "com.facebook.services"}));
        HashMap mapA0u = BV4.A0u();
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(setUnmodifiableSet);
        Iterator<C7mC> it = set.iterator();
        while (it.hasNext()) {
            mapA0u.put(it.next(), setUnmodifiableSet2);
        }
        A00 = new C7381Etf(Collections.unmodifiableMap(mapA0u));
    }
}

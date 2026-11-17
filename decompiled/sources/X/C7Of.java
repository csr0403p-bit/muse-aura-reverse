package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.7Of, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Of {
    public static final Set<String> A00;
    public static final Set<String> A01;

    static {
        String[] strArr = HtV.A02;
        HashSet hashSetA13 = C60O.A13();
        boolean z = false;
        for (int i = 0; i < 42; i++) {
            String str = strArr[i];
            if ("en".equals(str)) {
                z = true;
            } else {
                hashSetA13.add(str);
            }
        }
        A01 = Collections.unmodifiableSet(hashSetA13);
        HashSet hashSet = new HashSet(hashSetA13);
        if (z) {
            hashSet.add("en");
        }
        A00 = Collections.unmodifiableSet(hashSet);
    }
}

package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class HkT {
    public static final Map<String, Integer> A00;
    public static final Map<String, Integer> A01;

    static {
        HashMap mapA0u = BV4.A0u();
        Integer numA0V = BV4.A0V();
        mapA0u.put("auto", numA0V);
        Integer numA0W = BV4.A0W();
        mapA0u.put("yes", numA0W);
        Integer numA0X = BV4.A0X();
        mapA0u.put("no", numA0X);
        mapA0u.put("no_hide_descendants", BV4.A0Z());
        A00 = Collections.unmodifiableMap(mapA0u);
        HashMap mapA0u2 = BV4.A0u();
        mapA0u2.put("none", numA0V);
        mapA0u2.put("polite", numA0W);
        mapA0u2.put("assertive", numA0X);
        A01 = Collections.unmodifiableMap(mapA0u2);
    }
}

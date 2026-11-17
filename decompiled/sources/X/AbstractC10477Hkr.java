package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Hkr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10477Hkr {
    public static Number A02(double d) {
        int i = (int) d;
        return ((double) i) == d ? Integer.valueOf(i) : Double.valueOf(d);
    }

    public static double A00(Object obj) {
        if (obj != null) {
            return obj instanceof Boolean ? AnonymousClass001.A1X(obj) ? 1.0d : 0.0d : BV6.A00(obj);
        }
        throw BV4.A0a("null cannot be cast to number");
    }

    public static int A01(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Number) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        return obj instanceof HsM ? 8 : 5;
    }
}

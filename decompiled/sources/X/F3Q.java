package X;

import java.util.Comparator;

/* loaded from: classes5.dex */
public final class F3Q {
    public static final Comparator A00;

    static {
        Comparator comparator;
        try {
            Object[] enumConstants = Class.forName(String.valueOf(F3Q.class.getName()).concat("$UnsafeComparator")).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = F3Z.A01;
        }
        A00 = comparator;
    }
}

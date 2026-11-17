package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class HCY {
    public static String A00;
    public static volatile HCa A01;

    public static final void A00(String str, Object... objArr) {
        synchronized (HCY.class) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 2);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            CFK.A04("FbColdStartExperimentsLoader", str2);
            if (A00 == null) {
                A00 = str2;
            }
        }
    }
}

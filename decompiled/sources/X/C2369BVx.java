package X;

import java.util.HashSet;

/* renamed from: X.BVx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2369BVx {
    public static String A00 = "goog.exo.core";
    public static boolean A01 = true;
    public static final HashSet<String> A02 = C60O.A13();

    public static synchronized void A00(String str) {
        if (A02.add(str)) {
            A00 = FGI.A0U(A00, ", ", str);
        }
    }
}

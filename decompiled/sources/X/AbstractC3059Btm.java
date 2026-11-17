package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Btm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3059Btm {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        HashMap mapA0u2 = BV4.A0u();
        A01 = mapA0u2;
        mapA0u.put(-1, "The Play Store app is either not installed or not the official version.");
        mapA0u.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        mapA0u.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        mapA0u2.put(-1, "PLAY_STORE_NOT_FOUND");
        mapA0u2.put(-2, "INVALID_REQUEST");
        mapA0u2.put(-100, "INTERNAL_ERROR");
    }
}

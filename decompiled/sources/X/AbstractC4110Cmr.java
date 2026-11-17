package X;

/* renamed from: X.Cmr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4110Cmr {
    public static String A00(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw BV4.A0P();
    }
}

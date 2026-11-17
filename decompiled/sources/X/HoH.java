package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public abstract class HoH {
    public static Number A00(double d) {
        int i = (int) d;
        return ((double) i) == d ? Integer.valueOf(i) : Double.valueOf(d);
    }

    public static boolean A01(Object obj) {
        if (obj instanceof Number) {
            return AnonymousClass002.A1L(AnonymousClass001.A0F(obj));
        }
        if (obj instanceof Boolean) {
            return AnonymousClass001.A1X(obj);
        }
        throw C60Q.A0U("Expected Number or Boolean: ", obj == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : obj.toString());
    }
}

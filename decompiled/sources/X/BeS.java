package X;

import android.hardware.camera2.CameraCaptureSession;
import java.util.Locale;

/* loaded from: classes5.dex */
public abstract class BeS {
    public static void A02(Bj4 bj4) {
        A07(bj4.A0O.isEmpty(), null);
    }

    public static CameraCaptureSession A00(C2715Bil c2715Bil) {
        A03(c2715Bil.A01, "Need to call openCaptureSession before using this API.");
        return ((Bl1) c2715Bil.A01.A00).A00;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Object;>(TT;Ljava/lang/Object;)TT; */
    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void A04(String str, int i, int i2, int i3) {
        if (i < i2) {
            throw C60O.A0i(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", BV8.A1b(str, i2, i3)));
        }
        if (i > i3) {
            throw C60O.A0i(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", BV8.A1b(str, i2, i3)));
        }
    }

    public static void A05(boolean z) {
        if (!z) {
            throw BV4.A0P();
        }
    }

    public static void A06(boolean z, Object obj) {
        if (!z) {
            throw C60O.A0i(String.valueOf(obj));
        }
    }

    public static void A07(boolean z, String str) {
        if (!z) {
            throw C3cG.A0Q(str);
        }
    }

    public static C54 A01(C3241C4y c3241C4y) {
        C54 c54A03 = c3241C4y.A03();
        A03(c3241C4y.A00, "Did you call earlyInit()?");
        return c54A03;
    }
}

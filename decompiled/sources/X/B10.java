package X;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;

/* loaded from: classes4.dex */
public abstract class B10 {
    public static final B1T A01(Hw7 hw7, int i, int i2, int i3) {
        return new B1T(Bitmap.createBitmap((DisplayMetrics) null, i, i2, i3 == 0 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.ALPHA_8, true, AbstractC10377HDh.A00(hw7)));
    }

    public static final Bitmap A00(InterfaceC2178B0w interfaceC2178B0w) {
        if (interfaceC2178B0w instanceof B1T) {
            return ((B1T) interfaceC2178B0w).A00;
        }
        throw C8j3.A18("Unable to obtain android.graphics.Bitmap");
    }
}

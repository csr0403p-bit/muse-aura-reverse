package androidx.camera.view.internal.compat.quirk;

import X.BX1;
import android.os.Build;

/* loaded from: classes5.dex */
public class SurfaceViewStretchedQuirk implements BX1 {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 33) {
            return false;
        }
        String str = Build.MANUFACTURER;
        if ("SAMSUNG".equalsIgnoreCase(str)) {
            String str2 = Build.DEVICE;
            if ("F2Q".equalsIgnoreCase(str2) || "Q2Q".equalsIgnoreCase(str2)) {
                return true;
            }
        }
        if ("OPPO".equalsIgnoreCase(str) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE)) {
            return true;
        }
        return "LENOVO".equalsIgnoreCase(str) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }
}

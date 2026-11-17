package androidx.camera.camera2.internal.compat.quirk;

import X.BX1;
import X.C2476Bc3;
import android.os.Build;

/* loaded from: classes5.dex */
public class AfRegionFlipHorizontallyQuirk implements BX1 {
    public static boolean A00(C2476Bc3 c2476Bc3) {
        return Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && C2476Bc3.A00(c2476Bc3) == 0;
    }
}

package androidx.camera.camera2.internal.compat.quirk;

import X.BV6;
import X.BX1;
import android.os.Build;

/* loaded from: classes5.dex */
public class CaptureSessionShouldUseMrirQuirk implements BX1 {
    public static boolean A00() {
        return BV6.A1a("google") && Build.VERSION.SDK_INT >= 35;
    }
}

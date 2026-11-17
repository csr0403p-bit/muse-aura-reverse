package androidx.camera.video.internal.compat.quirk;

import X.BX1;
import X.C8j3;
import android.os.Build;

/* loaded from: classes5.dex */
public class NegativeLatLongSavesIncorrectlyQuirk implements BX1 {
    public static boolean A00() {
        return C8j3.A1T(Build.VERSION.SDK_INT, 34);
    }
}

package androidx.camera.video.internal.compat.quirk;

import X.BV5;
import X.BV6;
import X.BX1;
import android.os.Build;
import java.util.Set;

/* loaded from: classes5.dex */
public class CameraUseInconsistentTimebaseQuirk implements BX1 {
    public static final Set<String> A00 = BV5.A0v(new String[]{"samsungexynos7570", "samsungexynos7870", "qcom"});
    public static final Set<String> A02 = BV5.A0v(new String[]{"sm4350", "sm6375", "sm7325"});
    public static final Set<String> A01 = BV5.A0v(new String[]{"m2007j20cg", "m2007j20ct"});

    public static boolean A00() {
        return (Build.VERSION.SDK_INT >= 31 && A02.contains(Build.SOC_MODEL.toLowerCase())) || (BV6.A1a("SAMSUNG") && A00.contains(Build.HARDWARE.toLowerCase())) || A01.contains(Build.MODEL.toLowerCase());
    }
}

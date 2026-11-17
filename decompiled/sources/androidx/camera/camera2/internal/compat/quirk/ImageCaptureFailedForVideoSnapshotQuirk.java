package androidx.camera.camera2.internal.compat.quirk;

import X.BV5;
import X.BV6;
import X.BX1;
import android.os.Build;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public class ImageCaptureFailedForVideoSnapshotQuirk implements BX1 {
    public static final Set<String> A00 = BV5.A0v(new String[]{"itel l6006", "itel w6004", "moto g(20)", "moto e13", "moto e20", "rmx3231", "rmx3511", "sm-a032f", "sm-a035m", "tecno mobile bf6"});

    public static boolean A00() {
        Set<String> set = A00;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (set.contains(str.toLowerCase(locale))) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 31 && "Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER)) {
            return true;
        }
        String lowerCase = Build.HARDWARE.toLowerCase(locale);
        if (lowerCase.startsWith("ums")) {
            return true;
        }
        String str2 = Build.BRAND;
        if ("itel".equalsIgnoreCase(str2) && lowerCase.startsWith("sp")) {
            return true;
        }
        return "HUAWEI".equalsIgnoreCase(str2) && BV6.A1Z("FIG-LX1");
    }
}

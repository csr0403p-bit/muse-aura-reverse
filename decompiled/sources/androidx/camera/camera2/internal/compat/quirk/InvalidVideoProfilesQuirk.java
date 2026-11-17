package androidx.camera.camera2.internal.compat.quirk;

import X.AnonymousClass001;
import X.BV5;
import X.BV6;
import X.BX1;
import X.C60O;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public class InvalidVideoProfilesQuirk implements BX1 {
    public static final List<String> A02 = Arrays.asList("pixel 4", "pixel 4a", "pixel 4a (5g)", "pixel 4 xl", "pixel 5", "pixel 5a", "pixel 6", "pixel 6a", "pixel 6 pro", "pixel 7", "pixel 7 pro");
    public static final List<String> A00 = C60O.A16("cph2417", "cph2451");
    public static final List<String> A01 = BV5.A12("cph2437", "cph2525", "pht110");

    public static boolean A00() {
        if (BV6.A1a("samsung") && AnonymousClass001.A0u(Build.ID).startsWith("tp1a")) {
            return true;
        }
        List<String> list = A02;
        String str = Build.MODEL;
        Locale locale = Locale.ROOT;
        if (list.contains(str.toLowerCase(locale))) {
            String lowerCase = Build.ID.toLowerCase(locale);
            if (lowerCase.startsWith("tp1a") || lowerCase.startsWith("td1a")) {
                return true;
            }
        }
        String str2 = Build.BRAND;
        if ("redmi".equalsIgnoreCase(str2) || "xiaomi".equalsIgnoreCase(str2)) {
            String lowerCase2 = Build.ID.toLowerCase(locale);
            if (lowerCase2.startsWith("tkq1") || lowerCase2.startsWith("tp1a")) {
                return true;
            }
        }
        List<String> list2 = A00;
        String str3 = Build.MODEL;
        if (list2.contains(str3.toLowerCase(locale)) && Build.VERSION.SDK_INT == 33) {
            return true;
        }
        return A01.contains(str3.toLowerCase(locale)) && Build.VERSION.SDK_INT == 33;
    }
}

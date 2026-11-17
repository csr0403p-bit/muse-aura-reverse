package X;

import android.util.Log;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class BXP {
    public static void A00(String str) {
        Set<String> set = BXL.A00;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        set.add(str);
    }

    public static void A01(String str, Throwable th) {
        Set<String> set = BXL.A00;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}

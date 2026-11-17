package X;

import android.util.Log;

/* loaded from: classes5.dex */
public abstract class C35 {
    public static void A01(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void A00(String str) {
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", str);
        }
    }
}

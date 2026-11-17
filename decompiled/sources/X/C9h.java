package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;

/* loaded from: classes5.dex */
public abstract class C9h {
    public static long A00;
    public static boolean A01;

    public static boolean A00(Context context) {
        boolean z;
        NetworkInfo activeNetworkInfo;
        if (SystemClock.uptimeMillis() - A00 < 5000) {
            return A01;
        }
        boolean z2 = false;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    z2 = true;
                }
            }
            z = z2;
        } catch (Throwable th) {
            CFK.A08(C9Y.TAG, "Connectivity check failed", th);
            C2Q.A00().AT9("CheckNetwork", th, null);
            z = false;
        }
        A01 = z2;
        A00 = SystemClock.uptimeMillis();
        return z;
    }
}

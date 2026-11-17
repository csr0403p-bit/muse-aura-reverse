package X;

import android.os.Build;
import android.os.Process;

/* loaded from: classes5.dex */
public abstract class CCR {
    public static long A00 = -1;
    public static long A01 = -1;
    public static long A02 = -1;

    public static final long A00() {
        long j = A00;
        if (j != -1) {
            return j;
        }
        long startUptimeMillis = Process.getStartUptimeMillis();
        A00 = startUptimeMillis;
        return startUptimeMillis;
    }

    public static final long A01() {
        if (Build.VERSION.SDK_INT < 33) {
            return A00();
        }
        try {
            return Process.getStartRequestedUptimeMillis();
        } catch (NoSuchMethodError unused) {
            return A00();
        }
    }
}

package X;

import android.os.SystemClock;

/* renamed from: X.Hwv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10587Hwv {
    public static final Hs5 A00;

    static {
        Hs5 c10591Hxe;
        try {
            SystemClock.elapsedRealtimeNanos();
            c10591Hxe = new Hxf();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c10591Hxe = new C10591Hxe();
        }
        A00 = c10591Hxe;
    }
}

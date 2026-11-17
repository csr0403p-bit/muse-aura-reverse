package X;

import android.app.ApplicationExitInfo;

/* loaded from: classes5.dex */
public abstract class C6O {
    public static void A00(ApplicationExitInfo applicationExitInfo, C3228C4l c3228C4l) {
        try {
            ApplicationExitInfo.AnrInfo anrInfo = applicationExitInfo.getAnrInfo();
            if (anrInfo != null) {
                int anrId = anrInfo.getAnrId();
                int anrType = anrInfo.getAnrType();
                long timeoutMillis = anrInfo.getTimeoutMillis();
                boolean zIsUserPerceptible = anrInfo.isUserPerceptible();
                C3228C4l.A01(C6B.A1p, c3228C4l, anrId);
                C3228C4l.A01(C6B.A1r, c3228C4l, anrType);
                C3228C4l.A01(C6B.A1q, c3228C4l, timeoutMillis);
                c3228C4l.A02(C6B.A09, zIsUserPerceptible);
            }
        } catch (Throwable th) {
            CFK.A08(C9Y.TAG, "Error reading ANR info", th);
        }
    }
}

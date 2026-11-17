package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* loaded from: classes5.dex */
public final class DH3 implements Runnable {
    public static final String __redex_internal_original_name = "OneFabricEventHandler$initIfNeeded$1$1$3";

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String clockSyncConfig = FFSingletonJNILogger.setClockSyncConfig("");
            if (clockSyncConfig != null) {
                CFK.A0H("OneFabricEventHandler", "ClockSync config refused: %s", clockSyncConfig);
            }
        } catch (Throwable th) {
            try {
                CFK.A0J("OneFabricEventHandler", th, "ClockSync config refused: start_failed");
            } catch (Throwable unused) {
            }
            try {
                FFSingletonJNILogger.countClockSyncConfigStartFailed();
            } catch (Throwable unused2) {
            }
        }
    }
}

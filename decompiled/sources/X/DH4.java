package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* loaded from: classes5.dex */
public final class DH4 implements Runnable {
    public static final String __redex_internal_original_name = "OneFabricEventHandler$startNewSessionAndGetDescriptorLong$2$1";
    public final /* synthetic */ long A00;

    public DH4(long j) {
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            FFSingletonJNILogger.refreshClockSyncOnForeground(this.A00);
        } catch (Throwable th) {
            try {
                CFK.A0J("OneFabricEventHandler", th, "ClockSync foreground refresh threw");
            } catch (Throwable unused) {
            }
            try {
                FFSingletonJNILogger.countClockSyncForegroundThrew();
            } catch (Throwable unused2) {
            }
        }
    }
}

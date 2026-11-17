package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class C06 extends Thread {
    public static final String __redex_internal_original_name = "zza";

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}

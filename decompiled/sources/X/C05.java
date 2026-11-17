package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class C05 implements Runnable {
    public static final String __redex_internal_original_name = "zza";
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.A00.run();
    }

    public C05(Runnable runnable) {
        this.A00 = runnable;
    }
}

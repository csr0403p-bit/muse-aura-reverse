package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class Bx0 extends Thread {
    public static final String __redex_internal_original_name = "RequestExecutor$DefaultThreadFactory$ProcessPriorityThread";
    public final int A00;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.A00);
        super.run();
    }

    public Bx0(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.A00 = i;
    }
}

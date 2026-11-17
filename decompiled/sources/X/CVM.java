package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class CVM implements Runnable {
    public static final String __redex_internal_original_name = "DefaultSupplier$SimpleThreadFactory$newThread$t$1";
    public final /* synthetic */ CVL A00;
    public final /* synthetic */ Runnable A01;

    public CVM(CVL cvl, Runnable runnable) {
        this.A00 = cvl;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(this.A00.A00);
        this.A01.run();
    }
}

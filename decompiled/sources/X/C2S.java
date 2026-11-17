package X;

import android.os.Process;

/* loaded from: classes5.dex */
public final class C2S extends Thread {
    public static final String __redex_internal_original_name = "LacrimaExecutors$NamedThreadFactory$1";
    public final /* synthetic */ C2T A00;
    public final /* synthetic */ Runnable A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2S(C2T c2t, Runnable runnable, String str) {
        super(str);
        this.A01 = runnable;
        this.A00 = c2t;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(this.A00.A00);
        } catch (Throwable th) {
            C2Q.A00().AT9("ExecutorSetPriority", th, null);
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            runnable.run();
        }
    }
}

package X;

import android.os.PowerManager;

/* renamed from: X.CiH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC3969CiH implements Runnable {
    public static final String __redex_internal_original_name = "FBNSPreloadWakefulExecutor$1";
    public final /* synthetic */ PowerManager.WakeLock A00;
    public final /* synthetic */ C3971CiJ A01;
    public final /* synthetic */ Runnable A02;

    public RunnableC3969CiH(PowerManager.WakeLock wakeLock, C3971CiJ c3971CiJ, Runnable runnable) {
        this.A02 = runnable;
        this.A00 = wakeLock;
        this.A01 = c3971CiJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        try {
            try {
                this.A02.run();
            } catch (Exception e) {
                CFK.A08("FBNSPreloadWakefulExecutor", "wakefulExecute", e);
            }
            if (wakeLock != null) {
                wakeLock.release();
            }
        } finally {
            wakeLock = this.A00;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }
    }
}

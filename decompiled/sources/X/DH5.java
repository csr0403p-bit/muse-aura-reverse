package X;

import com.facebook.falco.fabric.FFSingletonJNILogger;

/* loaded from: classes5.dex */
public final class DH5 implements Runnable {
    public static final String __redex_internal_original_name = "Analytics2HealthCounterLogger$1";
    public final /* synthetic */ C4950DGx A00;

    public DH5(C4950DGx c4950DGx) {
        this.A00 = c4950DGx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DG4 dg4 = this.A00.A00;
        if (dg4 == null || dg4.AOX()) {
            FFSingletonJNILogger.flushHealthCounters();
        }
    }
}

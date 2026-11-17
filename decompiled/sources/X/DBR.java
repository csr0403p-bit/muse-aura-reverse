package X;

import com.facebook.aura.startup.AuraStartupMetricsRecorder;

/* loaded from: classes5.dex */
public final class DBR implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricAsyncRecorder$1";
    public final /* synthetic */ DBJ<ColdInfo> A00;

    public DBR(DBJ<ColdInfo> dbj) {
        this.A00 = dbj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AuraStartupMetricsRecorder.isQplReady.block();
    }
}

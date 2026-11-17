package X;

/* loaded from: classes5.dex */
public final class DAR implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricTracker$onAppStartBegin$1";
    public final /* synthetic */ DAW<ColdInfo> A00;

    public DAR(DAW<ColdInfo> daw) {
        this.A00 = daw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.cancelStart("timeout");
    }
}

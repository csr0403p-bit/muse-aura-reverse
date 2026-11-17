package X;

/* renamed from: X.DAr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4877DAr implements Runnable {
    public static final String __redex_internal_original_name = "StartupMetricTracker$navCancelStartAsync$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ DAW<ColdInfo> A01;
    public final /* synthetic */ String A02;

    public RunnableC4877DAr(DAW<ColdInfo> daw, String str, int i) {
        this.A01 = daw;
        this.A02 = str;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.handleCancel(this.A02, this.A00);
    }
}

package X;

/* loaded from: classes5.dex */
public final class CEA implements Runnable {
    public static final String __redex_internal_original_name = "GooglePlayDownloader$registerInstallManagerListener$1$onStateUpdate$2";
    public final /* synthetic */ C3313CDn A00;
    public final /* synthetic */ CJN A01;

    public CEA(C3313CDn c3313CDn, CJN cjn) {
        this.A00 = c3313CDn;
        this.A01 = cjn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3313CDn c3313CDn = this.A00;
        CJN cjn = this.A01;
        synchronized (c3313CDn) {
            C3313CDn.A03(c3313CDn, cjn, true);
            C3313CDn.A02(c3313CDn);
        }
    }
}

package X;

/* loaded from: classes5.dex */
public final class CSM implements Runnable {
    public static final String __redex_internal_original_name = "zzk";
    public final /* synthetic */ CSA A00;
    public final /* synthetic */ CSL A01;

    public CSM(CSA csa, CSL csl) {
        this.A01 = csl;
        this.A00 = csa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CSL csl = this.A01;
        synchronized (csl.A01) {
            CSP csp = csl.A00;
            Exception excA07 = this.A00.A07();
            CRy.A03(excA07);
            csp.onFailure(excA07);
        }
    }
}

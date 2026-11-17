package X;

/* loaded from: classes5.dex */
public final class CMR implements Runnable {
    public static final String __redex_internal_original_name = "zzi";
    public final /* synthetic */ CSA A00;
    public final /* synthetic */ CMS A01;

    public CMR(CSA csa, CMS cms) {
        this.A01 = cms;
        this.A00 = csa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CMS cms = this.A01;
        synchronized (cms.A01) {
            cms.A00.onComplete(this.A00);
        }
    }
}

package X;

/* loaded from: classes5.dex */
public final class CSX implements Runnable {
    public static final String __redex_internal_original_name = "zzm";
    public final /* synthetic */ CSA A00;
    public final /* synthetic */ CSW A01;

    public CSX(CSA csa, CSW csw) {
        this.A01 = csw;
        this.A00 = csa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CSW csw = this.A01;
        synchronized (csw.A01) {
            CSZ csz = csw.A00;
            if (csz != null) {
                csz.onSuccess(this.A00.A08());
            }
        }
    }
}

package X;

/* loaded from: classes5.dex */
public final class CSO implements Runnable {
    public static final String __redex_internal_original_name = "zzg";
    public final /* synthetic */ CSN A00;

    public CSO(CSN csn) {
        this.A00 = csn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CSN csn = this.A00;
        synchronized (csn.A01) {
            csn.A00.AS6();
        }
    }
}

package X;

/* loaded from: classes6.dex */
public final class FO0 implements Runnable {
    public static final String __redex_internal_original_name = "DataSynchronizer$4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7975FNq A01;
    public final /* synthetic */ Object A02;

    public FO0(C7975FNq c7975FNq, Object obj, int i) {
        this.A02 = obj;
        this.A00 = i;
        this.A01 = c7975FNq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7975FNq.A01(this.A01, this.A02, this.A00);
    }
}

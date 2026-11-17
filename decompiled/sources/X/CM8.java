package X;

/* loaded from: classes5.dex */
public final class CM8 implements Runnable {
    public static final String __redex_internal_original_name = "CallbackWrapper$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ CMK A01;
    public final /* synthetic */ CM6 A02;

    public CM8(CMK cmk, CM6 cm6, int i) {
        this.A02 = cm6;
        this.A01 = cmk;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CMK cmk = this.A01;
        int i = this.A00;
        CM9 cm9 = cmk.A00;
        if (cm9 != null) {
            cm9.A01(i);
        }
    }
}

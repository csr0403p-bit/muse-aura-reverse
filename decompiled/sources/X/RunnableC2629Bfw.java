package X;

/* renamed from: X.Bfw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2629Bfw implements Runnable {
    public static final String __redex_internal_original_name = "SurfaceEdge$$ExternalSyntheticLambda4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ BfK A02;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        BfK bfK = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        if (bfK.A00 != i) {
            bfK.A00 = i;
            z = true;
        } else {
            z = false;
        }
        if (bfK.A01 != i2) {
            bfK.A01 = i2;
        } else if (!z) {
            return;
        }
        BfK.A01(bfK);
    }

    public /* synthetic */ RunnableC2629Bfw(BfK bfK, int i, int i2) {
        this.A02 = bfK;
        this.A00 = i;
        this.A01 = i2;
    }
}

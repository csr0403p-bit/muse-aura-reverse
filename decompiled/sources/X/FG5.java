package X;

/* loaded from: classes6.dex */
public final class FG5 {
    public C0918AHu<C7825FGg, long[]> A00;
    public C0938AIr A01;
    public final int A02;
    public final C0918AHu<C7825FGg, long[]> A03;
    public final long[] A04;

    public final void A00(C7825FGg c7825FGg, long[] jArr) {
        if (jArr != null) {
            C0918AHu<C7825FGg, long[]> c0918AHu = this.A00;
            if (c0918AHu == null) {
                C0918AHu c0918AHu2 = AbstractC0977AKq.A00;
                c0918AHu = new C0918AHu<>(6);
                this.A00 = c0918AHu;
            }
            c0918AHu.A0C(c7825FGg, jArr);
            C0938AIr c0938AIr = this.A01;
            if (c0938AIr == null) {
                c0938AIr = new C0938AIr(this.A04);
                this.A01 = c0938AIr;
            }
            for (long j : jArr) {
                c0938AIr.A00(j);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (I[JLX/AHu<LX/FGg;[J>;)V */
    public FG5(C0918AHu c0918AHu, long[] jArr, int i) {
        this.A02 = i;
        this.A04 = jArr;
        this.A03 = c0918AHu;
    }
}

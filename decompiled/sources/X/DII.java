package X;

/* loaded from: classes5.dex */
public final class DII implements Runnable {
    public static final String __redex_internal_original_name = "QuickEventListenersList$notifyLater$1$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ COt A03;
    public final /* synthetic */ C4956DHw A04;
    public final /* synthetic */ ADq A05;
    public final /* synthetic */ ADq A06;

    public DII(COt cOt, C4956DHw c4956DHw, ADq aDq, ADq aDq2, int i, int i2, long j) {
        this.A04 = c4956DHw;
        this.A02 = j;
        this.A03 = cOt;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = aDq;
        this.A06 = aDq2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4956DHw c4956DHw = this.A04;
        long j = this.A02;
        C4956DHw.A01(this.A03, c4956DHw, this.A05, this.A06, this.A01, this.A00, j);
    }
}

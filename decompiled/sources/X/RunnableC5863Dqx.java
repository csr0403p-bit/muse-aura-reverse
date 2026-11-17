package X;

/* renamed from: X.Dqx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5863Dqx implements Runnable {
    public static final String __redex_internal_original_name = "PlayerListener$shouldProcessErrorRunnable";
    public final C5790DpZ A00;
    public final Dq8 A01;
    public final C5623Dm6 A02;
    public final String A03;
    public final /* synthetic */ C5630DmE A04;

    public RunnableC5863Dqx(C5630DmE c5630DmE, C5790DpZ c5790DpZ, Dq8 dq8, C5623Dm6 c5623Dm6, String str) {
        this.A04 = c5630DmE;
        this.A02 = c5623Dm6;
        this.A01 = dq8;
        this.A00 = c5790DpZ;
        this.A03 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5630DmE c5630DmE = this.A04;
        C5623Dm6 c5623Dm6 = this.A02;
        C5630DmE.A08(c5630DmE, this.A00, this.A01, c5623Dm6, this.A03);
    }
}

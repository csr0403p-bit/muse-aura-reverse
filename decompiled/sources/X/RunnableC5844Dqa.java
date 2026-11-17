package X;

/* renamed from: X.Dqa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5844Dqa implements Runnable {
    public static final String __redex_internal_original_name = "PlayerListener$processStartedPlaying$runnable$1";
    public final /* synthetic */ C5630DmE A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public RunnableC5844Dqa(C5630DmE c5630DmE, String str, String str2) {
        this.A00 = c5630DmE;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5630DmE c5630DmE = this.A00;
        String strA01 = C5630DmE.A01(c5630DmE);
        String str = this.A01;
        if (strA01.equals(str)) {
            C5630DmE.A03(AbstractC5640DmU.A01(this.A02), c5630DmE, str, false);
        }
    }
}

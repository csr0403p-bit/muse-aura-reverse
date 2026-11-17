package X;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class EXY implements Runnable {
    public static final String __redex_internal_original_name = "DcpIacBillingClient$createSandboxSessionThenDeliverSuccess$1";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ EXZ A01;
    public final /* synthetic */ EXP A02;
    public final /* synthetic */ C6729EXn A03;
    public final /* synthetic */ C6718EXb A04;
    public final /* synthetic */ F1F A05;

    public EXY(Handler handler, EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, F1F f1f) {
        this.A02 = exp;
        this.A03 = c6729EXn;
        this.A04 = c6718EXb;
        this.A01 = exz;
        this.A05 = f1f;
        this.A00 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EXP.A02(this.A00, new EDo(this.A02, this.A03, this.A04, this.A01, 2), this.A05);
    }
}

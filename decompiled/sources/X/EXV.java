package X;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class EXV implements CPS {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ EXZ A01;
    public final /* synthetic */ EXP A02;
    public final /* synthetic */ C6729EXn A03;
    public final /* synthetic */ C6718EXb A04;
    public final /* synthetic */ F1F A05;

    @Override // X.CPS
    public final void invoke(Throwable th) {
        C7384Etj.A0Y(th, 0);
        Handler handler = this.A00;
        handler.post(new EXW(handler, this.A01, this.A02, this.A03, this.A04, th, this.A05));
    }

    public EXV(Handler handler, EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, F1F f1f) {
        this.A00 = handler;
        this.A02 = exp;
        this.A03 = c6729EXn;
        this.A04 = c6718EXb;
        this.A01 = exz;
        this.A05 = f1f;
    }
}

package X;

import android.os.Handler;

/* renamed from: X.Ddu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5236Ddu<T> implements F0T {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ EXZ A01;
    public final /* synthetic */ EXP A02;
    public final /* synthetic */ C6729EXn A03;
    public final /* synthetic */ C6718EXb A04;
    public final /* synthetic */ F1F A05;

    @Override // X.F0T
    public final void invoke(F1G f1g) {
        String strAIJ;
        A7O a7oAIK;
        C7384Etj.A0Y(f1g, 0);
        A7N a7n = (A7N) ((CPX) f1g).A01;
        String strAIJ2 = null;
        if (a7n == null || (a7oAIK = a7n.innerData.AIK(-673382881)) == null) {
            strAIJ = null;
        } else {
            strAIJ = a7oAIK.AIJ(1661853540);
            strAIJ2 = a7oAIK.AIJ(201381648);
        }
        Handler handler = this.A00;
        handler.post(new RunnableC5237Ddv(handler, this.A01, this.A02, this.A03, this.A04, strAIJ, strAIJ2, this.A05));
    }

    public C5236Ddu(Handler handler, EXZ exz, EXP exp, C6729EXn c6729EXn, C6718EXb c6718EXb, F1F f1f) {
        this.A00 = handler;
        this.A02 = exp;
        this.A03 = c6729EXn;
        this.A04 = c6718EXb;
        this.A01 = exz;
        this.A05 = f1f;
    }
}

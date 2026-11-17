package X;

import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class BjO implements Runnable {
    public static final String __redex_internal_original_name = "Camera2CameraImpl$$ExternalSyntheticLambda16";
    public final /* synthetic */ Bj4 A00;
    public final /* synthetic */ C2643Bga A01;
    public final /* synthetic */ AbstractC2481Bc8 A02;
    public final /* synthetic */ BfN A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    @Override // java.lang.Runnable
    public final void run() {
        Bj4 bj4 = this.A00;
        String str = this.A04;
        C2643Bga c2643Bga = this.A01;
        BfN bfN = this.A03;
        AbstractC2481Bc8 abstractC2481Bc8 = this.A02;
        List list = this.A05;
        Bj4.A09(bj4, FGI.A0U("Use case ", str, " RESET"), null);
        bj4.A0M.A04(c2643Bga, abstractC2481Bc8, bfN, str, list);
        Bj4.A05(bj4);
        bj4.A0E();
        bj4.A0F();
        if (bj4.A0a == C79.A0Z) {
            bj4.A0D();
        }
    }

    public /* synthetic */ BjO(Bj4 bj4, C2643Bga c2643Bga, AbstractC2481Bc8 abstractC2481Bc8, BfN bfN, String str, List list) {
        this.A00 = bj4;
        this.A04 = str;
        this.A01 = c2643Bga;
        this.A03 = bfN;
        this.A02 = abstractC2481Bc8;
        this.A05 = list;
    }
}

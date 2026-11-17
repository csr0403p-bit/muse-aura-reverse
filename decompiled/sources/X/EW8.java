package X;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class EW8 implements Bs1<C6693EVo<String>> {
    public final /* synthetic */ C7418EvO A00;
    public final /* synthetic */ AbstractC5306Dfp A01;
    public final /* synthetic */ EWI A02;
    public final /* synthetic */ EWe A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ Executor A06;

    @Override // X.Bs1
    public final /* bridge */ /* synthetic */ void onChanged(C6693EVo<String> c6693EVo) {
        C6693EVo<String> c6693EVo2 = c6693EVo;
        if (c6693EVo2 != null) {
            Integer num = c6693EVo2.A00;
            if (num == C79.A00) {
                this.A01.A07(this);
                this.A03.A0B.execute(new EWC(this.A00, this.A02, c6693EVo2, this, this.A04, this.A05, this.A06));
                return;
            }
            if (num == C79.A01) {
                this.A01.A07(this);
                EWe.A03(this.A02, this.A03, null, c6693EVo2.A02, this.A06);
            }
        }
    }

    public EW8(C7418EvO c7418EvO, AbstractC5306Dfp abstractC5306Dfp, EWI ewi, EWe eWe, String str, Set set, Executor executor) {
        this.A01 = abstractC5306Dfp;
        this.A00 = c7418EvO;
        this.A04 = str;
        this.A05 = set;
        this.A02 = ewi;
        this.A06 = executor;
        this.A03 = eWe;
    }
}

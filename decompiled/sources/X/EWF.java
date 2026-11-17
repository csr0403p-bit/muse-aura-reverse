package X;

import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class EWF implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$1";
    public final /* synthetic */ C7418EvO A00;
    public final /* synthetic */ EWI A01;
    public final /* synthetic */ EWe A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Set A04;
    public final /* synthetic */ Executor A05;

    public EWF(C7418EvO c7418EvO, EWI ewi, EWe eWe, String str, Set set, Executor executor) {
        this.A00 = c7418EvO;
        this.A03 = str;
        this.A04 = set;
        this.A01 = ewi;
        this.A05 = executor;
        this.A02 = eWe;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        EWe eWe = this.A02;
        EWe.A01(this.A00, this.A01, eWe, null, this.A03, this.A04, this.A05);
    }
}

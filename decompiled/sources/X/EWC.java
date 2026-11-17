package X;

import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class EWC implements Runnable {
    public static final String __redex_internal_original_name = "PttRequestImpl$2$1";
    public final /* synthetic */ C7418EvO A00;
    public final /* synthetic */ EWI A01;
    public final /* synthetic */ C6693EVo A02;
    public final /* synthetic */ EW8 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ Executor A06;

    public EWC(C7418EvO c7418EvO, EWI ewi, C6693EVo c6693EVo, EW8 ew8, String str, Set set, Executor executor) {
        this.A00 = c7418EvO;
        this.A02 = c6693EVo;
        this.A04 = str;
        this.A05 = set;
        this.A01 = ewi;
        this.A06 = executor;
        this.A03 = ew8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        EWe eWe = this.A03.A03;
        C7418EvO c7418EvO = this.A00;
        Data data = this.A02.A01;
        data.getClass();
        String str = this.A04;
        Set set = this.A05;
        EWe.A01(c7418EvO, this.A01, eWe, (String) data, str, set, this.A06);
    }
}

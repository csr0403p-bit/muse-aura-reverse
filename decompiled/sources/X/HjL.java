package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* loaded from: classes6.dex */
public final class HjL implements HsR {
    public long A00;
    public long A01;
    public final UserFlowConfig A02;
    public final UserFlowConfig A03;
    public final UserFlowLogger A04;

    @Override // X.HsR
    public final void AQ8(String str) {
        this.A04.flowMarkPoint(this.A01, str);
    }

    public HjL() {
        UserFlowLogger userFlowLoggerA0a = AbstractC7609F5w.A0a();
        C7384Etj.A0Y(userFlowLoggerA0a, 0);
        this.A04 = userFlowLoggerA0a;
        this.A01 = userFlowLoggerA0a.generateFlowId(28522275, 0);
        this.A03 = new UserFlowConfig("launchPurchaseFlow", false);
        this.A00 = userFlowLoggerA0a.generateFlowId(28511505, 0);
        this.A02 = new UserFlowConfig("fetchProductDetails", false);
    }
}

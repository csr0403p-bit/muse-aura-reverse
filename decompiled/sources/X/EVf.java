package X;

import com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors;
import com.facebook.aura.bloks.fbpay.pttprovider.NoopServerCertApi;
import com.facebookpay.logging.FBPayLoggerData;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class EVf extends EVi implements EVn {
    public EW2 A00;
    public final EVe A01;
    public final NoopServerCertApi A02;
    public final EWL A03;
    public final AbstractC6699EVx A04;

    @Override // X.EVn
    public final void ABl(EW2 ew2) throws Throwable {
        this.A00 = ew2;
        EVi.A00(super.A03.A00, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.EVn
    public final AbstractC5306Dfp<C6693EVo<String>> AKU(EWB ewb) throws Throwable {
        HashMap mapA0u;
        C3016Bs3 c3016Bs3;
        if (!super.A01) {
            super.A01 = true;
            C6693EVo c6693EVo = (C6693EVo) super.A03.A02();
            if (c6693EVo == null || c6693EVo.A01 == 0) {
                EVi.A00(null, this);
            }
        }
        EVh eVh = super.A03;
        C6693EVo c6693EVo2 = (C6693EVo) eVh.A02();
        String strA00 = EVQ.A00();
        EVe eVe = this.A01;
        if (eVe != null) {
            mapA0u = BV4.A0u();
            mapA0u.put("session_id", strA00);
            mapA0u.put("flow_name", HVq.A0L.toString());
            mapA0u.put("logger_data", new FBPayLoggerData(null, null, null, null, null, null, null, null, C60O.A13()));
            eVe.APv("client_load_paysec_init", mapA0u);
        } else {
            mapA0u = null;
        }
        if (c6693EVo2 != null && c6693EVo2.A00 == C79.A00) {
            c6693EVo2.A01.getClass();
            throw BV4.A0a("leafX509Certificate");
        }
        if (eVe != null && mapA0u != null) {
            eVe.APv("client_load_paysec_success", mapA0u);
        }
        if (!super.A01) {
            super.A01 = true;
            C6693EVo c6693EVo3 = (C6693EVo) eVh.A02();
            if (c6693EVo3 == null || c6693EVo3.A01 == 0) {
                EVi.A00(null, this);
            }
        }
        C7592F5f c7592F5f = new C7592F5f(17, this, ewb);
        if (eVh.A08 != AbstractC5306Dfp.A0A) {
            c3016Bs3 = new C3016Bs3(c7592F5f.invoke(eVh.A02()));
            c3016Bs3.A00 = new C5304Dfn<>();
        } else {
            c3016Bs3 = new C3016Bs3();
        }
        c3016Bs3.A0B(eVh, new C7445Ew9(new C7592F5f(3, c3016Bs3, c7592F5f)));
        return c3016Bs3;
    }

    public EVf(AuraFBPayExecutors auraFBPayExecutors, NoopServerCertApi noopServerCertApi, EVe eVe, EW2 ew2, EWL ewl, AbstractC6699EVx abstractC6699EVx) {
        super(auraFBPayExecutors);
        this.A02 = noopServerCertApi;
        this.A04 = abstractC6699EVx;
        this.A00 = ew2;
        this.A03 = ewl;
        this.A01 = eVe;
    }
}

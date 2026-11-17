package X;

import com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors;
import com.facebook.aura.bloks.fbpay.pttprovider.NoopServerCertApi;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EW1 {
    public static final EW2 A06 = new EW2(null, null);
    public final AuraFBPayExecutors A00;
    public final NoopServerCertApi A01;
    public final EVe A02;
    public final EWL A03;
    public final Map<EW2, EVn> A04;
    public final F18<AbstractC6699EVx> A05;

    public EW1(AuraFBPayExecutors auraFBPayExecutors, NoopServerCertApi noopServerCertApi, EVe eVe, EWL ewl) {
        C7601F5o c7601F5o = new C7601F5o(2);
        Map<EW2, EVn> mapA14 = BV5.A14();
        this.A04 = mapA14;
        this.A01 = noopServerCertApi;
        this.A00 = auraFBPayExecutors;
        this.A05 = c7601F5o;
        this.A03 = ewl;
        EW2 ew2 = A06;
        mapA14.put(ew2, new EVf(auraFBPayExecutors, noopServerCertApi, eVe, ew2, ewl, (AbstractC6699EVx) c7601F5o.AMN()));
        this.A02 = eVe;
    }
}

package X;

import com.facebook.aura.bloks.fbpay.pttprovider.AuraFBPayExecutors;
import com.facebook.aura.bloks.fbpay.pttprovider.NoopServerCertApi;

/* loaded from: classes5.dex */
public final class EWD {
    public final AuraFBPayExecutors A00;
    public final EVe A01;
    public final EVa A02;
    public final EWL A03;
    public final EWL A04;
    public final EWL A05;
    public final EWL A06;
    public final EW1 A07;

    public EWD(AuraFBPayExecutors auraFBPayExecutors, NoopServerCertApi noopServerCertApi, EVe eVe, EVa eVa) {
        F4Q f4q = new F4Q(3);
        F4Q f4q2 = new F4Q(0);
        F4Q f4q3 = new F4Q(1);
        F4Q f4q4 = new F4Q(2);
        this.A00 = auraFBPayExecutors;
        this.A07 = new EW1(auraFBPayExecutors, noopServerCertApi, eVe, f4q);
        this.A02 = eVa;
        this.A01 = eVe;
        this.A06 = f4q;
        this.A04 = f4q2;
        this.A05 = f4q3;
        this.A03 = f4q4;
    }
}

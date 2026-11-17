package X;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Efh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7081Efh {
    public final C7084Efk A00;
    public final C7012EeJ A01;
    public final C7080Efg A02;
    public final C7011EeI A03;
    public final Executor A04;
    public final Executor A05;
    public final Eh7 A06;

    /* JADX WARN: Incorrect return type in method signature: (LX/CCV;)LX/DTg<Ljava/lang/Void;>; */
    public final void A00(CCV ccv) {
        C7384Etj.A0Y(ccv, 0);
        this.A02.A01(ccv);
        try {
            C5066DTg.A00(new CallableC7565F4e(2, ccv, this), this.A05);
        } catch (Exception e) {
            AbstractC3422CMk.A08(e, "Failed to schedule disk-cache remove for %s", ccv.AMJ());
            ExecutorService executorService = C5066DTg.A0C;
            new C5067DTh().A00(e);
        }
    }

    public C7081Efh(C7084Efk c7084Efk, C7012EeJ c7012EeJ, Eh7 eh7, C7011EeI c7011EeI, Executor executor, Executor executor2) {
        AnonymousClass003.A0v(c7084Efk, c7012EeJ);
        this.A00 = c7084Efk;
        this.A03 = c7011EeI;
        this.A01 = c7012EeJ;
        this.A04 = executor;
        this.A05 = executor2;
        this.A06 = eh7;
        this.A02 = new C7080Efg();
    }
}

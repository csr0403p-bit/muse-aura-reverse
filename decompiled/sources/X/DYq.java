package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class DYq implements Runnable {
    public static final String __redex_internal_original_name = "PandoQueryExecutor$initializeThenCall$1";
    public final /* synthetic */ CPS A00;
    public final /* synthetic */ DZD A01;
    public final /* synthetic */ Executor A02;
    public final /* synthetic */ F0C<T> A03;
    public final /* synthetic */ G0U<T, InterfaceC5106DYe> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/DZD;LX/F0C<+TT;>;LX/G0U<-TT;+LX/DYe;>;LX/CPS;Ljava/util/concurrent/Executor;)V */
    public DYq(CPS cps, DZD dzd, Executor executor, F0C f0c, G0U g0u) {
        this.A01 = dzd;
        this.A03 = f0c;
        this.A04 = g0u;
        this.A00 = cps;
        this.A02 = executor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5106DYe interfaceC5106DYeA00 = DYp.A00(this.A00, this.A02, this.A03, this.A04);
        DZD dzd = this.A01;
        synchronized (dzd) {
            C7384Etj.A0Y(interfaceC5106DYeA00, 0);
            dzd.A00 = interfaceC5106DYeA00;
            if (dzd.A01) {
                interfaceC5106DYeA00.cancel();
            }
        }
    }
}

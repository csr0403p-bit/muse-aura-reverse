package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CSL implements CMT {
    public CSP A00;
    public final Object A01 = C3cG.A0T();
    public final Executor A02;

    public CSL(CSP csp, Executor executor) {
        this.A02 = executor;
        this.A00 = csp;
    }

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        if (csa.A0C() || ((CSC) csa).A05) {
            return;
        }
        synchronized (this.A01) {
        }
        this.A02.execute(new CSM(csa, this));
    }
}

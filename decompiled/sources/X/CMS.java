package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CMS implements CMT {
    public CEF A00;
    public final Object A01 = C3cG.A0T();
    public final Executor A02;

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        synchronized (this.A01) {
        }
        this.A02.execute(new CMR(csa, this));
    }

    public CMS(CEF cef, Executor executor) {
        this.A02 = executor;
        this.A00 = cef;
    }
}

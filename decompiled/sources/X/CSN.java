package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CSN implements CMT {
    public CSQ A00;
    public final Object A01 = C3cG.A0T();
    public final Executor A02;

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        if (((CSC) csa).A05) {
            synchronized (this.A01) {
            }
            this.A02.execute(new CSO(this));
        }
    }

    public CSN(CSQ csq, Executor executor) {
        this.A02 = executor;
        this.A00 = csq;
    }
}

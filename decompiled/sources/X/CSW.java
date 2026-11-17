package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CSW implements CMT {
    public CSZ A00;
    public final Object A01 = C3cG.A0T();
    public final Executor A02;

    public CSW(CSZ csz, Executor executor) {
        this.A02 = executor;
        this.A00 = csz;
    }

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        if (csa.A0C()) {
            synchronized (this.A01) {
                if (this.A00 == null) {
                    return;
                }
                this.A02.execute(new CSX(csa, this));
            }
        }
    }
}

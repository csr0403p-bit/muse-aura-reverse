package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CSR<TResult, TContinuationResult> implements CSZ<TContinuationResult>, CSP, CSQ, CMT {
    public final CSY A00;
    public final CSC A01;
    public final Executor A02;

    @Override // X.CSQ
    public final void AS6() {
        this.A01.A0D();
    }

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        this.A02.execute(new CSS(csa, this));
    }

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        this.A01.A0F(exc);
    }

    @Override // X.CSZ
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.A01.A0G(tcontinuationresult);
    }

    public CSR(CSY csy, CSC csc, Executor executor) {
        this.A02 = executor;
        this.A00 = csy;
        this.A01 = csc;
    }
}

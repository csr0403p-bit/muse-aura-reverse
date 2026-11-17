package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CST<TResult, TContinuationResult> implements CSZ<TContinuationResult>, CSP, CSQ, CMT {
    public final InterfaceC3521CSa A00;
    public final CSC A01;
    public final Executor A02;

    @Override // X.CSQ
    public final void AS6() {
        this.A01.A0D();
    }

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        this.A02.execute(new RunnableC3522CSb(csa, this));
    }

    @Override // X.CSP
    public final void onFailure(Exception exc) {
        this.A01.A0F(exc);
    }

    @Override // X.CSZ
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.A01.A0G(tcontinuationresult);
    }

    public CST(InterfaceC3521CSa interfaceC3521CSa, CSC csc, Executor executor) {
        this.A02 = executor;
        this.A00 = interfaceC3521CSa;
        this.A01 = csc;
    }
}

package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CSV implements CMT {
    public final CSY A00;
    public final CSC A01;
    public final Executor A02;

    @Override // X.CMT
    public final void Ajb(CSA csa) {
        this.A02.execute(new CSU(csa, this));
    }

    public CSV(CSY csy, CSC csc, Executor executor) {
        this.A02 = executor;
        this.A00 = csy;
        this.A01 = csc;
    }
}

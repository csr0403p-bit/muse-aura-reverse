package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CRJ {
    public static final CRJ A03 = new CRJ();
    public CRJ A00;
    public final Runnable A01;
    public final Executor A02;

    public CRJ() {
        this.A01 = null;
        this.A02 = null;
    }

    public CRJ(Runnable runnable, Executor executor) {
        this.A01 = runnable;
        this.A02 = executor;
    }
}

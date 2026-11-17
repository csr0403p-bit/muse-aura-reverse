package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CQj {
    public static final CQj A03 = new CQj();
    public CQj A00;
    public final Runnable A01;
    public final Executor A02;

    public CQj() {
        this.A01 = null;
        this.A02 = null;
    }

    public CQj(Runnable task, Executor executor) {
        this.A01 = task;
        this.A02 = executor;
    }
}

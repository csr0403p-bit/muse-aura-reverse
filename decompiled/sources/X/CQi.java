package X;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class CQi {
    public static final CQi A03 = new CQi(null, null);
    public CQi A00;
    public final Runnable A01;
    public final Executor A02;

    public CQi(Runnable task, Executor executor) {
        this.A01 = task;
        this.A02 = executor;
    }
}

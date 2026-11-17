package X;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Bmc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2833Bmc implements Runnable {
    public static final String __redex_internal_original_name = "Recorder$$ExternalSyntheticLambda0";
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ Executor A01;

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor = this.A01;
        Runnable runnable = this.A00;
        Set<BmF> set = C2823Bm4.A0t;
        executor.execute(runnable);
    }

    public /* synthetic */ RunnableC2833Bmc(Executor executor, Runnable runnable) {
        this.A01 = executor;
        this.A00 = runnable;
    }
}

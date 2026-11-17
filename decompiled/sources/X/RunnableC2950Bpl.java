package X;

/* renamed from: X.Bpl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2950Bpl implements Runnable {
    public static final String __redex_internal_original_name = "SequentialExecutor$1";
    public final /* synthetic */ ExecutorC2949Bpk A00;
    public final /* synthetic */ Runnable A01;

    public RunnableC2950Bpl(ExecutorC2949Bpk executorC2949Bpk, Runnable runnable) {
        this.A00 = executorC2949Bpk;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.run();
    }
}

package X;

/* renamed from: X.BrN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2995BrN extends ScheduledExecutorServiceC2994BrM {
    public static C2995BrN A00;

    public C2995BrN() {
        super(C60O.A02());
    }

    @Override // X.ScheduledExecutorServiceC2994BrM, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == BV7.A13(this.A00)) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}

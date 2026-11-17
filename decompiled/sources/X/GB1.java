package X;

/* loaded from: classes6.dex */
public final class GB1 extends GB6 {
    public static final String __redex_internal_original_name = "EventLoopImplBase$DelayedRunnableTask";
    public final Runnable A00;

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
    }

    public GB1(long j, Runnable runnable) {
        this.A01 = j;
        super.A00 = -1;
        this.A00 = runnable;
    }

    @Override // X.GB6
    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        return C8j3.A14(this.A00, sbA0w);
    }
}

package X;

/* renamed from: X.DpI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5776DpI implements Runnable {
    public static final String __redex_internal_original_name = "GrootPlayerImpl$BackgroundRefreshExecutor$execute$refreshCallbackRunnable$1";
    public final /* synthetic */ C5829DqI A00;
    public final /* synthetic */ C5627DmA A01;

    public RunnableC5776DpI(C5829DqI c5829DqI, C5627DmA c5627DmA) {
        this.A01 = c5627DmA;
        this.A00 = c5829DqI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5829DqI c5829DqI = this.A00;
        DmR dmR = c5829DqI.A04;
        C5627DmA c5627DmA = c5829DqI.A05;
        C5627DmA.A1B.post(new RunnableC5634DmI(c5829DqI.A01, c5829DqI.A02, c5627DmA, dmR, c5829DqI.A00));
    }
}

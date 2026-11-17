package X;

/* renamed from: X.Bbz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC2472Bbz implements Runnable {
    public static final String __redex_internal_original_name = "RequestExecutor$ReplyRunnable$1";
    public final /* synthetic */ RunnableC2578BeC A00;
    public final /* synthetic */ BeM A01;
    public final /* synthetic */ Object A02;

    public RunnableC2472Bbz(RunnableC2578BeC runnableC2578BeC, BeM beM, Object obj) {
        this.A00 = runnableC2578BeC;
        this.A01 = beM;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.accept(this.A02);
    }
}

package X;

/* renamed from: X.EfA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC7063EfA implements Runnable {
    public static final String __redex_internal_original_name = "JobScheduler$2";
    public final /* synthetic */ C7051Eex A00;

    public RunnableC7063EfA(C7051Eex c7051Eex) {
        this.A00 = c7051Eex;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7051Eex c7051Eex = this.A00;
        c7051Eex.A07.execute(c7051Eex.A06);
    }
}

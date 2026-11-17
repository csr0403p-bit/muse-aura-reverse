package X;

/* renamed from: X.FNw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7980FNw implements Runnable {
    public static final String __redex_internal_original_name = "DataSynchronizer$1";
    public final /* synthetic */ FNC A00;
    public final /* synthetic */ C7975FNq A01;
    public final /* synthetic */ Object A02;

    public RunnableC7980FNw(FNC fnc, C7975FNq c7975FNq, Object obj) {
        this.A00 = fnc;
        this.A02 = obj;
        this.A01 = c7975FNq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7975FNq.A00(this.A00, this.A01, this.A02);
    }
}

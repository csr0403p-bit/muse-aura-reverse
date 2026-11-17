package X;

/* renamed from: X.FKm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC7914FKm implements Runnable {
    public static final String __redex_internal_original_name = "RecurringTask$runnable$1";
    public final /* synthetic */ C7913FKl A00;

    public RunnableC7914FKm(C7913FKl c7913FKl) {
        this.A00 = c7913FKl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7913FKl c7913FKl = this.A00;
        c7913FKl.A02.invoke();
        c7913FKl.A00.postDelayed(this, 200L);
    }
}

package X;

/* loaded from: classes6.dex */
public final class FNt implements Runnable {
    public static final String __redex_internal_original_name = "Emitter$4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7974FNp A01;

    public FNt(C7974FNp c7974FNp, int i) {
        this.A00 = i;
        this.A01 = c7974FNp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A01.onFetch(this.A00);
    }
}

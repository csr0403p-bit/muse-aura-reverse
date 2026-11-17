package X;

/* renamed from: X.F9t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC7675F9t implements Runnable {
    public static final String __redex_internal_original_name = "BloksTreeManager$InitialDataCommitHook$$ExternalSyntheticLambda0";
    public final /* synthetic */ FAV A00;
    public final /* synthetic */ FAT A01;

    @Override // java.lang.Runnable
    public final void run() {
        FAV fav = this.A00;
        FAT fat = this.A01;
        F9b f9b = fav.A00;
        String str = fat.A01;
        FAR far = fat.A00;
        if (f9b.A0R) {
            return;
        }
        f9b.A09.get();
        f9b.A02.A01(far.A6c(f9b, str));
    }

    public /* synthetic */ RunnableC7675F9t(FAV fav, FAT fat) {
        this.A00 = fav;
        this.A01 = fat;
    }
}

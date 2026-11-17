package X;

/* renamed from: X.Dh0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5356Dh0 implements Runnable {
    public static final String __redex_internal_original_name = "DashMediaSource$2";
    public final /* synthetic */ C5423DiJ A00;
    public final /* synthetic */ C5358Dh3 A01;

    public RunnableC5356Dh0(C5423DiJ c5423DiJ, C5358Dh3 c5358Dh3) {
        this.A00 = c5423DiJ;
        this.A01 = c5358Dh3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A00.A1K;
        C5358Dh3 c5358Dh3 = this.A01;
        if (z) {
            C5358Dh3.A08(c5358Dh3, false);
        } else {
            C5358Dh3.A07(c5358Dh3, false);
        }
    }
}

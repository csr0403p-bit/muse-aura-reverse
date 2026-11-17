package X;

/* renamed from: X.DSw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC5063DSw implements Runnable {
    public static final String __redex_internal_original_name = "ServiceLifecycleDispatcher$DispatchRunnable";
    public boolean A00;
    public final EnumC3085Bxl A01;
    public final C5303Dfm A02;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00) {
            return;
        }
        this.A02.A06(this.A01);
        this.A00 = true;
    }

    public RunnableC5063DSw(EnumC3085Bxl enumC3085Bxl, C5303Dfm c5303Dfm) {
        this.A02 = c5303Dfm;
        this.A01 = enumC3085Bxl;
    }
}

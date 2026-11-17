package X;

/* loaded from: classes6.dex */
public final class FNI implements Dg5 {
    public final /* synthetic */ C7967FMy A00;
    public final /* synthetic */ A25 A01;

    @Override // X.Dg5
    public final void onDestroy(C1HY c1hy) {
        C7384Etj.A0Y(c1hy, 0);
        c1hy.getLifecycle().A05(this);
        A25 a25 = this.A01;
        a25.A00.remove(this.A00);
    }

    public FNI(C7967FMy c7967FMy, A25 a25) {
        this.A01 = a25;
        this.A00 = c7967FMy;
    }

    @Override // X.Dg5
    public final /* bridge */ void onCreate(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onPause(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onResume(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onStart(C1HY c1hy) {
    }

    @Override // X.Dg5
    public final /* bridge */ void onStop(C1HY c1hy) {
    }
}

package X;

/* loaded from: classes6.dex */
public final class FPL implements Runnable {
    public static final String __redex_internal_original_name = "CDSBottomSheetContainerView$fadeOutGradientBackground$1$1";
    public final /* synthetic */ C7998FOr A00;
    public final /* synthetic */ FOV A01;

    public FPL(C7998FOr c7998FOr, FOV fov) {
        this.A00 = c7998FOr;
        this.A01 = fov;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7998FOr c7998FOr = this.A00;
        c7998FOr.post(new FPM(c7998FOr, this.A01));
    }
}

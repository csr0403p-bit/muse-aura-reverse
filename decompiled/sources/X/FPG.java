package X;

/* loaded from: classes6.dex */
public final class FPG implements Runnable {
    public static final String __redex_internal_original_name = "CDSBottomSheetContainerView$updateDragHandleVisibility$$inlined$runSafely$2";
    public final /* synthetic */ FOV A00;
    public final /* synthetic */ C7983FOa A01;

    public FPG(FOV fov, C7983FOa c7983FOa) {
        this.A00 = fov;
        this.A01 = c7983FOa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.removeView(this.A01);
    }
}

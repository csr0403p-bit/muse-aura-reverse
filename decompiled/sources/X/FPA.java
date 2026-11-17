package X;

/* loaded from: classes6.dex */
public final class FPA implements Runnable {
    public static final String __redex_internal_original_name = "CDSBloksBottomSheetDelegate$setBottomSheetLayoutVisibility$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ FOS A01;

    public FPA(FOS fos, int i) {
        this.A01 = fos;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FOl fOl;
        FOS fos = this.A01;
        FOl fOl2 = fos.A03;
        if ((fOl2 == null || fOl2.getVisibility() != this.A00) && (fOl = fos.A03) != null) {
            fOl.setVisibility(this.A00);
        }
    }
}

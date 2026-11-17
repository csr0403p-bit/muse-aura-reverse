package X;

/* loaded from: classes6.dex */
public final class FN8 implements Runnable {
    public static final String __redex_internal_original_name = "BloksSurfaceController$2";
    public final /* synthetic */ C7968FMz A00;
    public final /* synthetic */ C7968FMz A01;

    public FN8(C7968FMz c7968FMz, C7968FMz c7968FMz2) {
        this.A01 = c7968FMz2;
        this.A00 = c7968FMz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7968FMz c7968FMz = this.A00;
        if (c7968FMz.A04 || c7968FMz.A05 || c7968FMz.A03 != C79.A01 || c7968FMz.ACs() == null) {
            return;
        }
        c7968FMz.A05 = true;
        FD3.A03.A04(this.A01);
    }
}

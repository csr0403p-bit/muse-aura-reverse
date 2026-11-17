package X;

/* loaded from: classes6.dex */
public final class FZr implements Runnable {
    public static final String __redex_internal_original_name = "ListPopupWindow$ListSelectorHider";
    public final /* synthetic */ FZZ A00;

    public FZr(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FYL fyl = this.A00.A0A;
        if (fyl != null) {
            fyl.A07 = true;
            fyl.requestLayout();
        }
    }
}

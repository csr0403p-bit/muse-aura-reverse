package X;

/* renamed from: X.FZf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8212FZf implements Runnable {
    public static final String __redex_internal_original_name = "ListPopupWindow$ResizePopupRunnable";
    public final /* synthetic */ FZZ A00;

    public RunnableC8212FZf(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FZZ fzz = this.A00;
        FYL fyl = fzz.A0A;
        if (fyl == null || !fyl.isAttachedToWindow() || fzz.A0A.getCount() <= fzz.A0A.getChildCount()) {
            return;
        }
        fzz.A0A.getChildCount();
        fzz.A09.setInputMethodMode(2);
        fzz.Afd();
    }
}

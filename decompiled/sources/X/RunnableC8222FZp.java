package X;

import android.view.View;

/* renamed from: X.FZp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8222FZp implements Runnable {
    public static final String __redex_internal_original_name = "ListPopupWindow$2";
    public final /* synthetic */ FZZ A00;

    public RunnableC8222FZp(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FZZ fzz = this.A00;
        View view = fzz.A06;
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        fzz.Afd();
    }
}

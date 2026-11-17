package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.FZe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8211FZe implements AbsListView.OnScrollListener {
    public final /* synthetic */ FZZ A00;

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            FZZ fzz = this.A00;
            PopupWindow popupWindow = fzz.A09;
            if (popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null) {
                return;
            }
            Handler handler = fzz.A0I;
            RunnableC8212FZf runnableC8212FZf = fzz.A0K;
            handler.removeCallbacks(runnableC8212FZf);
            runnableC8212FZf.run();
        }
    }

    public C8211FZe(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}

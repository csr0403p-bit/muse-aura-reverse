package X;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: X.FZn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8220FZn implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener A00;
    public final /* synthetic */ C8208FZa A01;

    public C8220FZn(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, C8208FZa c8208FZa) {
        this.A01 = c8208FZa;
        this.A00 = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.A01.A04.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.A00);
        }
    }
}

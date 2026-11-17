package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes6.dex */
public final class FZb implements View.OnTouchListener {
    public final /* synthetic */ FZZ A00;

    public FZb(FZZ fzz) {
        this.A00 = fzz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            FZZ fzz = this.A00;
            fzz.A0I.removeCallbacks(fzz.A0K);
            return false;
        }
        FZZ fzz2 = this.A00;
        PopupWindow popupWindow = fzz2.A09;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= popupWindow.getWidth() || y < 0 || y >= popupWindow.getHeight()) {
            return false;
        }
        fzz2.A0I.postDelayed(fzz2.A0K, 250L);
        return false;
    }
}

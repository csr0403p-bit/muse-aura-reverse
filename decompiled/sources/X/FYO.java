package X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class FYO implements Runnable {
    public static final String __redex_internal_original_name = "ForwardingListener$TriggerLongPress";
    public final /* synthetic */ FYM A00;

    public FYO(FYM fym) {
        this.A00 = fym;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FYM fym = this.A00;
        FYM.A00(fym);
        View view = fym.A07;
        if (view.isEnabled() && !view.isLongClickable() && fym.A02()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            MotionEvent motionEventA0L = AbstractC7611F5y.A0L();
            view.onTouchEvent(motionEventA0L);
            motionEventA0L.recycle();
            fym.A03 = true;
        }
    }
}

package X;

import android.view.MotionEvent;

/* loaded from: classes6.dex */
public final class FLB implements Runnable {
    public static final String __redex_internal_original_name = "GestureExtensionBinderUtils$GestureController$cleanupRunnable$1";
    public final /* synthetic */ FLA A00;

    public FLB(FLA fla) {
        this.A00 = fla;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FLA fla = this.A00;
        ViewOnTouchListenerC8017FPq viewOnTouchListenerC8017FPq = fla.A00;
        if (viewOnTouchListenerC8017FPq != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
            try {
                viewOnTouchListenerC8017FPq.A06.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                fla.A00 = null;
            } catch (Throwable th) {
                motionEventObtain.recycle();
                throw th;
            }
        }
        fla.A01 = null;
        fla.A02 = false;
    }
}

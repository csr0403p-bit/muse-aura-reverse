package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* renamed from: X.FZh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8214FZh implements Runnable {
    public static final String __redex_internal_original_name = "AutoScrollHelper$ScrollAnimationRunnable";
    public final /* synthetic */ ViewOnTouchListenerC8213FZg A00;

    public RunnableC8214FZh(ViewOnTouchListenerC8213FZg viewOnTouchListenerC8213FZg) {
        this.A00 = viewOnTouchListenerC8213FZg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC8213FZg viewOnTouchListenerC8213FZg = this.A00;
        if (viewOnTouchListenerC8213FZg.A03) {
            if (viewOnTouchListenerC8213FZg.A06) {
                viewOnTouchListenerC8213FZg.A06 = false;
                C8221FZo c8221FZo = viewOnTouchListenerC8213FZg.A0F;
                long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c8221FZo.A06 = jCurrentAnimationTimeMillis;
                c8221FZo.A07 = -1L;
                c8221FZo.A05 = jCurrentAnimationTimeMillis;
                c8221FZo.A00 = 0.5f;
            }
            C8221FZo c8221FZo2 = viewOnTouchListenerC8213FZg.A0F;
            if ((c8221FZo2.A07 > 0 && AnimationUtils.currentAnimationTimeMillis() > c8221FZo2.A07 + c8221FZo2.A02) || !viewOnTouchListenerC8213FZg.A02()) {
                viewOnTouchListenerC8213FZg.A03 = false;
                return;
            }
            if (viewOnTouchListenerC8213FZg.A05) {
                viewOnTouchListenerC8213FZg.A05 = false;
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                viewOnTouchListenerC8213FZg.A0C.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
            if (c8221FZo2.A05 == 0) {
                throw BV4.A0c("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float fA00 = C8221FZo.A00(c8221FZo2, jCurrentAnimationTimeMillis2);
            long j = jCurrentAnimationTimeMillis2 - c8221FZo2.A05;
            c8221FZo2.A05 = jCurrentAnimationTimeMillis2;
            viewOnTouchListenerC8213FZg.A0E.scrollListBy((int) (j * (((-4.0f) * fA00 * fA00) + (fA00 * 4.0f)) * c8221FZo2.A01));
            viewOnTouchListenerC8213FZg.A0C.postOnAnimation(this);
        }
    }
}

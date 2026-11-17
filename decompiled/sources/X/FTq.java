package X;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
public final class FTq implements Runnable {
    public static final String __redex_internal_original_name = "FastScroller$1";
    public final /* synthetic */ FTX A00;

    public FTq(FTX ftx) {
        this.A00 = ftx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FTX ftx = this.A00;
        int i = ftx.A02;
        if (i == 1) {
            ftx.A0K.cancel();
        } else if (i != 2) {
            return;
        }
        ftx.A02 = 3;
        ValueAnimator valueAnimator = ftx.A0K;
        valueAnimator.setFloatValues(AbstractC7609F5w.A03(valueAnimator), 0.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.start();
    }
}

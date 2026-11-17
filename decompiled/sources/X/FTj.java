package X;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
public final class FTj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FTX A00;

    public FTj(FTX ftx) {
        this.A00 = ftx;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iA03 = (int) (AbstractC7609F5w.A03(valueAnimator) * 255.0f);
        FTX ftx = this.A00;
        ftx.A0O.setAlpha(iA03);
        ftx.A0M.setAlpha(iA03);
        ftx.A0B.invalidate();
    }
}

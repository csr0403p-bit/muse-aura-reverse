package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.FTn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8100FTn extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ FTX A01;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public C8100FTn(FTX ftx) {
        this.A01 = ftx;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        FTX ftx = this.A01;
        if (AbstractC7609F5w.A03(ftx.A0K) == 0.0f) {
            ftx.A02 = 0;
            ftx.A02(0);
        } else {
            ftx.A02 = 2;
            ftx.A0B.invalidate();
        }
    }
}

package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes6.dex */
public final class F8C extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ F8B A02;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C7384Etj.A0Y(animator, 0);
        F8B f8b = this.A02;
        if (f8b.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        f8b.A00 = 0;
        f8b.A01 = true;
        F8B.A00(f8b, FZS.A02(f8b, 15));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        C7384Etj.A0Y(animator, 0);
        F8B f8b = this.A02;
        if (f8b.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = f8b.A00 + 1;
        f8b.A00 = i2;
        if (!f8b.A01 && ((i = this.A01) == -1 || i2 < i)) {
            animator.start();
            return;
        }
        f8b.A00 = 0;
        f8b.A01 = false;
        F8B.A00(f8b, FZS.A02(f8b, 16));
    }

    public F8C(F8B f8b, int i) {
        this.A02 = f8b;
        this.A01 = i;
        this.A00 = f8b.A05.getStartDelay();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        F8B f8b = this.A02;
        if (f8b.A00 == 0) {
            F8B.A00(f8b, FZS.A02(f8b, 17));
        }
    }
}

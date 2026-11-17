package X;

import android.animation.Animator;

/* loaded from: classes6.dex */
public final class FNR implements Animator.AnimatorListener {
    public final /* synthetic */ FOV A00;

    public FNR(FOV fov) {
        this.A00 = fov;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A04 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A04 = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

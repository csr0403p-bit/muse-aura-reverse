package X;

import android.animation.Animator;

/* loaded from: classes6.dex */
public final class F6G implements Animator.AnimatorListener {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ Hj6 A01;
    public final /* synthetic */ HsM A02;

    public F6G(F6D f6d, Hj6 hj6, HsM hsM) {
        this.A02 = hsM;
        this.A01 = hj6;
        this.A00 = f6d;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        HsM hsM = this.A02;
        AbstractC7691FAk.A00(this.A00, this.A01, hsM);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

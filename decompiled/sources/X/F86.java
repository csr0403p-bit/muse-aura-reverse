package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes6.dex */
public final class F86 extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ FBB A01;
    public final /* synthetic */ F6D A02;
    public final /* synthetic */ HsM A03;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C7384Etj.A0Y(animator, 0);
        C9115Fyg c9115FygA02 = C9115Fyg.A02(animator);
        c9115FygA02.A06(C3cG.A0P(this.A00), 1);
        AbstractC7691FAk.A00(this.A02, C9115Fyg.A03(c9115FygA02, this.A01, 2), this.A03);
        this.A00 = false;
    }

    public F86(HsM hsM, FBB fbb, F6D f6d) {
        this.A01 = fbb;
        this.A03 = hsM;
        this.A02 = f6d;
    }
}

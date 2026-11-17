package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes6.dex */
public final class FT7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ FTA A04;
    public final /* synthetic */ FTV A05;

    public FT7(View view, ViewPropertyAnimator viewPropertyAnimator, FTA fta, FTV ftv, int i, int i2) {
        this.A04 = fta;
        this.A05 = ftv;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A03.setListener(null);
        FTA fta = this.A04;
        FTV ftv = this.A05;
        fta.A06(ftv);
        fta.A04.remove(ftv);
        fta.A0A();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

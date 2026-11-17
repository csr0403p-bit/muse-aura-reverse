package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class I08 extends AnimatorListenerAdapter {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public I08(View view, ViewPropertyAnimator viewPropertyAnimator, FTC ftc, FTA fta, int i) {
        this.$t = i;
        this.A00 = fta;
        this.A01 = ftc;
        if (2 - i != 0) {
            this.A03 = viewPropertyAnimator;
            this.A02 = view;
        } else {
            this.A02 = viewPropertyAnimator;
            this.A03 = view;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (1 - this.$t != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((View) this.A03).setAlpha(1.0f);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FTA fta;
        ArrayList<FTV> arrayList;
        FTV ftv;
        FTV ftv2;
        ArrayList<FTV> arrayList2;
        switch (this.$t) {
            case 0:
                ((ViewPropertyAnimator) this.A01).setListener(null);
                ((View) this.A03).setAlpha(1.0f);
                fta = (FTA) this.A00;
                ftv2 = (FTV) this.A02;
                fta.A06(ftv2);
                arrayList2 = fta.A0A;
                arrayList2.remove(ftv2);
                break;
            case 1:
                ((ViewPropertyAnimator) this.A01).setListener(null);
                fta = (FTA) this.A00;
                ftv2 = (FTV) this.A02;
                fta.A06(ftv2);
                arrayList2 = fta.A00;
                arrayList2.remove(ftv2);
                break;
            case 2:
                ((ViewPropertyAnimator) this.A02).setListener(null);
                View view = (View) this.A03;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                fta = (FTA) this.A00;
                FTC ftc = (FTC) this.A01;
                fta.A06(ftc.A05);
                arrayList = fta.A02;
                ftv = ftc.A05;
                arrayList.remove(ftv);
                break;
            default:
                ((ViewPropertyAnimator) this.A03).setListener(null);
                View view2 = (View) this.A02;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                fta = (FTA) this.A00;
                FTC ftc2 = (FTC) this.A01;
                fta.A06(ftc2.A04);
                arrayList = fta.A02;
                ftv = ftc2.A04;
                arrayList.remove(ftv);
                break;
        }
        fta.A0A();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public I08(View view, ViewPropertyAnimator viewPropertyAnimator, FTA fta, FTV ftv, int i) {
        this.$t = i;
        this.A00 = fta;
        this.A02 = ftv;
        if (i != 0) {
            this.A03 = view;
            this.A01 = viewPropertyAnimator;
        } else {
            this.A01 = viewPropertyAnimator;
            this.A03 = view;
        }
    }
}

package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: classes6.dex */
public final class I05 extends AnimatorListenerAdapter {
    public final int $t;
    public final Object A00;

    public I05(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    public static void A00(Animator animator, Object obj, int i) {
        animator.addListener(new I05(obj, i));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A00 = null;
                actionBarOverlayLayout.A04 = false;
                break;
            case 1:
            case 2:
            case 5:
            default:
                super.onAnimationCancel(animator);
                break;
            case 3:
                FR1 fr1 = ((C8040FQr) this.A00).A06;
                if (fr1 != null) {
                    fr1.AVr();
                    break;
                }
                break;
            case 4:
                FR2 fr2 = ((C8040FQr) this.A00).A05;
                if (fr2 != null) {
                    fr2.ASZ();
                    break;
                }
                break;
            case 6:
                FT5.A01((FT5) this.A00);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A00;
                actionBarOverlayLayout.A00 = null;
                actionBarOverlayLayout.A04 = false;
                return;
            case 1:
                ((AbstractC8429Fds) this.A00).A0K();
                animator.removeListener(this);
                return;
            case 2:
                C7384Etj.A0Y(animator, 0);
                FOT fot = (FOT) this.A00;
                if (fot.getChildCount() > 0) {
                    Interpolator interpolator = FOT.A08;
                    if (animator == fot.A04 && fot.A03.isStarted()) {
                        return;
                    }
                    View childAt = fot.getChildAt(0);
                    C7384Etj.A0X(childAt);
                    FOT.A02(childAt, fot);
                    return;
                }
                return;
            case 3:
                FR1 fr1 = ((C8040FQr) this.A00).A06;
                if (fr1 != null) {
                    fr1.AVr();
                    return;
                }
                return;
            case 4:
                FR2 fr2 = ((C8040FQr) this.A00).A05;
                if (fr2 != null) {
                    fr2.ASZ();
                    return;
                }
                return;
            case 5:
                F8D f8d = (F8D) this.A00;
                F8D.A00(f8d, FZS.A02(f8d, 11));
                return;
            case 6:
                FT5.A01((FT5) this.A00);
                return;
            case 7:
                FE3 fe3 = (FE3) this.A00;
                FGV fgv = fe3.A01;
                fgv.setVisibility(4);
                fgv.A00();
                fe3.A00.A00();
                return;
            case 8:
                ((HideBottomViewOnScrollBehavior) this.A00).A02 = null;
                return;
            case 9:
            case 10:
                ((FW1) this.A00).A03();
                return;
            case 11:
            default:
                super.onAnimationEnd(animator);
                return;
            case 12:
                throw new NullPointerException("textInputLayout");
            case 13:
                throw new NullPointerException("endIconView");
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 7:
                FE3 fe3 = (FE3) this.A00;
                FGV fgv = fe3.A01;
                fgv.A01();
                FGV fgv2 = fe3.A00;
                fgv2.A01();
                fgv.setVisibility(0);
                fgv2.setVisibility(0);
                return;
            case 8:
            case 9:
            default:
                super.onAnimationStart(animator);
                return;
            case 10:
                FW1 fw1 = (FW1) this.A00;
                Handler handler = FW1.A0H;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) fw1.A0F;
                snackbarContentLayout.A01.setAlpha(0.0f);
                snackbarContentLayout.A01.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                if (snackbarContentLayout.A00.getVisibility() == 0) {
                    snackbarContentLayout.A00.setAlpha(0.0f);
                    snackbarContentLayout.A00.animate().alpha(1.0f).setDuration(180L).setStartDelay(70L).start();
                    return;
                }
                return;
            case 11:
                throw new NullPointerException("textInputLayout");
        }
    }
}

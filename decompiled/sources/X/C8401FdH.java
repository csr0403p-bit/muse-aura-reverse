package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.FdH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8401FdH extends AnimatorListenerAdapter implements InterfaceC8451FeF {
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public boolean A00 = false;
    public final boolean A05 = true;

    public C8401FdH(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        A00(true);
    }

    @Override // X.InterfaceC8451FeF
    public final void AWq() {
        A00(false);
        if (this.A00) {
            return;
        }
        View view = this.A03;
        int i = this.A02;
        Property<View, Rect> property = AbstractC8405FdM.A00;
        view.setTransitionVisibility(i);
    }

    @Override // X.InterfaceC8451FeF
    public final void AWr() {
        A00(true);
        if (this.A00) {
            return;
        }
        View view = this.A03;
        Property<View, Rect> property = AbstractC8405FdM.A00;
        view.setTransitionVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    private void A00(boolean z) {
        ViewGroup viewGroup;
        if (!this.A05 || this.A01 == z || (viewGroup = this.A04) == null) {
            return;
        }
        this.A01 = z;
        viewGroup.suppressLayout(z);
    }

    @Override // X.InterfaceC8451FeF
    public final void AWo(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // X.InterfaceC8451FeF
    public final /* synthetic */ void AWs(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            View view = this.A03;
            int i = this.A02;
            Property<View, Rect> property = AbstractC8405FdM.A00;
            view.setTransitionVisibility(i);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWp(AbstractC8429Fds abstractC8429Fds) {
        abstractC8429Fds.A0Z(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.A00) {
                View view = this.A03;
                int i = this.A02;
                Property<View, Rect> property = AbstractC8405FdM.A00;
                view.setTransitionVisibility(i);
                ViewGroup viewGroup = this.A04;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            A00(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.A03;
            Property<View, Rect> property = AbstractC8405FdM.A00;
            view.setTransitionVisibility(0);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }
}

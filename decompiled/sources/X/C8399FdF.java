package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.aura.R;

/* renamed from: X.FdF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8399FdF extends AnimatorListenerAdapter implements InterfaceC8451FeF {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final /* synthetic */ C8398FdE A04;

    public C8399FdF(View view, View view2, ViewGroup viewGroup, C8398FdE c8398FdE) {
        this.A04 = c8398FdE;
        this.A03 = viewGroup;
        this.A01 = view;
        this.A02 = view2;
    }

    private void A00() {
        this.A02.setTag(R.id.save_overlay_view, null);
        this.A03.getOverlay().remove(this.A01);
        this.A00 = false;
    }

    @Override // X.InterfaceC8451FeF
    public final void AWo(AbstractC8429Fds abstractC8429Fds) {
        if (this.A00) {
            A00();
        }
    }

    @Override // X.InterfaceC8451FeF
    public final void AWq() {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWr() {
    }

    @Override // X.InterfaceC8451FeF
    public final /* synthetic */ void AWs(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.A03.getOverlay().remove(this.A01);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.A01;
        if (view.getParent() == null) {
            AbstractC8060FRo.A0C(this.A03, view);
        } else {
            this.A04.A0F();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.A02;
            View view2 = this.A01;
            view.setTag(R.id.save_overlay_view, view2);
            AbstractC8060FRo.A0C(this.A03, view2);
            this.A00 = true;
        }
    }

    @Override // X.InterfaceC8451FeF
    public final void AWp(AbstractC8429Fds abstractC8429Fds) {
        abstractC8429Fds.A0Z(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        A00();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            A00();
        }
    }
}

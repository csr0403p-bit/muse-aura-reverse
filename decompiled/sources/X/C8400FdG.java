package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.facebook.aura.R;

/* renamed from: X.FdG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8400FdG extends AnimatorListenerAdapter implements InterfaceC8451FeF {
    public boolean A00 = false;
    public final View A01;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // X.InterfaceC8451FeF
    public final void AWo(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWp(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // X.InterfaceC8451FeF
    public final void AWq() {
        float transitionAlpha;
        View view = this.A01;
        if (view.getVisibility() == 0) {
            Property<View, Rect> property = AbstractC8405FdM.A00;
            transitionAlpha = view.getTransitionAlpha();
        } else {
            transitionAlpha = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(transitionAlpha));
    }

    @Override // X.InterfaceC8451FeF
    public final void AWr() {
        this.A01.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // X.InterfaceC8451FeF
    public final void AWs(AbstractC8429Fds abstractC8429Fds) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.A01;
        Property<View, Rect> property = AbstractC8405FdM.A00;
        view.setTransitionAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, null);
        }
    }

    public C8400FdG(View view) {
        this.A01 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.A00) {
            this.A01.setLayerType(0, null);
        }
        if (!z) {
            View view = this.A01;
            Property<View, Rect> property = AbstractC8405FdM.A00;
            view.setTransitionAlpha(1.0f);
        }
    }
}

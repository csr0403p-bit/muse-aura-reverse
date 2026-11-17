package com.google.android.material.behavior;

import X.AbstractC7607F5u;
import X.AbstractC8136FVz;
import X.AnonymousClass002;
import X.I05;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public ViewPropertyAnimator A02;
    public int A01 = 0;
    public int A00 = 2;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return AnonymousClass002.A1Q(i, 2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        TimeInterpolator timeInterpolator;
        long j;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        float f;
        if (i2 > 0) {
            if (this.A00 == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.A02;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.A00 = 1;
            int i6 = this.A01;
            timeInterpolator = AbstractC8136FVz.A01;
            j = 175;
            viewPropertyAnimatorAnimate = v.animate();
            f = i6;
        } else {
            if (i2 >= 0 || this.A00 == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.A02;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v.clearAnimation();
            }
            this.A00 = 2;
            timeInterpolator = AbstractC8136FVz.A04;
            j = 225;
            viewPropertyAnimatorAnimate = v.animate();
            f = 0.0f;
        }
        this.A02 = viewPropertyAnimatorAnimate.translationY(f).setInterpolator(timeInterpolator).setDuration(j).setListener(new I05(this, 8));
    }

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.A01 = v.getMeasuredHeight() + AbstractC7607F5u.A0e(v).bottomMargin;
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

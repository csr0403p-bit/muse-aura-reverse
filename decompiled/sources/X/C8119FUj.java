package X;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: X.FUj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8119FUj extends ImageView {
    public int A00;
    public Animation.AnimationListener A01;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.A01;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.A01;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.A00 = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}

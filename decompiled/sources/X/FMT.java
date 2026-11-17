package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FMT extends ImageView {
    public boolean A00;
    public final ObjectAnimator A01;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.A00 = false;
        this.A01.cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C7384Etj.A0Y(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() != null) {
            if (i != 0 || getVisibility() != 0) {
                this.A01.cancel();
                this.A00 = false;
            } else if (getAnimation() == null) {
                if (getMeasuredWidth() != 0) {
                    this.A01.start();
                } else {
                    this.A00 = true;
                }
            }
        }
    }

    public FMT(Context context) {
        super(context);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", 0.0f, 360.0f).setDuration(850L);
        C7384Etj.A0U(duration);
        this.A01 = duration;
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        duration.setInterpolator(new LinearInterpolator());
        setImageDrawable(context.getDrawable(R.drawable.spinner_large));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            this.A01.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            this.A01.start();
            this.A00 = false;
        }
    }
}

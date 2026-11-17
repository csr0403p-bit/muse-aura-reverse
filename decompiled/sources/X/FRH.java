package X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.Magnifier;

/* loaded from: classes6.dex */
public final class FRH {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public boolean A06;
    public final ValueAnimator A07;
    public final Magnifier A08;

    public FRH(Magnifier magnifier) {
        this.A08 = magnifier;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A07 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        C8919Ftb.A01(valueAnimatorOfFloat, this, 5);
    }
}

package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;

/* renamed from: X.Fta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8918Fta implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public final int A00;
    public final Object A01;

    public C8918Fta(Object obj, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.$t != 0) {
            C7384Etj.A0Y(valueAnimator, 0);
            FMV fmv = (FMV) this.A01;
            TimeInterpolator timeInterpolator = FMV.A08;
            fmv.A01.setColor(HyN.A00(this.A00, AbstractC7610F5x.A03(valueAnimator)));
            fmv.invalidateSelf();
            return;
        }
        C7384Etj.A0Y(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C7384Etj.A0Z(animatedValue, AnonymousClass000.A00(0));
        int iA0F = AnonymousClass001.A0F(animatedValue);
        FOV fov = (FOV) this.A01;
        FrameLayout frameLayout = fov.A06;
        if (frameLayout != null) {
            frameLayout.setForeground(new ColorDrawable(iA0F));
        }
        if (iA0F == this.A00) {
            fov.A00 = iA0F;
        }
    }
}

package X;

import android.animation.ValueAnimator;

/* loaded from: classes6.dex */
public final class F6F implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ Hj6 A01;
    public final /* synthetic */ HsM A02;

    public F6F(F6D f6d, Hj6 hj6, HsM hsM) {
        this.A02 = hsM;
        this.A01 = hj6;
        this.A00 = f6d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HsM hsM = this.A02;
        AbstractC7691FAk.A00(this.A00, this.A01, hsM);
    }
}

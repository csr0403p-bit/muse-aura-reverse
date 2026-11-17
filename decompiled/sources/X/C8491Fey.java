package X;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.Fey, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8491Fey extends AbstractC8484Fer {
    public final WindowInsetsAnimation A00;

    public C8491Fey(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.A00 = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds A00(C8492Fez c8492Fez) {
        return new WindowInsetsAnimation.Bounds(c8492Fez.A00.A04(), c8492Fez.A01.A04());
    }

    public static void A03(View view, AbstractC8493Ff0 abstractC8493Ff0) {
        view.setWindowInsetsAnimationCallback(abstractC8493Ff0 != null ? new C8488Fev(abstractC8493Ff0) : null);
    }

    @Override // X.AbstractC8484Fer
    public final float A05() {
        return this.A00.getAlpha();
    }

    @Override // X.AbstractC8484Fer
    public final float A06() {
        return this.A00.getInterpolatedFraction();
    }

    @Override // X.AbstractC8484Fer
    public final int A07() {
        return this.A00.getTypeMask();
    }

    @Override // X.AbstractC8484Fer
    public final long A08() {
        return this.A00.getDurationMillis();
    }

    @Override // X.AbstractC8484Fer
    public final void A09(float f) {
        this.A00.setFraction(f);
    }

    public static C8345FcJ A01(WindowInsetsAnimation.Bounds bounds) {
        return C8345FcJ.A01(bounds.getUpperBound());
    }

    public static C8345FcJ A02(WindowInsetsAnimation.Bounds bounds) {
        return C8345FcJ.A01(bounds.getLowerBound());
    }

    public C8491Fey(int i, Interpolator interpolator, long j) {
        this(new WindowInsetsAnimation(i, interpolator, j));
    }
}

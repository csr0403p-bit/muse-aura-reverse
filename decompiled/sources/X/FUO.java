package X;

import android.view.animation.Interpolator;

/* loaded from: classes6.dex */
public final class FUO implements Interpolator {
    public final /* synthetic */ FUL A00;

    public FUO(FUL ful) {
        this.A00 = ful;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.A00.A07.getInterpolation(f);
    }
}

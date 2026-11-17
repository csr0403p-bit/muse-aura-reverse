package X;

import android.view.animation.Interpolator;

/* loaded from: classes6.dex */
public abstract class FWJ implements Interpolator {
    public final float A00 = 1.0f / 200.0f;
    public final float[] A01;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int iMin = Math.min((int) (200.0f * f), 199);
        float f2 = this.A00;
        return AbstractC7607F5u.A01(fArr[iMin + 1], fArr[iMin], (f - (iMin * f2)) / f2);
    }

    public FWJ(float[] fArr) {
        this.A01 = fArr;
    }
}

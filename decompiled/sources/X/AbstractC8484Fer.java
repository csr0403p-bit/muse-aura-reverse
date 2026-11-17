package X;

import android.view.animation.Interpolator;

/* renamed from: X.Fer, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8484Fer {
    public float A00;
    public final int A01;
    public final long A02;
    public final Interpolator A03;

    public float A05() {
        return 1.0f;
    }

    public float A06() {
        Interpolator interpolator = this.A03;
        float f = this.A00;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int A07() {
        return this.A01;
    }

    public long A08() {
        return this.A02;
    }

    public void A09(float f) {
        this.A00 = f;
    }

    public AbstractC8484Fer(int i, Interpolator interpolator, long j) {
        this.A01 = i;
        this.A03 = interpolator;
        this.A02 = j;
    }
}

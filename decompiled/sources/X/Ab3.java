package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public final class Ab3 extends Ab4 {
    public static int A02(float f, float f2) {
        return A01(f * f2);
    }

    public static Rect A04(AaC aaC) {
        return new Rect(A01(aaC.A01), A01(aaC.A03), A01(aaC.A02), A01(aaC.A00));
    }

    public static final int A00(double d) {
        if (Double.isNaN(d)) {
            throw C60O.A0i("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static final int A01(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static final long A03(double d) {
        if (Double.isNaN(d)) {
            throw C60O.A0i("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public Ab3(int i) {
    }

    public Ab3() {
    }
}

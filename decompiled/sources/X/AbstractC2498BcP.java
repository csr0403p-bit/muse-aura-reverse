package X;

import android.util.Rational;
import android.util.Size;

/* renamed from: X.BcP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2498BcP {
    public static final Rational A02 = new Rational(4, 3);
    public static final Rational A01 = new Rational(3, 4);
    public static final Rational A00 = new Rational(16, 9);
    public static final Rational A03 = new Rational(9, 16);

    public static boolean A01(Rational rational, Size size, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(BV8.A0Y(size))) {
            return true;
        }
        Size size3 = AbstractC2484BcB.A00;
        if (BV7.A0B(size) < BV7.A0B(size2)) {
            return false;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i = height % 16;
        if (width % 16 == 0) {
            return i == 0 ? A00(rational, Math.max(0, height + (-16)), width) || A00(rational2, Math.max(0, width + (-16)), height) : A00(rational, height, width);
        }
        if (i == 0) {
            return A00(rational2, width, height);
        }
        return false;
    }

    public static boolean A00(Rational rational, int i, int i2) {
        BeS.A05(AnonymousClass002.A1M(i2 % 16));
        double numerator = (i * rational.getNumerator()) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}

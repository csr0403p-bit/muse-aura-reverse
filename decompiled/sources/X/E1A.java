package X;

import com.google.common.base.Preconditions;

/* loaded from: classes5.dex */
public abstract class E1A {
    public static long A00(double d) {
        int exponent = Math.getExponent(d);
        Preconditions.checkArgument(BV7.A1S(exponent, 1023), "not a normal value");
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }
}

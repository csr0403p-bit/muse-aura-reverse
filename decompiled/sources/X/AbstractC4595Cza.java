package X;

import java.math.RoundingMode;

/* renamed from: X.Cza, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4595Cza {
    public static int A00(RoundingMode p, int q, int mode) {
        if (mode == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i = q / mode;
        int i2 = q - (mode * i);
        if (i2 == 0) {
            return i;
        }
        int i3 = ((q ^ mode) >> 31) | 1;
        switch (E4M.A00[p.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i;
            case 3:
                if (i3 >= 0) {
                    return i;
                }
                break;
            case 4:
                break;
            case 5:
                if (i3 <= 0) {
                    return i;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i2);
                int iAbs2 = iAbs - (Math.abs(mode) - iAbs);
                if (iAbs2 == 0 || iAbs2 <= 0) {
                    return i;
                }
                break;
            default:
                throw BV6.A0f();
        }
        return i + i3;
    }
}

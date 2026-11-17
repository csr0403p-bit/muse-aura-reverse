package X;

import java.math.RoundingMode;

/* renamed from: X.Cwl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4469Cwl {
    public static int A00(RoundingMode roundingMode, int i, int i2) {
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (E4O.A00[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0 || iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw BV6.A0f();
        }
        return i3 + i5;
    }
}

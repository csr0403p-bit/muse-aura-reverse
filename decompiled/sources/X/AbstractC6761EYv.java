package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.NavigableMap;

/* renamed from: X.EYv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6761EYv extends EZ0 {
    public static final BigDecimal A00(CharSequence charSequence, int i, int i2, int i3, int i4, int i5, boolean z) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerA00;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        NavigableMap<Integer, BigInteger> navigableMapA02 = null;
        if (i8 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i8 > 400) {
            navigableMapA02 = EXL.A02();
            EXL.A03(navigableMapA02, i, i2);
            bigIntegerNegate = AbstractC6759EYt.A01(charSequence, navigableMapA02, i, i2);
        } else {
            bigIntegerNegate = AbstractC6759EYt.A00(charSequence, i, i2);
        }
        if (i6 > 0) {
            if (i7 > 400) {
                if (navigableMapA02 == null) {
                    navigableMapA02 = EXL.A02();
                }
                EXL.A03(navigableMapA02, i3, i4);
                bigIntegerA00 = AbstractC6759EYt.A01(charSequence, navigableMapA02, i3, i4);
            } else {
                bigIntegerA00 = AbstractC6759EYt.A00(charSequence, i3, i4);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerA00 = EZI.A05(bigIntegerNegate, EXL.A00(navigableMapA02, i6)).add(bigIntegerA00);
            }
            bigIntegerNegate = bigIntegerA00;
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i5);
    }
}

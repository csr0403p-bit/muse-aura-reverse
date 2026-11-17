package X;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;

/* renamed from: X.EYs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6758EYs extends EZ0 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6 A[LOOP:1: B:26:0x00ae->B:28:0x00b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3 A[EDGE_INSN: B:45:0x00c3->B:29:0x00c3 BREAK  A[LOOP:1: B:26:0x00ae->B:28:0x00b6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.math.BigInteger A02(char[] r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6758EYs.A02(char[], int, int):java.math.BigInteger");
    }

    public static final BigDecimal A00(char[] cArr, int i, int i2, int i3, int i4, int i5, boolean z) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerA02;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        NavigableMap<Integer, BigInteger> navigableMapA02 = null;
        if (i8 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i8 > 400) {
            navigableMapA02 = EXL.A02();
            EXL.A03(navigableMapA02, i, i2);
            bigIntegerNegate = A01(navigableMapA02, cArr, i, i2);
        } else {
            bigIntegerNegate = A02(cArr, i, i2);
        }
        if (i6 > 0) {
            if (i7 > 400) {
                if (navigableMapA02 == null) {
                    navigableMapA02 = EXL.A02();
                }
                EXL.A03(navigableMapA02, i3, i4);
                bigIntegerA02 = A01(navigableMapA02, cArr, i3, i4);
            } else {
                bigIntegerA02 = A02(cArr, i3, i4);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerA02 = EZI.A05(bigIntegerNegate, EXL.A00(navigableMapA02, i6)).add(bigIntegerA02);
            }
            bigIntegerNegate = bigIntegerA02;
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i5);
    }

    public static BigInteger A01(Map map, char[] cArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 <= 400) {
            return A02(cArr, i, i2);
        }
        BigInteger bigInteger = EXL.A00;
        int i4 = i2 - (((i3 + 31) >>> 5) << 4);
        return A01(map, cArr, i4, i2).add(EZI.A05(A01(map, cArr, i, i4), (BigInteger) BV5.A0f(map, i2 - i4)));
    }
}

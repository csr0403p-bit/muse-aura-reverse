package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.math.RoundingMode;

/* renamed from: X.DzZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6280DzZ {
    public static final long[][] A00 = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{LinkEncryptedPairingKt.LINK_COUNTER_MAX, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    public static long A00(long a, long b) {
        long j = a + b;
        if (C8j3.A1R(((a ^ b) > 0L ? 1 : ((a ^ b) == 0L ? 0 : -1))) || ((a ^ j) >= 0)) {
            return j;
        }
        StringBuilder sbA0x = C3cI.A0x("overflow: ", "checkedAdd");
        sbA0x.append("(");
        sbA0x.append(a);
        C8j3.A1K(sbA0x);
        sbA0x.append(b);
        throw new ArithmeticException(BV7.A10(sbA0x));
    }

    public static long A01(long a, long b) {
        if (a < 0) {
            StringBuilder sbA0g = C3cG.A0g("a");
            sbA0g.append(" (");
            sbA0g.append(a);
            throw C8j3.A0w(") must be >= 0", sbA0g);
        }
        if (b < 0) {
            StringBuilder sbA0g2 = C3cG.A0g(CRD.__redex_internal_original_name);
            sbA0g2.append(" (");
            sbA0g2.append(b);
            throw C8j3.A0w(") must be >= 0", sbA0g2);
        }
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(a);
        long jNumberOfTrailingZeros = a >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(b);
        long j = b >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j) {
            long j2 = jNumberOfTrailingZeros - j;
            long j3 = (j2 >> 63) & j2;
            long j4 = (j2 - j3) - j3;
            j += j3;
            jNumberOfTrailingZeros = j4 >> Long.numberOfTrailingZeros(j4);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static long A03(RoundingMode p, long q, long mode) {
        long j = q / mode;
        long j2 = q - (mode * j);
        if (j2 == 0) {
            return j;
        }
        int i = ((int) ((q ^ mode) >> 63)) | 1;
        switch (E4L.A00[p.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j;
            case 3:
                if (i >= 0) {
                    return j;
                }
                break;
            case 4:
                break;
            case 5:
                if (i <= 0) {
                    return j;
                }
                break;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j2);
                long jAbs2 = jAbs - (Math.abs(mode) - jAbs);
                if (jAbs2 == 0) {
                    if (p != RoundingMode.HALF_UP && (p != RoundingMode.HALF_EVEN || (1 & j) == 0)) {
                        return j;
                    }
                } else if (jAbs2 <= 0) {
                    return j;
                }
                break;
            default:
                throw BV6.A0f();
        }
        return j + i;
    }

    public static long A02(long a, long b) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(a) + Long.numberOfLeadingZeros(a ^ (-1)) + Long.numberOfLeadingZeros(b) + Long.numberOfLeadingZeros((-1) ^ b);
        if (iNumberOfLeadingZeros > 65) {
            return a * b;
        }
        long j = ((a ^ b) >>> 63) + LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        if (C8j3.A1T(iNumberOfLeadingZeros, 64) || (C8j3.A1R((a > 0L ? 1 : (a == 0L ? 0 : -1))) & (b == Long.MIN_VALUE))) {
            return j;
        }
        long j2 = a * b;
        return (a == 0 || j2 / a == b) ? j2 : j;
    }
}

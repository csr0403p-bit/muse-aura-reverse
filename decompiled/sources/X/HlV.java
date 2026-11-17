package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.math.BigDecimal;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public abstract class HlV {
    public static final String A01 = String.valueOf(Long.MIN_VALUE).substring(1);
    public static final String A00 = String.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX);
    public static final Pattern A02 = Pattern.compile("[+-]?[0-9]*[\\.]?[0-9]+([eE][+-]?[0-9]+)?");
    public static final Pattern A03 = Pattern.compile("[+-]?[0-9]+[\\.]");

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A04(java.lang.String r8) {
        /*
            r6 = 0
            char r7 = r8.charAt(r6)
            int r5 = r8.length()
            r0 = 45
            r2 = 1
            if (r7 != r0) goto L58
            r6 = 1
            r0 = 10
            if (r5 == r2) goto L5c
            if (r5 > r0) goto L5c
            char r7 = r8.charAt(r2)
            r2 = 2
        L1a:
            r4 = 57
            if (r7 > r4) goto L5c
            r3 = 48
            if (r7 < r3) goto L5c
            int r7 = r7 - r3
            if (r2 >= r5) goto L61
            int r1 = r2 + 1
            char r0 = r8.charAt(r2)
            if (r0 > r4) goto L5c
            if (r0 < r3) goto L5c
            int r7 = r7 * 10
            int r0 = r0 - r3
            int r7 = r7 + r0
            if (r1 >= r5) goto L61
            int r2 = r2 + 2
            char r0 = r8.charAt(r1)
            if (r0 > r4) goto L5c
            if (r0 < r3) goto L5c
            int r7 = r7 * 10
            int r0 = r0 - r3
            int r7 = r7 + r0
            if (r2 >= r5) goto L61
        L45:
            int r1 = r2 + 1
            char r0 = r8.charAt(r2)
            if (r0 > r4) goto L5c
            if (r0 < r3) goto L5c
            int r7 = r7 * 10
            int r0 = r0 + (-48)
            int r7 = r7 + r0
            if (r1 >= r5) goto L61
            r2 = r1
            goto L45
        L58:
            r0 = 9
            if (r5 <= r0) goto L1a
        L5c:
            int r0 = java.lang.Integer.parseInt(r8)
            return r0
        L61:
            if (r6 == 0) goto L65
            int r0 = -r7
            return r0
        L65:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HlV.A04(java.lang.String):int");
    }

    public static boolean A0A(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.length() == 1) {
                char cCharAt = str.charAt(0);
                if (cCharAt <= '9' && cCharAt >= '0') {
                    return true;
                }
            } else if (A02.matcher(str).matches() || A03.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static double A00(String str, boolean z) {
        return z ? Double.longBitsToDouble(Htt.A01.A00(str, str.length())) : Double.parseDouble(str);
    }

    public static double A01(char[] cArr, int i, int i2, boolean z) {
        return z ? Double.longBitsToDouble(Htt.A00.A00(cArr, i, i2)) : Double.parseDouble(new String(cArr, i, i2));
    }

    public static float A02(String str, boolean z) {
        return z ? Float.intBitsToFloat((int) Htz.A01.A00(str, str.length())) : Float.parseFloat(str);
    }

    public static float A03(char[] cArr, int i, int i2, boolean z) {
        return z ? Float.intBitsToFloat((int) Htz.A00.A00(cArr, i, i2)) : Float.parseFloat(new String(cArr, i, i2));
    }

    public static int A05(String str, int i) {
        String strTrim;
        int length;
        if (str == null || (length = (strTrim = str.trim()).length()) == 0) {
            return i;
        }
        int i2 = 0;
        char cCharAt = strTrim.charAt(0);
        if (cCharAt == '+') {
            strTrim = strTrim.substring(1);
            length = strTrim.length();
        } else if (cCharAt == '-') {
            i2 = 1;
        }
        while (i2 < length) {
            try {
                char cCharAt2 = strTrim.charAt(i2);
                if (cCharAt2 > '9' || cCharAt2 < '0') {
                    return (int) Double.longBitsToDouble(Htt.A01.A00(strTrim, strTrim.length()));
                }
                i2++;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return Integer.parseInt(strTrim);
    }

    public static int A06(char[] cArr, int i, int i2) {
        if (i2 > 0 && cArr[i] == '+') {
            i++;
            i2--;
        }
        int i3 = cArr[(i + i2) - 1] - '0';
        switch (i2) {
            case 9:
                i3 += (cArr[i] - '0') * 100000000;
                i++;
            case 8:
                i3 += (cArr[i] - '0') * 10000000;
                i++;
            case 7:
                i3 += (cArr[i] - '0') * 1000000;
                i++;
            case 6:
                i3 += (cArr[i] - '0') * 100000;
                i++;
            case 5:
                i3 += (cArr[i] - '0') * 10000;
                i++;
            case 4:
                i3 += (cArr[i] - '0') * 1000;
                i++;
            case 3:
                i3 += (cArr[i] - '0') * 100;
                i++;
            case 2:
                return i3 + ((cArr[i] - '0') * 10);
            default:
                return i3;
        }
    }

    public static long A08(char[] cArr, int i, int i2) {
        int i3 = i2 - 9;
        return (A06(cArr, i, i3) * 1000000000) + A06(cArr, i + i3, 9);
    }

    public static BigDecimal A09(String str, boolean z) {
        try {
            return z ? AbstractC6762EYw.A00(str) : str.length() < 500 ? new BigDecimal(str) : AbstractC6762EYw.A00(str);
        } catch (ArithmeticException | NumberFormatException e) {
            throw Hpa.A00(e, str);
        }
    }

    public static long A07(String str) {
        return str.length() <= 9 ? A04(str) : Long.parseLong(str);
    }
}

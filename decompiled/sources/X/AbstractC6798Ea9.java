package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;

/* renamed from: X.Ea9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6798Ea9 {
    public static final String A00 = String.valueOf(Integer.MIN_VALUE);
    public static final String A01 = String.valueOf(Long.MIN_VALUE);
    public static final int[] A02;
    public static final String[] A03;
    public static final String[] A04;

    public static int A00(int i) {
        return (int) ((i * 274877907) >>> 38);
    }

    static {
        int[] iArr = new int[1000];
        A02 = iArr;
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = 0;
            do {
                int i4 = 0;
                do {
                    iArr[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                } while (i4 < 10);
                i3++;
            } while (i3 < 10);
        }
        A03 = new String[]{HatchPriceImpressionEventDataKt.NO_DISCOUNT, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        A04 = new String[]{ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL, "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    public static int A01(int i, char[] cArr, int i2) {
        int i3;
        int[] iArr;
        int iA0A;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = A00;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return i2 + length;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i < 1000) {
                if (i >= 10) {
                    return A02(i, cArr, i2);
                }
                cArr[i2] = (char) (i + 48);
                return i2 + 1;
            }
            int iA00 = A00(i);
            i3 = i - (iA00 * 1000);
            iA0A = A02(iA00, cArr, i2);
            iArr = A02;
        } else {
            if (i >= 1000000000) {
                int i4 = i - 1000000000;
                int i5 = i2 + 1;
                char c = '1';
                if (i4 >= 1000000000) {
                    i4 -= 1000000000;
                    c = '2';
                }
                cArr[i2] = c;
                return A03(i4, cArr, i5);
            }
            int iA002 = A00(i);
            i3 = i - (iA002 * 1000);
            int iA003 = A00(iA002);
            int i6 = iA002 - (iA003 * 1000);
            int iA02 = A02(iA003, cArr, i2);
            iArr = A02;
            iA0A = A0A(cArr, iArr, i6, iA02);
        }
        return A0A(cArr, iArr, i3, iA0A);
    }

    public static int A02(int i, char[] cArr, int i2) {
        int i3 = A02[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    public static int A04(byte[] bArr, int i, int i2) {
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = A00;
                int length = str.length();
                int i3 = 0;
                while (i3 < length) {
                    bArr[i2] = (byte) str.charAt(i3);
                    i3++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int iA00 = A00(i);
                return A08(bArr, A02, i - (iA00 * 1000), A05(bArr, iA00, i2));
            }
            if (i >= 10) {
                return A05(bArr, i, i2);
            }
            int i4 = i2 + 1;
            bArr[i2] = (byte) (i + 48);
            return i4;
        }
        if (i < 1000000000) {
            int iA002 = A00(i);
            int i5 = i - (iA002 * 1000);
            int iA003 = A00(iA002);
            int i6 = iA002 - (iA003 * 1000);
            int iA05 = A05(bArr, iA003, i2);
            int[] iArr = A02;
            return A08(bArr, iArr, i5, A08(bArr, iArr, i6, iA05));
        }
        int i7 = i - 1000000000;
        int i8 = i2 + 1;
        byte b = 49;
        if (i7 >= 1000000000) {
            i7 -= 1000000000;
            b = 50;
        }
        bArr[i2] = b;
        return A06(bArr, i7, i8);
    }

    public static int A05(byte[] bArr, int i, int i2) {
        int i3 = A02[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r10 <= 2147483647L) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A07(byte[] r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6798Ea9.A07(byte[], int, long):int");
    }

    public static int A08(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        bArr[i2] = (byte) (i3 >> 16);
        bArr[i2 + 1] = (byte) (i3 >> 8);
        int i4 = i2 + 3;
        bArr[i2 + 2] = (byte) i3;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r10 <= 2147483647L) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A09(char[] r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6798Ea9.A09(char[], int, long):int");
    }

    public static int A0A(char[] cArr, int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        cArr[i2] = (char) (i3 >> 16);
        cArr[i2 + 1] = (char) ((i3 >> 8) & 127);
        int i4 = i2 + 3;
        cArr[i2 + 2] = (char) (i3 & 127);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A0B(double r9, boolean r11) {
        /*
            if (r11 == 0) goto L85
            X.EaA r8 = new X.EaA
            r8.<init>()
            long r10 = java.lang.Double.doubleToRawLongBits(r9)
            r3 = 4503599627370495(0xfffffffffffff, double:2.225073858507201E-308)
            long r3 = r3 & r10
            r0 = 52
            long r0 = r10 >>> r0
            int r5 = (int) r0
            r0 = 2047(0x7ff, float:2.868E-42)
            r5 = r5 & r0
            r1 = 0
            if (r5 >= r0) goto L74
            r9 = -1
            r8.A00 = r9
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L29
            r0 = 45
            X.C6799EaA.A01(r8, r0)
        L29:
            r7 = 0
            if (r5 == 0) goto L53
            int r9 = 1075 - r5
            r0 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            long r3 = r3 | r0
            if (r9 <= 0) goto L4e
            r0 = 53
            if (r9 >= r0) goto L4e
            long r1 = r3 >> r9
            long r5 = r1 << r9
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4e
            X.C6799EaA.A06(r8, r7, r1)
        L42:
            byte[] r2 = r8.A01
            int r0 = r8.A00
            int r1 = r0 + 1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r7, r7, r1)
            return r0
        L4e:
            int r0 = -r9
            X.C6799EaA.A05(r8, r0, r7, r3)
            goto L42
        L53:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            r5 = 3
            r2 = -1074(0xfffffffffffffbce, float:NaN)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L66
            r0 = 10
            long r3 = r3 * r0
            X.C6799EaA.A05(r8, r2, r9, r3)
            goto L42
        L66:
            X.C6799EaA.A05(r8, r2, r7, r3)
            goto L42
        L6a:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto L71
            java.lang.String r0 = "0.0"
            return r0
        L71:
            java.lang.String r0 = "-0.0"
            return r0
        L74:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L7b
            java.lang.String r0 = "NaN"
            return r0
        L7b:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L82
            java.lang.String r0 = "Infinity"
            return r0
        L82:
            java.lang.String r0 = "-Infinity"
            return r0
        L85:
            java.lang.String r0 = java.lang.Double.toString(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6798Ea9.A0B(double, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A0C(float r5, boolean r6) {
        /*
            if (r6 == 0) goto L6f
            X.EaB r4 = new X.EaB
            r4.<init>()
            int r6 = java.lang.Float.floatToRawIntBits(r5)
            r5 = 8388607(0x7fffff, float:1.1754942E-38)
            r5 = r5 & r6
            int r1 = r6 >>> 23
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 >= r0) goto L62
            r2 = -1
            r4.A00 = r2
            if (r6 >= 0) goto L20
            r0 = 45
            X.C6800EaB.A00(r4, r0)
        L20:
            r3 = 0
            if (r1 == 0) goto L48
            int r2 = 150 - r1
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r5 = r5 | r0
            if (r2 <= 0) goto L43
            r0 = 24
            if (r2 >= r0) goto L43
            int r1 = r5 >> r2
            int r0 = r1 << r2
            if (r0 != r5) goto L43
            X.C6800EaB.A02(r4, r1, r3)
        L37:
            byte[] r2 = r4.A01
            int r0 = r4.A00
            int r1 = r0 + 1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r3, r3, r1)
            return r0
        L43:
            int r0 = -r2
            X.C6800EaB.A03(r4, r0, r5, r3)
            goto L37
        L48:
            if (r5 == 0) goto L5a
            r0 = 8
            r1 = -149(0xffffffffffffff6b, float:NaN)
            if (r5 >= r0) goto L56
            int r0 = r5 * 10
            X.C6800EaB.A03(r4, r1, r0, r2)
            goto L37
        L56:
            X.C6800EaB.A03(r4, r1, r5, r3)
            goto L37
        L5a:
            if (r6 != 0) goto L5f
            java.lang.String r0 = "0.0"
            return r0
        L5f:
            java.lang.String r0 = "-0.0"
            return r0
        L62:
            if (r5 == 0) goto L67
            java.lang.String r0 = "NaN"
            return r0
        L67:
            if (r6 <= 0) goto L6c
            java.lang.String r0 = "Infinity"
            return r0
        L6c:
            java.lang.String r0 = "-Infinity"
            return r0
        L6f:
            java.lang.String r0 = java.lang.Float.toString(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6798Ea9.A0C(float, boolean):java.lang.String");
    }

    public static int A03(int i, char[] cArr, int i2) {
        int iA00 = A00(i);
        int iA002 = A00(iA00);
        int[] iArr = A02;
        int iA0A = A0A(cArr, iArr, iA002, i2);
        int i3 = iArr[iA00 - (iA002 * 1000)];
        cArr[iA0A] = (char) (i3 >> 16);
        cArr[i2 + 4] = (char) ((i3 >> 8) & 127);
        cArr[i2 + 5] = (char) (i3 & 127);
        int i4 = iArr[i - (iA00 * 1000)];
        cArr[i2 + 6] = (char) (i4 >> 16);
        cArr[i2 + 7] = (char) ((i4 >> 8) & 127);
        int i5 = i2 + 9;
        cArr[i2 + 8] = (char) (i4 & 127);
        return i5;
    }

    public static int A06(byte[] bArr, int i, int i2) {
        int iA00 = A00(i);
        int i3 = i - (iA00 * 1000);
        int iA002 = A00(iA00);
        int i4 = iA00 - (iA002 * 1000);
        int[] iArr = A02;
        int iA08 = A08(bArr, iArr, iA002, i2);
        int i5 = iArr[i4];
        bArr[iA08] = (byte) (i5 >> 16);
        bArr[i2 + 4] = (byte) (i5 >> 8);
        bArr[i2 + 5] = (byte) i5;
        int i6 = iArr[i3];
        bArr[i2 + 6] = (byte) (i6 >> 16);
        bArr[i2 + 7] = (byte) (i6 >> 8);
        int i7 = i2 + 9;
        bArr[i2 + 8] = (byte) i6;
        return i7;
    }
}

package X;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class EZI {
    public static final double A00 = Math.cos(0.7853981633974483d);
    public static final double A01 = Math.sin(0.7853981633974483d);
    public static volatile EZJ[] A02 = new EZJ[20];
    public static volatile EZJ[] A03 = new EZJ[20];

    public static EZJ A01(int i) {
        EZJ ezj;
        if (i == 1) {
            ezj = new EZJ(1);
            ezj.A02(0, 1.0d);
            ezj.A01(0, 0.0d);
        } else {
            ezj = new EZJ(i);
            int i2 = ezj.A01;
            double[] dArr = ezj.A02;
            dArr[i2] = 1.0d;
            dArr[i2 + 1] = 0.0d;
            double d = A00;
            double d2 = A01;
            int i3 = i / 2;
            int i4 = (i3 << 1) + i2;
            dArr[i4] = d;
            dArr[i4 + 1] = d2;
            double d3 = 1.5707963267948966d / i;
            for (int i5 = 1; i5 < i3; i5++) {
                double d4 = i5 * d3;
                double dCos = Math.cos(d4);
                double dSin = Math.sin(d4);
                int i6 = (i5 << 1) + i2;
                dArr[i6] = dCos;
                dArr[i6 + 1] = dSin;
                int i7 = ((i - i5) << 1) + i2;
                dArr[i7] = dSin;
                dArr[i7 + 1] = dCos;
            }
        }
        return ezj;
    }

    public static int A00(int i) {
        if (i <= 9728) {
            return 19;
        }
        if (i <= 18432) {
            return 18;
        }
        if (i <= 69632) {
            return 17;
        }
        if (i <= 262144) {
            return 16;
        }
        if (i <= 983040) {
            return 15;
        }
        if (i <= 3670016) {
            return 14;
        }
        if (i <= 13631488) {
            return 13;
        }
        if (i <= 25165824) {
            return 12;
        }
        if (i <= 92274688) {
            return 11;
        }
        if (i <= 335544320) {
            return 10;
        }
        return i <= 1207959552 ? 9 : 8;
    }

    public static EZJ A02(int i) {
        if (i >= 20) {
            return A01(3 << i);
        }
        if (A03[i] == null) {
            A03[i] = A01(3 << i);
        }
        return A03[i];
    }

    public static EZJ A03(byte[] bArr, int i, int i2) {
        EZJ ezj = new EZJ(i);
        int length = bArr.length;
        if (length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - length, length);
            bArr = bArr2;
        }
        int i3 = 1 << i2;
        int i4 = i3 / 2;
        int i5 = i3 - 1;
        int i6 = 32 - i2;
        int length2 = bArr.length;
        int i7 = (length2 * 8) - i2;
        int iA0E = 0;
        int i8 = 0;
        while (i7 > (-i2)) {
            int iA0F = C8j3.A0F(length2, 4, Math.max(0, i7 >> 3));
            iA0E = (i4 - (((BV8.A0E(bArr, iA0F) >>> ((i6 - i7) + (iA0F << 3))) & i5) + iA0E)) >>> 31;
            ezj.A02(i8, r1 - ((-iA0E) & i3));
            i8++;
            i7 -= i2;
        }
        if (iA0E > 0) {
            ezj.A02(i8, iA0E);
        }
        return ezj;
    }

    public static BigInteger A04(EZJ ezj, int i, int i2) {
        long j = i2;
        int iA01 = BV4.A01(ezj.A00, (2147483648L / j) + 1);
        int i3 = (int) ((((iA01 * j) + 31) * 8) / 32);
        byte[] bArr = new byte[i3];
        int i4 = (1 << i2) - 1;
        int i5 = 32 - i2;
        int i6 = (i3 * 8) - i2;
        int i7 = i3 - 4;
        int iMin = Math.min(Math.max(0, i6 >> 3), i7);
        long j2 = 0;
        int i8 = 0;
        int i9 = 0;
        do {
            int i10 = 0;
            while (i10 < iA01) {
                long jRound = Math.round(ezj.A02[(i10 << 1) + i8]) + j2;
                j2 = jRound >> i2;
                int iA06 = BV7.A06(0, i6 >> 3, i7);
                i9 = (int) (((jRound & i4) << ((i5 - i6) + (iA06 << 3))) | (i9 >>> ((iMin - iA06) << 3)));
                bArr[iA06] = (byte) (i9 >>> 24);
                bArr[iA06 + 1] = (byte) (i9 >>> 16);
                bArr[iA06 + 2] = (byte) (i9 >>> 8);
                bArr[iA06 + 3] = (byte) i9;
                i6 -= i2;
                i10++;
                iMin = iA06;
            }
            i8++;
        } while (i8 <= 1);
        return new BigInteger(i, bArr);
    }

    public static void A06(EZJ ezj, EZJ ezj2, EZJ ezj3, double d, int i) {
        double dSqrt = i * (-0.5d) * Math.sqrt(3.0d);
        for (int i2 = 0; i2 < ezj.A00; i2++) {
            double[] dArr = ezj.A02;
            int i3 = i2 << 1;
            int i4 = i3 + ezj.A01;
            double d2 = dArr[i4];
            double[] dArr2 = ezj2.A02;
            int i5 = i3 + ezj2.A01;
            double d3 = dArr2[i5];
            double[] dArr3 = ezj3.A02;
            int i6 = i3 + ezj3.A01;
            double d4 = dArr3[i6];
            double d5 = d2 + d3 + d4;
            double d6 = dArr[i4 + 1];
            double d7 = dArr2[i5 + 1];
            double d8 = dArr3[i6 + 1];
            double d9 = d6 + d7 + d8;
            double d10 = (d8 - d7) * dSqrt;
            double d11 = (d3 - d4) * dSqrt;
            double d12 = (d7 + d8) * 0.5d;
            double d13 = d2 - ((d3 + d4) * 0.5d);
            ezj.A02(i2, d5 * d);
            ezj.A01(i2, d9 * d);
            ezj2.A02(i2, (d13 + d10) * d);
            ezj2.A01(i2, ((d6 + d11) - d12) * d);
            ezj3.A02(i2, (d13 - d10) * d);
            ezj3.A01(i2, ((d6 - d11) - d12) * d);
        }
    }

    public static void A07(EZJ ezj, EZJ ezj2, EZJ[] ezjArr) {
        int i;
        int i2 = ezj.A00;
        int i3 = i2 / 3;
        int i4 = 0;
        EZJ ezj3 = new EZJ(ezj, 0, i3);
        int i5 = i3 * 2;
        EZJ ezj4 = new EZJ(ezj, i3, i5);
        EZJ ezj5 = new EZJ(ezj, i5, i2);
        A06(ezj3, ezj4, ezj5, 1.0d, 1);
        EZL ezl = new EZL();
        while (true) {
            i = i2 / 4;
            if (i4 >= i) {
                break;
            }
            ezl.A00(ezj2, i4);
            ezj4.A08(ezl, i4);
            ezj5.A08(ezl, i4);
            ezj5.A08(ezl, i4);
            i4++;
        }
        while (i < i3) {
            ezl.A00(ezj2, i - i);
            ezj4.A09(ezl, i);
            ezj5.A09(ezl, i);
            ezj5.A09(ezl, i);
            i++;
        }
        A09(ezj3, ezjArr);
        A09(ezj4, ezjArr);
        A09(ezj5, ezjArr);
    }

    public static void A08(EZJ ezj, EZJ ezj2, EZJ[] ezjArr) {
        int i;
        int i2 = ezj.A00;
        int i3 = i2 / 3;
        int i4 = 0;
        EZJ ezj3 = new EZJ(ezj, 0, i3);
        int i5 = i3 * 2;
        EZJ ezj4 = new EZJ(ezj, i3, i5);
        EZJ ezj5 = new EZJ(ezj, i5, i2);
        A0A(ezj3, ezjArr);
        A0A(ezj4, ezjArr);
        A0A(ezj5, ezjArr);
        EZL ezl = new EZL();
        while (true) {
            i = i2 / 4;
            if (i4 >= i) {
                break;
            }
            ezl.A00(ezj2, i4);
            ezj4.A06(ezl, i4);
            ezj5.A06(ezl, i4);
            ezj5.A06(ezl, i4);
            i4++;
        }
        while (i < i3) {
            ezl.A00(ezj2, i - i);
            ezj4.A07(ezl, i);
            ezj5.A07(ezl, i);
            ezj5.A07(ezl, i);
            i++;
        }
        A06(ezj3, ezj4, ezj5, 0.3333333333333333d, -1);
    }

    public static void A09(EZJ ezj, EZJ[] ezjArr) {
        int i = ezj.A00;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        while (iNumberOfLeadingZeros >= 2) {
            EZJ ezj2 = ezjArr[iNumberOfLeadingZeros - 2];
            int i2 = 1 << iNumberOfLeadingZeros;
            for (int i3 = 0; i3 < i; i3 += i2) {
                int i4 = 0;
                while (true) {
                    int i5 = i2 / 4;
                    int i6 = i4;
                    if (i6 < i5) {
                        double[] dArr = ezj2.A02;
                        int i7 = (i6 << 1) + ezj2.A01;
                        double d = dArr[i7];
                        double d2 = dArr[i7 + 1];
                        double d3 = (d * d) + ((-d2) * d2);
                        double d4 = d * 2.0d * d2;
                        int i8 = i3 + i4;
                        int i9 = i5 + i8;
                        int i10 = i8 + (i2 / 2);
                        int i11 = i8 + ((i2 * 3) / 4);
                        double[] dArr2 = ezj.A02;
                        int i12 = ezj.A01;
                        int i13 = (i8 << 1) + i12;
                        double d5 = dArr2[i13];
                        int i14 = (i9 << 1) + i12;
                        double d6 = dArr2[i14];
                        double d7 = dArr2[i13 + 1];
                        double d8 = dArr2[i14 + 1];
                        int i15 = (i10 << 1) + i12;
                        double d9 = dArr2[i15];
                        double d10 = dArr2[i15 + 1];
                        int i16 = (i11 << 1) + i12;
                        double d11 = dArr2[i16];
                        double d12 = d5 + d6 + d9 + d11;
                        double d13 = dArr2[i16 + 1];
                        double d14 = d7 + d8 + d10 + d13;
                        double d15 = ((d5 + d8) - d9) - d13;
                        double d16 = ((d7 - d6) - d10) + d11;
                        double d17 = (d15 * d) + (d16 * d2);
                        double d18 = ((-d15) * d2) + (d16 * d);
                        double d19 = ((d5 - d6) + d9) - d11;
                        double d20 = ((d7 - d8) + d10) - d13;
                        double d21 = (d19 * d3) + (d20 * d4);
                        double d22 = ((-d19) * d4) + (d20 * d3);
                        double d23 = ((d5 - d8) - d9) + d13;
                        double d24 = ((d7 + d6) - d10) - d11;
                        ezj.A02(i8, d12);
                        ezj.A01(i8, d14);
                        ezj.A02(i9, d17);
                        ezj.A01(i9, d18);
                        ezj.A02(i10, d21);
                        ezj.A01(i10, d22);
                        ezj.A02(i11, (d23 * d) + ((-d24) * d2));
                        ezj.A01(i11, (d23 * d2) + (d24 * d));
                        i4++;
                    }
                }
            }
            iNumberOfLeadingZeros -= 2;
        }
        if (iNumberOfLeadingZeros > 0) {
            for (int i17 = 0; i17 < i; i17 += 2) {
                double[] dArr3 = ezj.A02;
                int i18 = ezj.A01;
                int i19 = (i17 << 1) + i18;
                double d25 = dArr3[i19];
                int i20 = i19 + 1;
                double d26 = dArr3[i20];
                int i21 = i17 + 1;
                int i22 = (i21 << 1) + i18;
                double d27 = dArr3[i22];
                double d28 = dArr3[i22 + 1];
                dArr3[i19] = d25 + d27;
                dArr3[i20] = dArr3[i20] + d28;
                ezj.A02(i21, d25 - d27);
                ezj.A01(i21, d26 - d28);
            }
        }
    }

    public static void A0A(EZJ ezj, EZJ[] ezjArr) {
        int i;
        int i2 = ezj.A00;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i2);
        if (iNumberOfLeadingZeros % 2 != 0) {
            for (int i3 = 0; i3 < i2; i3 += 2) {
                int i4 = i3 + 1;
                double[] dArr = ezj.A02;
                int i5 = ezj.A01;
                int i6 = (i4 << 1) + i5;
                double d = dArr[i6];
                double d2 = dArr[i6 + 1];
                int i7 = (i3 << 1) + i5;
                double d3 = dArr[i7];
                int i8 = i7 + 1;
                double d4 = dArr[i8];
                dArr[i7] = d3 + d;
                dArr[i8] = dArr[i8] + d2;
                ezj.A02(i4, d3 - d);
                ezj.A01(i4, d4 - d2);
            }
            i = 2;
        } else {
            i = 1;
        }
        while (i <= iNumberOfLeadingZeros) {
            EZJ ezj2 = ezjArr[i - 1];
            int i9 = 1 << (i + 1);
            for (int i10 = 0; i10 < i2; i10 += i9) {
                int i11 = 0;
                while (true) {
                    int i12 = i9 / 4;
                    int i13 = i11;
                    if (i13 < i12) {
                        double[] dArr2 = ezj2.A02;
                        int i14 = (i13 << 1) + ezj2.A01;
                        double d5 = dArr2[i14];
                        double d6 = dArr2[i14 + 1];
                        double d7 = (d5 * d5) + ((-d6) * d6);
                        double d8 = d5 * 2.0d * d6;
                        int i15 = i10 + i11;
                        int i16 = i12 + i15;
                        int i17 = i15 + (i9 / 2);
                        int i18 = i15 + ((i9 * 3) / 4);
                        double[] dArr3 = ezj.A02;
                        int i19 = ezj.A01;
                        int i20 = (i15 << 1) + i19;
                        double d9 = dArr3[i20];
                        double d10 = dArr3[i20 + 1];
                        int i21 = (i16 << 1) + i19;
                        double d11 = dArr3[i21];
                        double d12 = dArr3[i21 + 1];
                        double d13 = (d11 * d5) + (d6 * (-d12));
                        double d14 = (d11 * d6) + (d12 * d5);
                        int i22 = (i17 << 1) + i19;
                        double d15 = dArr3[i22];
                        double d16 = dArr3[i22 + 1];
                        double d17 = (d15 * d7) + (d8 * (-d16));
                        double d18 = (d15 * d8) + (d16 * d7);
                        int i23 = (i18 << 1) + i19;
                        double d19 = dArr3[i23];
                        double d20 = dArr3[i23 + 1];
                        double d21 = (d19 * d5) + (d20 * d6);
                        double d22 = ((-d19) * d6) + (d20 * d5);
                        ezj.A02(i15, d9 + d13 + d17 + d21);
                        ezj.A01(i15, d10 + d14 + d18 + d22);
                        ezj.A02(i16, ((d9 - d14) - d17) + d22);
                        ezj.A01(i16, ((d10 + d13) - d18) - d21);
                        ezj.A02(i17, ((d9 - d13) + d17) - d21);
                        ezj.A01(i17, ((d10 - d14) + d18) - d22);
                        ezj.A02(i18, ((d9 + d14) - d17) - d22);
                        ezj.A01(i18, ((d10 - d13) - d18) + d21);
                        i11++;
                    }
                }
            }
            i += 2;
        }
        for (int i24 = 0; i24 < i2; i24++) {
            int i25 = (i24 << 1) + ezj.A01;
            int i26 = i25 + 1;
            double[] dArr4 = ezj.A02;
            double d23 = dArr4[i25];
            double d24 = dArr4[i26];
            double dLongBitsToDouble = Double.longBitsToDouble(((-iNumberOfLeadingZeros) + 1023) << 52);
            dArr4[i25] = d23 * dLongBitsToDouble;
            dArr4[i26] = d24 * dLongBitsToDouble;
        }
    }

    public static EZJ[] A0B(int i) {
        EZJ ezjA01;
        EZJ[] ezjArr = new EZJ[i + 1];
        while (i >= 0) {
            if (i < 20) {
                if (A02[i] == null) {
                    A02[i] = A01(1 << i);
                }
                ezjA01 = A02[i];
            } else {
                ezjA01 = A01(1 << i);
            }
            ezjArr[i] = ezjA01;
            i -= 2;
        }
        return ezjArr;
    }

    public static BigInteger A05(BigInteger bigInteger, BigInteger bigInteger2) {
        EZJ ezjA03;
        EZJ ezjA02;
        EZJ ezjA032;
        EZJ ezjA022;
        if (bigInteger2.signum() != 0 && bigInteger.signum() != 0) {
            if (bigInteger2 != bigInteger) {
                int iBitLength = bigInteger.bitLength();
                int iBitLength2 = bigInteger2.bitLength();
                if (iBitLength + iBitLength2 > 2147483648L) {
                    throw new ArithmeticException("BigInteger would overflow supported range");
                }
                if (iBitLength <= 1920 || iBitLength2 <= 1920 || (iBitLength <= 33220 && iBitLength2 <= 33220)) {
                    return bigInteger.multiply(bigInteger2);
                }
                int iSignum = bigInteger.signum() * bigInteger2.signum();
                if (bigInteger.signum() < 0) {
                    bigInteger = bigInteger.negate();
                }
                byte[] byteArray = bigInteger.toByteArray();
                if (bigInteger2.signum() < 0) {
                    bigInteger2 = bigInteger2.negate();
                }
                byte[] byteArray2 = bigInteger2.toByteArray();
                int iMax = Math.max(byteArray.length, byteArray2.length) * 8;
                int iA00 = A00(iMax);
                int i = ((iMax + iA00) - 1) / iA00;
                int i2 = i + 1;
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                int i3 = 32 - iNumberOfLeadingZeros;
                int i4 = 1 << i3;
                int i5 = (i4 * 3) / 4;
                if (i2 >= i5 || i3 <= 3) {
                    EZJ[] ezjArrA0B = A0B(i3);
                    ezjA03 = A03(byteArray, i4, iA00);
                    ezjA03.A04(ezjArrA0B[i3]);
                    A09(ezjA03, ezjArrA0B);
                    EZJ ezjA033 = A03(byteArray2, i4, iA00);
                    ezjA02 = ezjArrA0B[i3];
                    ezjA033.A04(ezjA02);
                    A09(ezjA033, ezjArrA0B);
                    ezjA03.A05(ezjA033);
                    A0A(ezjA03, ezjArrA0B);
                } else {
                    int i6 = 30 - iNumberOfLeadingZeros;
                    EZJ[] ezjArrA0B2 = A0B(i6);
                    ezjA02 = A02(i6);
                    EZJ ezjA023 = A02(28 - iNumberOfLeadingZeros);
                    ezjA03 = A03(byteArray, i5, iA00);
                    ezjA03.A04(ezjA02);
                    A07(ezjA03, ezjA023, ezjArrA0B2);
                    EZJ ezjA034 = A03(byteArray2, i5, iA00);
                    ezjA034.A04(ezjA02);
                    A07(ezjA034, ezjA023, ezjArrA0B2);
                    ezjA03.A05(ezjA034);
                    A08(ezjA03, ezjA023, ezjArrA0B2);
                }
                ezjA03.A03(ezjA02);
                return A04(ezjA03, iSignum, iA00);
            }
            if (bigInteger2.signum() != 0) {
                if (bigInteger2.bitLength() < 33220) {
                    return bigInteger2.multiply(bigInteger2);
                }
                byte[] byteArray3 = bigInteger2.toByteArray();
                int length = byteArray3.length * 8;
                int iA002 = A00(length);
                int i7 = ((length + iA002) - 1) / iA002;
                int i8 = i7 + 1;
                int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i7);
                int i9 = 32 - iNumberOfLeadingZeros2;
                int i10 = 1 << i9;
                int i11 = (i10 * 3) / 4;
                if (i8 < i11) {
                    ezjA032 = A03(byteArray3, i11, iA002);
                    int i12 = 30 - iNumberOfLeadingZeros2;
                    EZJ[] ezjArrA0B3 = A0B(i12);
                    ezjA022 = A02(i12);
                    EZJ ezjA024 = A02(28 - iNumberOfLeadingZeros2);
                    ezjA032.A04(ezjA022);
                    A07(ezjA032, ezjA024, ezjArrA0B3);
                    ezjA032.A00();
                    A08(ezjA032, ezjA024, ezjArrA0B3);
                } else {
                    ezjA032 = A03(byteArray3, i10, iA002);
                    EZJ[] ezjArrA0B4 = A0B(i9);
                    ezjA022 = ezjArrA0B4[i9];
                    ezjA032.A04(ezjA022);
                    A09(ezjA032, ezjArrA0B4);
                    ezjA032.A00();
                    A0A(ezjA032, ezjArrA0B4);
                }
                ezjA032.A03(ezjA022);
                return A04(ezjA032, 1, iA002);
            }
        }
        return BigInteger.ZERO;
    }
}

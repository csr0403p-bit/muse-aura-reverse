package X;

/* loaded from: classes5.dex */
public abstract class Esv {
    public static final float[] A00 = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};

    public static float A00(int i, int i2, long j, boolean z, boolean z2) {
        if (j == 0) {
            return z ? -0.0f : 0.0f;
        }
        if (!z2) {
            if (-45 > i || i > 38) {
                return Float.NaN;
            }
            return A02(i, j, z);
        }
        if (-45 > i2 || i2 > 38) {
            return Float.NaN;
        }
        float fA02 = A02(i2, j, z);
        float fA022 = A02(i2, j + 1, z);
        if (Float.isNaN(fA02) || fA022 != fA02) {
            return Float.NaN;
        }
        return fA02;
    }

    public static float A01(int i, int i2, long j, boolean z, boolean z2) {
        if (z2) {
            i = i2;
        }
        if (-126 > i || i > 127) {
            return Float.NaN;
        }
        float fIntBitsToFloat = (j + (j < 0 ? 1.8446744E19f : 0.0f)) * Float.intBitsToFloat((i + 127) << 23);
        return z ? -fIntBitsToFloat : fIntBitsToFloat;
    }

    public static float A02(int i, long j, boolean z) {
        if (-10 <= i && i <= 10 && BMp.A01(j, 16777215L) <= 0) {
            float f = j;
            float[] fArr = A00;
            float f2 = i < 0 ? f / fArr[-i] : f * fArr[i];
            return z ? -f2 : f2;
        }
        long j2 = Esw.A00[i + 325];
        long j3 = ((i * 217706) >> 16) + 191;
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j);
        long jA01 = BV9.A01(j, j2, iNumberOfLeadingZeros);
        long j4 = jA01 >>> 63;
        long j5 = jA01 >>> ((int) (38 + j4));
        int i2 = iNumberOfLeadingZeros + ((int) (j4 ^ 1));
        long j6 = jA01 & 274877906943L;
        if (j6 != 274877906943L) {
            if (j6 != 0 || (3 & j5) != 1) {
                long j7 = (j5 + 1) >>> 1;
                if (j7 >= 16777216) {
                    i2--;
                    j7 = 8388608;
                }
                long j8 = j7 & (-8388609);
                long j9 = j3 - i2;
                if (j9 >= 1 && j9 <= 254) {
                    return Float.intBitsToFloat((int) (j8 | (j9 << 23) | (z ? 2147483648L : 0L)));
                }
            }
        }
        return Float.NaN;
    }
}

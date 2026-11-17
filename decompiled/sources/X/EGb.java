package X;

import android.graphics.Color;

/* loaded from: classes5.dex */
public abstract class EGb {
    public static final ThreadLocal<double[]> A00 = new ThreadLocal<>();

    public static int A06(float[] fArr) {
        int iRound;
        float f;
        float f2;
        int iRound2;
        float f3;
        float f4;
        float f5;
        int iRound3;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float fA01 = (1.0f - C8j3.A01(f8 * 2.0f, 1.0f)) * f7;
        float f9 = f8 - (0.5f * fA01);
        float fA012 = (1.0f - C8j3.A01((f6 / 60.0f) % 2.0f, 1.0f)) * fA01;
        switch (((int) f6) / 60) {
            case 0:
                iRound = Math.round((fA01 + f9) * 255.0f);
                f5 = fA012 + f9;
                iRound2 = Math.round(f5 * 255.0f);
                f4 = f9 * 255.0f;
                iRound3 = Math.round(f4);
                break;
            case 1:
                iRound = Math.round((fA012 + f9) * 255.0f);
                f5 = fA01 + f9;
                iRound2 = Math.round(f5 * 255.0f);
                f4 = f9 * 255.0f;
                iRound3 = Math.round(f4);
                break;
            case 2:
                iRound = Math.round(f9 * 255.0f);
                f = (fA01 + f9) * 255.0f;
                iRound2 = Math.round(f);
                f3 = fA012 + f9;
                f4 = f3 * 255.0f;
                iRound3 = Math.round(f4);
                break;
            case 3:
                iRound = Math.round(f9 * 255.0f);
                f2 = (fA012 + f9) * 255.0f;
                iRound2 = Math.round(f2);
                f3 = fA01 + f9;
                f4 = f3 * 255.0f;
                iRound3 = Math.round(f4);
                break;
            case 4:
                iRound = Math.round((fA012 + f9) * 255.0f);
                f2 = f9 * 255.0f;
                iRound2 = Math.round(f2);
                f3 = fA01 + f9;
                f4 = f3 * 255.0f;
                iRound3 = Math.round(f4);
                break;
            case 5:
            case 6:
                iRound = Math.round((fA01 + f9) * 255.0f);
                f = f9 * 255.0f;
                iRound2 = Math.round(f);
                f3 = fA012 + f9;
                f4 = f3 * 255.0f;
                iRound3 = Math.round(f4);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(iRound >= 0 ? Math.min(iRound, 255) : 0, iRound2 >= 0 ? Math.min(iRound2, 255) : 0, iRound3 >= 0 ? Math.min(iRound3, 255) : 0);
    }

    public static void A07(int i, int i2, float[] fArr, int i3) {
        float f;
        float fA01;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float fMax = Math.max(f2, Math.max(f3, f4));
        float fMin = Math.min(f2, Math.min(f3, f4));
        float f5 = fMax - fMin;
        float f6 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f = 0.0f;
            fA01 = 0.0f;
        } else {
            f = fMax == f2 ? ((f3 - f4) / f5) % 6.0f : fMax == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            fA01 = f5 / (1.0f - C8j3.A01(2.0f * f6, 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 >= 0.0f ? Math.min(f7, 360.0f) : 0.0f;
        fArr[1] = fA01 >= 0.0f ? Math.min(fA01, 1.0f) : 0.0f;
        fArr[2] = f6 >= 0.0f ? Math.min(f6, 1.0f) : 0.0f;
    }

    public static double A00(int i) {
        ThreadLocal<double[]> threadLocal = A00;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw C60O.A0i("outXyz must have a length of 3.");
        }
        double d = iRed / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = iGreen / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = iBlue / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
        return dArr[1] / 100.0d;
    }

    public static int A05(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw C60O.A0i("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static double A01(int i, int i2) {
        if (Color.alpha(i2) != 255) {
            throw C60Q.A0U("background can not be translucent: #", Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = A04(i, i2);
        }
        double dA00 = A00(i) + 0.05d;
        double dA002 = A00(i2) + 0.05d;
        return Math.max(dA00, dA002) / Math.min(dA00, dA002);
    }

    public static int A03(float f, int i, int i2) {
        int i3 = 255;
        if (Color.alpha(i2) != 255) {
            throw C60Q.A0U("background can not be translucent: #", Integer.toHexString(i2));
        }
        double d = f;
        if (A01(A05(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        int i5 = 0;
        do {
            int i6 = (i5 + i3) / 2;
            if (A01(A05(i, i6), i2) < d) {
                i5 = i6;
            } else {
                i3 = i6;
            }
            i4++;
            if (i4 > 10) {
                return i3;
            }
        } while (i3 - i5 > 1);
        return i3;
    }

    public static int A04(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - iAlpha2;
        int i4 = 255 - (((255 - iAlpha) * i3) / 255);
        return Color.argb(i4, i4 == 0 ? 0 : (((Color.red(i) * 255) * iAlpha2) + ((Color.red(i2) * iAlpha) * i3)) / (i4 * 255), i4 == 0 ? 0 : (((Color.green(i) * 255) * iAlpha2) + ((Color.green(i2) * iAlpha) * i3)) / (i4 * 255), i4 == 0 ? 0 : (((Color.blue(i) * 255) * iAlpha2) + ((Color.blue(i2) * iAlpha) * i3)) / (i4 * 255));
    }

    public static int A02(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        double dPow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double dPow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double dPow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int iA0G = (int) BV6.A0G(dPow, 255.0d);
        int iMin = iA0G >= 0 ? Math.min(iA0G, 255) : 0;
        int iA0G2 = (int) BV6.A0G(dPow2, 255.0d);
        int iMin2 = iA0G2 >= 0 ? Math.min(iA0G2, 255) : 0;
        int iA0G3 = (int) BV6.A0G(dPow3, 255.0d);
        return Color.rgb(iMin, iMin2, iA0G3 >= 0 ? Math.min(iA0G3, 255) : 0);
    }
}

package X;

import android.graphics.Color;

/* loaded from: classes5.dex */
public final class EGY {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public static EGY A02(int i) {
        float[] fArr = new float[7];
        EGZ egz = EGZ.A0A;
        float fA00 = EGa.A00(Color.red(i));
        float fA002 = EGa.A00(Color.green(i));
        float fA003 = EGa.A00(Color.blue(i));
        float[][] fArr2 = EGa.A02;
        float[] fArr3 = fArr2[0];
        float[] fArr4 = fArr2[1];
        float[] fArr5 = fArr2[2];
        float f = (fA00 * fArr5[0]) + (fA002 * fArr5[1]) + (fA003 * fArr5[2]);
        float[] fArr6 = {(fArr3[0] * fA00) + (fArr3[1] * fA002) + (fArr3[2] * fA003), (fArr4[0] * fA00) + (fArr4[1] * fA002) + (fArr4[2] * fA003), f};
        float[][] fArr7 = EGa.A03;
        float f2 = fArr6[0];
        float[] fArr8 = fArr7[0];
        float f3 = fArr8[0] * f2;
        float f4 = fArr6[1];
        float f5 = f3 + (fArr8[1] * f4) + (fArr8[2] * f);
        float[] fArr9 = fArr7[1];
        float f6 = (fArr9[0] * f2) + (fArr9[1] * f4) + (fArr9[2] * f);
        float[] fArr10 = fArr7[2];
        float f7 = (f2 * fArr10[0]) + (f4 * fArr10[1]) + (f * fArr10[2]);
        float[] fArr11 = egz.A09;
        float f8 = fArr11[0] * f5;
        float f9 = fArr11[1] * f6;
        float f10 = fArr11[2] * f7;
        float f11 = egz.A02;
        float fPow = (float) Math.pow((Math.abs(f8) * f11) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((f11 * Math.abs(f10)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f12 = ((float) (((fSignum * 11.0d) + (fSignum2 * (-12.0d))) + d)) / 11.0f;
        float f13 = ((float) ((fSignum + fSignum2) - (d * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = (((fSignum * 20.0f) + f14) + (21.0f * fSignum3)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = (3.1415927f * fAtan2) / 180.0f;
        float f18 = f16 * egz.A05;
        float f19 = egz.A00;
        float f20 = egz.A01;
        float fPow4 = ((float) Math.pow(f18 / f19, egz.A08 * f20)) * 100.0f;
        float fSqrt = (4.0f / f20) * ((float) Math.sqrt(fPow4 / 100.0f)) * (f19 + 4.0f);
        float f21 = egz.A03;
        float f22 = fSqrt * f21;
        float fSqrt2 = ((float) Math.sqrt(fPow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, egz.A04), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * egz.A06) * egz.A07) * ((float) Math.sqrt((f12 * f12) + (f13 * f13)))) / (f15 + 0.305f), 0.9d));
        float fSqrt3 = ((float) Math.sqrt((r7 * f20) / r12)) * 50.0f;
        float fLog = ((float) Math.log((0.0228f * r14) + 1.0f)) * 43.85965f;
        double d2 = f17;
        float fCos = ((float) Math.cos(d2)) * fLog;
        float fSin = fLog * ((float) Math.sin(d2));
        fArr6[0] = fAtan2;
        fArr6[1] = fSqrt2;
        fArr[0] = fPow4;
        fArr[1] = f22;
        fArr[2] = f21 * fSqrt2;
        fArr[3] = fSqrt3;
        fArr[4] = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        fArr[5] = fCos;
        fArr[6] = fSin;
        return new EGY(fArr6[0], fArr6[1], fArr[0], fArr[4], fArr[5], fSin);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.EGY r17, X.EGZ r18) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EGY.A00(X.EGY, X.EGZ):int");
    }

    public static EGY A01(float f, float f2, float f3) {
        float fLog = ((float) Math.log((EGZ.A0A.A03 * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new EGY(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), ((float) Math.cos(d)) * fLog, fLog * ((float) Math.sin(d)));
    }

    public EGY(float f, float f2, float f3, float f4, float f5, float f6) {
        this.A03 = f;
        this.A02 = f2;
        this.A04 = f3;
        this.A05 = f4;
        this.A00 = f5;
        this.A01 = f6;
    }
}

package X;

/* loaded from: classes5.dex */
public final class EGZ {
    public static final EGZ A0A;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float[] A09;

    static {
        float f;
        float f2;
        float f3;
        float[] fArr = EGa.A00;
        float fPow = ((float) Math.pow((50.0d + 16.0d) / 116.0d, 3.0d)) * 100.0f;
        float f4 = (float) ((fPow * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = EGa.A03;
        float f5 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f6 = fArr3[0] * f5;
        float f7 = fArr[1];
        float f8 = f6 + (fArr3[1] * f7);
        float f9 = fArr[2];
        float f10 = f8 + (fArr3[2] * f9);
        float[] fArr4 = fArr2[1];
        float f11 = (fArr4[0] * f5) + (fArr4[1] * f7) + (fArr4[2] * f9);
        float[] fArr5 = fArr2[2];
        float f12 = (f5 * fArr5[0]) + (f7 * fArr5[1]) + (f9 * fArr5[2]);
        float f13 = (2.0f / 10.0f) + 0.8f;
        if (f13 >= 0.9d) {
            f = (f13 - 0.9f) * 10.0f;
            f2 = 0.59f;
            f3 = 0.69f;
        } else {
            f = (f13 - 0.8f) * 10.0f;
            f2 = 0.525f;
            f3 = 0.59f;
        }
        float f14 = f2 + ((f3 - f2) * f);
        float fExp = (1.0f - (((float) Math.exp(((-f4) - 42.0f) / 92.0f)) * 0.2777778f)) * f13;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float f15 = 1.0f / ((5.0f * f4) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float fCbrt = (f16 * f4) + (0.1f * f17 * f17 * ((float) Math.cbrt(f4 * 5.0d)));
        float f18 = fPow / fArr[1];
        double d2 = f18;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow2 = 0.725f / ((float) Math.pow(d2, 0.2d));
        float fPow3 = (float) Math.pow(((r8[0] * fCbrt) * f10) / 100.0d, 0.42d);
        float fPow4 = (float) Math.pow(((r8[1] * fCbrt) * f11) / 100.0d, 0.42d);
        float fPow5 = (float) Math.pow(((r6 * fCbrt) * f12) / 100.0d, 0.42d);
        float[] fArr6 = {fPow3, fPow4, fPow5};
        float f19 = fArr6[0];
        float f20 = fArr6[1];
        float f21 = (400.0f * fPow5) / (fPow5 + 27.13f);
        float[] fArr7 = {(f19 * 400.0f) / (f19 + 27.13f), (f20 * 400.0f) / (f20 + 27.13f), f21};
        A0A = new EGZ(new float[]{(((100.0f / f10) * fExp) + 1.0f) - fExp, (((100.0f / f11) * fExp) + 1.0f) - fExp, (((100.0f / f12) * fExp) + 1.0f) - fExp}, f18, ((fArr7[0] * 2.0f) + fArr7[1] + (f21 * 0.05f)) * fPow2, fPow2, fPow2, f14, f13, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public EGZ(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.A04 = f;
        this.A00 = f2;
        this.A05 = f3;
        this.A07 = f4;
        this.A01 = f5;
        this.A06 = f6;
        this.A09 = fArr;
        this.A02 = f7;
        this.A03 = f8;
        this.A08 = f9;
    }
}

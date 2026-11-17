package X;

/* loaded from: classes6.dex */
public abstract class HDm {
    public static final void A00(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = AbstractC7607F5u.A06(fArr, f3, AbstractC7607F5u.A07(fArr, f, f2, 0, 3), 6);
        fArr2[1] = AbstractC7607F5u.A04(fArr, f, f2, f3);
        fArr2[2] = AbstractC7607F5u.A05(fArr, f, f2, f3);
    }

    public static final boolean A01(C9193G4w c9193G4w, C9193G4w c9193G4w2) {
        return c9193G4w == c9193G4w2 || (Math.abs(c9193G4w.A00 - c9193G4w2.A00) < 0.001f && Math.abs(c9193G4w.A01 - c9193G4w2.A01) < 0.001f);
    }

    public static final float[] A02(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] A03(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length >= 9 && fArr2.length >= 9) {
            float f = fArr[0] * fArr2[0];
            float f2 = fArr[3];
            float f3 = fArr2[1];
            float f4 = fArr[6];
            float f5 = fArr2[2];
            fArr3[0] = f + (f2 * f3) + (f4 * f5);
            float f6 = fArr[1];
            float f7 = fArr2[0];
            float f8 = fArr[4];
            float f9 = fArr[7];
            fArr3[1] = (f6 * f7) + (f3 * f8) + (f9 * f5);
            float f10 = fArr[2] * f7;
            float f11 = fArr[5];
            float fA06 = AbstractC7607F5u.A06(fArr2, f11, f10, 1);
            float f12 = fArr[8];
            fArr3[2] = fA06 + (f5 * f12);
            float f13 = fArr[0];
            float f14 = fArr2[3] * f13;
            float f15 = fArr2[4];
            float f16 = fArr2[5];
            fArr3[3] = f14 + (f2 * f15) + (f4 * f16);
            float f17 = fArr[1];
            float f18 = fArr2[3];
            fArr3[4] = C8j3.A03(f17, f18, f8, f15) + (f9 * f16);
            float f19 = fArr[2];
            fArr3[5] = (f18 * f19) + (f11 * fArr2[4]) + (f16 * f12);
            float f20 = f13 * fArr2[6];
            float f21 = fArr[3];
            float f22 = fArr2[7];
            float f23 = fArr2[8];
            fArr3[6] = f20 + (f21 * f22) + (f4 * f23);
            float f24 = fArr2[6];
            fArr3[7] = AbstractC7607F5u.A06(fArr, f22, f17 * f24, 4) + (f9 * f23);
            fArr3[8] = (f19 * f24) + (fArr[5] * fArr2[7]) + (f12 * f23);
        }
        return fArr3;
    }

    public static final float[] A04(float[] fArr, float[] fArr2, float[] fArr3) {
        A00(fArr, fArr2);
        A00(fArr, fArr3);
        float f = fArr3[0] / fArr2[0];
        float f2 = fArr3[1] / fArr2[1];
        float f3 = fArr3[2] / fArr2[2];
        float[] fArrA1Z = AbstractC7607F5u.A1Z(f, f2, 3);
        fArrA1Z[2] = f3;
        float[] fArrA02 = A02(fArr);
        float f4 = fArrA1Z[0];
        float f5 = fArr[0] * f4;
        float f6 = fArrA1Z[1];
        float f7 = fArr[1] * f6;
        float f8 = fArrA1Z[2];
        float f9 = fArr[2] * f8;
        float f10 = fArr[3] * f4;
        float f11 = fArr[4] * f6;
        float f12 = fArr[5] * f8;
        float f13 = f4 * fArr[6];
        float f14 = f6 * fArr[7];
        float f15 = f8 * fArr[8];
        float[] fArrA1Z2 = AbstractC7607F5u.A1Z(f5, f7, 9);
        fArrA1Z2[2] = f9;
        fArrA1Z2[3] = f10;
        fArrA1Z2[4] = f11;
        fArrA1Z2[5] = f12;
        fArrA1Z2[6] = f13;
        fArrA1Z2[7] = f14;
        fArrA1Z2[8] = f15;
        return A03(fArrA02, fArrA1Z2);
    }
}

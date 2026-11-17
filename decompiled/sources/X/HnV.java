package X;

/* loaded from: classes6.dex */
public final class HnV implements C28s {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public static final int A00(float[] fArr, float f, int i) {
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = f;
            if (f > 1.0f) {
                f2 = 1.0f;
            }
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HnV) {
            HnV hnV = (HnV) obj;
            if (this.A00 == hnV.A00 && this.A01 == hnV.A01 && this.A02 == hnV.A02 && this.A03 == hnV.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A00), this.A01), this.A02), this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CubicBezierEasing(a=");
        sbA0x.append(this.A00);
        sbA0x.append(", b=");
        sbA0x.append(this.A01);
        sbA0x.append(", c=");
        sbA0x.append(this.A02);
        sbA0x.append(", d=");
        sbA0x.append(this.A03);
        return AnonymousClass006.A0z(sbA0x);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6 A[PHI: r16
  0x00c6: PHI (r16v2 float) = (r16v1 float), (r16v3 float) binds: [B:15:0x0072, B:17:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    @Override // X.C28s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float transform(float r27) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HnV.transform(float):float");
    }

    public HnV(float f, float f2, float f3, float f4) {
        int iA00;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            StringBuilder sb = new StringBuilder("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ");
            sb.append(f);
            sb.append(", ");
            sb.append(f2);
            sb.append(", ");
            sb.append(f3);
            sb.append(", ");
            sb.append(f4);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iA00 = d2 == d3 ? 0 : A00(fArr, (float) ((d4 - d3) / (d4 - (d3 * 2.0d))), 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iA002 = A00(fArr, (float) ((-(d6 + d7)) / d5), 0);
            iA00 = iA002 + A00(fArr, (float) ((d6 - d7) / d5), iA002);
            if (iA00 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iA00--;
                }
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iA003 = iA00 + A00(fArr, (-f10) / (((f7 - f6) * 2.0f) - f10), iA00);
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iA003; i++) {
            float f11 = fArr[i];
            float f12 = (((((((1.0f + ((f2 - f4) * 3.0f)) - 0.0f) * f11) + (((f4 - (2.0f * f2)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) & 4294967295L) | (Float.floatToRawIntBits(fMin) << 32);
        this.A05 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.A04 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }
}

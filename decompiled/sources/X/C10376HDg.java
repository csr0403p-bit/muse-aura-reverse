package X;

import java.util.Arrays;

/* renamed from: X.HDg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10376HDg extends Hw7 {
    public static final InterfaceC10545Hqy A0E = new C10639I0j(6);
    public final float A00;
    public final float A01;
    public final InterfaceC10545Hqy A02;
    public final InterfaceC10545Hqy A03;
    public final InterfaceC10545Hqy A04;
    public final InterfaceC10545Hqy A05;
    public final HAi A06;
    public final C9193G4w A07;
    public final G0U<Double, Double> A08;
    public final G0U<Double, Double> A09;
    public final float[] A0A;
    public final float[] A0B;
    public final float[] A0C;
    public final boolean A0D;

    public static final float A00(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    @Override // X.Hw7
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C10376HDg c10376HDg = (C10376HDg) obj;
            if (Float.compare(c10376HDg.A01, this.A01) != 0 || Float.compare(c10376HDg.A00, this.A00) != 0 || !this.A07.equals(c10376HDg.A07) || !Arrays.equals(this.A0B, c10376HDg.A0B)) {
                return false;
            }
            HAi hAi = this.A06;
            HAi hAi2 = c10376HDg.A06;
            if (hAi != null) {
                return hAi.equals(hAi2);
            }
            if (hAi2 != null) {
                if (C7384Etj.areEqual(this.A05, c10376HDg.A05)) {
                    return C7384Etj.areEqual(this.A03, c10376HDg.A03);
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01a4, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10376HDg(X.InterfaceC10545Hqy r25, X.InterfaceC10545Hqy r26, X.HAi r27, X.C9193G4w r28, java.lang.String r29, float[] r30, float[] r31, float r32, float r33, int r34) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10376HDg.<init>(X.Hqy, X.Hqy, X.HAi, X.G4w, java.lang.String, float[], float[], float, float, int):void");
    }

    @Override // X.Hw7
    public final float A01(int i) {
        return this.A00;
    }

    @Override // X.Hw7
    public final float A02(int i) {
        return this.A01;
    }

    @Override // X.Hw7
    public final boolean A03() {
        return this.A0D;
    }

    @Override // X.Hw7
    public final int hashCode() {
        int iA0F = (AnonymousClass005.A0F(this.A07, super.hashCode() * 31) + Arrays.hashCode(this.A0B)) * 31;
        float f = this.A01;
        int iFloatToIntBits = (iA0F + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.A00;
        int iFloatToIntBits2 = f2 == 0.0f ? 0 : Float.floatToIntBits(f2);
        HAi hAi = this.A06;
        int iA0E = ((iFloatToIntBits + iFloatToIntBits2) * 31) + C8j4.A0E(hAi, 0);
        if (hAi == null) {
            return AnonymousClass005.A0G(this.A03, AnonymousClass005.A0F(this.A05, iA0E * 31));
        }
        return iA0E;
    }

    public C10376HDg(HAi hAi, C9193G4w c9193G4w, String str, float[] fArr, int i) {
        int i2;
        int i3;
        double d = hAi.A06;
        if (d == -3.0d) {
            i2 = 5;
        } else {
            i2 = 7;
            if (d == -2.0d) {
                i2 = 6;
            }
        }
        C10641I0l c10641I0l = new C10641I0l(hAi, i2);
        if (d == -3.0d) {
            i3 = 2;
        } else {
            i3 = 4;
            if (d == -2.0d) {
                i3 = 3;
            }
        }
        this(c10641I0l, new C10641I0l(hAi, i3), hAi, c9193G4w, str, fArr, null, 0.0f, 1.0f, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10376HDg(C9193G4w c9193G4w, String str, float[] fArr, double d, float f, float f2, int i) {
        InterfaceC10545Hqy c10640I0k;
        InterfaceC10545Hqy c10640I0k2;
        if (d == 1.0d) {
            c10640I0k = A0E;
        } else {
            c10640I0k = new C10640I0k(d, 0);
        }
        if (d == 1.0d) {
            c10640I0k2 = A0E;
        } else {
            c10640I0k2 = new C10640I0k(d, 1);
        }
        this(c10640I0k, c10640I0k2, new HAi(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d), c9193G4w, str, fArr, null, f, f2, i);
    }
}

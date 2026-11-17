package X;

import java.util.Arrays;

/* renamed from: X.2LD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LD {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final C1Z3 A05;
    public final float[] A06;

    public final float A00(int i, int i2) {
        long j = this.A01;
        int i3 = (int) (j >> 32);
        int iMin = Math.min(Math.max(i3, 0), i);
        int i4 = (int) j;
        int iMin2 = Math.min(Math.max(i4, 0), i2);
        long j2 = this.A00;
        int i5 = (((int) (j2 >> 32)) - i3) * (((int) j2) - i4);
        return Math.max((Math.max(Math.min(r8, i), 0) - iMin) * (Math.max(Math.min(r1, i2), 0) - iMin2), 0) / Math.min(i * i2, i5);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C2LD c2ld = (C2LD) obj;
                if (this.A01 == c2ld.A01 && this.A00 == c2ld.A00 && this.A02 == c2ld.A02 && this.A04 == c2ld.A04 && this.A03 == c2ld.A03) {
                    float[] fArr = this.A06;
                    float[] fArr2 = c2ld.A06;
                    if (fArr != null) {
                        if (fArr2 == null || !fArr.equals(fArr2)) {
                            return false;
                        }
                        if (this.A05.equals(c2ld.A05)) {
                        }
                    } else if (fArr2 == null) {
                        if (this.A05.equals(c2ld.A05)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long A01() {
        long j = this.A03;
        long j2 = this.A04;
        int i = ((int) (j >> 32)) - ((int) (j2 >> 32));
        int iA09 = AnonymousClass002.A09(j) - AnonymousClass002.A09(j2);
        long j3 = this.A01;
        return ((((int) (j3 >> 32)) + i) << 32) | ((((int) j3) + iA09) & 4294967295L);
    }

    public final BLU A02() {
        long j = this.A01;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.A00;
        return new BLU(i, i2, (int) (j2 >> 32), (int) j2);
    }

    public final BLU A03() {
        long j = this.A01;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.A00;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.A06;
        if (fArr == null) {
            long j3 = this.A03;
            long j4 = this.A04;
            int i5 = ((int) (j3 >> 32)) - ((int) (j4 >> 32));
            int iA09 = AnonymousClass002.A09(j3) - AnonymousClass002.A09(j4);
            return new BLU(i + i5, i2 + iA09, i3 + i5, i4 + iA09);
        }
        AaC aaC = new AaC(i, i2, i3, i4);
        if (fArr.length >= 16) {
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[3];
            float f4 = fArr[4];
            float f5 = fArr[5];
            float f6 = fArr[7];
            float f7 = fArr[12];
            float f8 = fArr[13];
            float f9 = fArr[15];
            float f10 = aaC.A01;
            float f11 = aaC.A03;
            float f12 = aaC.A02;
            float f13 = aaC.A00;
            float f14 = f3 * f10;
            float f15 = f6 * f11;
            float f16 = 1.0f / ((f14 + f15) + f9);
            if ((Float.floatToRawIntBits(f16) & Integer.MAX_VALUE) >= 2139095040) {
                f16 = 0.0f;
            }
            float f17 = f * f10;
            float f18 = f4 * f11;
            float f19 = f16 * (f17 + f18 + f7);
            float f20 = f10 * f2;
            float f21 = f11 * f5;
            float f22 = f16 * (f20 + f21 + f8);
            float f23 = f6 * f13;
            float f24 = 1.0f / ((f14 + f23) + f9);
            if ((Float.floatToRawIntBits(f24) & Integer.MAX_VALUE) >= 2139095040) {
                f24 = 0.0f;
            }
            float f25 = f4 * f13;
            float f26 = (f17 + f25 + f7) * f24;
            float f27 = f5 * f13;
            float f28 = f24 * (f20 + f27 + f8);
            float f29 = f3 * f12;
            float f30 = 1.0f / ((f15 + f29) + f9);
            if ((Float.floatToRawIntBits(f30) & Integer.MAX_VALUE) >= 2139095040) {
                f30 = 0.0f;
            }
            float f31 = f * f12;
            float f32 = f30 * (f31 + f18 + f7);
            float f33 = f12 * f2;
            float f34 = f30 * (f21 + f33 + f8);
            float f35 = 1.0f / ((f29 + f23) + f9);
            float f36 = (Float.floatToRawIntBits(f35) & Integer.MAX_VALUE) < 2139095040 ? f35 : 0.0f;
            float f37 = (f31 + f25 + f7) * f36;
            float f38 = f36 * (f33 + f27 + f8);
            aaC = new AaC(Math.min(f19, Math.min(f26, Math.min(f32, f37))), Math.min(f22, Math.min(f28, Math.min(f34, f38))), Math.max(f19, Math.max(f26, Math.max(f32, f37))), Math.max(f22, Math.max(f28, Math.max(f34, f38))));
        }
        return C2Un.A02(aaC);
    }

    public final int hashCode() {
        int iA06 = AnonymousClass006.A06(this.A03, AnonymousClass006.A06(this.A04, AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A00, AnonymousClass005.A07(this.A01)))));
        float[] fArr = this.A06;
        return AnonymousClass005.A0G(this.A05, (iA06 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }

    public C2LD(C1Z3 c1z3, float[] fArr, long j, long j2, long j3, long j4, long j5) {
        this.A01 = j;
        this.A00 = j2;
        this.A04 = j3;
        this.A03 = j4;
        this.A02 = j5;
        this.A06 = fArr;
        this.A05 = c1z3;
    }
}

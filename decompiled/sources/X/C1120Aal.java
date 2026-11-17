package X;

import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.util.Arrays;

/* renamed from: X.Aal, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1120Aal {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final boolean A0G;
    public final float[] A0H;

    public C1120Aal(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        boolean z;
        float f7;
        int i2;
        float f8;
        float f9 = f3;
        this.A09 = f;
        this.A0A = f2;
        this.A0C = f9;
        this.A0E = f4;
        this.A0D = f5;
        this.A0F = f6;
        float f10 = f5 - f3;
        float f11 = f6 - f4;
        boolean z2 = true;
        if (i == 1 || (i == 4 ? f11 > 0.0f : !(i != 5 || f11 >= 0.0f))) {
            z = true;
            f7 = -1.0f;
        } else {
            z = false;
            f7 = 1.0f;
        }
        this.A0B = f7;
        float f12 = 1.0f / (f2 - f);
        this.A08 = f12;
        float[] fArr = new float[FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE];
        this.A0H = fArr;
        if (i == 3 || Math.abs(f10) < 0.001f || Math.abs(f11) < 0.001f) {
            float fHypot = (float) Math.hypot(f11, f10);
            this.A00 = fHypot;
            this.A03 = fHypot * f12;
            this.A06 = f10 * f12;
            this.A07 = f11 * f12;
            this.A04 = Float.NaN;
            this.A05 = Float.NaN;
        } else {
            this.A04 = f10 * f7;
            this.A05 = f11 * (-f7);
            this.A06 = z ? f5 : f9;
            this.A07 = z ? f4 : f6;
            float f13 = f4 - f6;
            float[] fArr2 = Aaz.A00;
            float f14 = f13;
            int i3 = 1;
            float fHypot2 = 0.0f;
            float f15 = 0.0f;
            while (true) {
                double d = (float) (((i3 * 90.0d) / 90.0d) * 0.017453292519943295d);
                float fSin = ((float) Math.sin(d)) * f10;
                float fCos = ((float) Math.cos(d)) * f13;
                fHypot2 += (float) Math.hypot(fSin - f15, fCos - f14);
                fArr2[i3] = fHypot2;
                if (i3 == 90) {
                    break;
                }
                i3++;
                f14 = fCos;
                f15 = fSin;
            }
            this.A00 = fHypot2;
            int i4 = 1;
            do {
                fArr2[i4] = fArr2[i4] / fHypot2;
                i2 = i4;
                i4++;
            } while (i2 != 90);
            int i5 = 0;
            do {
                float f16 = i5 / 100.0f;
                int iBinarySearch = Arrays.binarySearch(fArr2, 0, 91, f16);
                if (iBinarySearch >= 0) {
                    f8 = iBinarySearch;
                } else if (iBinarySearch == -1) {
                    fArr[i5] = 0.0f;
                    i5++;
                } else {
                    int i6 = -iBinarySearch;
                    int i7 = i6 - 2;
                    float f17 = fArr2[i7];
                    f8 = i7 + ((f16 - f17) / (fArr2[i6 - 1] - f17));
                }
                fArr[i5] = f8 / 90.0f;
                i5++;
            } while (i5 < 101);
            this.A03 = this.A00 * f12;
            z2 = false;
        }
        this.A0G = z2;
    }

    public final void A00(float f) {
        float f2 = (this.A0B == -1.0f ? this.A0A - f : f - this.A09) * this.A08;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                float f4 = f2 * 100.0f;
                int i = (int) f4;
                float[] fArr = this.A0H;
                float f5 = fArr[i];
                f3 = f5 + ((f4 - i) * (fArr[i + 1] - f5));
            }
        }
        double d = f3 * 1.5707964f;
        this.A02 = (float) Math.sin(d);
        this.A01 = (float) Math.cos(d);
    }
}

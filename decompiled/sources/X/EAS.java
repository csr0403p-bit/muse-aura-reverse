package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EAS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public static short[] A04(EAS eas, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = eas.A0G;
        int i4 = length / i3;
        return i + i2 > i4 ? Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3) : sArr;
    }

    private int A00(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.A0G;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.A02 = i6 / i7;
        this.A01 = i8 / i5;
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.EAS r24) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAS.A01(X.EAS):void");
    }

    private void A02(short[] sArr, int i, int i2) {
        short[] sArrA04 = A04(this, this.A0B, this.A05, i2);
        this.A0B = sArrA04;
        int i3 = this.A0G;
        System.arraycopy(sArr, i * i3, sArrA04, this.A05 * i3, i3 * i2);
        this.A05 += i2;
    }

    private void A03(short[] sArr, int i, int i2) {
        int i3 = this.A0J / i2;
        int i4 = this.A0G;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.A0L[i7] = (short) (i8 / i5);
        }
    }

    public EAS(float f, float f2, int i, int i2, int i3) {
        this.A0H = i;
        this.A0G = i2;
        this.A0F = f;
        this.A0D = f2;
        this.A0E = i / i3;
        this.A0K = i / 400;
        int i4 = i / 65;
        this.A0I = i4;
        int i5 = i4 * 2;
        this.A0J = i5;
        this.A0L = new short[i5];
        int i6 = i5 * i2;
        this.A0A = new short[i6];
        this.A0B = new short[i6];
        this.A0C = new short[i6];
    }
}

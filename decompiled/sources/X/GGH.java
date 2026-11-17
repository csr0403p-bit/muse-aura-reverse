package X;

import java.io.OutputStream;

/* loaded from: classes6.dex */
public final class GGH extends GGI {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;
    public final OutputStream A04;

    public static void A00(GGH ggh) {
        ggh.A04.write(ggh.A03, 0, ggh.A00);
        ggh.A00 = 0;
    }

    public static void A01(GGH ggh, int i) {
        if (ggh.A02 - ggh.A00 < i) {
            A00(ggh);
        }
    }

    public static final void A02(GGH ggh, byte[] bArr, int i, int i2) {
        int i3 = ggh.A02;
        int i4 = ggh.A00;
        int i5 = i3 - i4;
        byte[] bArr2 = ggh.A03;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i4, i2);
            ggh.A00 += i2;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i5);
            int i6 = i + i5;
            i2 -= i5;
            ggh.A00 = i3;
            ggh.A01 += i5;
            A00(ggh);
            if (i2 <= i3) {
                System.arraycopy(bArr, i6, bArr2, 0, i2);
                ggh.A00 = i2;
            } else {
                ggh.A04.write(bArr, i6, i2);
            }
        }
        ggh.A01 += i2;
    }

    public final void A0E(int i) {
        byte[] bArr = this.A03;
        int i2 = this.A00;
        int i3 = i2 + 1;
        this.A00 = i3;
        BV5.A1C(i, bArr, i2);
        int i4 = i2 + 2;
        this.A00 = i4;
        BV5.A1C(i >> 8, bArr, i3);
        int i5 = i2 + 3;
        this.A00 = i5;
        BV5.A1C(i >> 16, bArr, i4);
        this.A00 = i2 + 4;
        BV5.A1C(i >> 24, bArr, i5);
        this.A01 += 4;
    }

    public final void A0F(int i) {
        byte[] bArr;
        int i2;
        int i3;
        byte[] bArr2;
        long j;
        if (GGI.A02) {
            long j2 = this.A00;
            while (true) {
                int i4 = i & (-128);
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j = i5;
                if (i4 == 0) {
                    break;
                }
                C9400GHp.A07(bArr2, (byte) ((i & 127) | 128), j);
                i >>>= 7;
            }
            C9400GHp.A07(bArr2, (byte) i, j);
            i3 = this.A01 + ((int) (this.A00 - j2));
        } else {
            while (true) {
                int i6 = i & (-128);
                bArr = this.A03;
                i2 = this.A00;
                this.A00 = i2 + 1;
                if (i6 == 0) {
                    break;
                }
                bArr[i2] = (byte) ((i & 127) | 128);
                this.A01++;
                i >>>= 7;
            }
            bArr[i2] = (byte) i;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public final void A0G(long j) {
        byte[] bArr = this.A03;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.A00 = i3;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i + 3;
        this.A00 = i4;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i + 4;
        this.A00 = i5;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i + 5;
        this.A00 = i6;
        AbstractC7609F5w.A15(j, bArr, 32, i5);
        int i7 = i + 6;
        this.A00 = i7;
        AbstractC7609F5w.A15(j, bArr, 40, i6);
        int i8 = i + 7;
        this.A00 = i8;
        AbstractC7609F5w.A15(j, bArr, 48, i7);
        this.A00 = i + 8;
        AbstractC7609F5w.A15(j, bArr, 56, i8);
        this.A01 += 8;
    }

    public final void A0H(long j) {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        byte[] bArr2;
        long j2;
        int i4;
        if (GGI.A02) {
            long j3 = this.A00;
            while (true) {
                long j4 = j & (-128);
                bArr2 = this.A03;
                int i5 = this.A00;
                this.A00 = i5 + 1;
                j2 = i5;
                i4 = (int) j;
                if (j4 == 0) {
                    break;
                }
                C9400GHp.A07(bArr2, (byte) ((i4 & 127) | 128), j2);
                j >>>= 7;
            }
            C9400GHp.A07(bArr2, (byte) i4, j2);
            i3 = this.A01 + ((int) (this.A00 - j3));
        } else {
            while (true) {
                long j5 = j & (-128);
                bArr = this.A03;
                i = this.A00;
                this.A00 = i + 1;
                i2 = (int) j;
                if (j5 == 0) {
                    break;
                }
                bArr[i] = (byte) ((i2 & 127) | 128);
                this.A01++;
                j >>>= 7;
            }
            bArr[i] = (byte) i2;
            i3 = this.A01 + 1;
        }
        this.A01 = i3;
    }

    public GGH(OutputStream outputStream, int i) {
        if (i < 0) {
            throw C60O.A0i("bufferSize must be >= 0");
        }
        int iMax = Math.max(i, 20);
        this.A03 = new byte[iMax];
        this.A02 = iMax;
        if (outputStream == null) {
            throw BV4.A0a("out");
        }
        this.A04 = outputStream;
    }
}

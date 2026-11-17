package X;

import androidx.media3.common.util.Util;

/* renamed from: X.E1q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6340E1q {
    public int A00;
    public int A01;
    public int A02;
    public byte[] A03;

    public C6340E1q(byte[] bArr) {
        int length = bArr.length;
        this.A03 = bArr;
        this.A01 = length;
    }

    public final int A08(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (i2 > 8) {
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            this.A02 = i4 + 1;
            i3 |= (bArr[i4] & 255) << i2;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + 1;
        }
        A03(this);
        return i6;
    }

    public final void A0F(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.A03;
            int i4 = this.A02;
            int i5 = i4 + 1;
            this.A02 = i5;
            byte b = bArr2[i4];
            int i6 = this.A00;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            BV6.A0x((255 & bArr2[i5]) >> (8 - i6), bArr, b2, i3);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.A00;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.A03;
                int i9 = this.A02;
                this.A02 = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
                this.A00 = i8;
            }
            int i10 = i8 + i7;
            this.A00 = i10;
            byte[] bArr4 = this.A03;
            int i11 = this.A02;
            BV6.A0x((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7)), bArr, b3, i2);
            if (i10 == 8) {
                this.A00 = 0;
                this.A02 = i11 + 1;
            }
            A03(this);
        }
    }

    public final void A0G(byte[] bArr, int i) {
        C1G.A08(AnonymousClass002.A1M(this.A00));
        System.arraycopy(this.A03, this.A02, bArr, 0, i);
        this.A02 += i;
        A03(this);
    }

    public static long A02(C6340E1q c6340E1q, long j) {
        c6340E1q.A0C(1);
        long jA08 = j | (c6340E1q.A08(15) << 15) | c6340E1q.A08(15);
        c6340E1q.A0C(1);
        return jA08;
    }

    public static void A03(C6340E1q c6340E1q) {
        int i;
        int i2 = c6340E1q.A02;
        C1G.A08(i2 >= 0 && (i2 < (i = c6340E1q.A01) || (i2 == i && c6340E1q.A00 == 0)));
    }

    public final int A06() {
        return ((this.A01 - this.A02) * 8) - this.A00;
    }

    public final int A07() {
        C1G.A08(AnonymousClass002.A1M(this.A00));
        return this.A02;
    }

    public final void A09() {
        if (this.A00 != 0) {
            this.A00 = 0;
            this.A02++;
            A03(this);
        }
    }

    public final void A0A() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            this.A02++;
        }
        A03(this);
    }

    public final void A0B(int i) {
        int i2 = i / 8;
        this.A02 = i2;
        this.A00 = i - (i2 * 8);
        A03(this);
    }

    public final void A0C(int i) {
        int i2 = i / 8;
        int i3 = this.A02 + i2;
        this.A02 = i3;
        int i4 = this.A00 + (i - (i2 * 8));
        this.A00 = i4;
        if (i4 > 7) {
            this.A02 = i3 + 1;
            this.A00 = i4 - 8;
        }
        A03(this);
    }

    public final void A0D(int i) {
        C1G.A08(AnonymousClass002.A1M(this.A00));
        this.A02 += i;
        A03(this);
    }

    public final void A0E(E1P e1p) {
        A0H(e1p.A02, e1p.A00);
        A0B(e1p.A01 * 8);
    }

    public final void A0H(byte[] bArr, int i) {
        this.A03 = bArr;
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = i;
    }

    public final boolean A0I() {
        boolean zA1L = AnonymousClass002.A1L(this.A03[this.A02] & (128 >> this.A00));
        A0A();
        return zA1L;
    }

    public static int A00(C6340E1q c6340E1q, int i) {
        return c6340E1q.A08(i) + 1;
    }

    public static int A01(C6340E1q c6340E1q, int i, int i2) {
        c6340E1q.A0C(i);
        return c6340E1q.A08(i2);
    }

    public static void A04(C6340E1q c6340E1q, int i) {
        if (c6340E1q.A0I()) {
            c6340E1q.A0C(i);
        }
    }

    public static boolean A05(C6340E1q c6340E1q, int i) {
        c6340E1q.A0C(i);
        return c6340E1q.A0I();
    }

    public C6340E1q() {
        this.A03 = Util.A07;
    }
}

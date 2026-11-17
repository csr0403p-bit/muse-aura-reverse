package X;

/* loaded from: classes5.dex */
public final class E4H {
    public int A00 = 0;
    public int A01;
    public int A02;
    public byte[] A03;

    public static int A00(E4H e4h) {
        int i = 0;
        while (!e4h.A06()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? e4h.A03(i) : 0);
    }

    private boolean A02(int i) {
        if (2 > i || i >= this.A01) {
            return false;
        }
        byte[] bArr = this.A03;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public static void A01(E4H e4h) {
        int i;
        int i2 = e4h.A02;
        C1G.A08(i2 >= 0 && (i2 < (i = e4h.A01) || (i2 == i && e4h.A00 == 0)));
    }

    public final int A03(int i) {
        int i2 = this.A00 + i;
        this.A00 = i2;
        int i3 = 0;
        while (true) {
            if (i2 <= 8) {
                break;
            }
            i2 -= 8;
            this.A00 = i2;
            byte[] bArr = this.A03;
            int i4 = this.A02;
            i3 |= (bArr[i4] & 255) << i2;
            if (!A02(i4 + 1)) {
                i = 1;
            }
            this.A02 = i4 + i;
        }
        byte[] bArr2 = this.A03;
        int i5 = this.A02;
        int i6 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.A00 = 0;
            this.A02 = i5 + (A02(i5 + 1) ? 2 : 1);
        }
        A01(this);
        return i6;
    }

    public final void A04() {
        int i = this.A00 + 1;
        this.A00 = i;
        if (i == 8) {
            this.A00 = 0;
            int i2 = this.A02;
            this.A02 = i2 + (A02(i2 + 1) ? 2 : 1);
        }
        A01(this);
    }

    public final void A05(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.A02 = i4;
        int i5 = this.A00 + (i - (i3 * 8));
        this.A00 = i5;
        if (i5 > 7) {
            i4++;
            this.A02 = i4;
            this.A00 = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > i4) {
                A01(this);
                return;
            } else if (A02(i2)) {
                i4++;
                this.A02 = i4;
                i2 += 2;
            }
        }
    }

    public final boolean A06() {
        boolean zA1L = AnonymousClass002.A1L(this.A03[this.A02] & (128 >> this.A00));
        A04();
        return zA1L;
    }

    public final boolean A07(int i) {
        int i2 = this.A02;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.A00 + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.A01) {
                break;
            }
            if (A02(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.A01;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public E4H(byte[] bArr, int i, int i2) {
        this.A03 = bArr;
        this.A02 = i;
        this.A01 = i2;
        A01(this);
    }
}

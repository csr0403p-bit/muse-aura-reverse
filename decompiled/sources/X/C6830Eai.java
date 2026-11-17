package X;

/* renamed from: X.Eai, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6830Eai {
    public int A00;
    public int A01;
    public C6830Eai A02;
    public C6830Eai A03;
    public boolean A04;
    public boolean A05;
    public final byte[] A06;

    public final C6830Eai A02() {
        this.A05 = true;
        return new C6830Eai(this.A06, this.A01, this.A00, true);
    }

    public final void A04(C6830Eai c6830Eai, int i) {
        if (!c6830Eai.A04) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = c6830Eai.A00;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c6830Eai.A05) {
                throw new IllegalArgumentException();
            }
            int i4 = c6830Eai.A01;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c6830Eai.A06;
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            i2 = c6830Eai.A00 - c6830Eai.A01;
            c6830Eai.A00 = i2;
            c6830Eai.A01 = 0;
        }
        byte[] bArr2 = this.A06;
        byte[] bArr3 = c6830Eai.A06;
        int i5 = this.A01;
        System.arraycopy(bArr2, i5, bArr3, i2, (i5 + i) - i5);
        c6830Eai.A00 += i;
        this.A01 += i;
    }

    public static void A00(C6818EaW c6818EaW, C6830Eai c6830Eai, int i) {
        if (i == c6830Eai.A00) {
            c6818EaW.A01 = c6830Eai.A01();
            AbstractC6826Eae.A01(c6830Eai);
        }
    }

    public final C6830Eai A01() {
        C6830Eai c6830Eai = this.A02;
        if (c6830Eai == this) {
            c6830Eai = null;
        }
        C6830Eai c6830Eai2 = this.A03;
        C7384Etj.A0X(c6830Eai2);
        c6830Eai2.A02 = this.A02;
        C6830Eai c6830Eai3 = this.A02;
        C7384Etj.A0X(c6830Eai3);
        c6830Eai3.A03 = this.A03;
        this.A02 = null;
        this.A03 = null;
        return c6830Eai;
    }

    public final void A03(C6830Eai c6830Eai) {
        c6830Eai.A03 = this;
        c6830Eai.A02 = this.A02;
        C6830Eai c6830Eai2 = this.A02;
        C7384Etj.A0X(c6830Eai2);
        c6830Eai2.A03 = c6830Eai;
        this.A02 = c6830Eai;
    }

    public C6830Eai() {
        this.A06 = new byte[8192];
        this.A04 = true;
        this.A05 = false;
    }

    public C6830Eai(byte[] bArr, int i, int i2, boolean z) {
        C7384Etj.A0Y(bArr, 0);
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A04 = false;
    }
}

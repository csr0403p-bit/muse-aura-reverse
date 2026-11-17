package X;

/* loaded from: classes5.dex */
public final class CA3 {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final long A00() {
        int i = this.A0A;
        int i2 = this.A06;
        int i3 = this.A09;
        int i4 = this.A0B;
        int i5 = this.A0C;
        return (0 << 62) | (BV5.A06(this.A0F ? 1 : 0) << 61) | (this.A0E ? 1152921504606846976L : 0L) | (i5 << 54) | (i << 48) | (BV4.A03((i2 << 16) + i3) << 16) | i4;
    }

    public CA3(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        this.A03 = str;
        this.A05 = str2;
        this.A08 = i;
        this.A06 = i2;
        this.A09 = i3;
        this.A0B = i4;
        this.A0A = i5;
        this.A0C = i6;
        this.A0E = z;
        this.A0F = z2;
        this.A07 = i7;
        this.A0D = z3;
    }
}

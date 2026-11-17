package X;

/* loaded from: classes4.dex */
public final class B0q {
    public static int A0A;
    public static final C2180B0y A0B;
    public static final Object A0C;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final B0o A07;
    public final String A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B0q) {
                B0q b0q = (B0q) obj;
                if (C7384Etj.areEqual(this.A08, b0q.A08) && C1DG.A08(this.A01, b0q.A01) && C1DG.A08(this.A00, b0q.A00) && this.A03 == b0q.A03 && this.A02 == b0q.A02 && C7384Etj.areEqual(this.A07, b0q.A07)) {
                    long j = this.A06;
                    long j2 = b0q.A06;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A05 != b0q.A05 || this.A09 != b0q.A09) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    static {
        C2180B0y c2180B0y = new C2180B0y();
        A0B = c2180B0y;
        A0C = c2180B0y;
    }

    public /* synthetic */ B0q(B0o b0o, String str, float f, float f2, float f3, float f4, int i, long j, boolean z) {
        int i2;
        synchronized (A0C) {
            i2 = A0A;
            A0A = i2 + 1;
        }
        this.A08 = str;
        this.A01 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = b0o;
        this.A06 = j;
        this.A05 = i;
        this.A09 = z;
        this.A04 = i2;
    }

    public final int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.A07, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass001.A0G(this.A08), this.A01), this.A00), this.A03), this.A02));
        long j = this.A06;
        long j2 = B6A.A01;
        return C0KA.A00((C60R.A00(j, iA0F) + this.A05) * 31, this.A09);
    }
}

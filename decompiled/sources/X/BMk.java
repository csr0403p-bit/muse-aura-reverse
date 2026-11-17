package X;

/* loaded from: classes4.dex */
public final class BMk extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final BOv A07;
    public final BNN A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BMk) {
                BMk bMk = (BMk) obj;
                long j = this.A05;
                long j2 = bMk.A05;
                long j3 = B6A.A01;
                if (j != j2 || !C1DG.A08(this.A04, bMk.A04) || !C1DG.A08(this.A00, bMk.A00) || !C1DG.A08(this.A01, bMk.A01) || !C1DG.A08(this.A02, bMk.A02) || !C1DG.A08(this.A03, bMk.A03) || this.A06 != bMk.A06 || !C7384Etj.areEqual(this.A08, bMk.A08) || !C7384Etj.areEqual(this.A07, bMk.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public BMk() {
        this(null, 0.0f, 511, 0L);
    }

    public final int hashCode() {
        long j = this.A05;
        long j2 = B6A.A01;
        return AnonymousClass005.A0F(this.A08, AnonymousClass006.A06(this.A06, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A07(j), this.A04), this.A00), this.A01), this.A02), this.A03))) + AnonymousClass006.A0D(this.A07);
    }

    public /* synthetic */ BMk(BNN bnn, float f, int i, long j) {
        BOv bOv;
        BNN bnn2 = bnn;
        float f2 = f;
        long j2 = (i & 1) != 0 ? 4294967295L << 32 : j;
        f2 = (i & 8) != 0 ? 16.0f : f2;
        long jA0U = C8j3.A0U(771751936L);
        bnn2 = (i & 128) != 0 ? new BNN(63, 0L) : bnn2;
        if ((i & 256) != 0) {
            bOv = new BOv(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 127, 0L, 0L);
        } else {
            bOv = null;
        }
        C7384Etj.A0Y(bnn2, 7);
        this.A05 = j2;
        this.A04 = 38.0f;
        this.A00 = 52.0f;
        this.A01 = f2;
        this.A02 = 16.0f;
        this.A03 = 24.0f;
        this.A06 = jA0U;
        this.A08 = bnn2;
        this.A07 = bOv;
    }
}

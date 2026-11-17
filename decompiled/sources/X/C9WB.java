package X;

/* renamed from: X.9WB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WB extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final long A0B;
    public final long A0C;
    public final C1780Aqg A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9WB) {
                C9WB c9wb = (C9WB) obj;
                if (C1DG.A08(this.A0A, c9wb.A0A) && C1DG.A08(this.A08, c9wb.A08) && C1DG.A08(this.A00, c9wb.A00) && C1DG.A08(this.A09, c9wb.A09) && C1DG.A08(this.A07, c9wb.A07) && C1DG.A08(this.A03, c9wb.A03)) {
                    long j = this.A0C;
                    long j2 = c9wb.A0C;
                    long j3 = B6A.A01;
                    if (j != j2 || !C1DG.A08(this.A04, c9wb.A04) || !C1DG.A08(this.A02, c9wb.A02) || !C1DG.A08(this.A01, c9wb.A01) || !C1DG.A08(this.A06, c9wb.A06) || this.A0B != c9wb.A0B || !C1DG.A08(this.A05, c9wb.A05) || !C7384Etj.areEqual(this.A0D, c9wb.A0D)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C9WB(int i, long j) {
        long j2 = (i & 64) != 0 ? 4292927712L << 32 : j;
        long j3 = B6A.A08;
        C1780Aqg c1780Aqg = C1780Aqg.A03;
        C1780Aqg c1780Aqg2 = new C1780Aqg(1711276032 << 32, C8j3.A0V(C8j3.A0P(1.0f), AnonymousClass002.A0F() << 32), 2.0f);
        this.A0A = 160.0f;
        this.A08 = 160.0f;
        this.A00 = 328.0f;
        this.A09 = 8.0f;
        this.A07 = 8.0f;
        this.A03 = 12.0f;
        this.A0C = j2;
        this.A04 = 8.0f;
        this.A02 = 18.0f;
        this.A01 = 24.0f;
        this.A06 = 40.0f;
        this.A0B = j3;
        this.A05 = 1.5f;
        this.A0D = c1780Aqg2;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A0A), this.A08), this.A00), this.A09), this.A07), this.A03);
        long j = this.A0C;
        long j2 = B6A.A01;
        return AnonymousClass005.A02(AnonymousClass006.A06(this.A0B, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(j, iA02), this.A04), this.A02), this.A01), this.A06)), this.A05) + AnonymousClass006.A0D(this.A0D);
    }

    public C9WB() {
        this(16383, 0L);
    }
}

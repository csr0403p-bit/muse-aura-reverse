package X;

/* renamed from: X.9W7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9W7 extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final C1822Arm A0B;
    public final C1822Arm A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9W7) {
                C9W7 c9w7 = (C9W7) obj;
                if (C7384Etj.areEqual(this.A0C, c9w7.A0C) && C7384Etj.areEqual(this.A0B, c9w7.A0B) && C1DG.A08(this.A05, c9w7.A05) && C1DG.A08(this.A00, c9w7.A00)) {
                    long j = this.A07;
                    long j2 = c9w7.A07;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A06 != c9w7.A06 || this.A0A != c9w7.A0A || !C1DG.A08(this.A03, c9w7.A03) || this.A09 != c9w7.A09 || !C1DG.A08(this.A04, c9w7.A04) || this.A08 != c9w7.A08 || !C1DG.A08(this.A01, c9w7.A01) || Float.compare(this.A02, c9w7.A02) != 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C9W7(C1822Arm c1822Arm, C1822Arm c1822Arm2, float f, float f2, int i, long j, long j2, long j3, long j4) {
        C1822Arm c1822Arm3 = c1822Arm;
        C1822Arm c1822Arm4 = c1822Arm2;
        float f3 = f;
        float f4 = f2;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        if ((i & 1) != 0) {
            long jA03 = C19U.A03(22);
            long jA032 = C19U.A03(32);
            long j9 = B6A.A01;
            C1822Arm c1822Arm5 = C1822Arm.A03;
            c1822Arm3 = new C1822Arm(null, null, C1736ApY.A03, 0, 0, 4279308562L << 32, jA03, C1809ArT.A01, B6A.A07, jA032);
        }
        if ((i & 2) != 0) {
            long jA033 = C19U.A03(15);
            long jA04 = C60Q.A04();
            C1736ApY c1736ApY = C1736ApY.A04;
            long jA0U = C8j3.A0U(2516583433L);
            C1822Arm c1822Arm6 = C1822Arm.A03;
            c1822Arm4 = new C1822Arm(null, null, c1736ApY, 0, 0, jA0U, jA033, C1809ArT.A01, B6A.A07, jA04);
        }
        f3 = (i & 4) != 0 ? 4.0f : f3;
        f4 = (i & 8) != 0 ? 0.0f : f4;
        j5 = (i & 16) != 0 ? 4281236786L << 32 : j5;
        j6 = (i & 32) != 0 ? 4292030255L << 32 : j6;
        long j10 = 4290007817L << 32;
        long j11 = B6A.A01;
        j7 = (i & 256) != 0 ? 3690966016L << 32 : j7;
        j8 = (i & 1024) != 0 ? 4293783021L << 32 : j8;
        AnonymousClass003.A0u(c1822Arm3, c1822Arm4);
        this.A0C = c1822Arm3;
        this.A0B = c1822Arm4;
        this.A05 = f3;
        this.A00 = f4;
        this.A07 = j5;
        this.A06 = j6;
        this.A0A = j10;
        this.A03 = 12.0f;
        this.A09 = j7;
        this.A04 = 2.0f;
        this.A08 = j8;
        this.A01 = 4.0f;
        this.A02 = 0.6f;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0E(this.A0C)), this.A05), this.A00);
        long j = this.A07;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass006.A06(this.A08, AnonymousClass005.A02(AnonymousClass006.A06(this.A09, AnonymousClass005.A02(AnonymousClass006.A06(this.A0A, AnonymousClass006.A06(this.A06, AnonymousClass006.A06(j, iA02))), this.A03)), this.A04)), this.A01), this.A02);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9W7() {
        C1822Arm c1822Arm = null;
        float f = 0.0f;
        long j = 0;
        this(c1822Arm, c1822Arm, f, f, 8191, j, j, j, j);
    }
}

package X;

/* renamed from: X.9WH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WH extends C06G {
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
    public final long A0A;
    public final long A0B;
    public final C1822Arm A0C;
    public final C1822Arm A0D;
    public final C1822Arm A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9WH) {
                C9WH c9wh = (C9WH) obj;
                if (C7384Etj.areEqual(this.A0E, c9wh.A0E) && C1DG.A08(this.A06, c9wh.A06) && C1DG.A08(this.A05, c9wh.A05)) {
                    long j = this.A0A;
                    long j2 = c9wh.A0A;
                    long j3 = B6A.A01;
                    if (j != j2 || !C1DG.A08(this.A07, c9wh.A07) || !C1DG.A08(this.A09, c9wh.A09) || !C1DG.A08(this.A08, c9wh.A08) || !C1DG.A08(this.A01, c9wh.A01) || this.A0B != c9wh.A0B || !C7384Etj.areEqual(this.A0C, c9wh.A0C) || !C1DG.A08(this.A00, c9wh.A00) || !C7384Etj.areEqual(this.A0D, c9wh.A0D) || !C1DG.A08(this.A03, c9wh.A03) || !C1DG.A08(this.A04, c9wh.A04) || !C1DG.A08(this.A02, c9wh.A02)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C9WH(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, float f, float f2, float f3, int i, long j) {
        C1822Arm c1822Arm4 = c1822Arm2;
        C1822Arm c1822Arm5 = c1822Arm3;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        long j2 = j;
        C1822Arm c1822ArmA0N = (i & 1) != 0 ? C8j5.A0N() : c1822Arm;
        f4 = (i & 4) != 0 ? Float.NaN : f4;
        j2 = (i & 8) != 0 ? 2902458887L << 32 : j2;
        long j3 = 4293211197L << 32;
        long j4 = B6A.A01;
        if ((i & 512) != 0) {
            long jA03 = C19U.A03(15);
            long jA04 = C60Q.A04();
            C1822Arm c1822Arm6 = C1822Arm.A03;
            c1822Arm4 = new C1822Arm(null, null, C1736ApY.A05, 0, 0, 4279308562L << 32, jA03, C1809ArT.A01, B6A.A07, jA04);
        }
        if ((i & 2048) != 0) {
            long jA032 = C19U.A03(17);
            long jA033 = C19U.A03(22);
            C1822Arm c1822Arm7 = C1822Arm.A03;
            c1822Arm5 = new C1822Arm(null, null, C1736ApY.A03, 0, 0, 4279308562L << 32, jA032, C1809ArT.A01, B6A.A07, jA033);
        }
        f5 = (i & 8192) != 0 ? 0.0f : f5;
        f6 = (i & 16384) != 0 ? 0.0f : f6;
        AnonymousClass002.A1F(c1822ArmA0N, 0, c1822Arm4);
        C7384Etj.A0Y(c1822Arm5, 11);
        this.A0E = c1822ArmA0N;
        this.A06 = 24.0f;
        this.A05 = f4;
        this.A0A = j2;
        this.A07 = 12.0f;
        this.A09 = 8.0f;
        this.A08 = 16.0f;
        this.A01 = 2.0f;
        this.A0B = j3;
        this.A0C = c1822Arm4;
        this.A00 = 12.0f;
        this.A0D = c1822Arm5;
        this.A03 = 8.0f;
        this.A04 = f5;
        this.A02 = f6;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0E(this.A0E), this.A06), this.A05);
        long j = this.A0A;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0D, AnonymousClass005.A02(AnonymousClass005.A0F(this.A0C, AnonymousClass006.A06(this.A0B, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(j, iA02), this.A07), this.A09), this.A08), this.A01))), this.A00)), this.A03), this.A04), this.A02);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9WH() {
        C1822Arm c1822Arm = null;
        float f = 0.0f;
        this(c1822Arm, c1822Arm, c1822Arm, f, f, f, 32767, 0L);
    }
}

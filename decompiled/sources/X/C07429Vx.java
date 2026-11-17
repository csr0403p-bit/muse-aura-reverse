package X;

/* renamed from: X.9Vx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07429Vx extends C06G {
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
    public final float A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final float A0H;
    public final int A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final C1822Arm A0O;
    public final C1822Arm A0P;
    public final C1822Arm A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07429Vx) {
                C07429Vx c07429Vx = (C07429Vx) obj;
                if (C7384Etj.areEqual(this.A0Q, c07429Vx.A0Q) && C7384Etj.areEqual(this.A0P, c07429Vx.A0P) && C7384Etj.areEqual(this.A0O, c07429Vx.A0O) && C1DG.A08(this.A0H, c07429Vx.A0H) && C1DG.A08(this.A0E, c07429Vx.A0E) && C1DG.A08(this.A0F, c07429Vx.A0F) && C1DG.A08(this.A0G, c07429Vx.A0G) && C1DG.A08(this.A0D, c07429Vx.A0D) && C1DG.A08(this.A0C, c07429Vx.A0C) && C1DG.A08(this.A0B, c07429Vx.A0B) && C1DG.A08(this.A0A, c07429Vx.A0A)) {
                    long j = this.A0N;
                    long j2 = c07429Vx.A0N;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A0M != c07429Vx.A0M || !C1DG.A08(this.A08, c07429Vx.A08) || !C1DG.A08(this.A09, c07429Vx.A09) || !C1DG.A08(this.A00, c07429Vx.A00) || !C1DG.A08(this.A01, c07429Vx.A01) || this.A0J != c07429Vx.A0J || !C1DG.A08(this.A07, c07429Vx.A07) || !C1DG.A08(this.A04, c07429Vx.A04) || !C1DG.A08(this.A03, c07429Vx.A03) || this.A0K != c07429Vx.A0K || this.A0L != c07429Vx.A0L || !C1DG.A08(this.A02, c07429Vx.A02) || !C1DG.A08(this.A06, c07429Vx.A06) || !C1DG.A08(this.A05, c07429Vx.A05) || this.A0I != c07429Vx.A0I) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C07429Vx(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, float f, float f2, float f3, int i, long j, long j2, long j3, long j4) {
        C1822Arm c1822ArmA0O = c1822Arm2;
        C1822Arm c1822ArmA0O2 = c1822Arm3;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        C1822Arm c1822ArmA0O3 = (i & 1) != 0 ? C8j5.A0O(C1736ApY.A05, C19U.A03(17), C19U.A03(22)) : c1822Arm;
        c1822ArmA0O = (i & 2) != 0 ? C8j5.A0O(C1736ApY.A05, C19U.A03(15), C19U.A03(20)) : c1822ArmA0O;
        c1822ArmA0O2 = (i & 4) != 0 ? C8j5.A0O(C1736ApY.A04, C19U.A03(15), C19U.A03(20)) : c1822ArmA0O2;
        f4 = (i & 16) != 0 ? 16.0f : f4;
        f5 = (i & 32) != 0 ? 12.0f : f5;
        f6 = (i & 64) != 0 ? 20.0f : f6;
        j5 = (i & 2048) != 0 ? 4294178037L << 32 : j5;
        long j9 = B6A.A06;
        j6 = (i & 131072) != 0 ? 4292927712L << 32 : j6;
        j7 = (i & 2097152) != 0 ? 4294967295L << 32 : j7;
        j8 = (i & 4194304) != 0 ? 2902458887L << 32 : j8;
        C1822Arm c1822Arm4 = c1822ArmA0O3;
        AnonymousClass005.A0x(c1822Arm4, c1822ArmA0O, c1822ArmA0O2);
        this.A0Q = c1822Arm4;
        this.A0P = c1822ArmA0O;
        this.A0O = c1822ArmA0O2;
        this.A0H = 12.0f;
        this.A0E = f4;
        this.A0F = f5;
        this.A0G = f6;
        this.A0D = 328.0f;
        this.A0C = 8.0f;
        this.A0B = 20.0f;
        this.A0A = 22.0f;
        this.A0N = j5;
        this.A0M = j9;
        this.A08 = 1.0f;
        this.A09 = 13.0f;
        this.A00 = 28.0f;
        this.A01 = 10.0f;
        this.A0J = j6;
        this.A07 = 14.0f;
        this.A04 = 16.0f;
        this.A03 = 12.0f;
        this.A0K = j7;
        this.A0L = j8;
        this.A02 = 1.0f;
        this.A06 = 1.0f;
        this.A05 = 6.0f;
        this.A0I = 5;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0O, AnonymousClass005.A0F(this.A0P, AnonymousClass005.A0E(this.A0Q))), this.A0H), this.A0E), this.A0F), this.A0G), this.A0D), this.A0C), this.A0B), this.A0A);
        long j = this.A0N;
        long j2 = B6A.A01;
        return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A0L, AnonymousClass006.A06(this.A0K, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A0J, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A0M, AnonymousClass006.A06(j, iA02)), this.A08), this.A09), this.A00), this.A01)), this.A07), this.A04), this.A03))), this.A02), this.A06), this.A05) + this.A0I;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C07429Vx() {
        C1822Arm c1822Arm = null;
        float f = 0.0f;
        long j = 0;
        this(c1822Arm, c1822Arm, c1822Arm, f, f, f, 134217727, j, j, j, j);
    }
}

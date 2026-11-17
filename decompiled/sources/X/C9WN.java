package X;

/* renamed from: X.9WN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WN extends C06G {
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
    public final C1822Arm A0C;
    public final C1822Arm A0D;
    public final C1822Arm A0E;
    public final C1822Arm A0F;
    public final C1822Arm A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9WN) {
                C9WN c9wn = (C9WN) obj;
                if (C7384Etj.areEqual(this.A0E, c9wn.A0E) && C7384Etj.areEqual(this.A0G, c9wn.A0G) && C7384Etj.areEqual(this.A0C, c9wn.A0C) && C7384Etj.areEqual(this.A0F, c9wn.A0F) && C1DG.A08(this.A04, c9wn.A04) && C1DG.A08(this.A03, c9wn.A03)) {
                    long j = this.A0B;
                    long j2 = c9wn.A0B;
                    long j3 = B6A.A01;
                    if (j != j2 || !C1DG.A08(this.A05, c9wn.A05) || !C1DG.A08(this.A0A, c9wn.A0A) || !C1DG.A08(this.A08, c9wn.A08) || !C1DG.A08(this.A09, c9wn.A09) || !C1DG.A08(this.A07, c9wn.A07) || !C1DG.A08(this.A06, c9wn.A06) || !C7384Etj.areEqual(this.A0D, c9wn.A0D) || !C1DG.A08(this.A01, c9wn.A01) || !C1DG.A08(this.A02, c9wn.A02) || !C1DG.A08(this.A00, c9wn.A00)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C9WN(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, C1822Arm c1822Arm5, float f, float f2, float f3, float f4, float f5, int i, long j) {
        C1822Arm c1822ArmA00 = c1822Arm2;
        C1822Arm c1822ArmA002 = c1822Arm4;
        C1822Arm c1822ArmA0O = c1822Arm5;
        float f6 = f;
        float f7 = f2;
        float f8 = f3;
        float f9 = f4;
        float f10 = f5;
        C1822Arm c1822Arm6 = c1822Arm3;
        long jA0U = j;
        C1822Arm c1822ArmA0N = (i & 1) != 0 ? C8j5.A0N() : c1822Arm;
        c1822ArmA00 = (i & 2) != 0 ? C1822Arm.A00(null, c1822ArmA0N, null, null, C1736ApY.A01, null, null, null, null, null, 0, 0, 0, 16777211, 0L, 0L, 0L, 0L) : c1822ArmA00;
        if ((i & 4) != 0) {
            long jA03 = C19U.A03(13);
            long jA032 = C19U.A03(18);
            C1736ApY c1736ApY = C1736ApY.A04;
            long jA0U2 = C8j3.A0U(1577060113L);
            C1822Arm c1822Arm7 = C1822Arm.A03;
            c1822Arm6 = new C1822Arm(null, null, c1736ApY, 0, 0, jA0U2, jA03, C1809ArT.A01, B6A.A07, jA032);
        }
        c1822ArmA002 = (i & 8) != 0 ? C1822Arm.A00(null, c1822Arm6, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C8j3.A0U(4278191889L), 0L, 0L, 0L) : c1822ArmA002;
        f6 = (i & 32) != 0 ? Float.NaN : f6;
        jA0U = (i & 64) != 0 ? C8j3.A0U(2902458887L) : jA0U;
        f7 = (i & 128) != 0 ? 12.0f : f7;
        f8 = (i & 512) != 0 ? Float.NaN : f8;
        c1822ArmA0O = (i & 8192) != 0 ? C8j5.A0O(C1736ApY.A03, C19U.A03(17), C19U.A03(22)) : c1822ArmA0O;
        f9 = (32768 & i) != 0 ? 0.0f : f9;
        f10 = (i & 65536) != 0 ? 0.0f : f10;
        AnonymousClass005.A14(c1822ArmA0N, c1822ArmA00, c1822Arm6, c1822ArmA002);
        C7384Etj.A0Y(c1822ArmA0O, 13);
        this.A0E = c1822ArmA0N;
        this.A0G = c1822ArmA00;
        this.A0C = c1822Arm6;
        this.A0F = c1822ArmA002;
        this.A04 = 24.0f;
        this.A03 = f6;
        this.A0B = jA0U;
        this.A05 = f7;
        this.A0A = 8.0f;
        this.A08 = f8;
        this.A09 = 16.0f;
        this.A07 = 1.5f;
        this.A06 = 6.0f;
        this.A0D = c1822ArmA0O;
        this.A01 = 8.0f;
        this.A02 = f9;
        this.A00 = f10;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0F, AnonymousClass005.A0F(this.A0C, AnonymousClass005.A0F(this.A0G, AnonymousClass005.A0E(this.A0E)))), this.A04), this.A03);
        long j = this.A0B;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0D, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C60R.A00(j, iA02), this.A05), this.A0A), this.A08), this.A09), this.A07), this.A06)), this.A01), this.A02), this.A00);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9WN() {
        C1822Arm c1822Arm = null;
        float f = 0.0f;
        this(c1822Arm, c1822Arm, c1822Arm, c1822Arm, c1822Arm, f, f, f, f, f, 131071, 0L);
    }
}

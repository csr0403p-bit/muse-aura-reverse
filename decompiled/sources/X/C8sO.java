package X;

/* renamed from: X.8sO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sO extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final long A09;
    public final long A0A;
    public final C1822Arm A0B;
    public final C1822Arm A0C;
    public final C1822Arm A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8sO) {
                C8sO c8sO = (C8sO) obj;
                if (C7384Etj.areEqual(this.A0C, c8sO.A0C) && C7384Etj.areEqual(this.A0B, c8sO.A0B) && C7384Etj.areEqual(this.A0D, c8sO.A0D) && C1DG.A08(this.A06, c8sO.A06) && C1DG.A08(this.A01, c8sO.A01) && C1DG.A08(this.A00, c8sO.A00) && Float.compare(this.A02, c8sO.A02) == 0 && C1DG.A08(this.A03, c8sO.A03)) {
                    long j = this.A0A;
                    long j2 = c8sO.A0A;
                    long j3 = B6A.A01;
                    if (j != j2 || !C1DG.A08(this.A04, c8sO.A04) || !C1DG.A08(this.A05, c8sO.A05) || !C1DG.A08(this.A07, c8sO.A07) || !C1DG.A08(this.A08, c8sO.A08) || this.A09 != c8sO.A09) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8sO() {
        C1822Arm c1822Arm = null;
        this(c1822Arm, c1822Arm, c1822Arm, 16383);
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0D, AnonymousClass005.A0F(this.A0B, AnonymousClass005.A0E(this.A0C))), this.A06), this.A01), this.A00), this.A02), this.A03);
        long j = this.A0A;
        long j2 = B6A.A01;
        return C8j4.A0B(this.A09, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(j, iA02), this.A04), this.A05), this.A07), this.A08));
    }

    public /* synthetic */ C8sO(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, int i) {
        C1822Arm c1822ArmA0O = c1822Arm;
        C1822Arm c1822Arm4 = c1822Arm2;
        C1822Arm c1822ArmA0O2 = c1822Arm3;
        if ((i & 1) != 0) {
            c1822ArmA0O = C8j5.A0O(C1736ApY.A05, C19U.A03(17), C19U.A03(22));
        }
        if ((i & 2) != 0) {
            long jA03 = C19U.A03(13);
            long jA032 = C19U.A03(18);
            C1736ApY c1736ApY = C1736ApY.A04;
            long jA0U = C8j3.A0U(4284835948L);
            C1822Arm c1822Arm5 = C1822Arm.A03;
            c1822Arm4 = new C1822Arm(null, null, c1736ApY, 0, 0, jA0U, jA03, C1809ArT.A01, B6A.A07, jA032);
        }
        if ((i & 4) != 0) {
            c1822ArmA0O2 = C8j5.A0O(C1736ApY.A05, C19U.A03(15), C60Q.A04());
        }
        long j = B6A.A08;
        AnonymousClass005.A0x(c1822ArmA0O, c1822Arm4, c1822ArmA0O2);
        this.A0C = c1822ArmA0O;
        this.A0B = c1822Arm4;
        this.A0D = c1822ArmA0O2;
        this.A06 = 12.0f;
        this.A01 = 328.0f;
        this.A00 = 8.0f;
        this.A02 = 1.9f;
        this.A03 = 12.0f;
        this.A0A = 4292927712L << 32;
        this.A04 = 8.0f;
        this.A05 = 4.0f;
        this.A07 = 8.0f;
        this.A08 = 18.0f;
        this.A09 = j;
    }
}

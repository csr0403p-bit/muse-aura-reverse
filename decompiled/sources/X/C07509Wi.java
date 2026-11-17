package X;

/* renamed from: X.9Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07509Wi extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C1EQ A08;
    public final C1822Arm A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07509Wi) {
                C07509Wi c07509Wi = (C07509Wi) obj;
                if (C7384Etj.areEqual(this.A09, c07509Wi.A09) && C7384Etj.areEqual(this.A08, c07509Wi.A08)) {
                    long j = this.A05;
                    long j2 = c07509Wi.A05;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A06 != c07509Wi.A06 || this.A07 != c07509Wi.A07 || !C1DG.A08(this.A02, c07509Wi.A02) || !C1DG.A08(this.A03, c07509Wi.A03) || !C1DG.A08(this.A04, c07509Wi.A04) || !C1DG.A08(this.A00, c07509Wi.A00) || !C1DG.A08(this.A01, c07509Wi.A01)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C07509Wi() {
        long j = 0;
        this(null, 0 == true ? 1 : 0, 1023, j, j, j);
    }

    public final int hashCode() {
        int iA0F = AnonymousClass005.A0F(this.A08, AnonymousClass005.A0E(this.A09));
        long j = this.A05;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A06, AnonymousClass006.A06(j, iA0F))), this.A02), this.A03), this.A04), this.A00), this.A01);
    }

    public /* synthetic */ C07509Wi(C1EQ c1eq, C1822Arm c1822Arm, int i, long j, long j2, long j3) {
        C1EQ c1326AhD = c1eq;
        C1822Arm c1822Arm2 = c1822Arm;
        long jA0U = j;
        long jA0U2 = j2;
        long jA0U3 = j3;
        if ((i & 1) != 0) {
            long jA03 = C19U.A03(17);
            long jA032 = C19U.A03(22);
            C1736ApY c1736ApY = C1736ApY.A03;
            C1822Arm c1822Arm3 = C1822Arm.A03;
            long j4 = B6A.A07;
            c1822Arm2 = new C1822Arm(null, null, c1736ApY, 3, 0, j4, jA03, C1809ArT.A01, j4, jA032);
        }
        c1326AhD = (i & 2) != 0 ? new C1326AhD(C8j3.A0U(4279308562L)) : c1326AhD;
        jA0U = (i & 4) != 0 ? C8j3.A0U(4294967295L) : jA0U;
        jA0U2 = (i & 8) != 0 ? C8j3.A0U(4294178037L) : jA0U2;
        jA0U3 = (i & 16) != 0 ? C8j3.A0U(4279308562L) : jA0U3;
        AnonymousClass003.A0u(c1822Arm2, c1326AhD);
        this.A09 = c1822Arm2;
        this.A08 = c1326AhD;
        this.A05 = jA0U;
        this.A06 = jA0U2;
        this.A07 = jA0U3;
        this.A02 = 10000.0f;
        this.A03 = 16.0f;
        this.A04 = 11.0f;
        this.A00 = 8.0f;
        this.A01 = 21.0f;
    }
}

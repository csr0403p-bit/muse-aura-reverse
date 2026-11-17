package X;

/* renamed from: X.7cR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7cR extends C06G {
    public final float A00;
    public final C1822Arm A01;
    public final C1822Arm A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7cR) {
                C7cR c7cR = (C7cR) obj;
                if (!C7384Etj.areEqual(this.A02, c7cR.A02) || !C7384Etj.areEqual(this.A01, c7cR.A01) || !C1DG.A08(this.A00, c7cR.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C7cR(C1822Arm c1822Arm, C1822Arm c1822Arm2, int i) {
        C1822Arm c1822Arm3 = c1822Arm;
        C1822Arm c1822Arm4 = c1822Arm2;
        if ((i & 1) != 0) {
            long jA03 = C19U.A03(17);
            long jA032 = C19U.A03(22);
            long j = B6A.A01;
            C1822Arm c1822Arm5 = C1822Arm.A03;
            c1822Arm3 = new C1822Arm(null, null, C1736ApY.A05, 0, 0, 4279308562L << 32, jA03, C1809ArT.A01, B6A.A07, jA032);
        }
        if ((i & 2) != 0) {
            long jA033 = C19U.A03(15);
            long jA04 = C60Q.A04();
            long j2 = B6A.A01;
            C1822Arm c1822Arm6 = C1822Arm.A03;
            c1822Arm4 = new C1822Arm(null, null, C1736ApY.A04, 0, 0, 4279308562L << 32, jA033, C1809ArT.A01, B6A.A07, jA04);
        }
        AnonymousClass003.A0u(c1822Arm3, c1822Arm4);
        this.A02 = c1822Arm3;
        this.A01 = c1822Arm4;
        this.A00 = 4.0f;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A01, AnonymousClass005.A0E(this.A02)) + Float.floatToIntBits(this.A00);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7cR() {
        C1822Arm c1822Arm = null;
        this(c1822Arm, c1822Arm, 7);
    }
}

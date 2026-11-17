package X;

/* renamed from: X.9WY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9WY extends C06G {
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

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9WY) {
                C9WY c9wy = (C9WY) obj;
                if (C7384Etj.areEqual(this.A0D, c9wy.A0D) && C1DG.A08(this.A04, c9wy.A04) && C1DG.A08(this.A03, c9wy.A03)) {
                    long j = this.A0B;
                    long j2 = c9wy.A0B;
                    long j3 = B6A.A01;
                    if (j != j2 || !C1DG.A08(this.A05, c9wy.A05) || !C1DG.A08(this.A0A, c9wy.A0A) || !C1DG.A08(this.A09, c9wy.A09) || !C1DG.A08(this.A08, c9wy.A08) || !C1DG.A08(this.A07, c9wy.A07) || !C7384Etj.areEqual(this.A0C, c9wy.A0C) || !C1DG.A08(this.A01, c9wy.A01) || !C1DG.A08(this.A02, c9wy.A02) || !C1DG.A08(this.A00, c9wy.A00) || Float.compare(this.A06, c9wy.A06) != 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C9WY(C1822Arm c1822Arm, C1822Arm c1822Arm2, float f, float f2, float f3, int i, long j) {
        C1822Arm c1822ArmA0O = c1822Arm2;
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        long jA0U = j;
        C1822Arm c1822ArmA0N = (i & 1) != 0 ? C8j5.A0N() : c1822Arm;
        f4 = (i & 4) != 0 ? Float.NaN : f4;
        jA0U = (i & 8) != 0 ? C8j3.A0U(2902458887L) : jA0U;
        c1822ArmA0O = (i & 512) != 0 ? C8j5.A0O(C1736ApY.A03, C19U.A03(17), C19U.A03(22)) : c1822ArmA0O;
        f5 = (i & 2048) != 0 ? 0.0f : f5;
        f6 = (i & 4096) != 0 ? 0.0f : f6;
        float f7 = (i & 8192) != 0 ? -1.0f : 0.0f;
        AnonymousClass002.A1F(c1822ArmA0N, 0, c1822ArmA0O);
        this.A0D = c1822ArmA0N;
        this.A04 = 24.0f;
        this.A03 = f4;
        this.A0B = jA0U;
        this.A05 = 12.0f;
        this.A0A = 8.0f;
        this.A09 = 16.0f;
        this.A08 = 1.5f;
        this.A07 = 6.0f;
        this.A0C = c1822ArmA0O;
        this.A01 = 8.0f;
        this.A02 = f5;
        this.A00 = f6;
        this.A06 = f7;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0E(this.A0D), this.A04), this.A03);
        long j = this.A0B;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0F(this.A0C, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C60R.A00(j, iA02), this.A05), this.A0A), this.A09), this.A08), this.A07)), this.A01), this.A02), this.A00), this.A06);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9WY() {
        C1822Arm c1822Arm = null;
        float f = 0.0f;
        this(c1822Arm, c1822Arm, f, f, f, 16383, 0L);
    }
}

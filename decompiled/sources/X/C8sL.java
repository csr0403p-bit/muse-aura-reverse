package X;

/* renamed from: X.8sL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sL extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8sL) {
                C8sL c8sL = (C8sL) obj;
                long j = this.A03;
                long j2 = c8sL.A03;
                long j3 = B6A.A01;
                if (j != j2 || this.A09 != c8sL.A09 || this.A07 != c8sL.A07 || this.A08 != c8sL.A08 || this.A06 != c8sL.A06 || Float.compare(this.A01, c8sL.A01) != 0 || Float.compare(this.A00, c8sL.A00) != 0 || Float.compare(this.A02, c8sL.A02) != 0 || this.A04 != c8sL.A04 || this.A05 != c8sL.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C8sL(int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        long jA0U = j2;
        long jA0U2 = j3;
        long jA0U3 = j4;
        long jA0U4 = j5;
        long jA0U5 = j6;
        long jA0U6 = (i & 1) != 0 ? C8j3.A0U(4293454056L) : j;
        boolean zA1K = C3cG.A1K(i & 2, z);
        jA0U = (i & 4) != 0 ? C8j3.A0U(4294967295L) : jA0U;
        jA0U2 = (i & 8) != 0 ? C8j3.A0U(4280036147L) : jA0U2;
        jA0U3 = (i & 16) != 0 ? C8j3.A0U(4294967295L) : jA0U3;
        jA0U4 = (i & 256) != 0 ? C8j3.A0U(4293454056L) : jA0U4;
        jA0U5 = (i & 512) != 0 ? C8j3.A0U(4289769648L) : jA0U5;
        this.A03 = jA0U6;
        this.A09 = zA1K;
        this.A07 = jA0U;
        this.A08 = jA0U2;
        this.A06 = jA0U3;
        this.A01 = 1.0f;
        this.A00 = 0.5f;
        this.A02 = 0.1f;
        this.A04 = jA0U4;
        this.A05 = jA0U5;
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = B6A.A01;
        return C8j4.A0B(this.A05, AnonymousClass006.A06(this.A04, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A06, AnonymousClass006.A06(this.A08, AnonymousClass006.A06(this.A07, C0KA.A01(AnonymousClass005.A07(j), this.A09)))), this.A01), this.A00), this.A02)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8sL() {
        long j = 0;
        this(1023, j, j, j, j, j, j, false);
    }
}

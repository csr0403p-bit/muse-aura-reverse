package X;

/* renamed from: X.8sM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8sM extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8sM) {
                C8sM c8sM = (C8sM) obj;
                long j = this.A05;
                long j2 = c8sM.A05;
                long j3 = B6A.A01;
                if (j != j2 || this.A06 != c8sM.A06 || !C1DG.A08(this.A03, c8sM.A03) || !C1DG.A08(this.A00, c8sM.A00) || !C1DG.A08(this.A04, c8sM.A04) || !C1DG.A08(this.A02, c8sM.A02) || !C1DG.A08(this.A01, c8sM.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C8sM(int i, long j, long j2) {
        j = (i & 1) != 0 ? C8j3.A0U(4294967295L) : j;
        j2 = (i & 2) != 0 ? C8j3.A0U(4280036147L) : j2;
        this.A05 = j;
        this.A06 = j2;
        this.A03 = 32.0f;
        this.A00 = 16.0f;
        this.A04 = 12.0f;
        this.A02 = 12.0f;
        this.A01 = 4.0f;
    }

    public final int hashCode() {
        long j = this.A05;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A06, AnonymousClass005.A07(j)), this.A03), this.A00), this.A04), this.A02), this.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8sM() {
        long j = 0;
        this(127, j, j);
    }
}

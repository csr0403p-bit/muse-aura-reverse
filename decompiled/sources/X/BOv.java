package X;

/* loaded from: classes4.dex */
public final class BOv extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;
    public final long A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BOv) {
                BOv bOv = (BOv) obj;
                if (C1DG.A08(this.A04, bOv.A04) && C1DG.A08(this.A00, bOv.A00)) {
                    long j = this.A05;
                    long j2 = bOv.A05;
                    long j3 = B6A.A01;
                    if (j != j2 || this.A06 != bOv.A06 || !C1DG.A08(this.A02, bOv.A02) || !C1DG.A08(this.A03, bOv.A03) || !C1DG.A08(this.A01, bOv.A01)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ BOv(C06H c06h, float f, float f2, float f3, float f4, float f5, int i, long j, long j2) {
        long j3 = B6A.A01;
        this.A04 = 44.0f;
        this.A00 = 24.0f;
        this.A05 = 2332033023L << 32;
        this.A06 = 4280036147L << 32;
        this.A02 = 20.0f;
        this.A03 = 2.0f;
        this.A01 = 16.0f;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(C8j4.A04(this.A04), this.A00);
        long j = this.A05;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass006.A06(this.A06, AnonymousClass006.A06(j, iA02)), this.A02), this.A03), this.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BOv() {
        float f = 0.0f;
        long j = 0;
        this(null, f, f, f, f, f, 127, j, j);
    }
}

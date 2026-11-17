package X;

/* loaded from: classes4.dex */
public final class BNN extends C06G {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final long A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BNN) {
                BNN bnn = (BNN) obj;
                if (C1DG.A08(this.A04, bnn.A04) && C1DG.A08(this.A02, bnn.A02) && C1DG.A08(this.A01, bnn.A01)) {
                    long j = this.A05;
                    long j2 = bnn.A05;
                    long j3 = B6A.A01;
                    if (j != j2 || !C1DG.A08(this.A03, bnn.A03) || !C1DG.A08(this.A00, bnn.A00)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ BNN(int i, long j) {
        j = (i & 8) != 0 ? C8j3.A0U(4292467161L) : j;
        this.A04 = 36.0f;
        this.A02 = 5.0f;
        this.A01 = 3.0f;
        this.A05 = j;
        this.A03 = 8.0f;
        this.A00 = 8.0f;
    }

    public final int hashCode() {
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(C8j4.A04(this.A04), this.A02), this.A01);
        long j = this.A05;
        long j2 = B6A.A01;
        return C8j4.A06(AnonymousClass005.A02(C60R.A00(j, iA02), this.A03), this.A00);
    }

    public BNN() {
        this(63, 0L);
    }
}

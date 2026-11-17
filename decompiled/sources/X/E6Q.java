package X;

/* loaded from: classes5.dex */
public final class E6Q {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Dy6 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E6Q e6q = (E6Q) obj;
                if (this.A03 != e6q.A03 || this.A02 != e6q.A02 || this.A01 != e6q.A01 || this.A00 != e6q.A00 || this.A09 != e6q.A09 || this.A06 != e6q.A06 || this.A07 != e6q.A07 || this.A08 != e6q.A08 || this.A05 != e6q.A05 || !C6xC.A00(this.A04, e6q.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final E6Q A00(long j) {
        return j == this.A02 ? this : new E6Q(this.A04, this.A03, j, this.A01, this.A00, this.A09, this.A06, this.A07, this.A08, this.A05);
    }

    public final E6Q A01(long j) {
        return j == this.A03 ? this : new E6Q(this.A04, j, this.A02, this.A01, this.A00, this.A09, this.A06, this.A07, this.A08, this.A05);
    }

    public final int hashCode() {
        return ((((((((((((((((BV8.A09(this.A04) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31) + ((int) this.A01)) * 31) + ((int) this.A00)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0);
    }

    public E6Q(Dy6 dy6, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = dy6;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = j4;
        this.A09 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A05 = z5;
    }
}

package X;

/* loaded from: classes4.dex */
public final class ALL extends C06G {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public ALL() {
        this(true, true, true, true, true, true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ALL) {
                ALL all = (ALL) obj;
                if (this.A03 != all.A03 || this.A05 != all.A05 || this.A02 != all.A02 || this.A04 != all.A04 || this.A00 != all.A00 || this.A01 != all.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.A03), this.A05), this.A02), this.A04), this.A00), this.A01) + 1237;
    }

    public ALL(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = z;
        this.A05 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A00 = z5;
        this.A01 = z6;
    }
}

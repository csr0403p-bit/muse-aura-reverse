package X;

/* loaded from: classes4.dex */
public final class BA2 {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BA2) {
                BA2 ba2 = (BA2) obj;
                if (this.A02 != ba2.A02 || this.A03 != ba2.A03 || this.A00 != ba2.A00 || this.A04 != ba2.A04 || this.A01 != ba2.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public BA2(boolean z, boolean z2, boolean z3) {
        this(C79.A00, z, z2, z3, true);
    }

    public final int hashCode() {
        int iA01 = C0KA.A01(C0KA.A02(this.A02), this.A03);
        int iIntValue = this.A00.intValue();
        return (C0KA.A01(C0KA.A01((iA01 + (iIntValue != 0 ? "SecureOn" : "Inherit").hashCode() + iIntValue) * 31, this.A04), this.A01) + 2) * 31;
    }

    public BA2(Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = num;
        this.A04 = z3;
        this.A01 = z4;
    }

    public BA2() {
        this(C79.A00, true, true, true, true);
    }
}

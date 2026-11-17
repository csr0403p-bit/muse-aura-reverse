package X;

/* renamed from: X.Apq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1753Apq {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1753Apq) {
                C1753Apq c1753Apq = (C1753Apq) obj;
                if (this.A01 != c1753Apq.A01 || this.A03 != c1753Apq.A03 || this.A02 != c1753Apq.A02 || this.A00 != c1753Apq.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("InsetsValues(left=");
        sbA0x.append(this.A01);
        sbA0x.append(", top=");
        sbA0x.append(this.A03);
        sbA0x.append(", right=");
        sbA0x.append(this.A02);
        sbA0x.append(", bottom=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public C1753Apq(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}

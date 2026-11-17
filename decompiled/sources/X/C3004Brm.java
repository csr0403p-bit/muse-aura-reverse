package X;

/* renamed from: X.Brm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3004Brm extends C06G {
    public final double A00;
    public final double A01;
    public final double A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3004Brm) {
                C3004Brm c3004Brm = (C3004Brm) obj;
                if (Double.compare(this.A01, c3004Brm.A01) != 0 || Double.compare(this.A02, c3004Brm.A02) != 0 || Double.compare(this.A00, c3004Brm.A00) != 0 || this.A03 != c3004Brm.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(((((AnonymousClass002.A0A(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A02))) * 31) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A00))) * 31, this.A03);
    }

    public C3004Brm(double d, double d2, double d3, boolean z) {
        this.A01 = d;
        this.A02 = d2;
        this.A00 = d3;
        this.A03 = z;
    }
}

package X;

/* loaded from: classes6.dex */
public final class HAi {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final double A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HAi) {
                HAi hAi = (HAi) obj;
                if (Double.compare(this.A06, hAi.A06) != 0 || Double.compare(this.A00, hAi.A00) != 0 || Double.compare(this.A01, hAi.A01) != 0 || Double.compare(this.A02, hAi.A02) != 0 || Double.compare(this.A03, hAi.A03) != 0 || Double.compare(this.A04, hAi.A04) != 0 || Double.compare(this.A05, hAi.A05) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return HsK.A01(this.A04, HsK.A01(this.A03, HsK.A01(this.A02, HsK.A01(this.A01, HsK.A01(this.A00, AnonymousClass002.A0A(Double.doubleToLongBits(this.A06)) * 31))))) + AnonymousClass002.A0A(Double.doubleToLongBits(this.A05));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TransferParameters(gamma=");
        sbA0x.append(this.A06);
        sbA0x.append(", a=");
        sbA0x.append(this.A00);
        sbA0x.append(", b=");
        sbA0x.append(this.A01);
        sbA0x.append(", c=");
        sbA0x.append(this.A02);
        sbA0x.append(", d=");
        sbA0x.append(this.A03);
        sbA0x.append(", e=");
        sbA0x.append(this.A04);
        sbA0x.append(", f=");
        sbA0x.append(this.A05);
        return AnonymousClass006.A0z(sbA0x);
    }

    public HAi(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.A06 = d;
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = d4;
        this.A03 = d5;
        this.A04 = d6;
        this.A05 = d7;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d == -2.0d || d == -3.0d) {
            return;
        }
        if (d5 < 0.0d || d5 > 1.0d) {
            StringBuilder sb = new StringBuilder("Parameter d must be in the range [0..1], was ");
            sb.append(d5);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d5 >= 1.0d && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d4 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d2 < 0.0d || d < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}

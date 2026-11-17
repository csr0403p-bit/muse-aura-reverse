package X;

/* renamed from: X.FeK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8456FeK {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public double A04;
    public double A05;
    public double A06;
    public double A07;
    public boolean A08;
    public final C8463FeR A09 = A00(this);

    public final C8463FeR A01(double d, double d2, long j) {
        double d3;
        double d4;
        double d5;
        double d6;
        if (!this.A08) {
            if (this.A02 == Double.MAX_VALUE) {
                throw C3cG.A0Q("Error: Final position of the spring must be set before the animation starts");
            }
            double d7 = this.A01;
            if (d7 > 1.0d) {
                double d8 = this.A05;
                double d9 = (-d7) * d8;
                double dSqrt = d8 * Math.sqrt((d7 * d7) - 1.0d);
                this.A04 = d9 + dSqrt;
                this.A03 = d9 - dSqrt;
            } else if (d7 >= 0.0d && d7 < 1.0d) {
                this.A00 = this.A05 * Math.sqrt(1.0d - (d7 * d7));
            }
            this.A08 = true;
        }
        double d10 = j / 1000.0d;
        double d11 = this.A02;
        double d12 = d - d11;
        double d13 = this.A01;
        if (d13 > 1.0d) {
            double d14 = this.A03;
            double d15 = this.A04;
            double d16 = ((d14 * d12) - d2) / (d14 - d15);
            double d17 = d12 - d16;
            double dPow = Math.pow(2.718281828459045d, d14 * d10);
            double dPow2 = Math.pow(2.718281828459045d, d15 * d10);
            d3 = (dPow * d17) + (dPow2 * d16);
            d6 = d17 * d14 * dPow;
            d5 = d16 * d15 * dPow2;
        } else {
            if (d13 != 1.0d) {
                double d18 = this.A00;
                double d19 = this.A05;
                double d20 = (1.0d / d18) * ((d13 * d19 * d12) + d2);
                double dPow3 = Math.pow(2.718281828459045d, (-d13) * d19 * d10);
                double d21 = d18 * d10;
                double dCos = Math.cos(d21);
                double dSin = Math.sin(d21);
                d3 = dPow3 * ((dCos * d12) + (dSin * d20));
                d4 = ((-d19) * d3 * d13) + (dPow3 * (((-d18) * d12 * dSin) + (d20 * d18 * dCos)));
                C8463FeR c8463FeR = this.A09;
                c8463FeR.A00 = (float) (d3 + d11);
                c8463FeR.A01 = (float) d4;
                return c8463FeR;
            }
            double d22 = this.A05;
            double d23 = d2 + (d22 * d12);
            double d24 = -d22;
            double dPow4 = Math.pow(2.718281828459045d, d24 * d10);
            d3 = dPow4 * (d12 + (d23 * d10));
            d5 = d3 * d24;
            d6 = d23 * dPow4;
        }
        d4 = d6 + d5;
        C8463FeR c8463FeR2 = this.A09;
        c8463FeR2.A00 = (float) (d3 + d11);
        c8463FeR2.A01 = (float) d4;
        return c8463FeR2;
    }

    public C8456FeK() {
    }

    public static C8463FeR A00(C8456FeK c8456FeK) {
        c8456FeK.A05 = Math.sqrt(1500.0d);
        c8456FeK.A01 = 0.5d;
        c8456FeK.A08 = false;
        c8456FeK.A02 = Double.MAX_VALUE;
        return new C8463FeR();
    }

    public C8456FeK(float f) {
        this.A02 = f;
    }
}

package X;

/* renamed from: X.Aav, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1124Aav {
    public double A00;
    public float A01;
    public float A02;

    public final long A00(float f, float f2, long j) {
        double d;
        double d2;
        double d3;
        double dExp;
        double d4;
        float f3 = this.A02;
        float f4 = f - f3;
        double d5 = j / 1000.0d;
        float f5 = this.A01;
        double d6 = f5;
        double d7 = d6 * d6;
        double d8 = this.A00;
        double d9 = (-f5) * d8;
        if (f5 > 1.0f) {
            double dSqrt = d8 * Math.sqrt(d7 - 1.0d);
            double d10 = d9 + dSqrt;
            double d11 = d9 - dSqrt;
            double d12 = f4;
            double d13 = ((d11 * d12) - f2) / (d11 - d10);
            double d14 = d12 - d13;
            double dExp2 = Math.exp(d11 * d5);
            dExp = Math.exp(d5 * d10);
            d = (dExp2 * d14) + (dExp * d13);
            d4 = d14 * d11 * dExp2;
            d3 = d13 * d10;
        } else {
            if (f5 != 1.0f) {
                double dSqrt2 = d8 * Math.sqrt(1.0d - d7);
                double d15 = f4;
                double d16 = (1.0d / dSqrt2) * (((-d9) * d15) + f2);
                double d17 = dSqrt2 * d5;
                double dExp3 = Math.exp(d5 * d9);
                double dCos = Math.cos(d17);
                double dSin = Math.sin(d17);
                d = dExp3 * ((dCos * d15) + (dSin * d16));
                d2 = (d9 * d) + (dExp3 * (((-dSqrt2) * d15 * dSin) + (dSqrt2 * d16 * dCos)));
                return AnonymousClass005.A0J((float) (d + f3), (float) d2);
            }
            double d18 = f4;
            d3 = f2 + (d8 * d18);
            double d19 = -d8;
            double d20 = d18 + (d5 * d3);
            dExp = Math.exp(d19 * d5);
            d = d20 * dExp;
            d4 = d * d19;
        }
        d2 = d4 + (d3 * dExp);
        return AnonymousClass005.A0J((float) (d + f3), (float) d2);
    }
}

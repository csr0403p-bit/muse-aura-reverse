package X;

/* loaded from: classes5.dex */
public final class DBX {
    public static DBX A03;
    public int A00;
    public long A01;
    public long A02;

    public final void A00(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = Math.sin(d3);
        double dSin2 = (dSin * 0.03341960161924362d) + d3 + (Math.sin(2.0f * r5) * 3.4906598739326E-4d) + (Math.sin(r5 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r2 - 9.0E-4f) - r4) + 9.0E-4f + ((-d2) / 360.0d) + (dSin * 0.0053d) + (Math.sin(2.0d * dSin2) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin2) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(dAsin))) / (Math.cos(d4) * Math.cos(dAsin));
        if (dSin3 >= 1.0d) {
            this.A00 = 1;
        } else {
            if (dSin3 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
                long jA0G = BV6.A0G(dRound + dAcos, 8.64E7d) + 946728000000L;
                this.A02 = jA0G;
                long jA0G2 = BV6.A0G(dRound - dAcos, 8.64E7d) + 946728000000L;
                this.A01 = jA0G2;
                if (jA0G2 >= j || jA0G <= j) {
                    this.A00 = 1;
                    return;
                } else {
                    this.A00 = 0;
                    return;
                }
            }
            this.A00 = 0;
        }
        this.A02 = -1L;
        this.A01 = -1L;
    }
}

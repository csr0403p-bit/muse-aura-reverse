package X;

/* loaded from: classes5.dex */
public final class EZJ {
    public final int A00;
    public final int A01;
    public final double[] A02;

    public final void A00() {
        int i = this.A01;
        int i2 = (this.A00 + i) << 1;
        while (i < i2) {
            double[] dArr = this.A02;
            double d = dArr[i];
            int i3 = i + 1;
            double d2 = dArr[i3];
            dArr[i] = (d * d) + ((-d2) * d2);
            dArr[i3] = d * 2.0d * d2;
            i += 2;
        }
    }

    public final void A01(int i, double d) {
        this.A02[(i << 1) + this.A01 + 1] = d;
    }

    public final void A02(int i, double d) {
        this.A02[(i << 1) + this.A01] = d;
    }

    public final void A03(EZJ ezj) {
        int i = ezj.A01;
        double[] dArr = ezj.A02;
        int i2 = this.A01;
        int i3 = (this.A00 + i2) << 1;
        while (i2 < i3) {
            double[] dArr2 = this.A02;
            double d = dArr2[i2];
            int i4 = i2 + 1;
            double d2 = dArr2[i4];
            int i5 = i + 1;
            dArr2[i2] = (d * dArr[i]) + (dArr[i5] * d2);
            dArr2[i4] = ((-d) * dArr[i5]) + (d2 * dArr[i]);
            i += 2;
            i2 += 2;
        }
    }

    public final void A04(EZJ ezj) {
        int i = ezj.A01;
        double[] dArr = ezj.A02;
        int i2 = this.A01;
        int i3 = (this.A00 + i2) << 1;
        while (i2 < i3) {
            double[] dArr2 = this.A02;
            double d = dArr2[i2];
            dArr2[i2] = dArr[i] * d;
            dArr2[i2 + 1] = d * dArr[i + 1];
            i += 2;
            i2 += 2;
        }
    }

    public final void A05(EZJ ezj) {
        int i = ezj.A01;
        double[] dArr = ezj.A02;
        int i2 = this.A01;
        int i3 = (this.A00 + i2) << 1;
        while (i2 < i3) {
            double[] dArr2 = this.A02;
            double d = dArr2[i2];
            int i4 = i2 + 1;
            double d2 = dArr2[i4];
            double d3 = dArr[i];
            double d4 = dArr[i + 1];
            dArr2[i2] = (d * d3) + ((-d2) * d4);
            dArr2[i4] = (d * d4) + (d2 * d3);
            i += 2;
            i2 += 2;
        }
    }

    public final void A06(EZL ezl, int i) {
        int i2 = (i << 1) + this.A01;
        int i3 = i2 + 1;
        double[] dArr = this.A02;
        double d = dArr[i2];
        double d2 = dArr[i3];
        double d3 = ezl.A01;
        double d4 = ezl.A00;
        dArr[i2] = (d * d3) + ((-d2) * d4);
        dArr[i3] = (d * d4) + (d3 * d2);
    }

    public final void A07(EZL ezl, int i) {
        int i2 = (i << 1) + this.A01;
        int i3 = i2 + 1;
        double[] dArr = this.A02;
        double d = dArr[i2];
        double d2 = dArr[i3];
        double d3 = ezl.A00;
        double d4 = -d2;
        double d5 = ezl.A01;
        dArr[i2] = ((-d) * d3) + (d5 * d4);
        dArr[i3] = (d * d5) + (d4 * d3);
    }

    public final void A08(EZL ezl, int i) {
        int i2 = (i << 1) + this.A01;
        int i3 = i2 + 1;
        double[] dArr = this.A02;
        double d = dArr[i2];
        double d2 = dArr[i3];
        double d3 = ezl.A01;
        double d4 = ezl.A00;
        dArr[i2] = (d * d3) + (d4 * d2);
        dArr[i3] = ((-d) * d4) + (d2 * d3);
    }

    public final void A09(EZL ezl, int i) {
        int i2 = (i << 1) + this.A01;
        int i3 = i2 + 1;
        double[] dArr = this.A02;
        double d = dArr[i2];
        double d2 = dArr[i3];
        double d3 = -d;
        double d4 = ezl.A00;
        double d5 = ezl.A01;
        dArr[i2] = (d3 * d4) + (d2 * d5);
        dArr[i3] = (d3 * d5) + ((-d2) * d4);
    }

    public EZJ(int i) {
        this.A02 = new double[i << 1];
        this.A00 = i;
        this.A01 = 0;
    }

    public EZJ(EZJ ezj, int i, int i2) {
        this.A00 = i2 - i;
        this.A02 = ezj.A02;
        this.A01 = i << 1;
    }
}
